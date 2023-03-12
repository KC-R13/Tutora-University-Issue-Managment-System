/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Models.Employer;
import Controler.EmployerController;
import Models.UserContext;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GARFIELD
 */
public class EmployerMainView extends javax.swing.JFrame {

    UserContext userContext ; 
    
    Employer objEmployer;
    Employer[] arrayEmployer;

    Employer.myissuesEmployer objmyissuesEmployer;
    Employer.myissuesEmployer[] arraymyissuesEmployer;

    Employer.AllissuesEmployer objAllissuesEmployer;
    Employer.AllissuesEmployer[] arrayAllissuesEmployer;

    Employer.ManagecoursesEmployer objManagecoursesEmployer;
    Employer.ManagecoursesEmployer[] arrayManagecoursesEmployer;
    int index;

    EmployerController objEmployerController;

    List<Employer.ManagecoursesEmployer> list2;
    List<Employer.AllissuesEmployer> list3;
    List<Employer.AllissuesEmployer> list4;
    List<Employer.myissuesEmployer> list5;

    /**
     * Creates new form Student_main_page_view
     */
    public EmployerMainView(UserContext userContext) {
        initComponents();
        setSize(1250, 800);
        icon();
        arrayEmployer = new Employer[1000];
        arraymyissuesEmployer = new Employer.myissuesEmployer[1000];
        arrayManagecoursesEmployer = new Employer.ManagecoursesEmployer[1000];
        arrayManagecoursesEmployer = new Employer.ManagecoursesEmployer[1000];
        objEmployerController = new EmployerController();

               
        
        userContext =userContext ; 
        
        objEmployerController.setUserContext(userContext);
        objEmployerController.GetID();
        
        lblEMname.setText(userContext.getName());
        lblEMID.setText(userContext.getID());
        
        
        
        PopulateManagecoursesEmployerList();
        PopulateAllissuesEmployerList();
        PopulateCompletedAllissuesEmployerList();
        PopulatemyAllissuesEmployerList(userContext.getID());
        
        

    }

    EmployerMainView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void PopulateManagecoursesEmployerList() {
        // load data from database
        list2 = objEmployerController.GetManagecoursesEmployer("");

        System.out.println(list2);

        // bind data into JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Degree Type");
        model.addColumn("Uni Name");
        model.addColumn("Cuntry");
        model.addColumn("Degree Name");
        model.addColumn("Degree ID");
        model.addColumn("Faculty");
        model.addColumn("Entry Reqirements");
        model.addColumn("Programme Duration");
        model.addColumn("Programme Shedule");
        model.addColumn("Inake");
        model.addColumn("Course Fee");

//        System.out.println(list2);
        for (int i = 0; i < list2.size(); i++) {

            // Create the first row
            Object[] rowData = new Object[]{
                list2.get(i).getdegreetype(),
                list2.get(i).getuniname(),
                list2.get(i).getcuntry(),
                list2.get(i).getdegreename(),
                list2.get(i).getdegreeid(),
                list2.get(i).getfaculty(),
                list2.get(i).getentryreqirements(),
                list2.get(i).getprogrammeduration(),
                list2.get(i).getprogrammeschedule(),
                list2.get(i).getintake(),
                list2.get(i).getcoursefee()

            };

            model.insertRow(0, rowData);
        }

        tabalemanagecourses.setModel(model);

    }
    
    private void PopulateAllissuesEmployerList() {
        // load data from database
        list3 = objEmployerController.GetAllissuesEmployer("");

        System.out.println(list3);

        // bind data into JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Issue ID");
        model.addColumn("Issue Type");
        model.addColumn("Inquiry Type");
        model.addColumn("Student Name");
        model.addColumn("Student ID");
        model.addColumn("Email");
        model.addColumn("Phone No");
        model.addColumn("Degree Type");
        model.addColumn("Degree Name");
        model.addColumn("Registerd Year");
        model.addColumn("Intake");
        model.addColumn("Year");
        model.addColumn("Semester");
        model.addColumn("Batch");
        model.addColumn("Suubject Name");
        model.addColumn("Exam");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Comment");
        model.addColumn("Details");
        model.addColumn("Employer ID");

//        System.out.println(list2);
        for (int i = 0; i < list3.size(); i++) {

            // Create the first row
            Object[] rowData = new Object[]{
                list3.get(i).getissueid(),
                list3.get(i).getissuetype(),
                list3.get(i).getinquirytype(),
                list3.get(i).getname(),
                list3.get(i).getitnumber(),
                list3.get(i).getemail(),
                list3.get(i).getphone(),
                list3.get(i).getdegreetype(),
                list3.get(i).getdegree(),
                list3.get(i).getregisterdyear(),
                list3.get(i).getintake(),
                list3.get(i).getyear(),
                list3.get(i).getsemester(),
                list3.get(i).getbatch(),
                list3.get(i).getsubject(),
                list3.get(i).getexam(),
                list3.get(i).getdate(),
                list3.get(i).gettime(),
                list3.get(i).getcomment(),
                list3.get(i).getdetails(),
                list3.get(i).getemployerID()

            };

            model.insertRow(0, rowData);
        }

        TBallissuesEM.setModel(model);

    }
    
