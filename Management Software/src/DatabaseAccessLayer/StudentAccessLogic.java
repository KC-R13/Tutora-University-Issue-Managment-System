package DatabaseAccessLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Admin;
import Models.Student;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Models.Student.StudentRegisration;
import Other.SecondDatabase;

public class StudentAccessLogic {

    private final DatabaseConnection singleConn;
    Student.StudentRegisration objStudentRegistration;
    Student objStudent;
    SecondDatabase objseconddatabase; // create object for the second database

    public StudentAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
        objStudent = new Student();
        objseconddatabase = new SecondDatabase(); // create object for the second database
    }

    public boolean addStudentregistrationTODB(Student.StudentRegisration objstudent) {
        try {

            String query = "insert into notcomplitedallissues(ncallissuesid,issuetype,stname,itnumber,email,phoneNo,degree_type,degreename,registerdyear,intake,year,semester,batch,allexinquirydetails,Employee_ID) values('" + 0 + "','" + "Student Registration Issues" + "','" + objstudent.getName() + "','" + objstudent.getID() + "','" + objstudent.getEmail() + "','" + objstudent.getPhone() + "','"
                    + objstudent.getDegreeType() + "','" + objstudent.getDegreeName() + "','" + objstudent.getRegisterYear() + "','" + objstudent.getIntake() + "','" + objstudent.getYear() + "','"
                    + objstudent.getSemester() + "','" + objstudent.getBatch() + "','" + objstudent.getStudentIssue() + "','" + objseconddatabase.GetRandomEmployer() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }


//getting data from database to load for a combox
    //update combox
    public List<Student.StudentRegisration> updatacombox(String searchID) {
        try {

            List<Student.StudentRegisration> adduser = new ArrayList<Student.StudentRegisration>();

            String query = " SELECT  * FROM coursedetails where degreetype ='" + searchID + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Student.StudentRegisration adm = objStudent.new StudentRegisration(
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

    /*  
     //update combox
     public List<Student.StudentRegisration> updatacombox2(String searchID) {
        try {

            List<Student.StudentRegisration> employees = new ArrayList<Student.StudentRegisration>();

           String query = " SELECT * FROM studentregistration ";
            // String query = " SELECT * FROM studentregistration where degreeType ='" + searchID + "'";
           
            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Student.StudentRegisration emp = objStudent.new StudentRegisration(
                        result.getString("name"),
                        result.getString("ID"),
                        result.getString("email"),
                        result.getString("phone"),
                        result.getString("degreeType"),
                        result.getString("degreeName"),
                        result.getString("registerYear"),
                        result.getString("intake"),
                        result.getString("year"),
                        result.getString("semester"),
                        result.getString("batch"),
                        result.getString("batch")
                );

           

                employees.add(emp);
            }

            return employees;

        } catch (Exception ex) {
            return null;//
        }

    }


     */
    ////////////////////////////////////////General exam issuse////////////////////////
    public boolean addGeneralExamIssueTODB(Student.GeneralExamIssue objstudent) {
        try {

            String query = "insert into notcomplitedallissues (ncallissuesid,issuetype,stname,itnumber,email,phoneNo,degree_type,degreename,registerdyear,intake,year,semester,batch,subjectname,exam,allexinquirydetails,Employee_ID) values('" + 0 + "','" + "General Exam Issue" + "','" + objstudent.getName() + "','" + objstudent.getID() + "','" + objstudent.getEmail() + "','" + objstudent.getPhone() + "','"
                    + objstudent.getDegreeType() + "','" + objstudent.getDegreeName() + "','" + objstudent.getRegisterYear() + "','" + objstudent.getIntake() + "','" + objstudent.getYear() + "','"
                    + objstudent.getSemester() + "','" + objstudent.getBatch() + "','" + objstudent.getSubjectName() + "','" + objstudent.getExamtype() + "','" + objstudent.getExaminationIssue_general() + "','" + objseconddatabase.GetRandomEmployer() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

//getting data from database to load for a combox
    //update combox
    public List<Student.GeneralExamIssue> updatecomboxOFgeneralissue(String searchID) {
        try {

            List<Student.GeneralExamIssue> adduser = new ArrayList<Student.GeneralExamIssue>();

            String query = " SELECT  * FROM coursedetails where degreetype ='" + searchID + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Student.GeneralExamIssue adm = objStudent.new GeneralExamIssue(
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
                        result.getString("coursefee"),
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

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean addExamInquiryTODB(Student.ExamInquiries objstudent) {
        try {

            String query = "insert into notcomplitedallissues (ncallissuesid,issuetype,inquiry_type,stname,itnumber,email,phoneNo,degree_type,degreename,registerdyear,intake,year,semester,batch,subjectname,exam,date,time,allexinquirydetails,Employee_ID) values('" + 0 + "','" + "Examination Inquiry" + "','" + objstudent.getInquirieType() + "','" + objstudent.getName() + "','" + objstudent.getID() + "','" + objstudent.getEmail() + "','" + objstudent.getPhone() + "','"
                    + objstudent.getDegreeType() + "','" + objstudent.getDegreeName() + "','" + objstudent.getRegisterYear() + "','" + objstudent.getIntake() + "','" + objstudent.getYear() + "','"
                    + objstudent.getSemester() + "','" + objstudent.getBatch() + "','" + objstudent.getSubjectName() + "','" + objstudent.getExamType() + "','" + objstudent.getdate() + "','" + objstudent.gettime() + "','" + objstudent.getOtherIssue() + "','" + objseconddatabase.GetRandomEmployer() + "');";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

//getting data from database to load for a combox
    //update combox
    public List<Student.ExamInquiries> updatecomboxOFExaminquiry(String searchID) {
        try {

            List<Student.ExamInquiries> adduser = new ArrayList<Student.ExamInquiries>();

            String query = " SELECT  * FROM coursedetails where degreetype ='" + searchID + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Student.ExamInquiries adm = objStudent.new ExamInquiries(
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
                        result.getString("coursefee"),
                        result.getString("coursefee"),
                        result.getString("coursefee"),
                        result.getString("coursefee"),
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

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<Student.Course> ShowCouseDetails(String searchID) {
        try {

            List<Student.Course> adduser = new ArrayList<Student.Course>();

            String query = " SELECT * FROM coursedetails where degreetype ='" + searchID + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Student.Course adm = objStudent.new Course(
                        result.getString("degreetype"),
                        result.getString("degreename"),
                        result.getString("cuntry"),
                        result.getString("faculty"),
                        result.getString("entryreqirements"),
                        result.getString("programmeduration"),
                        result.getString("programmeschedule"),
                        result.getString("degreeid"),
                        result.getString("intake"),
                        result.getString("coursefee"),
                        result.getString("uniname")
                );

                adduser.add(adm);

            }

            return adduser;

        } catch (Exception ex) {

            return null;
        }

    }

    public List<Student.Course> ShowCouseDetails2ndBox(String searchID) {
        try {

            List<Student.Course> adduser = new ArrayList<Student.Course>();

            String query = " SELECT * FROM coursedetails where degreename ='" + searchID + "'";

            ResultSet result = singleConn.ExecuteQueryResultSet(query);

            while (result.next()) {
                Student.Course adm = objStudent.new Course(
                        result.getString("degreetype"),
                        result.getString("degreename"),
                        result.getString("cuntry"),
                        result.getString("faculty"),
                        result.getString("entryreqirements"),
                        result.getString("programmeduration"),
                        result.getString("programmeschedule"),
                        result.getString("degreeid"),
                        result.getString("intake"),
                        result.getString("coursefee"),
                        result.getString("uniname")
                // degreeType, degreeName,country,faculty,entityRequirnment,ProgrammDuration,Schedule,Registration,intake,fee,Univ
                );

                adduser.add(adm);

            }

            return adduser;

        } catch (Exception ex) {

            return null;
        }

    }

    //////////////////////////////////////////////////
   

}
