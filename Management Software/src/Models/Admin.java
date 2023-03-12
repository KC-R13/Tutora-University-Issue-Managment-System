package Models;




//----------------------------------------------------------------------------------------------------------

public  class Admin {

    public  class Adduser {  //for the student registration panal

        String usertype;
        String name;
        String userid;
        String email;
        String password;
        String phoneNo;
        String reenterpassword;
        String address;
   

        public Adduser(String usertype,String userid,String name,String phoneNo,String address,String password,String reenterpassword,String email) {
            this.usertype = usertype;
            this.name = name;
            this.userid = userid;
            this.email = email;
            this.password = password;
            this.phoneNo = phoneNo;
            this.reenterpassword = reenterpassword;
            this.address = address;
            
        }

        public String getusertype() {
            return usertype;
        }

        public void setusertype(String usertype) {
            this.usertype = usertype;
        }
        
        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }
        
        public String getuserid() {
            return userid;
        }

        public void setuserid(String userid) {
            this.userid = userid;
        }
        
        public String getemail() {
            return email;
        }

        public void setemail(String email) {
            this.email = email;
        }
        
        public String getpassword() {
            return password;
        }

        public void setpassword(String password) {
            this.password = password;
        }
        
        public String getphoneNo() {
            return phoneNo;
        }

        public void setphoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }
        
        public String getreenterpassword() {
            return reenterpassword;
        }

        public void setreenterpassword(String reenterpassword) {
            this.reenterpassword = reenterpassword;
        }
        
        public String getaddress() {
            return address;
        }

        public void setaddress(String address) {
            this.address = address;
        }

        public String getsearch() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
           
    }
    //--------------------------------------------------------------------------------------------
    
//    public class searchAdmin {
//        
//        String search;
//        
//         public searchAdmin(String search){
//         this.search = search;
//         
//         }
//         
//         public String getsearch() {
//            return search;
//        }
//
//        public void setsearch(String search) {
//            this.search = search;
//        }
//        
//    }

    //--------------------------------------------------------------------------------------------
    
    public class AllissuesAdmin {   //for the general examination issues

        String email;
        String phone;
        String degree;
        String registerdyear;
        String year;
        String batch;
        String semester;
        String subject;
        String exam;
        String date;
        String time;
        String details;
        

        public AllissuesAdmin(String email, String phone, String degree, String registerdyear, String year, String batch, String semester,
                String subject,String exam,String date,String time,String details) {

            this.email = email;
            this.phone = phone;
            this.degree = degree;
            this.registerdyear = registerdyear;
            this.year = year;
            this.batch = batch;
            this.semester = semester;
            this.subject = subject;
            this.exam = exam;
            this.date = date;
            this.time = time;
            this.details = details;

        }
        
        public String getEmail() {
            return email;
        }

        public void setemail(String email) {
            this.email = email;
        }
        
        public String getphone() {
            return phone;
        }

        public void setphone(String phone) {
            this.phone = phone;
        }
        
        public String getdegree() {
            return degree;
        }

        public void setdegree(String degree) {
            this.degree = degree;
        }
        
        public String getregisterdyear() {
            return registerdyear;
        }

        public void setregisterdyear(String registerdyear) {
            this.registerdyear = registerdyear;
        }
        
        public String getyear() {
            return year;
        }

        public void setyear(String year) {
            this.year = year;
        }
        
        public String getbatch() {
            return batch;
        }

        public void setbatch(String batch) {
            this.batch = batch;
        }
        
        public String getsemester() {
            return semester;
        }

        public void setsemester(String semester) {
            this.semester = semester;
        }
        
        public String getsubject() {
            return subject;
        }

        public void setsubject(String subject) {
            this.subject = subject;
        }
        
        public String getexam() {
            return exam;
        }

        public void setexam(String exam) {
            this.exam = exam;
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
        
        public String getdetails() {
            return details;
        }

        public void setdetails(String details) {
            this.details = details;
        }
        
    }
    
        
//---------------------------------------------------------------------------------------------------------------------------------
    public class ManagecoursesAdmin {     //for other examination related issues
        
        String degreetype;
        String uniname;
        String cuntry;
        String degreename;
        String degreeid;
        String faculty;
        String entryreqirements;
        String programmeduration;
        String programmeschedule;
        String intake;
        String coursefee;
        

        public ManagecoursesAdmin(String degreetype, String uniname, String cuntry, String degreename, String degreeid, String faculty,
                String entryreqirements,String programmeduration,String programmeschedule,String intake,String coursefee) {

            this.degreetype = degreetype;
            this.uniname = uniname;
            this.cuntry = cuntry;
            this.degreename = degreename;
            this.degreeid = degreeid;
            this.faculty = faculty;
            this.entryreqirements = entryreqirements;
            this.programmeduration = programmeduration;
            this.programmeschedule = programmeschedule;
            this.intake = intake;
            this.coursefee = coursefee;

        }
        
        public String getdegreetype() {
            return degreetype;
        }

        public void setdegreetype(String degreetype) {
            this.degreetype = degreetype;
        }
        
        public String getuniname() {
            return uniname;
        }

        public void setuniname(String uniname) {
            this.uniname = uniname;
        }
        
        public String getcuntry() {
            return cuntry;
        }

        public void setcuntry(String cuntry) {
            this.cuntry = cuntry;
        }
        
        public String getdegreename() {
            return degreename;
        }

        public void setdegreename(String degreename) {
            this.degreename = degreename;
        }
        
        public String getdegreeid() {
            return degreeid;
        }

        public void setdegreeid(String degreeid) {
            this.degreeid = degreeid;
        }
        
        public String getfaculty() {
            return faculty;
        }

        public void setfaculty(String faculty) {
            this.faculty = faculty;
        }
        
        public String getentryreqirements() {
            return entryreqirements;
        }

        public void setentryreqirements(String entryreqirements) {
            this.entryreqirements = entryreqirements;
        }
        
        public String getprogrammeduration() {
            return programmeduration;
        }

        public void setprogrammeduration(String programmeduration) {
            this.programmeduration = programmeduration;
        }
        
        public String getprogrammeschedule() {
            return programmeschedule;
        }

        public void setprogrammeschedule(String programmeschedule) {
            this.programmeschedule = programmeschedule;
        }
        
        public String getintake() {
            return intake;
        }

        public void setintake(String intake) {
            this.intake = intake;
        }
        
        public String getcoursefee() {
            return coursefee;
        }

        public void setcoursefee(String coursefee) {
            this.coursefee = coursefee;
        }
        
        public String getsearch() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    //-----------------------------------------------------------------------
    public class MonthlyHistoryOfIssuesAdmin {         //for the course details

    }

    //------------------------------------------------------------------
    public class HelpAdmin {

     String helpAdmin;

        public HelpAdmin(String helpAdmin) {
            this.helpAdmin = helpAdmin;
        }

        public String getHelpAdmin() {
            return helpAdmin;
        }

        public void setHelpAdmin(String helpAdmin) {
            this.helpAdmin = helpAdmin;
        }
     
    }

}
