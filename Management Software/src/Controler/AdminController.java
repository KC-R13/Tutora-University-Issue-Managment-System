package Controler;

import Models.Admin;
import Models.Admin.Adduser;
import Models.Admin.AllissuesAdmin;
import Models.Admin.ManagecoursesAdmin;
import DatabaseAccessLayer.AdminAccessLogic;
import java.util.List;


 
public class AdminController extends BaseController {

    Admin objAdmin;
    Admin.Adduser objAdduser;
    Admin.AllissuesAdmin objAllissuesAdmin;
    Admin.ManagecoursesAdmin objManagecoursesAdmin;
    Admin.MonthlyHistoryOfIssuesAdmin objMonthlyHistoryOfIssuesAdmin;
    Admin.HelpAdmin objHelpAdmin;

    AdminAccessLogic deshan;

    public AdminController() {
        deshan = new AdminAccessLogic();
    }

    public Admin addAdmin() {
        objAdmin = new Admin();
        return objAdmin;
    }

    public Admin.Adduser addAdduser(String usertype, String userid, String name, String phoneNo, String address, String password, String reenterpassword, String email) {
        objAdduser = objAdmin.new Adduser(usertype, userid, name, phoneNo, address, password, reenterpassword, email);
        return objAdduser;

    }
    public boolean GetIDDDDDDD( ) {
        boolean result = true;   
        String  zz=userContext.getID();  
        return result;
    }
    public boolean insertAdminToDB(Admin.Adduser objAdminAdduser) {
        boolean result = deshan.addAdduserTODB(objAdminAdduser);
        return result;
    }

    public List<Admin.Adduser> GetAddUsers(String searchText) {
        List<Admin.Adduser> result = deshan.GetAddUsser(searchText);

        return result;
    }

    public boolean updateAdminToDB(Admin.Adduser objAdminupdateuser) {
        boolean result = deshan.updateAdduserTODB(objAdminupdateuser);
        return result;
    }

    public boolean deleteAdminToDB(Admin.Adduser objAdmindeletuser) {
        boolean result = deshan.deleteAdduserTODB(objAdmindeletuser);
        return result;
    }

    public List<Admin.Adduser> searchAddUsers(String searchText) {
        List<Admin.Adduser> result = deshan.searchAddUsser(searchText);

        return result;
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public Admin.ManagecoursesAdmin addManagecoursesAdmin(String degreetype, String uniname, String cuntry, String degreename, String degreeid, String faculty,
            String entryreqirements, String programmeduration, String programmeschedule, String intake, String coursefee) {

        objManagecoursesAdmin = objAdmin.new ManagecoursesAdmin(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);

        return objManagecoursesAdmin;
    }

    public boolean insertManagecoursesAdminToDB(Admin.ManagecoursesAdmin objManagecoursesAdmin) {
        boolean result = deshan.addManagecoursesAdminTODB(objManagecoursesAdmin);
        return result;
    }

    public List<Admin.ManagecoursesAdmin> GetManagecoursesAdmin(String searchText) {
        List<Admin.ManagecoursesAdmin> result = deshan.GetManagecoursesAdmin(searchText);

        return result;
    }

    public boolean updateManagecoursesAdminToDB(Admin.ManagecoursesAdmin objManagecoursesAdminupdate) {
        boolean result = deshan.updateManagecoursesAdminTODB(objManagecoursesAdminupdate);
        return result;
    }

    public boolean deleteManagecoursesAdminToDB(Admin.ManagecoursesAdmin objanagecoursesAdmindelete) {
        boolean result = deshan.deleteManagecoursesAdminTODB(objanagecoursesAdmindelete);
        return result;
    }

    public List<Admin.ManagecoursesAdmin> searchManagecoursesAdmin(String searchText) {
        List<Admin.ManagecoursesAdmin> result = deshan.searchManagecoursesAdmin(searchText);

        return result;
    }

}

/*  
   

    public Admin.AllissuesAdmin addAllissuesAdmin(String email, String phone, String degree, String registerdyear, String year, String batch, String semester,
                String subject,String exam,String date,String time,String details) {
        objAllissuesAdmin = objAdmin.new AllissuesAdmin(email,phone,degree,registerdyear,year,batch,semester,subject,exam,date,time,details);

        return objAllissuesAdmin;
    }
    
    



    public Admin.MonthlyHistoryOfIssuesAdmin addMonthlyHistoryOfIssuesAdmin() {
        return null;
    }
    
    public Admin.HelpAdmin addHelpAdmin() {
        return null;
    }
 */
//    public boolean searchAdminToDB(Adduser objAdduser ) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

