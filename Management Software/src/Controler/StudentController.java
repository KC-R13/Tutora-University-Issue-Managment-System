package Controler;

import Models.Student;
import Models.Student.StudentRegisration;
import Models.Student.GeneralExamIssue;
import Models.Student.ExamInquiries;
import Models.Student.Course;
import Models.Student.HelpStudent;

import DatabaseAccessLayer.StudentAccessLogic;
import Models.Users;
import java.util.List;

public class StudentController  extends BaseController {

    Student objStudent;
    Student.StudentRegisration objRegistration;
    Student.GeneralExamIssue objGeneralIssue;
    Student.ExamInquiries objExamInquiries;
    Student.Course objCourse;
    Student.HelpStudent objHelpStudent;

    StudentAccessLogic kasun;

    public StudentController() {
        kasun = new StudentAccessLogic();
    }

    public Student addStudent() {
        objStudent = new Student();
        return objStudent;
    }

    public Student.StudentRegisration addRegistration(String name, String ID, String email,
            String phone, String degreeType, String degreeName, String registerYear, String intake,
            String year, String semester, String batch, String studentIssue) {
        objRegistration = objStudent.new StudentRegisration(name, ID, email, phone, degreeType, degreeName, registerYear,
                intake, year, semester, batch, studentIssue);
        return objRegistration;

    }

    public boolean insertStudentToDB(Student.StudentRegisration objStudentRegistration) {
        boolean result = kasun.addStudentregistrationTODB(objRegistration);
        return result;
    }

    public List<Student.StudentRegisration> updattecombox(String searchpassword) {
        List<Student.StudentRegisration> result = kasun.updatacombox(searchpassword);

        return result;
    }

    /* public List<Student.StudentRegisration> updattecombox2(String searchpassword) {
        List<Student.StudentRegisration> result = kasun.updatacombox2(searchpassword);

        return result;
    }
    
     */
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public Student.GeneralExamIssue addGereralIssue(String name, String ID, String email, String phone, String degreeType, String degreeName,
            String registerYear, String intake, String year, String semester, String batch, String subjectName, String Examtype,
            String examinationIssue_general) {
        objGeneralIssue = objStudent.new GeneralExamIssue(name, ID, email, phone, degreeType, degreeName, registerYear,
                intake, year, semester, batch, subjectName, Examtype, examinationIssue_general);

        return objGeneralIssue;
    }

    public boolean insertGeneralEToDB(Student.GeneralExamIssue objgeneralexamissue) {
        boolean result = kasun.addGeneralExamIssueTODB(objgeneralexamissue);
        return result;
    }

    public List<Student.GeneralExamIssue> updattecomboxOFgeneralissue(String searchpassword) {
        List<Student.GeneralExamIssue> result = kasun.updatecomboxOFgeneralissue(searchpassword);

        return result;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public Student.ExamInquiries addExamInquiries(String name, String ID, String email,
            String phone, String degreeType, String degreeName, String registerYear, String intake,
            String year, String semester, String batch, String issueType, String subjectName, String examType,
            String date, String time, String otherIssue) {

        objExamInquiries = objStudent.new ExamInquiries(name, ID, email, phone, degreeType, degreeName,
                registerYear, intake, year, semester, batch, issueType, subjectName, examType, date, time, otherIssue);

        return objExamInquiries;
    }

    public boolean insertExamInquiryToDB(Student.ExamInquiries objgeneralexamissue) {
        boolean result = kasun.addExamInquiryTODB(objgeneralexamissue);
        return result;
    }

    public List<Student.ExamInquiries> updattecomboxOFExamInquiry(String searchpassword) {
        List<Student.ExamInquiries> result = kasun.updatecomboxOFExaminquiry(searchpassword);

        return result;
    }

    public Student.Course CourseDetails(String degreeType, String degreeName, String country, String faculty, String entityRequirnment, String ProgrammDuration, String Schedule, String Registration, String intake, String fee, String degreeid) {
        objCourse = objStudent.new Course(degreeType, degreeName, country, faculty, entityRequirnment, ProgrammDuration, Schedule, Registration, intake, fee, degreeid);
        return objCourse;

    }

    //           public boolean insertCourseDetailToDB(Student.Course objgeneralexamissue) {
    //      boolean result = kasun.ShowCouseDetails(objgeneralexamissue);
    //     return result;
    //  }
    public List<Student.Course> UpdateCoseDetailsfromDatabase(String searchpassword) {
        List<Student.Course> result = kasun.ShowCouseDetails(searchpassword);

        return result;
    }

    public List<Student.Course> UpdateCoseDetailsfromDatabasefor2ndbox(String searchpassword) {
        List<Student.Course> result = kasun.ShowCouseDetails2ndBox(searchpassword);

        return result;
    }

    /////////////////////////////////////////////////////////
    


}
