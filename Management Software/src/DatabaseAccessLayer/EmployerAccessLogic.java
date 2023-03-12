
package DatabaseAccessLayer;
import Controler.EmployerController;
import DatabaseLayer.DatabaseConnection;
import Models.Admin;
import Models.Employer;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class EmployerAccessLogic {
 


    private final DatabaseConnection singleConn;
    Employer objamployer;

    public EmployerAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
        objamployer = new Employer();
    }
    
     EmployerController objEmployerController;
    
    
    public boolean addManagecoursesEmployerTODB(Employer.ManagecoursesEmployer objEmployer) {
        try {

            String query = "insert into coursedetails values('" + objEmployer.getdegreetype() + "','" + objEmployer.getuniname() + "','" + objEmployer.getcuntry() + "','" + objEmployer.getdegreename() + "','"
                    + objEmployer.getdegreeid() + "','" + objEmployer.getfaculty() + "','" + objEmployer.getentryreqirements() + "','" + objEmployer.getprogrammeduration() + "','" + objEmployer.getprogrammeschedule() + "'"
                    + ",'" + objEmployer.getintake() + "','" + objEmployer.getcoursefee() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

    public List<Employer.ManagecoursesEmployer> GetManagecoursesEmployer(String searchText) {
        try {

            List<Employer.ManagecoursesEmployer> ManagecoursesEmployer = new ArrayList<Employer.ManagecoursesEmployer>();

            String query = " SELECT * FROM coursedetails";
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Employer.ManagecoursesEmployer emp = objamployer.new ManagecoursesEmployer(
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

                ManagecoursesEmployer.add(emp);
            }

            return ManagecoursesEmployer;

        } catch (Exception ex) {
            return null;
        }

    }

    public boolean updateManagecoursesEmployerTODB(Employer.ManagecoursesEmployer objManagecoursesEmployer) {

        try {

            String query = "update coursedetails set degreetype = '" + objManagecoursesEmployer.getdegreetype() + "',uniname = '" + objManagecoursesEmployer.getuniname() + "',cuntry = '"
                    + objManagecoursesEmployer.getcuntry() + "',degreename = '" + objManagecoursesEmployer.getdegreename() + "',faculty = '" + objManagecoursesEmployer.getfaculty() + "',entryreqirements = '" + objManagecoursesEmployer.getentryreqirements()
                    + "',programmeduration = '" + objManagecoursesEmployer.getprogrammeduration() + "',programmeschedule = '" + objManagecoursesEmployer.getprogrammeschedule() + "',intake = '" + objManagecoursesEmployer.getintake() + "',coursefee = '" + objManagecoursesEmployer.getcoursefee() + "'where degreeid = '" + objManagecoursesEmployer.getdegreeid() + "';";

            //type, name, id, email, password1, phone, password2, address
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }

    }
    
    public boolean deleteManagecoursesEmployerTODB(Employer.ManagecoursesEmployer objManagecoursesEmployer) {

        try {
            String query = "delete from coursedetails where degreeid ='" + objManagecoursesEmployer.getdegreeid() + "'";

            boolean result = singleConn.ExecuteQuery(query);
            return result;

        } catch (Exception ex) {
            return false;
        }
    }
    
    public List<Employer.ManagecoursesEmployer> searchManagecoursesEmployer(String searchText) {
        try {

            List<Employer.ManagecoursesEmployer> managecoursesEmployer = new ArrayList<Employer.ManagecoursesEmployer>();

            String query = " SELECT degreetype,uniname,cuntry,degreename,degreeid,faculty,entryreqirements,programmeduration,programmeschedule,intake,coursefee  FROM coursedetails where degreename ='" + searchText + "' or  degreeid ='" + searchText + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Employer.ManagecoursesEmployer emp = objamployer.new ManagecoursesEmployer(
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

                managecoursesEmployer.add(emp);
            }

            return managecoursesEmployer;

        } catch (Exception ex) {
            return null;
        }

    }
    
    
    //-----------------------------------------------------------------------------------------------------------
    
     public List<Employer.AllissuesEmployer> GetAllissuesEmployer(String searchText) {
        try {

            List<Employer.AllissuesEmployer> AllissuesEmployer = new ArrayList<Employer.AllissuesEmployer>();

            String query = " SELECT * FROM notcomplitedallissues where Status = 'Not-Completed' ";
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Employer.AllissuesEmployer emp = objamployer.new AllissuesEmployer(
                        result.getString("ncallissuesid"),
                        result.getString("issuetype"),
                        result.getString("inquiry_type"),
                        result.getString("stname"),
                        result.getString("itnumber"),
                        result.getString("email"),
                        result.getString("phoneNo"),
                        result.getString("degree_type"),
                        result.getString("degreename"),
                        result.getString("registerdyear"),
                        result.getString("intake"),
                        result.getString("year"),
                        result.getString("semester"),
                        result.getString("batch"),
                        result.getString("subjectname"),
                        result.getString("exam"),
                        result.getString("date"),
                        result.getString("time"),
                        result.getString("comment"),
                        result.getString("allexinquirydetails"),
                        result.getString("Employee_ID")
                        
                           
                        
                );

                AllissuesEmployer.add(emp);
            }

            return AllissuesEmployer;

        } catch (Exception ex) {
            return null;
        }

    }
     public List<Employer.AllissuesEmployer> GetCompletedAllissuesEmployer(String searchText) {
        try {

            List<Employer.AllissuesEmployer> AllissuesEmployer = new ArrayList<Employer.AllissuesEmployer>();

            String query = " SELECT * FROM notcomplitedallissues where Status = 'Completed' ";
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Employer.AllissuesEmployer emp = objamployer.new AllissuesEmployer(
                        result.getString("ncallissuesid"),
                        result.getString("issuetype"),
                        result.getString("inquiry_type"),
                        result.getString("stname"),
                        result.getString("itnumber"),
                        result.getString("email"),
                        result.getString("phoneNo"),
                        result.getString("degree_type"),
                        result.getString("degreename"),
                        result.getString("registerdyear"),
                        result.getString("intake"),
                        result.getString("year"),
                        result.getString("semester"),
                        result.getString("batch"),
                        result.getString("subjectname"),
                        result.getString("exam"),
                        result.getString("date"),
                        result.getString("time"),
                        result.getString("comment"),
                        result.getString("allexinquirydetails"),
                        result.getString("Employee_ID")
                        
                           
                        
                );

                AllissuesEmployer.add(emp);
            }

            return AllissuesEmployer;

        } catch (Exception ex) {
            return null;
        }

    }
      
     public List<Employer.myissuesEmployer> GetmyissuesEmployer( String employee_ID ) {
        try {

            List<Employer.myissuesEmployer> myissuesEmployer = new ArrayList<Employer.myissuesEmployer>();

            
          String query = " SELECT  ncallissuesid,issuetype,inquiry_type,stname,itnumber,email,phoneNo,degree_type,degreename,registerdyear,intake,year,"
                    + "semester,batch,subjectname,exam,date,time,comment,allexinquirydetails,Employee_ID FROM notcomplitedallissues where Employee_ID = '" + employee_ID + "'";
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Employer.myissuesEmployer emp = objamployer.new myissuesEmployer(
                        result.getString("ncallissuesid"),
                        result.getString("issuetype"),
                        result.getString("inquiry_type"),
                        result.getString("stname"),
                        result.getString("itnumber"),
                        result.getString("email"),
                        result.getString("phoneNo"),
                        result.getString("degree_type"),
                        result.getString("degreename"),
                        result.getString("registerdyear"),
                        result.getString("intake"),
                        result.getString("year"),
                        result.getString("semester"),
                        result.getString("batch"),
                        result.getString("subjectname"),
                        result.getString("exam"),
                        result.getString("date"),
                        result.getString("time"),
                        result.getString("comment"),
                        result.getString("allexinquirydetails"),
                        result.getString("Employee_ID")
                        
                           
                        
                );

                myissuesEmployer.add(emp);
            }

            return myissuesEmployer;

        } catch (Exception ex) {
            return null;
        }

     }
     
      public boolean updatmyAllissuesEmployerTODB(Employer.myissuesEmployer objMyissues) {

        try {

            String query = "update notcomplitedallissues  set comment = '" + objMyissues.getcomment() + "' where ncallissuesid = '" + objMyissues.getissueid1() + "';";

            //type, name, id, email, password1, phone, password2, address
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }

    }
      

      





}
    



