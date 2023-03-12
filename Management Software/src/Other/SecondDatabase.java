package Other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SecondDatabase {
   static SecondDatabase objSecondDatabase;

 String namex;
    public String GetRandomEmployer() 
    {
        try {

            // 1. Get a conection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentapp", "root", "");

            // 2. Creqate a statement
            Statement myStmt = myConn.createStatement();
           
            //3.Execute sql query
           // ResultSet myRs = myStmt.executeQuery("select name,count(*)as NoOF from kasuncheck group by name having count(*)>=all(select count(*) from kasuncheck group by name)");
            ResultSet myRs = myStmt.executeQuery("select ID from addusers where ID like 'em%' order by rand() LIMIT 1 ");
           
            //4.process the result set
            while (myRs.next()) {

                // int count = myRs.getInt("NoOF");
                //String x = String.valueOf(count);
                 namex =myRs.getString("ID");
 
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
return namex;
        
    }
    
}