    private void PopulateCompletedAllissuesEmployerList() {
        // load data from database
        list4 = objEmployerController.GetCompletedAllissuesEmployer("");

        System.out.println(list4);

        // bind data into JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Issue ID");
        model.addColumn("Issue Type");
        model.addColumn("Inquiry Type");
        model.addColumn("Student Name");
        model.addColumn("Student ID");
        model.addColumn("Email");
        model.addColumn("Phone No");
        model.addColumn("Degree Type");
        model.addColumn("Degree Name");
        model.addColumn("Registerd Year");
        model.addColumn("Intake");
        model.addColumn("Year");
        model.addColumn("Semester");
        model.addColumn("Batch");
        model.addColumn("Suubject Name");
        model.addColumn("Exam");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Comment");
        model.addColumn("Details");
        model.addColumn("Employer ID");

//        System.out.println(list2);
        for (int i = 0; i < list4.size(); i++) {

            // Create the first row
            Object[] rowData = new Object[]{
                list4.get(i).getissueid(),
                list4.get(i).getissuetype(),
                list4.get(i).getinquirytype(),
                list4.get(i).getname(),
                list4.get(i).getitnumber(),
                list4.get(i).getemail(),
                list4.get(i).getphone(),
                list4.get(i).getdegreetype(),
                list4.get(i).getdegree(),
                list4.get(i).getregisterdyear(),
                list4.get(i).getintake(),
                list4.get(i).getyear(),
                list4.get(i).getsemester(),
                list4.get(i).getbatch(),
                list4.get(i).getsubject(),
                list4.get(i).getexam(),
                list4.get(i).getdate(),
                list4.get(i).gettime(),
                list4.get(i).getcomment(),
                list4.get(i).getdetails(),
                list4.get(i).getemployerID()

            };

            model.insertRow(0, rowData);
        }

        TBComAllIssuesEM.setModel(model);

    }
    
