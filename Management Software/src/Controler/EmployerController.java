package Controler;

import Models.Employer;
import Models.Employer.myissuesEmployer;
import Models.Employer.AllissuesEmployer;
import Models.Employer.ManagecoursesEmployer;
import DatabaseAccessLayer.EmployerAccessLogic;
import Models.Admin;
import java.util.List;

public class EmployerController extends BaseController {

    Employer objEmployer;
    Employer.myissuesEmployer objmyissuesEmployer;
    Employer.AllissuesEmployer objAllissuesEmployer;
    Employer.ManagecoursesEmployer objManagecoursesEmployer;
    Employer.MonthlyHistoryOfIssuesEmployer objMonthlyHistoryOfIssuesEmployer;
    Employer.HelpEmployer objHelpEmployer;
    
    EmployerAccessLogic deshan;
    
    public EmployerController()
    {
        deshan = new EmployerAccessLogic();
         
    }

    public Employer addEmployer() {
        objEmployer = new Employer();
        return objEmployer;
    }
    
    public String GetID() {
        boolean result = true; 
        String  zz=userContext.getID(); 
        return zz;
    }
    
    
     public Employer.ManagecoursesEmployer addManagecoursesEmployer(String degreetype, String uniname, String cuntry, String degreename, String degreeid, String faculty,
            String entryreqirements, String programmeduration, String programmeschedule, String intake, String coursefee) {

        objManagecoursesEmployer = objEmployer.new ManagecoursesEmployer(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);

        return objManagecoursesEmployer;
    }

    public boolean insertManagecoursesEmployerToDB(Employer.ManagecoursesEmployer objManagecoursesEmployer) {
        boolean result = deshan.addManagecoursesEmployerTODB(objManagecoursesEmployer);
        return result;
    }

    public List<Employer.ManagecoursesEmployer> GetManagecoursesEmployer(String searchText) {
        List<Employer.ManagecoursesEmployer> result = deshan.GetManagecoursesEmployer(searchText);

        return result;
    }

    public boolean updateManagecoursesEmployerToDB(Employer.ManagecoursesEmployer objManagecoursesEmployerupdate) {
        boolean result = deshan.updateManagecoursesEmployerTODB(objManagecoursesEmployerupdate);
        return result;
    }

    public boolean deleteManagecoursesEmployerToDB(Employer.ManagecoursesEmployer objManagecoursesEmployerdelete) {
        boolean result = deshan.deleteManagecoursesEmployerTODB(objManagecoursesEmployerdelete);
        return result;
    }

    public List<Employer.ManagecoursesEmployer> searchManagecoursesEmployer(String searchText) {
        List<Employer.ManagecoursesEmployer> result = deshan.searchManagecoursesEmployer(searchText);

        return result;
    }
    

//-------------------------------------------------------------------------------------------------------------------
    
    public List<Employer.AllissuesEmployer> GetAllissuesEmployer(String searchText) {
        List<Employer.AllissuesEmployer> result = deshan.GetAllissuesEmployer(searchText);

        return result;
    }
    
    public List<Employer.AllissuesEmployer> GetCompletedAllissuesEmployer(String searchText) {
        List<Employer.AllissuesEmployer> result = deshan.GetCompletedAllissuesEmployer(searchText);

        return result;
    }
    
  //------------------------------------------------------------------------------------------------------------------
    
    public Employer.myissuesEmployer addmyissueEmployer(String comment,int issueid1) {

        objmyissuesEmployer = objEmployer.new myissuesEmployer(comment,issueid1);

        return objmyissuesEmployer;
    }
    
    public List<Employer.myissuesEmployer> GetmyissuesEmployer(String searchText) {
        List<Employer.myissuesEmployer> result = deshan.GetmyissuesEmployer(searchText);

        return result;
    }
    
    public boolean updatemyissueEmployer(Employer.myissuesEmployer objMyissues) {
        boolean result = deshan.updatmyAllissuesEmployerTODB(objMyissues);
        return result;
    }
    
    





    



}
