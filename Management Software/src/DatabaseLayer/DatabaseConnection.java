package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ruvin
 */
public class DatabaseConnection {

    private final String URL = "jdbc:mysql://localhost:3306/studentapp";
    private final String Uname = "root";
    private final String Password = "";

//        private final String URL = "jdbc:mysql://204.93.167.23:3306/autolank_javatest_db";
//    private final String Uname = "autolank_test";
//    private final String Password = "Admin321@";
    
    private static DatabaseConnection instance; //create an object for the class of DatabaseConnection
    private Connection con;

    private DatabaseConnection() //create private that is why we do not need to  create multiple 
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, Uname, Password);
            System.out.println("Connection susses");
        } catch (SQLException ex) {
            System.out.println("Database is connection is error " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver class error " + ex.getMessage());
        }
    }

    public static DatabaseConnection getSingleInstace() {
        try {
            if (instance == null) {
                return instance = new DatabaseConnection();

            } else if (instance.con.isClosed()) {
                return instance = new DatabaseConnection();
            } else {
                return instance;

            }
        } catch (SQLException ex) {
            System.out.println("Database connectio error" + ex.getMessage());
            return null;
        }
    }

    public boolean ExecuteQuery(String sqlQ) {
        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(sqlQ);
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("Sql error" + ex.getMessage());
            return false;
        }
    }

    public ResultSet ExecuteQueryResultSet(String sqlQ) {
        try {

            Statement st = con.createStatement();
            ResultSet result = st.executeQuery(sqlQ);

            return result;

        } catch (SQLException ex) {
            System.out.println("Sql error" + ex.getMessage());
            return null;
        }
    }

    public PreparedStatement PreparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
