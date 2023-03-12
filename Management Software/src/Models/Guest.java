package Models;




//----------------------------------------------------------------------------------------------------------

public class Guest {

 
    public class StudentRegisrationGuest {  //for the StudentRegisrationGuest panal

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

        public StudentRegisrationGuest(String name, String ID, String email, String phone, String degreeType, String degreeName, String registerYear, String intake, String year, String semester, String batch,String studentIssue) {
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
    
    public class Forgotpassword {   //for the Forgotpassword issues

        String logintype;
        String userID;
        String NIC;
        String name;
        String email;


        public Forgotpassword(String logintype, String userID, String NIC, String name, String email) {
            this.logintype = logintype;
            this.userID = userID;
            this.NIC = NIC;
            this.name = name;
            this.email = email;
        }

        public String getlogintype() {
            return logintype;
        }

        public void setlogintype(String logintype) {
            this.logintype = logintype;
        }

        public String getuserID() {
            return userID;
        }

        public void setuserID(String userID) {
            this.userID = userID;
        }

        public String getNIC() {
            return NIC;
        }

        public void setNIC(String NIC) {
            this.NIC = NIC;
        }

        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }

        public String getemail() {
            return email;
        }

        public void setemail(String email) {
            this.email = email;
        }

    }
    
        
//---------------------------------------------------------------------------------------------------------------------------------
    
    public class HelpGuest {

     String helpGuest;

        public HelpGuest(String helpGuest) {
            this.helpGuest = helpGuest;
        }

        public String getHelpGuest() {
            return helpGuest;
        }

        public void setHelpGuest(String helpGuest) {
            this.helpGuest = helpGuest;
        }
     
    }

}
