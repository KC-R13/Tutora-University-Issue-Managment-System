package Models;




//----------------------------------------------------------------------------------------------------------

public class Employer {

 
    public class myissuesEmployer {   //for the general examination issues
        
        String issueid;
        String issuetype;
        String inquirytype;
        String name;
        String itnumber;
        String email;
        String phone;
        String degreetype;
        String degree;
        String registerdyear;
        String year;
        String intake;
        String semester;
        String batch;
        String subject;
        String exam;
        String date;
        String time;
        String comment;
        String details;
        String employerID;
        int issueid1;
        

        public myissuesEmployer(String issueid,String issuetype,String inquirytype,String name,String itnumber,String email,String phone,String degreetype,String degree,String registerdyear,String year,String intake,String semester,String batch,String subject,String exam,String date,String time,String comment,String details,String employerID) {

            this.issueid = issueid;
            this.issuetype = issuetype;
            this.inquirytype = inquirytype;
            this.name = name;
            this.itnumber = itnumber;
            this.email = email;
            this.phone = phone;
            this.degreetype = degreetype;
            this.degree = degree;
            this.registerdyear = registerdyear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.subject = subject;
            this.exam = exam;
            this.date = date;
            this.time = time;
            this.comment = comment;
            this.details = details;
            this.employerID = employerID;

        }
        
           public myissuesEmployer(String comment,int issueid1)
        {
            this.comment=comment;
            this.issueid1=issueid1;
        }
        
        public String getissueid() {
            return issueid;
        }

        public void setissueid(String issueid) {
            this.issueid = issueid;
        }
        
        public String getissuetype() {
            return issuetype;
        }

        public void setissuetype(String issuetype) {
            this.issuetype = issuetype;
        }
        
        public String getinquirytype() {
            return inquirytype;
        }

        public void setinquirytype(String inquirytype) {
            this.inquirytype = inquirytype;
        }
        
        public String getname() {
            return name;
        }
        
        public void setname(String name) {
            this.name = name;
        }
        
        public String getitnumber() {
            return itnumber;
        }
        
        public void setitnumber(String itnumber) {
            this.itnumber = itnumber;
        }
        
        public String getemail() {
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
        
        public String getdegreetype() {
            return degreetype;
        }

        public void setdegreetype(String degreetype) {
            this.degreetype = degreetype;
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
        
        public String getintake() {
            return intake;
        }

        public void setintake(String intake) {
            this.intake = intake;
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
        
        public String getcomment() {
            return comment;
        }

        public void setcomment(String comment) {
            this.comment = comment;
        }
        
        public String getdetails() {
            return details;
        }

        public void setdetails(String details) {
            this.details = details;
        }
        
        public String getemployerID() {
            return employerID;
        }

        public void setemployerID(String employerID) {
            this.employerID = employerID;
        }
        
        public int getissueid1() {
            return issueid1;
        }

        public void setissueid1(int issueid1) {
            this.issueid1 = issueid1;
        }
        
        
    }

    //--------------------------------------------------------------------------------------------
    
    public class AllissuesEmployer {   //for the general examination issues
        
        String issueid;
        String issuetype;
        String inquirytype;
        String name;
        String itnumber;
        String email;
        String phone;
        String degreetype;
        String degree;
        String registerdyear;
        String year;
        String intake;
        String semester;
        String batch;
        String subject;
        String exam;
        String date;
        String time;
        String comment;
        String details;
        String employerID;
        
        
        public AllissuesEmployer(String issueid,String issuetype,String inquirytype,String name,String itnumber,String email,String phone,String degreetype,String degree,String registerdyear,String year,String intake,String semester,String batch,String subject,String exam,String date,String time,String comment,String details,String employerID) {
            
            this.issueid = issueid;
            this.issuetype = issuetype;
            this.inquirytype = inquirytype;
            this.name = name;
            this.itnumber = itnumber;
            this.email = email;
            this.phone = phone;
            this.degreetype = degreetype;
            this.degree = degree;
            this.registerdyear = registerdyear;
            this.intake = intake;
            this.year = year;
            this.semester = semester;
            this.batch = batch;
            this.subject = subject;
            this.exam = exam;
            this.date = date;
            this.time = time;
            this.comment = comment;
            this.details = details;
            this.employerID = employerID;

        }
        
        //second constructor to pass the comment
        
        
        
     
        public String getissueid() {
            return issueid;
        }

        public void setissueid(String issueid) {
            this.issueid = issueid;
        }
        
        public String getissuetype() {
            return issuetype;
        }

        public void setissuetype(String issuetype) {
            this.issuetype = issuetype;
        }
        
        public String getinquirytype() {
            return inquirytype;
        }

        public void setinquirytype(String inquirytype) {
            this.inquirytype = inquirytype;
        }
        
        public String getname() {
            return name;
        }
        
        public void setname(String name) {
            this.name = name;
        }
        
        public String getitnumber() {
            return itnumber;
        }
        
        public void setitnumber(String itnumber) {
            this.itnumber = itnumber;
        }
        
        public String getemail() {
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
        
        public String getdegreetype() {
            return degreetype;
        }

        public void setdegreetype(String degreetype) {
            this.degreetype = degreetype;
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
        
        public String getintake() {
            return intake;
        }

        public void setintake(String intake) {
            this.intake = intake;
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
        
        public String getcomment() {
            return comment;
        }

        public void setcomment(String comment) {
            this.comment = comment;
        }
        
        public String getdetails() {
            return details;
        }

        public void setdetails(String details) {
            this.details = details;
        }
        
        public String getemployerID() {
            return employerID;
        }

        public void setemployerID(String employerID) {
            this.employerID = employerID;
        }
        
        
    }
    
        
//---------------------------------------------------------------------------------------------------------------------------------
    public class ManagecoursesEmployer {     //for other examination related issues
        
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
        

        public ManagecoursesEmployer(String degreetype, String uniname, String cuntry, String degreename, String degreeid, String faculty,
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
        

    }

    //-----------------------------------------------------------------------
    public class MonthlyHistoryOfIssuesEmployer {         //for the course details

    }

    //------------------------------------------------------------------
    public class HelpEmployer {

     String helpEmployer;

        public HelpEmployer(String helpEmployer) {
            this.helpEmployer = helpEmployer;
        }

        public String getHelpEmployer() {
            return helpEmployer;
        }

        public void setHelpEmployer(String helpEmployer) {
            this.helpEmployer = helpEmployer;
        }
     
    }

}