    private void PopulatemyAllissuesEmployerList(String Id) {
        // load data from database
        list5 = objEmployerController.GetmyissuesEmployer(Id);

//        System.out.println("wedada  "+list5);

        // bind data into JTable
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Issue ID");
        model.addColumn("Issue Type");
        model.addColumn("Inquiry Type");
        model.addColumn("Student Name");
        model.addColumn("Student ID");
        model.addColumn("Email");
        model.addColumn("Phone No");
        model.addColumn("Degree Type");
        model.addColumn("Degree Name");
        model.addColumn("Registerd Year");
        model.addColumn("Intake");
        model.addColumn("Year");
        model.addColumn("Semester");
        model.addColumn("Batch");
        model.addColumn("Suubject Name");
        model.addColumn("Exam");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Comment");
        model.addColumn("Details");
        model.addColumn("Employer ID");

//        System.out.println(list2);
        for (int i = 0; i < list5.size(); i++) {

            // Create the first row
            Object[] rowData = new Object[]{
                list5.get(i).getissueid(),
                list5.get(i).getissuetype(),
                list5.get(i).getinquirytype(),
                list5.get(i).getname(),
                list5.get(i).getitnumber(),
                list5.get(i).getemail(),
                list5.get(i).getphone(),
                list5.get(i).getdegreetype(),
                list5.get(i).getdegree(),
                list5.get(i).getregisterdyear(),
                list5.get(i).getintake(),
                list5.get(i).getyear(),
                list5.get(i).getsemester(),
                list5.get(i).getbatch(),
                list5.get(i).getsubject(),
                list5.get(i).getexam(),
                list5.get(i).getdate(),
                list5.get(i).gettime(),
                list5.get(i).getcomment(),
                list5.get(i).getdetails(),
                list5.get(i).getemployerID()

            };

            model.insertRow(0, rowData);
        }

        tblEMMyissues.setModel(model);

    }

    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/Tutora logo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblEMID = new javax.swing.JLabel();
        lblEMname = new javax.swing.JLabel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        btn_EXIG1 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        btn_EXIG = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        btn_ERI = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        btn_CD = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        btn_help = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        mainpanel = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEMMyissues = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        allemail8 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtComment1 = new javax.swing.JTextArea();
        allemail9 = new javax.swing.JLabel();
        allemail10 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtDetails1 = new javax.swing.JTextArea();
        alldetails2 = new javax.swing.JLabel();
        allemail12 = new javax.swing.JLabel();
        allemail13 = new javax.swing.JLabel();
        txtStudentID1 = new javax.swing.JLabel();
        txtissuetype1 = new javax.swing.JLabel();
        allemail14 = new javax.swing.JLabel();
        txtissueID1 = new javax.swing.JLabel();
        alldetails3 = new javax.swing.JLabel();
        allemail16 = new javax.swing.JLabel();
        txtStudentemail1 = new javax.swing.JLabel();
        allemail17 = new javax.swing.JLabel();
        allemail18 = new javax.swing.JLabel();
        allemail19 = new javax.swing.JLabel();
        allemail20 = new javax.swing.JLabel();
        allemail21 = new javax.swing.JLabel();
        txtStudentname1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        typecomment = new javax.swing.JTextArea();
        tab2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBallissuesEM = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        allemail = new javax.swing.JLabel();
        allyear = new javax.swing.JLabel();
        alldetails = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        alldetails1 = new javax.swing.JLabel();
        txtissueID = new javax.swing.JLabel();
        allemail2 = new javax.swing.JLabel();
        txtissuetype = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JLabel();
        allemail5 = new javax.swing.JLabel();
        allemail6 = new javax.swing.JLabel();
        txtEmployerID = new javax.swing.JLabel();
        allemail1 = new javax.swing.JLabel();
        allemail3 = new javax.swing.JLabel();
        allemail4 = new javax.swing.JLabel();
        allemail7 = new javax.swing.JLabel();
        tab_3_2 = new javax.swing.JPanel();
        searchMCtxt = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabalemanagecourses = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        tab3 = new javax.swing.JPanel();
        txtfaculty = new javax.swing.JTextField();
        txtuniname = new javax.swing.JTextField();
        txtcuntry = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtcoursefee = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtdgreename = new javax.swing.JTextField();
        Cboxdgreetype = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtprogrammeduration = new javax.swing.JTextArea();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        txtdgreeid = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtentryrequirements = new javax.swing.JTextArea();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtprogrammeschedule = new javax.swing.JTextArea();
        jLabel73 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtintakes = new javax.swing.JTextArea();
        tab4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBComAllIssuesEM = new javax.swing.JTable();
        tab6 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        helptEmployer = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(36, 47, 65));

        jPanel15.setBackground(new java.awt.Color(97, 212, 195));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employer icon 100.png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EMPLOYER");

        lblEMID.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblEMID.setForeground(new java.awt.Color(255, 255, 255));
        lblEMID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEMID.setText("IT223365420");

        lblEMname.setBackground(new java.awt.Color(255, 255, 255));
        lblEMname.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblEMname.setForeground(new java.awt.Color(255, 255, 255));
        lblEMname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEMname.setText("KC Rathnayaka");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEMID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEMname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEMname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblEMID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btn_1.setBackground(new java.awt.Color(36, 47, 65));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });
        btn_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_1.setBackground(new java.awt.Color(255, 255, 255));
        ind_1.setOpaque(false);

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_1.add(ind_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_EXIG1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_EXIG1.setForeground(new java.awt.Color(255, 255, 255));
        btn_EXIG1.setText("My Issues");
        btn_1.add(btn_EXIG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        btn_2.setBackground(new java.awt.Color(36, 47, 65));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
        });
        btn_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_2.setBackground(new java.awt.Color(255, 255, 255));
        ind_2.setOpaque(false);

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_2.add(ind_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_EXIG.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_EXIG.setForeground(new java.awt.Color(255, 255, 255));
        btn_EXIG.setText("All Issues");
        btn_2.add(btn_EXIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        btn_3.setBackground(new java.awt.Color(36, 47, 65));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });
        btn_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_3.setBackground(new java.awt.Color(255, 255, 255));
        ind_3.setOpaque(false);

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_3.add(ind_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_ERI.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_ERI.setForeground(new java.awt.Color(255, 255, 255));
        btn_ERI.setText("Manage Courses");
        btn_3.add(btn_ERI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        btn_4.setBackground(new java.awt.Color(36, 47, 65));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });
        btn_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_4.setBackground(new java.awt.Color(255, 255, 255));
        ind_4.setOpaque(false);

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_4.add(ind_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_CD.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_CD.setForeground(new java.awt.Color(255, 255, 255));
        btn_CD.setText("Monthly history of issues");
        btn_4.add(btn_CD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        btn_6.setBackground(new java.awt.Color(36, 47, 65));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
        });
        btn_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_6.setBackground(new java.awt.Color(255, 255, 255));
        ind_6.setOpaque(false);

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btn_6.add(ind_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));

        btn_help.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_help.setForeground(new java.awt.Color(255, 255, 255));
        btn_help.setText("Help");
        btn_6.add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 290, 60));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(btn_3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(btn_4, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(btn_6, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        mainpanel.setPreferredSize(new java.awt.Dimension(872, 758));
        mainpanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mainpanelMouseMoved(evt);
            }
        });
        mainpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainpanelMousePressed(evt);
            }
        });
        mainpanel.setLayout(new javax.swing.OverlayLayout(mainpanel));

        tab1.setBackground(new java.awt.Color(255, 255, 255));
        tab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tab1MouseMoved(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("My Issues");

        jScrollPane5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jScrollPane5MouseMoved(evt);
            }
        });

        tblEMMyissues.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEMMyissues.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Issue ID", "Category", "Type", "IT number or ID number", "Student Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEMMyissues.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblEMMyissues.setAutoscrolls(false);
        tblEMMyissues.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEMMyissues.setRowHeight(30);
        tblEMMyissues.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tblEMMyissues.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblEMMyissues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEMMyissuesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblEMMyissues);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        allemail8.setBackground(new java.awt.Color(255, 255, 255));
        allemail8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail8.setText("-");

        txtComment1.setColumns(20);
        txtComment1.setRows(5);
        jScrollPane13.setViewportView(txtComment1);

        allemail9.setBackground(new java.awt.Color(255, 255, 255));
        allemail9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail9.setText("-");

        allemail10.setBackground(new java.awt.Color(255, 255, 255));
        allemail10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail10.setText("-");

        txtDetails1.setColumns(20);
        txtDetails1.setRows(5);
        jScrollPane14.setViewportView(txtDetails1);

        alldetails2.setBackground(new java.awt.Color(255, 255, 255));
        alldetails2.setText("Details");

        allemail12.setBackground(new java.awt.Color(255, 255, 255));
        allemail12.setText("Student ID");

        allemail13.setBackground(new java.awt.Color(255, 255, 255));
        allemail13.setText("Issue ID");

        txtStudentID1.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentID1.setText(" ");

        txtissuetype1.setBackground(new java.awt.Color(255, 255, 255));
        txtissuetype1.setText(" ");

        allemail14.setBackground(new java.awt.Color(255, 255, 255));
        allemail14.setText("Issue Type");

        txtissueID1.setBackground(new java.awt.Color(255, 255, 255));
        txtissueID1.setText(" ");

        alldetails3.setBackground(new java.awt.Color(255, 255, 255));
        alldetails3.setText("Comment");

        allemail16.setBackground(new java.awt.Color(255, 255, 255));
        allemail16.setText("Student Mail");

        txtStudentemail1.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentemail1.setText(" ");

        allemail17.setBackground(new java.awt.Color(255, 255, 255));
        allemail17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail17.setText("-");

        allemail18.setBackground(new java.awt.Color(255, 255, 255));
        allemail18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail18.setText("-");

        allemail19.setBackground(new java.awt.Color(255, 255, 255));
        allemail19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail19.setText("-");

        allemail20.setBackground(new java.awt.Color(255, 255, 255));
        allemail20.setText("Student Name");

        allemail21.setBackground(new java.awt.Color(255, 255, 255));
        allemail21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail21.setText("-");

        txtStudentname1.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentname1.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(allemail14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(allemail9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtissuetype1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(allemail12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(allemail8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtStudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(allemail13)
                            .addGap(19, 19, 19)
                            .addComponent(allemail10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtissueID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(allemail20)
                                .addGap(19, 19, 19)
                                .addComponent(allemail21, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(allemail18, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(allemail16)
                                    .addComponent(allemail19, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allemail17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudentemail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStudentname1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(alldetails2)
                        .addComponent(alldetails3))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail13)
                    .addComponent(txtissueID1)
                    .addComponent(allemail10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail14)
                    .addComponent(txtissuetype1)
                    .addComponent(allemail9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail12)
                    .addComponent(txtStudentID1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allemail8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail20)
                    .addComponent(txtStudentname1)
                    .addComponent(allemail21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail16)
                    .addComponent(allemail17)
                    .addComponent(txtStudentemail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(allemail18)
                .addGap(64, 64, 64)
                .addComponent(allemail19)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(121, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(alldetails2)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(alldetails3)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("Comment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        typecomment.setColumns(20);
        typecomment.setRows(5);
        jScrollPane1.setViewportView(typecomment);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainpanel.add(tab1);

        tab2.setBackground(new java.awt.Color(255, 255, 255));
        tab2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("All Issues");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TBallissuesEM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TBallissuesEM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Issue ID", "Category", "Type", "IT number or ID number", "Student name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBallissuesEM.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TBallissuesEM.setRowHeight(30);
        TBallissuesEM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBallissuesEMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBallissuesEM);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        allemail.setBackground(new java.awt.Color(255, 255, 255));
        allemail.setText("Issue ID");

        allyear.setBackground(new java.awt.Color(255, 255, 255));
        allyear.setText("Year");

        alldetails.setBackground(new java.awt.Color(255, 255, 255));
        alldetails.setText("Details -");

        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        jScrollPane11.setViewportView(txtDetails);

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane12.setViewportView(txtComment);

        alldetails1.setBackground(new java.awt.Color(255, 255, 255));
        alldetails1.setText("Comment -");

        txtissueID.setBackground(new java.awt.Color(255, 255, 255));
        txtissueID.setText(" ");

        allemail2.setBackground(new java.awt.Color(255, 255, 255));
        allemail2.setText("Issue Type");

        txtissuetype.setBackground(new java.awt.Color(255, 255, 255));
        txtissuetype.setText(" ");

        txtStudentID.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentID.setText(" ");

        allemail5.setBackground(new java.awt.Color(255, 255, 255));
        allemail5.setText("Student ID");

        allemail6.setBackground(new java.awt.Color(255, 255, 255));
        allemail6.setText("Employer ID");

        txtEmployerID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployerID.setText(" ");

        allemail1.setBackground(new java.awt.Color(255, 255, 255));
        allemail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail1.setText("-");

        allemail3.setBackground(new java.awt.Color(255, 255, 255));
        allemail3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail3.setText("-");

        allemail4.setBackground(new java.awt.Color(255, 255, 255));
        allemail4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail4.setText("-");

        allemail7.setBackground(new java.awt.Color(255, 255, 255));
        allemail7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allemail7.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(allemail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allemail1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(allemail2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(allemail7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(allemail3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtissuetype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(544, 544, 544))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtissueID, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(529, 529, 529)))
                        .addComponent(allyear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alldetails)
                                    .addComponent(alldetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                                    .addComponent(jScrollPane11)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(allemail5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allemail4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(allemail6)
                                .addGap(19, 19, 19)
                                .addComponent(txtEmployerID, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allyear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allemail2)
                            .addComponent(txtissuetype)
                            .addComponent(allemail3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allemail)
                            .addComponent(txtissueID)
                            .addComponent(allemail1))))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail5)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allemail4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allemail6)
                    .addComponent(txtEmployerID)
                    .addComponent(allemail7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alldetails)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alldetails1)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 868, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.add(tab2);

        tab_3_2.setBackground(new java.awt.Color(255, 255, 255));
        tab_3_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tab_3_2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tab_3_2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("Remove");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setText("Update");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setText("Add New");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Manage Coureses");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Next page");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabalemanagecourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Degree name", "Degree Type", "Univercity", "Cuntry"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabalemanagecourses.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabalemanagecourses.setRowHeight(30);
        tabalemanagecourses.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabalemanagecourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabalemanagecoursesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabalemanagecourses);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab_3_2Layout = new javax.swing.GroupLayout(tab_3_2);
        tab_3_2.setLayout(tab_3_2Layout);
        tab_3_2Layout.setHorizontalGroup(
            tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_3_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_3_2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_3_2Layout.createSequentialGroup()
                                .addComponent(searchMCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_3_2Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(tab_3_2Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab_3_2Layout.setVerticalGroup(
            tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_3_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchMCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(tab_3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainpanel.add(tab_3_2);

        tab3.setBackground(new java.awt.Color(255, 255, 255));
        tab3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtfaculty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfacultyActionPerformed(evt);
            }
        });

        txtuniname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtuniname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuninameActionPerformed(evt);
            }
        });

        txtcuntry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcuntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuntryActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Back");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtcoursefee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcoursefee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoursefeeActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Course Fee");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Faculty");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("Dgree name");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Univercity name");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Cuntry");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Add Coureses");

        txtdgreename.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdgreename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdgreenameActionPerformed(evt);
            }
        });

        Cboxdgreetype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cboxdgreetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "External", "Internal" }));
        Cboxdgreetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxdgreetypeActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Degree type");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setText("Entry Requirements");

        txtprogrammeduration.setColumns(20);
        txtprogrammeduration.setRows(5);
        jScrollPane3.setViewportView(txtprogrammeduration);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton16.setText("Add");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton17.setText("Update");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        txtdgreeid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdgreeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdgreeidActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("Programme Duration");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Dgree ID");

        txtentryrequirements.setColumns(20);
        txtentryrequirements.setRows(5);
        jScrollPane6.setViewportView(txtentryrequirements);

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("Programme Schedule");

        txtprogrammeschedule.setColumns(20);
        txtprogrammeschedule.setRows(5);
        jScrollPane7.setViewportView(txtprogrammeschedule);

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("Intakes");

        txtintakes.setColumns(20);
        txtintakes.setRows(5);
        jScrollPane9.setViewportView(txtintakes);

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcoursefee, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfaculty)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                        .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdgreename)
                            .addGroup(tab3Layout.createSequentialGroup()
                                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cboxdgreetype, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tab3Layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtuniname, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)))
                            .addGroup(tab3Layout.createSequentialGroup()
                                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcuntry, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdgreeid, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cboxdgreetype, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtuniname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcuntry, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdgreename, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdgreeid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcoursefee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainpanel.add(tab3);

        tab4.setBackground(new java.awt.Color(255, 255, 255));
        tab4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Monthly histry of Issue");

        TBComAllIssuesEM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TBComAllIssuesEM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Issue ID", "Category", "Type", "IT or ID number", "Student Name", "Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TBComAllIssuesEM.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TBComAllIssuesEM.setRowHeight(30);
        jScrollPane4.setViewportView(TBComAllIssuesEM);

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE))
                .addContainerGap())
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.add(tab4);

        tab6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Help");

        helptEmployer.setColumns(20);
        helptEmployer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        helptEmployer.setRows(5);
        helptEmployer.setText("Employee Overview\n\n\nMy Issues :\n\nThis button redirects you to the “My Issues” page which is allows the employee to view, edit, comment on \nissues, and submit his/her own list of issues.\nWhen an issue is completed and submitted by the employee, the system will send an email to the relevant \nstudent notifying them that their issues has been solved.\n\nAll Issues :\n\nThis button redirects you to the “All Issues” page which includes all the issues that students have \nsubmitted throughout a month.\nEvery employee has the privilege to view All Issues but they cannot edit and comment.\n\nManage courses :\n\nThis button redirects you the “Manage courses” page, where the employee can add, remove, edit courses and \nrelated details.\n\nMonthly History of Issues :\n\nThis buttons redirects you to the “Monthly History of Issues” page which shows the table of monthly issues \nthat has been submitted and completed throughout the past months (and years).");
        jScrollPane10.setViewportView(helptEmployer);

        javax.swing.GroupLayout tab6Layout = new javax.swing.GroupLayout(tab6);
        tab6.setLayout(tab6Layout);
        tab6Layout.setHorizontalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10))
                .addContainerGap())
        );
        tab6Layout.setVerticalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.add(tab6);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back icon 30.png"))); // NOI18N
        jLabel14.setToolTipText("");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize icon 30.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close button icon 30.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 882, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 798, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed
        // TODO add your handling code here:

        setColor(btn_2);
        resetColor(btn_1);
        resetColor(btn_3);
        resetColor(btn_4);
        resetColor(btn_6);
        ind_1.setOpaque(false);
        ind_2.setOpaque(true);
        ind_3.setOpaque(false);
        ind_4.setOpaque(false);
        ind_6.setOpaque(false);
    }//GEN-LAST:event_btn_2MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:

        setColor(btn_3);
        resetColor(btn_1);
        resetColor(btn_2);
        resetColor(btn_4);
        resetColor(btn_6);
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(true);
        ind_4.setOpaque(false);
        ind_6.setOpaque(false);
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        // TODO add your handling code here:

        setColor(btn_4);
        resetColor(btn_1);
        resetColor(btn_2);
        resetColor(btn_3);
        resetColor(btn_6);
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_4.setOpaque(true);
        ind_6.setOpaque(false);
    }//GEN-LAST:event_btn_4MousePressed

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed
        // TODO add your handling code here:

        setColor(btn_6);
        resetColor(btn_1);
        resetColor(btn_2);
        resetColor(btn_3);
        resetColor(btn_4);
        ind_1.setOpaque(false);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_4.setOpaque(false);
        ind_6.setOpaque(true);
    }//GEN-LAST:event_btn_6MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(true);
        tab2.setEnabled(true);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);

    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(true);
        tab_3_2.setEnabled(true);

    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(true);
        tab4.setEnabled(true);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);

    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(true);
        tab6.setEnabled(true);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);

    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        // TODO add your handling code here:
        setColor(btn_1);
        resetColor(btn_2);
        resetColor(btn_3);
        resetColor(btn_4);
        resetColor(btn_6);
        ind_1.setOpaque(true);
        ind_2.setOpaque(false);
        ind_3.setOpaque(false);
        ind_4.setOpaque(false);
        ind_6.setOpaque(false);
    }//GEN-LAST:event_btn_1MousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to sign out ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            dispose();
            LoginView info = new LoginView();
            info.setVisible(true);
        } else if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.CLOSED_OPTION) {

        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you want to continue this action ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.CLOSED_OPTION) {

        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(EmployerMainView.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Comment this Issue ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == 0) {

            String comment = typecomment.getText();
            int issueid1 = Integer.parseInt(txtissueID1.getText());

            objEmployer = objEmployerController.addEmployer();

            arrayEmployer[index] = objEmployer;
            objmyissuesEmployer = objEmployerController.addmyissueEmployer(comment,issueid1);
         //   objManagecoursesEmployer = objEmployerController.addManagecoursesEmployer(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);


            boolean result = objEmployerController.updatemyissueEmployer(objmyissuesEmployer);
            System.out.println(result);

            index++;
            if (result) {
                JOptionPane.showMessageDialog(rootPane, "Comment have been updated to database succesful " + index, "Output", 1);
                typecomment.setText("");
           

            } else {
                JOptionPane.showMessageDialog(rootPane, "Coursee details have not been updated to database succesful " + index, "Output", 1);
            }

//            PopulatemyAllissuesEmployerList(userContext.getID()); //this is the method to call the table details
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here: 
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void mainpanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_mainpanelMousePressed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
    }//GEN-LAST:event_formMouseMoved

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseMoved

    private void mainpanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpanelMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_mainpanelMouseMoved

    private void jScrollPane5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane5MouseMoved
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
    }//GEN-LAST:event_jScrollPane5MouseMoved

    private void tab1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseMoved
        // TODO add your handling code here:
        tab1.setVisible(true);
        tab1.setEnabled(true);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
    }//GEN-LAST:event_tab1MouseMoved

    private void tab_3_2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tab_3_2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_3_2AncestorAdded
    private int xMouse, yMouse;
    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Delete this Course ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == 0) {

            String degreetype = (String) Cboxdgreetype.getSelectedItem();
            String uniname = txtuniname.getText();
            String cuntry = txtcuntry.getText();
            String degreename = txtdgreename.getText();
            String degreeid = txtdgreeid.getText();
            String faculty = txtfaculty.getText();
            String entryreqirements = txtentryrequirements.getText();
            String programmeduration = txtprogrammeduration.getText();
            String programmeschedule = txtprogrammeschedule.getText();
            String intake = txtintakes.getText();
            String coursefee = txtcoursefee.getText();

            objEmployer = objEmployerController.addEmployer();

            arrayEmployer[index] = objEmployer;
            objManagecoursesEmployer = objEmployerController.addManagecoursesEmployer(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);

            boolean result = objEmployerController.deleteManagecoursesEmployerToDB(objManagecoursesEmployer);

            System.out.println(result);

            txtuniname.setText("");
            txtcuntry.setText("");
            txtdgreename.setText("");
            txtdgreeid.setText("");
            txtfaculty.setText("");
            txtentryrequirements.setText("");
            txtprogrammeduration.setText("");
            txtprogrammeschedule.setText("");
            txtintakes.setText("");
            txtcoursefee.setText("");

            PopulateManagecoursesEmployerList(); //this is the method to call the table details
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(true);
        tab3.setEnabled(true);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(true);
        tab3.setEnabled(true);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(true);
        tab3.setEnabled(true);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(false);
        tab_3_2.setEnabled(false);

        txtuniname.setText("");
        txtcuntry.setText("");
        txtdgreename.setText("");
        txtdgreeid.setText("");
        txtfaculty.setText("");
        txtentryrequirements.setText("");
        txtprogrammeduration.setText("");
        txtprogrammeschedule.setText("");
        txtintakes.setText("");
        txtcoursefee.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabalemanagecoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabalemanagecoursesMouseClicked
        int row = tabalemanagecourses.getSelectedRow();
        String tc = tabalemanagecourses.getModel().getValueAt(row, 4).toString();

        try {

            System.out.println(tc);

            String searchText = tc;
            boolean isFound = false;
            for (Employer.ManagecoursesEmployer r : list2) {
                if (r.getdegreeid().contains(searchText)) {
                    isFound = true;

                    Cboxdgreetype.setSelectedItem(r.getdegreetype());
                    txtuniname.setText(r.getuniname());
                    txtcuntry.setText(r.getcuntry());
                    txtdgreename.setText(r.getdegreename());
                    txtdgreeid.setText(r.getdegreeid());
                    txtfaculty.setText(r.getfaculty());
                    txtentryrequirements.setText(r.getentryreqirements());
                    txtprogrammeduration.setText(r.getprogrammeduration());
                    txtprogrammeschedule.setText(r.getprogrammeschedule());
                    txtintakes.setText(r.getintake());
                    txtcoursefee.setText(r.getcoursefee());

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tabalemanagecoursesMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String name = searchMCtxt.getText();

        if (name.equals("")) {

            list2 = objEmployerController.GetManagecoursesEmployer("");

            System.out.println(list2);

            // bind data into JTable
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Degree Type");
            model.addColumn("Uni Name");
            model.addColumn("Cuntry");
            model.addColumn("Degree Name");
            model.addColumn("Degree ID");
            model.addColumn("Faculty");
            model.addColumn("Entry Reqirements");
            model.addColumn("Programme Duration");
            model.addColumn("Programme Shedule");
            model.addColumn("Inake");
            model.addColumn("Course Fee");

//        System.out.println(list);
            for (int i = 0; i < list2.size(); i++) {

                // Create the first row
                Object[] rowData = new Object[]{
                    list2.get(i).getdegreetype(),
                    list2.get(i).getuniname(),
                    list2.get(i).getcuntry(),
                    list2.get(i).getdegreename(),
                    list2.get(i).getdegreeid(),
                    list2.get(i).getfaculty(),
                    list2.get(i).getentryreqirements(),
                    list2.get(i).getprogrammeduration(),
                    list2.get(i).getprogrammeschedule(),
                    list2.get(i).getintake(),
                    list2.get(i).getcoursefee()

                };

                model.insertRow(0, rowData);
            }

            tabalemanagecourses.setModel(model);

        } else {
            list2 = objEmployerController.searchManagecoursesEmployer(name);

            System.out.println(list2);

            // bind data into JTable
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Degree Type");
            model.addColumn("Uni Name");
            model.addColumn("Cuntry");
            model.addColumn("Degree Name");
            model.addColumn("Degree ID");
            model.addColumn("Faculty");
            model.addColumn("Entry Reqirements");
            model.addColumn("Programme Duration");
            model.addColumn("Programme Shedule");
            model.addColumn("Inake");
            model.addColumn("Course Fee");

//        System.out.println(list);
            for (int i = 0; i < list2.size(); i++) {

                // Create the first row
                Object[] rowData = new Object[]{
                    list2.get(i).getdegreetype(),
                    list2.get(i).getuniname(),
                    list2.get(i).getcuntry(),
                    list2.get(i).getdegreename(),
                    list2.get(i).getdegreeid(),
                    list2.get(i).getfaculty(),
                    list2.get(i).getentryreqirements(),
                    list2.get(i).getprogrammeduration(),
                    list2.get(i).getprogrammeschedule(),
                    list2.get(i).getintake(),
                    list2.get(i).getcoursefee()

                };

                model.insertRow(0, rowData);
            }

            tabalemanagecourses.setModel(model);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfacultyActionPerformed

    private void txtuninameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuninameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuninameActionPerformed

    private void txtcuntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcuntryActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        tab1.setVisible(false);
        tab1.setEnabled(false);
        tab2.setVisible(false);
        tab2.setEnabled(false);
        tab3.setVisible(false);
        tab3.setEnabled(false);
        tab4.setVisible(false);
        tab4.setEnabled(false);
        tab6.setVisible(false);
        tab6.setEnabled(false);
        tab_3_2.setVisible(true);
        tab_3_2.setEnabled(true);

        txtuniname.setText("");
        txtcuntry.setText("");
        txtdgreename.setText("");
        txtdgreeid.setText("");
        txtfaculty.setText("");
        txtentryrequirements.setText("");
        txtprogrammeduration.setText("");
        txtprogrammeschedule.setText("");
        txtintakes.setText("");
        txtcoursefee.setText("");
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtcoursefeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoursefeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoursefeeActionPerformed

    private void txtdgreenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdgreenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdgreenameActionPerformed

    private void CboxdgreetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxdgreetypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxdgreetypeActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (txtuniname.getText().length() <= 0 || txtcuntry.getText().length() <= 0 || txtdgreename.getText().length() <= 0 || txtdgreeid.getText().length() <= 0 || txtfaculty.getText().length() <= 0
                || txtentryrequirements.getText().length() <= 0 || txtprogrammeduration.getText().length() <= 0 || txtcoursefee.getText().length() <= 0) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Empty Text Field, Please fill all");
        } else {
            try {
                String degreetype = (String) Cboxdgreetype.getSelectedItem();
                String uniname = txtuniname.getText();
                String cuntry = txtcuntry.getText();
                String degreename = txtdgreename.getText();
                String degreeid = txtdgreeid.getText();
                String faculty = txtfaculty.getText();
                String entryreqirements = txtentryrequirements.getText();
                String programmeduration = txtprogrammeduration.getText();
                String programmeschedule = txtprogrammeschedule.getText();
                String intake = txtintakes.getText();
                String coursefee = txtcoursefee.getText();

                objEmployer = objEmployerController.addEmployer();

                arrayEmployer[index] = objEmployer;
                objManagecoursesEmployer = objEmployerController.addManagecoursesEmployer(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);

                boolean result = objEmployerController.insertManagecoursesEmployerToDB(objManagecoursesEmployer);

                arrayManagecoursesEmployer[index] = objManagecoursesEmployer;

                index++;
                if (result) {
                    JOptionPane.showMessageDialog(rootPane, "Coursee details have been added to database succesful " + index, "Output", 1);
                    txtuniname.setText("");
                    txtcuntry.setText("");
                    txtdgreename.setText("");
                    txtdgreeid.setText("");
                    txtfaculty.setText("");
                    txtentryrequirements.setText("");
                    txtprogrammeduration.setText("");
                    txtprogrammeschedule.setText("");
                    txtintakes.setText("");
                    txtcoursefee.setText("");

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Coursee details have not been added to database succesful " + index, "Output", 1);
                }
            } catch (Throwable ex) {
                System.out.println(ex.getMessage());
            }
        }
        PopulateManagecoursesEmployerList();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Update this Course ?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == 0) {

            String degreetype = (String) Cboxdgreetype.getSelectedItem();
            String uniname = txtuniname.getText();
            String cuntry = txtcuntry.getText();
            String degreename = txtdgreename.getText();
            String degreeid = txtdgreeid.getText();
            String faculty = txtfaculty.getText();
            String entryreqirements = txtentryrequirements.getText();
            String programmeduration = txtprogrammeduration.getText();
            String programmeschedule = txtprogrammeschedule.getText();
            String intake = txtintakes.getText();
            String coursefee = txtcoursefee.getText();

            objEmployer = objEmployerController.addEmployer();

            arrayEmployer[index] = objEmployer;
            objManagecoursesEmployer = objEmployerController.addManagecoursesEmployer(degreetype, uniname, cuntry, degreename, degreeid, faculty, entryreqirements, programmeduration, programmeschedule, intake, coursefee);

            boolean result = objEmployerController.updateManagecoursesEmployerToDB(objManagecoursesEmployer);
            System.out.println(result);

            index++;
            if (result) {
                JOptionPane.showMessageDialog(rootPane, "Coursee details have been updated to database succesful " + index, "Output", 1);
                txtuniname.setText("");
                txtcuntry.setText("");
                txtdgreename.setText("");
                txtdgreeid.setText("");
                txtfaculty.setText("");
                txtentryrequirements.setText("");
                txtprogrammeduration.setText("");
                txtprogrammeschedule.setText("");
                txtintakes.setText("");
                txtcoursefee.setText("");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Coursee details have not been updated to database succesful " + index, "Output", 1);
            }

            PopulateManagecoursesEmployerList(); //this is the method to call the table details
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void txtdgreeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdgreeidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdgreeidActionPerformed

    private void TBallissuesEMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBallissuesEMMouseClicked
        int row = TBallissuesEM.getSelectedRow();
        String tc = TBallissuesEM.getModel().getValueAt(row, 0).toString();

        try {

            System.out.println(tc);

            String searchText = tc;
            boolean isFound = false;
            for (Employer.AllissuesEmployer r : list3) {
                if (r.getissueid().contains(searchText)) {
                    isFound = true;

                    txtissueID.setText(r.getissueid());
                    txtissuetype.setText(r.getissuetype());
                    txtStudentID.setText(r.getname());
                    txtEmployerID.setText(r.getitnumber());
                    txtDetails.setText(r.getdetails());
                    txtComment.setText(r.getcomment());
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_TBallissuesEMMouseClicked

    private void tblEMMyissuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEMMyissuesMouseClicked
        int row = tblEMMyissues.getSelectedRow();
        String tc = tblEMMyissues.getModel().getValueAt(row, 0).toString();

        try {

            System.out.println(tc);

            String searchText = tc;
            boolean isFound = false;
            for (Employer.myissuesEmployer r : list5) {
                if (r.getissueid().contains(searchText)) {
                    isFound = true;

                    txtissueID1.setText(r.getissueid());
                    txtissuetype1.setText(r.getissuetype());
                    txtStudentID1.setText(r.getitnumber());
                    txtStudentname1.setText(r.getname());
                    txtStudentemail1.setText(r.getemail());
                    txtDetails1.setText(r.getdetails());
                    txtComment1.setText(r.getcomment());
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblEMMyissuesMouseClicked

    //set and reset color
    void setColor(JPanel panel) {
        panel.setBackground(new Color(58, 70, 90));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(36, 47, 65));
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cboxdgreetype;
    private javax.swing.JTable TBComAllIssuesEM;
    private javax.swing.JTable TBallissuesEM;
    private javax.swing.JLabel alldetails;
    private javax.swing.JLabel alldetails1;
    private javax.swing.JLabel alldetails2;
    private javax.swing.JLabel alldetails3;
    private javax.swing.JLabel allemail;
    private javax.swing.JLabel allemail1;
    private javax.swing.JLabel allemail10;
    private javax.swing.JLabel allemail12;
    private javax.swing.JLabel allemail13;
    private javax.swing.JLabel allemail14;
    private javax.swing.JLabel allemail16;
    private javax.swing.JLabel allemail17;
    private javax.swing.JLabel allemail18;
    private javax.swing.JLabel allemail19;
    private javax.swing.JLabel allemail2;
    private javax.swing.JLabel allemail20;
    private javax.swing.JLabel allemail21;
    private javax.swing.JLabel allemail3;
    private javax.swing.JLabel allemail4;
    private javax.swing.JLabel allemail5;
    private javax.swing.JLabel allemail6;
    private javax.swing.JLabel allemail7;
    private javax.swing.JLabel allemail8;
    private javax.swing.JLabel allemail9;
    private javax.swing.JLabel allyear;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_6;
    private javax.swing.JLabel btn_CD;
    private javax.swing.JLabel btn_ERI;
    private javax.swing.JLabel btn_EXIG;
    private javax.swing.JLabel btn_EXIG1;
    private javax.swing.JLabel btn_help;
    private javax.swing.JTextArea helptEmployer;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblEMID;
    private javax.swing.JLabel lblEMname;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField searchMCtxt;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    private javax.swing.JPanel tab6;
    private javax.swing.JPanel tab_3_2;
    private javax.swing.JTable tabalemanagecourses;
    private javax.swing.JTable tblEMMyissues;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextArea txtComment1;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextArea txtDetails1;
    private javax.swing.JLabel txtEmployerID;
    private javax.swing.JLabel txtStudentID;
    private javax.swing.JLabel txtStudentID1;
    private javax.swing.JLabel txtStudentemail1;
    private javax.swing.JLabel txtStudentname1;
    private javax.swing.JTextField txtcoursefee;
    private javax.swing.JTextField txtcuntry;
    private javax.swing.JTextField txtdgreeid;
    private javax.swing.JTextField txtdgreename;
    private javax.swing.JTextArea txtentryrequirements;
    private javax.swing.JTextField txtfaculty;
    private javax.swing.JTextArea txtintakes;
    private javax.swing.JLabel txtissueID;
    private javax.swing.JLabel txtissueID1;
    private javax.swing.JLabel txtissuetype;
    private javax.swing.JLabel txtissuetype1;
    private javax.swing.JTextArea txtprogrammeduration;
    private javax.swing.JTextArea txtprogrammeschedule;
    private javax.swing.JTextField txtuniname;
    private javax.swing.JTextArea typecomment;
    // End of variables declaration//GEN-END:variables
}
