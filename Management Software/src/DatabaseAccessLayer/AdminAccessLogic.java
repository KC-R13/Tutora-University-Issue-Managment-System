package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Admin;
import Models.Admin.Adduser;
import Models.Admin.ManagecoursesAdmin;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminAccessLogic {

    private final DatabaseConnection singleConn;
    Admin objadmin;

    public AdminAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
        objadmin = new Admin();
    }

    public boolean addAdduserTODB(Admin.Adduser objAdmin) {
        try {

            String query = "insert into addusers values('" + objAdmin.getusertype() + "','" + objAdmin.getuserid() + "','" + objAdmin.getname() + "','" + objAdmin.getphoneNo() + "','"
                    + objAdmin.getaddress() + "','" + objAdmin.getpassword() + "','" + objAdmin.getreenterpassword() + "','" + objAdmin.getemail() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public List<Admin.Adduser> GetAddUsser(String searchText) {
        try {

            List<Admin.Adduser> adduser = new ArrayList<Admin.Adduser>();

            String query = " SELECT * FROM addusers";
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Admin.Adduser adm = objadmin.new Adduser(
                        result.getString("type"),
                        result.getString("ID"),
                        result.getString("name"),
                        result.getString("phone"),
                        result.getString("address"),
                        result.getString("password"),
                        result.getString("reenterpassword"),
                        result.getString("email")
                );

                adduser.add(adm);
            }

            return adduser;

        } catch (Exception ex) {
            return null;
        }

    }

    public boolean updateAdduserTODB(Admin.Adduser objAdmin) {

        try {

            String query = "update addusers set type = '" + objAdmin.getusertype() + "',name = '" + objAdmin.getname() + "',phone = '"
                    + objAdmin.getphoneNo() + "',address = '" + objAdmin.getaddress() + "',password = '" + objAdmin.getpassword() + "',reenterpassword = '" + objAdmin.getreenterpassword()
                    + "',email = '" + objAdmin.getemail() + "'where ID = '" + objAdmin.getuserid() + "';";

            //type, name, id, email, password1, phone, password2, address
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }

    }

    public boolean deleteAdduserTODB(Admin.Adduser objAdmin) {

        try {
            String query = "delete from addusers where ID ='" + objAdmin.getuserid() + "'";

            boolean result = singleConn.ExecuteQuery(query);
            return result;

        } catch (Exception ex) {
            return false;
        }
    }

    public List<Admin.Adduser> searchAddUsser(String searchText) {
        try {

            List<Admin.Adduser> adduser = new ArrayList<Admin.Adduser>();

            String query = " SELECT type,ID,name,phone,address,password,reenterpassword,email  FROM addusers where name ='" + searchText + "' or  ID ='" + searchText + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Admin.Adduser adm = objadmin.new Adduser(
                        result.getString("type"),
                        result.getString("ID"),
                        result.getString("name"),
                        result.getString("phone"),
                        result.getString("address"),
                        result.getString("password"),
                        result.getString("reenterpassword"),
                        result.getString("email")
                );

                adduser.add(adm);
            }

            return adduser;

        } catch (Exception ex) {
            return null;
        }

    }

