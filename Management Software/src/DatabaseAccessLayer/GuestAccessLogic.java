
package DatabaseAccessLayer;
import DatabaseLayer.DatabaseConnection;
import Models.Guest;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class GuestAccessLogic {
 


    private final DatabaseConnection singleConn;
    Guest.StudentRegisrationGuest objStudentRegistrationGuest;
    Guest objGuest;
    

    public GuestAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
        objGuest = new Guest();
    }
    
       public boolean addStudentregistrationGuestTODB(Guest.StudentRegisrationGuest objGuest) {
        try {

            String query = "insert into notcomplitedallissues(ncallissuesid,issuetype,stname,itnumber,email,phoneNo,degree_type,degreename,registerdyear,intake,year,semester,batch,allexinquirydetails) values('" + 0 + "','" + "Student Registration Issues" + "','" + objGuest.getName() + "','" + objGuest.getID() + "','" + objGuest.getEmail() + "','" + objGuest.getPhone() + "','"
                    + objGuest.getDegreeType() + "','" + objGuest.getDegreeName() + "','" + objGuest.getRegisterYear() + "','" + objGuest.getIntake() + "','" + objGuest.getYear() + "','"
                    + objGuest.getSemester() + "','" + objGuest.getBatch() + "','" + objGuest.getStudentIssue() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
       
       public List<Guest.StudentRegisrationGuest> updatacombox(String searchID) {
        try {

            List<Guest.StudentRegisrationGuest> adduser = new ArrayList<Guest.StudentRegisrationGuest>();

            String query = " SELECT  * FROM coursedetails where degreetype ='" + searchID + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Guest.StudentRegisrationGuest adm = objGuest.new StudentRegisrationGuest(
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
                        result.getString("coursefee"),
                        result.getString("coursefee")
                );

                adduser.add(adm);
                //System.out.println(result.getString("ID"));
            }

            return adduser;

        } catch (Exception ex) {

            return null;
        }

    }

  
}


