package Controler;

import Models.Users;
import Views.LoginView;
import java.util.ArrayList;
import java.util.List;
import DatabaseAccessLayer.LoginAccessLayer;

public class LoginController extends BaseController {

    Users objEmployee;
    LoginAccessLayer bal;

    public LoginController() {
        bal = new LoginAccessLayer();     
    }

    public Users addEmployee(String type, String ID, String password) {
        objEmployee = new Users(type, ID, password);
        return objEmployee;
    }
 

    public List<Users> GetEmployees(String searchpassword, String searchID) {
        List<Users> result = bal.GetUsers(searchpassword, searchID);

        return result;
    }
}
