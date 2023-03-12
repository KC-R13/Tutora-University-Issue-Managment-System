package Controler;

import Models.Guest;
import Models.Guest.StudentRegisrationGuest;
import Models.Guest.Forgotpassword;
import Models.Guest.HelpGuest;

import DatabaseAccessLayer.GuestAccessLogic;
import java.util.List;

public class GuestController extends BaseController  {

    Guest objGuest;
    Guest.StudentRegisrationGuest objRegistrationGuest;
    Guest.Forgotpassword objForgotpassword;
    Guest.HelpGuest objHelpGuest;
    
    GuestAccessLogic deshan;
    
    public GuestController()
    {
        deshan = new GuestAccessLogic();
    }

    public Guest addGuest() {
        objGuest = new Guest();
        return objGuest;
    }

    public Guest.StudentRegisrationGuest addRegistrationGuest(String name, String ID, String email,
            String phone, String degreeType, String degreeName, String registerYear, String intake,
            String year, String semester, String batch, String studentIssue) {
        objRegistrationGuest = objGuest.new StudentRegisrationGuest(name, ID, email, phone, degreeType, degreeName, registerYear,
                intake, year, semester, batch, studentIssue);
        return objRegistrationGuest;
    
    }
     public boolean insertGuestToDB(Guest.StudentRegisrationGuest objStudentRegistrationGuest) {
        boolean result = deshan.addStudentregistrationGuestTODB(objRegistrationGuest);
        return result;
    }
     
        public List<Guest.StudentRegisrationGuest> updatecombox(String searchpassword) {
        List<Guest.StudentRegisrationGuest> result = deshan.updatacombox(searchpassword);

        return result;
    }

     
//     public boolean insertGuestToDB(Guest.StudentRegisrationGuest objStudentRegistrationGuest)
//    {
//      boolean result =deshan.addStudentregistrationGuestTODB(objRegistrationGuest);
//      return result;
//    }
//   
//
//    public Guest.Forgotpassword addForgotpassword(String logintype, String userID, String NIC, String name, String email) {
//        objForgotpassword = objGuest.new Forgotpassword(logintype,userID,NIC,name,email);
//
//        return objForgotpassword;
//    }
//    
//      public boolean insertForgotpasswordToDB(Guest.Forgotpassword objForgotpassword)
//    {
//      boolean result =deshan.addForgotpasswordTODB(objForgotpassword);
//      return result;
//    }
//      
//      public Guest.HelpGuest addHelpGuest() {
//        return null;
//    }


}