//----------------------------------------------------------------------------------------------------------------------------------------------------
    public boolean addManagecoursesAdminTODB(Admin.ManagecoursesAdmin objAdmin) {
        try {

            String query = "insert into coursedetails values('" + objAdmin.getdegreetype() + "','" + objAdmin.getuniname() + "','" + objAdmin.getcuntry() + "','" + objAdmin.getdegreename() + "','"
                    + objAdmin.getdegreeid() + "','" + objAdmin.getfaculty() + "','" + objAdmin.getentryreqirements() + "','" + objAdmin.getprogrammeduration() + "','" + objAdmin.getprogrammeschedule() + "'"
                    + ",'" + objAdmin.getintake() + "','" + objAdmin.getcoursefee() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public List<Admin.ManagecoursesAdmin> GetManagecoursesAdmin(String searchText) {
        try {

            List<Admin.ManagecoursesAdmin> ManagecoursesAdmin = new ArrayList<Admin.ManagecoursesAdmin>();

            String query = " SELECT * FROM coursedetails";
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Admin.ManagecoursesAdmin adm = objadmin.new ManagecoursesAdmin(
                        result.getString("degreetype"),
                        result.getString("uniname"),
                        result.getString("cuntry"),
                        result.getString("degreename"),
                        result.getString("degreeid"),
                        result.getString("faculty"),
                        result.getString("entryreqirements"),
                        result.getString("programmeduration"),
                        result.getString("programmeschedule"),
                        result.getString("intake"),
                        result.getString("coursefee")
                );

                ManagecoursesAdmin.add(adm);
            }

            return ManagecoursesAdmin;

        } catch (Exception ex) {
            return null;
        }

    }

    public boolean updateManagecoursesAdminTODB(Admin.ManagecoursesAdmin objManagecoursesAdmin) {

        try {

            String query = "update coursedetails set degreetype = '" + objManagecoursesAdmin.getdegreetype() + "',uniname = '" + objManagecoursesAdmin.getuniname() + "',cuntry = '"
                    + objManagecoursesAdmin.getcuntry() + "',degreename = '" + objManagecoursesAdmin.getdegreename() + "',faculty = '" + objManagecoursesAdmin.getfaculty() + "',entryreqirements = '" + objManagecoursesAdmin.getentryreqirements()
                    + "',programmeduration = '" + objManagecoursesAdmin.getprogrammeduration() + "',programmeschedule = '" + objManagecoursesAdmin.getprogrammeschedule() + "',intake = '" + objManagecoursesAdmin.getintake() + "',coursefee = '" + objManagecoursesAdmin.getcoursefee() + "'where degreeid = '" + objManagecoursesAdmin.getdegreeid() + "';";

            //type, name, id, email, password1, phone, password2, address
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }

    }
    
    public boolean deleteManagecoursesAdminTODB(Admin.ManagecoursesAdmin objManagecoursesAdmin) {

        try {
            String query = "delete from coursedetails where degreeid ='" + objManagecoursesAdmin.getdegreeid() + "'";

            boolean result = singleConn.ExecuteQuery(query);
            return result;

        } catch (Exception ex) {
            return false;
        }
    }
    
    public List<ManagecoursesAdmin> searchManagecoursesAdmin(String searchText) {
        try {

            List<Admin.ManagecoursesAdmin> managecoursesAdmin = new ArrayList<Admin.ManagecoursesAdmin>();

            String query = " SELECT degreetype,uniname,cuntry,degreename,degreeid,faculty,entryreqirements,programmeduration,programmeschedule,intake,coursefee  FROM coursedetails where degreename ='" + searchText + "' or  degreeid ='" + searchText + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Admin.ManagecoursesAdmin adm = objadmin.new ManagecoursesAdmin(
                        result.getString("degreetype"),
                        result.getString("uniname"),
                        result.getString("cuntry"),
                        result.getString("degreename"),
                        result.getString("degreeid"),
                        result.getString("faculty"),
                        result.getString("entryreqirements"),
                        result.getString("programmeduration"),
                        result.getString("programmeschedule"),
                        result.getString("intake"),
                        result.getString("coursefee")
                );

                managecoursesAdmin.add(adm);
            }

            return managecoursesAdmin;

        } catch (Exception ex) {
            return null;
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//    public boolean searchAdduserTODB(Admin.Adduser objAdmin) {
//        try {
//
//            String query = "Select type,ID,name,phone,address,password,reenterpassword,email where ID = '" + objAdmin.getsearch() + "';";
//            boolean result = singleConn.ExecuteQuery(query);
//            return result;
//            
//        } catch (Exception ex) {
//            return false;
//        }
//    }
}

/*
    public boolean addAllissuesAdminTODB(Admin.AllissuesAdmin objAdmin) {
        try {

            String query = "insert into studentregistration values;";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean addManagecoursesAdminTODB(Admin.ManagecoursesAdmin objAdmin) {
        try {

            String query = "insert into studentregistration values;";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean addMonthlyHistoryOfIssuesAdminTODB(Admin.MonthlyHistoryOfIssuesAdmin objAdmin) {
        try {

            String query = "insert into studentregistration values;";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }


 */
