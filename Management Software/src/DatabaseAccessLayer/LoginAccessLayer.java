/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Users;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Views.AdminMainView;
import Views.EmployerMainView;
import Views.StudentMainView;
import Views.LoginView;
import javax.swing.JOptionPane;
import Views.GuestView;

/**
 *
 * @author ruvin
 */
public class LoginAccessLayer {

    private DatabaseConnection singleConn;
    private static Connection con = null;
    private static Statement stml = null;
    private static ResultSet res = null;
    AdminMainView objAdminMainView;
    EmployerMainView objEmployerMainView;
    StudentMainView objStudentMainView;
    LoginView objLoginView;
    GuestView objGuestView;

    public LoginAccessLayer() {
        singleConn = DatabaseConnection.getSingleInstace();

       /* objAdminMainView = new AdminMainView();
      //  objLoginView =new LoginView();
        objEmployerMainView = new EmployerMainView();
        objStudentMainView = new StudentMainView();
        objGuestView= new GuestView(); */

    }


    public List<Users> GetUsers(String searchID, String searchpassword) {
        try {

            List<Users> employees = new ArrayList<Users>();

            String query = " SELECT * FROM addusers where password='" + searchpassword + "'and ID ='" + searchID + "'";
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Users emp = new Users(
                        result.getString("ID"),
                        result.getString("password"),
                        result.getString("type"),
                        result.getString("name")
                );

           

                employees.add(emp);
            }

            return employees;

        } catch (Exception ex) {
            return null;//
        }

    }

}

