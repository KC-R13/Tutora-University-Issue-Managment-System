package Models;




//----------------------------------------------------------------------------------------------------------

public class Student {

 
    public class StudentRegisration {  //for the student registration panal

        String name;
        String ID;
        String email;
        String phone;
        String degreeType;
        String degreeName;
        String registerYear;
        String intake;
        String year;
        String semester;
        String batch;
        String studentIssue;

        public StudentRegisration(String name, String ID, String email, String phone, String degreeType, String degreeName, String registerYear, String intake, String year, String semester, String batch,String studentIssue) {
            this.name = name;
            this.ID = ID;
            this.email = email;
            this.phone = phone;
            this.degreeType = degreeType;
            this.degreeName = degreeName;
            this.registerYear = registerYear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.studentIssue= studentIssue;
        }

        public String getName() 
        {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDegreeType() {
            return degreeType;
        }

        public void setDegreeType(String degreeType) {
            this.degreeType = degreeType;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getRegisterYear() {
            return registerYear;
        }

        public void setRegisterYear(String registerYear) {
            this.registerYear = registerYear;
        }

        public String getIntake() {
            return intake;
        }

        public void setIntake(String intake) {
            this.intake = intake;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getSemester() {
            return semester;
        }

        public void setSemester(String semester) {
            this.semester = semester;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public String getStudentIssue() {
            return studentIssue;
        }

        public void setStudentIssue(String studentIssue) {
            this.studentIssue = studentIssue;
        }
        
        

    }

    //--------------------------------------------------------------------------------------------
    
    public class GeneralExamIssue {   //for the general examination issues

        String name;
        String ID;
        String email;
        String phone;
        String degreeType;
        String degreeName;
        String registerYear;
        String intake;
        String year;
        String semester;
        String batch;
        String subjectName;
        String Examtype;
        String examinationIssue_general;

        public GeneralExamIssue(String name, String ID, String email, String phone, String degreeType, String degreeName, String registerYear, String intake, String year, String semester, String batch, String subjectName, String Examtype, String examinationIssue_general) {
            this.name = name;
            this.ID = ID;
            this.email = email;
            this.phone = phone;
            this.degreeType = degreeType;
            this.degreeName = degreeName;
            this.registerYear = registerYear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.subjectName = subjectName;
            this.Examtype = Examtype;
            this.examinationIssue_general = examinationIssue_general;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDegreeType() {
            return degreeType;
        }

        public void setDegreeType(String degreeType) {
            this.degreeType = degreeType;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getRegisterYear() {
            return registerYear;
        }

        public void setRegisterYear(String registerYear) {
            this.registerYear = registerYear;
        }

        public String getIntake() {
            return intake;
        }

        public void setIntake(String intake) {
            this.intake = intake;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getSemester() {
            return semester;
        }

        public void setSemester(String semester) {
            this.semester = semester;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
        }

        public String getExamtype() {
            return Examtype;
        }

        public void setExamtype(String Examtype) {
            this.Examtype = Examtype;
        }

        public String getExaminationIssue_general() {
            return examinationIssue_general;
        }

        public void setExaminationIssue_general(String examinationIssue_general) {
            this.examinationIssue_general = examinationIssue_general;
        }

    }
    
        
//---------------------------------------------------------------------------------------------------------------------------------
    public class ExamInquiries {     //for other examination related issues
        
        String name;
        String ID;
        String email;
        String phone;
        String degreeType;
        String degreeName;
        String registerYear;
        String intake;
        String year;
        String semester;
        String batch;
        String InquirieType;
        String subjectName;
        String examType;
        String date;
        String time;
        String otherIssue;

        public ExamInquiries(String name, String ID, String email, String phone, String degreeType, String degreeName, String registerYear, String intake, String year, String semester,
                             String batch, String InquirieType, String subjectName, String examType, String date
                             , String time,String otherIssue) {
            this.name = name;
            this.ID = ID;
            this.email = email;
            this.phone = phone;
            this.degreeType = degreeType;
            this.degreeName = degreeName;
            this.registerYear = registerYear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.InquirieType = InquirieType;
            this.subjectName = subjectName;
            this.examType = examType;
            this.date = date;
            this.time = time;
            this.otherIssue = otherIssue;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDegreeType() {
            return degreeType;
        }

        public void setDegreeType(String degreeType) {
            this.degreeType = degreeType;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getRegisterYear() {
            return registerYear;
        }

        public void setRegisterYear(String registerYear) {
            this.registerYear = registerYear;
        }

        public String getIntake() {
            return intake;
        }

        public void setIntake(String intake) {
            this.intake = intake;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getSemester() {
            return semester;
        }

        public void setSemester(String semester) {
            this.semester = semester;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public String getInquirieType() {
            return InquirieType;
        }

        public void setInquirieType(String InquirieType) {
            this.InquirieType = InquirieType;
        }

        public String getSubjectName() {
            return subjectName;
        }

        public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
        }

        public String getExamType() {
            return examType;
        }

        public void setExamType(String examType) {
            this.examType = examType;
        }

        public String getdate() {
            return date;
        }

        public void setdate(String date) {
            this.date = date;
        }

        public String gettime() {
            return time;
        }

        public void settime(String time) {
            this.time = time;
        }

        public String getOtherIssue() {
            return otherIssue;
        }

        public void setOtherIssue(String otherIssue) {
            this.otherIssue = otherIssue;
        }

    }

    //-----------------------------------------------------------------------
    public class Course {         //for the course details

        String degreeType;
        String degreeName;
        String country;
        String faculty;
        String entityRequirnment;
        String ProgrammDuration;
        String Schedule;
        String degreeid;
        String intake;
        String fee;
        String Universityname;

        public Course(String degreeType, String degreeName, String country, String faculty, String entityRequirnment, String ProgrammDuration, String Schedule, String degreeid, String intake, String fee,String Universityname) {
            this.degreeType = degreeType;
            this.degreeName = degreeName;
            this.country = country;
            this.faculty = faculty;
            this.entityRequirnment = entityRequirnment;
            this.ProgrammDuration = ProgrammDuration;
            this.Schedule = Schedule;
            this.degreeid = degreeid;
            this.intake = intake;
            this.fee = fee;
            this.Universityname=Universityname;
        }

        public String getUniversityname() {
            return Universityname;
        }

        public void setUniversityname(String Universityname) {
            this.Universityname = Universityname;
        }

        public String getDegreeType() {
            return degreeType;
        }

        public void setDegreeType(String degreeType) {
            this.degreeType = degreeType;
        }

        public String getDegreeName() {
            return degreeName;
        }

        public void setDegreeName(String degreeName) {
            this.degreeName = degreeName;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String getEntityRequirnment() {
            return entityRequirnment;
        }

        public void setEntityRequirnment(String entityRequirnment) {
            this.entityRequirnment = entityRequirnment;
        }

        public String getProgrammDuration() {
            return ProgrammDuration;
        }

        public void setProgrammDuration(String ProgrammDuration) {
            this.ProgrammDuration = ProgrammDuration;
        }

        public String getSchedule() {
            return Schedule;
        }

        public void setSchedule(String Schedule) {
            this.Schedule = Schedule;
        }

        public String getdegreeid() {
            return degreeid;
        }

        public void setdegreeid(String Registration) {
            this.degreeid = Registration;
        }

        public String getIntake() {
            return intake;
        }

        public void setIntake(String intake) {
            this.intake = intake;
        }

        public String getFee() {
            return fee;
        }

        public void setFee(String fee) {
            this.fee = fee;
        }

 
        
        
        
    }


    //------------------------------------------------------------------
    public class HelpStudent {

     String helpStudnet;

        public HelpStudent(String helpStudnet) {
            this.helpStudnet = helpStudnet;
        }

        public String getHelpStudnet() {
            return helpStudnet;
        }

        public void setHelpStudnet(String helpStudnet) {
            this.helpStudnet = helpStudnet;
        }
     
    }

}
