//Name: Team Squad
//Project title: HeadCount
//Date Produced: 4/15/2017
//Purpose
//HeadCount is a desktop and android based software for keeping track 
//of Student attendance in a classroom made by Team Squad.
package app;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class App extends javax.swing.JFrame {
    private static final String USERNAME = "userConnection";
    private static final String PASSWORD = "HeadCount123";
    private static final String CONN_STRING = 
    "jdbc:mysql://50.62.209.85:3306/HeadCount";
    int user_id = 0;    //initalizes user_id to 0
    private int timesNext = 1;
    boolean isPresent = false;
    boolean isAbsent = false;
    boolean excusedAbsence = false;
    boolean isTardy = false;
    int temp = 0;
    ButtonGroup group = new ButtonGroup(); //set present,absent,tardy,excused 
                                            //absense a button group
 
  
    public App() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        error_label.setVisible(false);
        error_label1.setVisible(false);
        ButtonGroup group = new ButtonGroup();
        group.add(Present_toggle_button);
        group.add(Absent_toggle_button);
        group.add(Tardy_toggle_button);
        group.add(Excused_absense_toggle_button);
        Field_not_filled_text_field.setVisible(false);
        help_message.setVisible(false);     //set help buttons invisible
        help_message1.setVisible(false);
        help_message2.setVisible(false);
        help_message4.setVisible(false);
        help_message5.setVisible(false);
        help_message6.setVisible(false);
        
    }
    //create panels, buttons, labels, text fields
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_LogIn = new javax.swing.JPanel();
        Login_label = new javax.swing.JLabel();
        Password_label = new javax.swing.JLabel();
        Username_field = new javax.swing.JTextField();
        Submit_button = new javax.swing.JButton();
        Clear_button = new javax.swing.JButton();
        Forgot_password_button = new javax.swing.JButton();
        Create_new_button = new javax.swing.JButton();
        Head_count_logo = new javax.swing.JLabel();
        Password_field = new javax.swing.JPasswordField();
        error_label = new javax.swing.JLabel();
        error_label1 = new javax.swing.JLabel();
        Help_logo = new javax.swing.JLabel();
        help_message = new javax.swing.JLabel();
        jPanel_NewUser = new javax.swing.JPanel();
        Create_new_user = new javax.swing.JLabel();
        Username_label = new javax.swing.JLabel();
        Username_text_field = new javax.swing.JTextField();
        First_name_label = new javax.swing.JLabel();
        First_name_text_field = new javax.swing.JTextField();
        Last_name_label = new javax.swing.JLabel();
        Last_name_text_field = new javax.swing.JTextField();
        Email_label = new javax.swing.JLabel();
        Email_text_field = new javax.swing.JTextField();
        Password_label1 = new javax.swing.JLabel();
        Password_text_field = new javax.swing.JTextField();
        Password_confirmed_label = new javax.swing.JLabel();
        Password_confirmed_text_field = new javax.swing.JTextField();
        Head_count_mini_logo = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();
        Submit_button2 = new javax.swing.JButton();
        help_message1 = new javax.swing.JLabel();
        Help_logo1 = new javax.swing.JLabel();
        help_message2 = new javax.swing.JLabel();
        Field_not_filled_text_field = new javax.swing.JLabel();
        jPanel_ChooseClass = new javax.swing.JPanel();
        Head_Count_logo2 = new javax.swing.JLabel();
        Choose_Class_title = new javax.swing.JLabel();
        Class_table = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Create_New_Class_button = new javax.swing.JButton();
        Submit_button1 = new javax.swing.JButton();
        jPanel_CreateClass = new javax.swing.JPanel();
        Head_count_logo2 = new javax.swing.JLabel();
        Create_New_Class_title = new javax.swing.JLabel();
        Class_name_label = new javax.swing.JLabel();
        Class_name_text_field = new javax.swing.JTextField();
        Class_number_label = new javax.swing.JLabel();
        Class_number_text_field = new javax.swing.JTextField();
        Class_minutes_label = new javax.swing.JLabel();
        Class_minutes_text_field = new javax.swing.JTextField();
        Back_button1 = new javax.swing.JButton();
        Clear_button1 = new javax.swing.JButton();
        Submit_button3 = new javax.swing.JButton();
        jPanel_ManageView = new javax.swing.JPanel();
        Manage_view_title = new javax.swing.JLabel();
        Head_count_logo3 = new javax.swing.JLabel();
        Student_photo_label = new javax.swing.JLabel();
        Class_label = new javax.swing.JLabel();
        Class_name_label_database = new javax.swing.JLabel();
        Date_label = new javax.swing.JLabel();
        Student_name_label = new javax.swing.JLabel();
        Back_button2 = new javax.swing.JButton();
        Next_button1 = new javax.swing.JButton();
        Submit_button4 = new javax.swing.JButton();
        Calculate_attendence_button = new javax.swing.JButton();
        Edit_roster_button = new javax.swing.JButton();
        Present_toggle_button = new javax.swing.JToggleButton();
        Absent_toggle_button = new javax.swing.JToggleButton();
        Excused_absense_toggle_button = new javax.swing.JToggleButton();
        Tardy_toggle_button = new javax.swing.JToggleButton();
        Minutes_late_label = new javax.swing.JLabel();
        Minutes_late_text_field = new javax.swing.JTextField();
        Notes_label = new javax.swing.JLabel();
        Notes_text_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Help_logo2 = new javax.swing.JLabel();
        help_message4 = new javax.swing.JLabel();
        help_message5 = new javax.swing.JLabel();
        help_message6 = new javax.swing.JLabel();
        jPanel_EditRoster = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jPanel_AddStudent = new javax.swing.JPanel();
        Head_count_logo5 = new javax.swing.JLabel();
        Add_student_title = new javax.swing.JLabel();
        First_name_label2 = new javax.swing.JLabel();
        First_name_text_field2 = new javax.swing.JTextField();
        Last_name_label2 = new javax.swing.JLabel();
        Last_name_text_field2 = new javax.swing.JTextField();
        Id_number_label = new javax.swing.JLabel();
        Id_number_text_field = new javax.swing.JTextField();
        Choose_image_label = new javax.swing.JLabel();
        Browse_button = new javax.swing.JButton();
        Cancel_button = new javax.swing.JButton();
        Submit_button5 = new javax.swing.JButton();
        jPanel_CalculateAttendence = new javax.swing.JPanel();
        Calculate_attendence_label = new javax.swing.JLabel();
        Head_count_logo6 = new javax.swing.JLabel();
        Select_student_label = new javax.swing.JLabel();
        Select_student_drop_down_menu = new javax.swing.JComboBox<>();
        Back_button4 = new javax.swing.JButton();
        Calculate_button = new javax.swing.JButton();
        Calculate_button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel_GenerateReport = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel_Template = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel_LogIn.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_LogIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Login_label.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Login_label.setText("Login:");

        Password_label.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Password_label.setText("Password:");

        Username_field.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_fieldActionPerformed(evt);
            }
        });

        Submit_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Submit_button.setText("Submit");
        Submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_buttonActionPerformed(evt);
            }
        });

        Clear_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Clear_button.setText("Clear");
        Clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_buttonActionPerformed(evt);
            }
        });

        Forgot_password_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Forgot_password_button.setText("Forgot Password");

        Create_new_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Create_new_button.setText("Create New");
        Create_new_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_new_buttonActionPerformed(evt);
            }
        });

        Head_count_logo.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount2.png")); // NOI18N
        Head_count_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_fieldActionPerformed(evt);
            }
        });

        error_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        error_label.setText("Invalid credentials. Try again.");

        error_label1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        error_label1.setText("Error connecting to server. Try again.");

        Help_logo.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/Help_icon.png")); // NOI18N
        Help_logo.setToolTipText("Help\n");
        Help_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Help_logoMouseClicked(evt);
            }
        });

        help_message.setText("Enter text in all fields above. Fill all fields. Once fields are filled, click Submit.");

        javax.swing.GroupLayout jPanel_LogInLayout = new javax.swing.GroupLayout(jPanel_LogIn);
        jPanel_LogIn.setLayout(jPanel_LogInLayout);
        jPanel_LogInLayout.setHorizontalGroup(
            jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LogInLayout.createSequentialGroup()
                .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_LogInLayout.createSequentialGroup()
                            .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_LogInLayout.createSequentialGroup()
                                    .addGap(183, 183, 183)
                                    .addComponent(Login_label))
                                .addComponent(Password_label, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LogInLayout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LogInLayout.createSequentialGroup()
                                    .addComponent(Forgot_password_button, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Create_new_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LogInLayout.createSequentialGroup()
                                    .addComponent(Clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Head_count_logo, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel_LogInLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(error_label))
                    .addGroup(jPanel_LogInLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(error_label1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LogInLayout.createSequentialGroup()
                .addGap(0, 103, Short.MAX_VALUE)
                .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LogInLayout.createSequentialGroup()
                        .addComponent(Help_logo)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LogInLayout.createSequentialGroup()
                        .addComponent(help_message)
                        .addGap(15, 15, 15))))
        );
        jPanel_LogInLayout.setVerticalGroup(
            jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LogInLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Help_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Head_count_logo)
                .addGap(50, 50, 50)
                .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login_label)
                    .addComponent(Username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_label)
                    .addComponent(Password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_button)
                    .addComponent(Clear_button))
                .addGap(18, 18, 18)
                .addGroup(jPanel_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Forgot_password_button)
                    .addComponent(Create_new_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(help_message)
                .addGap(3, 3, 3)
                .addComponent(error_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error_label1)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_LogIn, "card2");

        jPanel_NewUser.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_NewUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Create_new_user.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Create_new_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Create_new_user.setText("Create New User");

        Username_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Username_label.setText("Username:");

        Username_text_field.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Username_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_text_fieldActionPerformed(evt);
            }
        });

        First_name_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        First_name_label.setText("First Name:");

        First_name_text_field.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        First_name_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First_name_text_fieldActionPerformed(evt);
            }
        });

        Last_name_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Last_name_label.setText("Last Name:");

        Last_name_text_field.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Last_name_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Last_name_text_fieldActionPerformed(evt);
            }
        });

        Email_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Email_label.setText("Email:");

        Email_text_field.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        Password_label1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Password_label1.setText("Password:");

        Password_text_field.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Password_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_text_fieldActionPerformed(evt);
            }
        });

        Password_confirmed_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Password_confirmed_label.setText("Password Confirmed:");

        Password_confirmed_text_field.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        Head_count_mini_logo.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        Back_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Back_button.setText("Back");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        Submit_button2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Submit_button2.setText("Submit");
        Submit_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_button2ActionPerformed(evt);
            }
        });

        help_message1.setText("Enter new user info in all fields above. Once all fields are filled click \"Submit\".");

        Help_logo1.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/Help_icon.png")); // NOI18N
        Help_logo1.setToolTipText("Help\n");
        Help_logo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Help_logo1MouseClicked(evt);
            }
        });

        help_message2.setText("Choose \"Back\" button to return to Login screen. ");

        Field_not_filled_text_field.setText("Some fields are missing! Enter text in all fields to proceed.");

        javax.swing.GroupLayout jPanel_NewUserLayout = new javax.swing.GroupLayout(jPanel_NewUser);
        jPanel_NewUser.setLayout(jPanel_NewUserLayout);
        jPanel_NewUserLayout.setHorizontalGroup(
            jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NewUserLayout.createSequentialGroup()
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_NewUserLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(help_message1)
                            .addGroup(jPanel_NewUserLayout.createSequentialGroup()
                                .addComponent(Head_count_mini_logo)
                                .addGap(87, 87, 87)
                                .addComponent(Create_new_user)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Help_logo1)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NewUserLayout.createSequentialGroup()
                                .addComponent(help_message2)
                                .addGap(65, 65, 65))))
                    .addGroup(jPanel_NewUserLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Field_not_filled_text_field)
                            .addGroup(jPanel_NewUserLayout.createSequentialGroup()
                                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Password_label1)
                                    .addComponent(Password_confirmed_label)
                                    .addComponent(Email_label)
                                    .addComponent(Last_name_label)
                                    .addComponent(First_name_label)
                                    .addComponent(Username_label)
                                    .addComponent(Back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(First_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Last_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Password_confirmed_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Submit_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel_NewUserLayout.setVerticalGroup(
            jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NewUserLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Create_new_user)
                    .addComponent(Head_count_mini_logo)
                    .addComponent(Help_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_label)
                    .addComponent(Username_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(First_name_label)
                    .addComponent(First_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Last_name_label)
                    .addComponent(Last_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_label)
                    .addComponent(Email_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_label1)
                    .addComponent(Password_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_confirmed_label)
                    .addComponent(Password_confirmed_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_NewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_button)
                    .addComponent(Submit_button2))
                .addGap(11, 11, 11)
                .addComponent(Field_not_filled_text_field)
                .addGap(18, 18, 18)
                .addComponent(help_message1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(help_message2)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_NewUser, "card6");

        jPanel_ChooseClass.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_ChooseClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Head_Count_logo2.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        Choose_Class_title.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Choose_Class_title.setText("Choose Class");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Number", "Course Minutes", "User ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        Class_table.setViewportView(jScrollPane6);

        Create_New_Class_button.setText("Create New");
        Create_New_Class_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_New_Class_buttonActionPerformed(evt);
            }
        });

        Submit_button1.setText("Submit");
        Submit_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ChooseClassLayout = new javax.swing.GroupLayout(jPanel_ChooseClass);
        jPanel_ChooseClass.setLayout(jPanel_ChooseClassLayout);
        jPanel_ChooseClassLayout.setHorizontalGroup(
            jPanel_ChooseClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChooseClassLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Head_Count_logo2)
                .addGap(100, 100, 100)
                .addComponent(Choose_Class_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ChooseClassLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(jPanel_ChooseClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Class_table, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_ChooseClassLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Create_New_Class_button)
                        .addGap(111, 111, 111)
                        .addComponent(Submit_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        jPanel_ChooseClassLayout.setVerticalGroup(
            jPanel_ChooseClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ChooseClassLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel_ChooseClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Choose_Class_title)
                    .addComponent(Head_Count_logo2))
                .addGap(35, 35, 35)
                .addComponent(Class_table, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_ChooseClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Create_New_Class_button)
                    .addComponent(Submit_button1))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_ChooseClass, "card7");

        jPanel_CreateClass.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_CreateClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Head_count_logo2.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        Create_New_Class_title.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Create_New_Class_title.setText("Create New Class");

        Class_name_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Class_name_label.setText("Class Name:");

        Class_number_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Class_number_label.setText("Class Number:");

        Class_minutes_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Class_minutes_label.setText("Class Minutes:");

        Back_button1.setText("Back");
        Back_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_button1ActionPerformed(evt);
            }
        });

        Clear_button1.setText("Clear");
        Clear_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_button1ActionPerformed(evt);
            }
        });

        Submit_button3.setText("Submit");
        Submit_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CreateClassLayout = new javax.swing.GroupLayout(jPanel_CreateClass);
        jPanel_CreateClass.setLayout(jPanel_CreateClassLayout);
        jPanel_CreateClassLayout.setHorizontalGroup(
            jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CreateClassLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Class_number_label)
                    .addComponent(Class_name_label)
                    .addComponent(Class_minutes_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Class_name_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(Class_number_text_field)
                    .addComponent(Class_minutes_text_field))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CreateClassLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Head_count_logo2)
                .addGap(81, 81, 81)
                .addComponent(Create_New_Class_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CreateClassLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(Back_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Clear_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submit_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel_CreateClassLayout.setVerticalGroup(
            jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CreateClassLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Create_New_Class_title)
                    .addComponent(Head_count_logo2))
                .addGap(66, 66, 66)
                .addGroup(jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Class_name_label)
                    .addComponent(Class_name_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Class_number_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class_number_label))
                .addGap(17, 17, 17)
                .addGroup(jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Class_minutes_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class_minutes_label))
                .addGap(42, 42, 42)
                .addGroup(jPanel_CreateClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_button3)
                    .addComponent(Clear_button1)
                    .addComponent(Back_button1))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_CreateClass, "card7");

        jPanel_ManageView.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_ManageView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Manage_view_title.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Manage_view_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Manage_view_title.setText("Manage View");

        Head_count_logo3.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        Student_photo_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Class_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Class_label.setText("Class:");

        Class_name_label_database.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Class_name_label_database.setText("CLASS NAME");

        Date_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Date_label.setText("Date:");

        Student_name_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Student_name_label.setText("Student Name");

        Back_button2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Back_button2.setText("Back");
        Back_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_button2ActionPerformed(evt);
            }
        });

        Next_button1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Next_button1.setText("Next");
        Next_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_button1ActionPerformed(evt);
            }
        });

        Submit_button4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Submit_button4.setText("Submit");

        Calculate_attendence_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Calculate_attendence_button.setText("Calculate Attendence");
        Calculate_attendence_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_attendence_buttonActionPerformed(evt);
            }
        });

        Edit_roster_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Edit_roster_button.setText("Edit Roster");
        Edit_roster_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_roster_buttonActionPerformed(evt);
            }
        });

        Present_toggle_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Present_toggle_button.setText("Present");
        Present_toggle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Present_toggle_buttonActionPerformed(evt);
            }
        });

        Absent_toggle_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Absent_toggle_button.setText("Absent");
        Absent_toggle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Absent_toggle_buttonActionPerformed(evt);
            }
        });

        Excused_absense_toggle_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Excused_absense_toggle_button.setText("Excused Absense");
        Excused_absense_toggle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excused_absense_toggle_buttonActionPerformed(evt);
            }
        });

        Tardy_toggle_button.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Tardy_toggle_button.setText("Tardy");
        Tardy_toggle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tardy_toggle_buttonActionPerformed(evt);
            }
        });

        Minutes_late_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Minutes_late_label.setText("Minutes Late:");

        Minutes_late_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minutes_late_text_fieldActionPerformed(evt);
            }
        });
        Minutes_late_text_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Minutes_late_text_fieldKeyTyped(evt);
            }
        });

        Notes_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Notes_label.setText("Notes:");

        Notes_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Notes_text_fieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("04/26/2017");

        Help_logo2.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/Help_icon.png")); // NOI18N
        Help_logo2.setToolTipText("Help\n");
        Help_logo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Help_logo2MouseClicked(evt);
            }
        });

        help_message4.setText("First find student's name. Then choose the students attendence for the day.");

        help_message5.setText("Once attendence is choosen click \"Next\". Include notes if necessary.");

        help_message6.setText("Once all attendence is taken click \"Calculate Attendence\".");

        javax.swing.GroupLayout jPanel_ManageViewLayout = new javax.swing.GroupLayout(jPanel_ManageView);
        jPanel_ManageView.setLayout(jPanel_ManageViewLayout);
        jPanel_ManageViewLayout.setHorizontalGroup(
            jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Head_count_logo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                        .addComponent(Student_name_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                        .addComponent(Manage_view_title, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Help_logo2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ManageViewLayout.createSequentialGroup()
                        .addComponent(Class_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Class_name_label_database)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Date_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(106, 106, 106))))
            .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Student_photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculate_attendence_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Submit_button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_ManageViewLayout.createSequentialGroup()
                        .addComponent(Back_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Next_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Edit_roster_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excused_absense_toggle_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tardy_toggle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                                .addComponent(Minutes_late_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Minutes_late_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Notes_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Notes_label)))
                    .addComponent(Present_toggle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Absent_toggle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ManageViewLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(help_message4)
                    .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(help_message5)))
                .addGap(26, 26, 26))
            .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(help_message6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ManageViewLayout.setVerticalGroup(
            jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Head_count_logo3))
                    .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Manage_view_title)
                            .addComponent(Help_logo2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Class_label)
                            .addComponent(Date_label)
                            .addComponent(Class_name_label_database)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Student_name_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_ManageViewLayout.createSequentialGroup()
                        .addComponent(Student_photo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back_button2)
                            .addComponent(Next_button1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submit_button4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Calculate_attendence_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_ManageViewLayout.createSequentialGroup()
                        .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_ManageViewLayout.createSequentialGroup()
                                .addComponent(Edit_roster_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Present_toggle_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Absent_toggle_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Excused_absense_toggle_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tardy_toggle_button)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel_ManageViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Minutes_late_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Minutes_late_label)))
                        .addComponent(Notes_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Notes_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(help_message4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(help_message5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(help_message6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel_ManageView, "card3");

        jPanel_EditRoster.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_EditRoster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Edit Roster");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jScrollPane3.setViewportView(jScrollPane5);

        jButton8.setText("Add Student");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Done");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        jButton20.setText("Remove Student");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_EditRosterLayout = new javax.swing.GroupLayout(jPanel_EditRoster);
        jPanel_EditRoster.setLayout(jPanel_EditRosterLayout);
        jPanel_EditRosterLayout.setHorizontalGroup(
            jPanel_EditRosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EditRosterLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel34)
                .addGap(91, 91, 91)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_EditRosterLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel_EditRosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_EditRosterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel_EditRosterLayout.setVerticalGroup(
            jPanel_EditRosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EditRosterLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel_EditRosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel34))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_EditRosterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton20)
                    .addComponent(jButton9))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_EditRoster, "card5");

        jPanel_AddStudent.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_AddStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Head_count_logo5.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        Add_student_title.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Add_student_title.setText("Add Student");

        First_name_label2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        First_name_label2.setText("First Name:");

        Last_name_label2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Last_name_label2.setText("Last Name:");

        Id_number_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Id_number_label.setText("ID Number:");

        Choose_image_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Choose_image_label.setText("Choose Image:");

        Browse_button.setText("Browse");
        Browse_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse_buttonActionPerformed(evt);
            }
        });

        Cancel_button.setText("Cancel");
        Cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_buttonActionPerformed(evt);
            }
        });

        Submit_button5.setText("Submit");
        Submit_button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AddStudentLayout = new javax.swing.GroupLayout(jPanel_AddStudent);
        jPanel_AddStudent.setLayout(jPanel_AddStudentLayout);
        jPanel_AddStudentLayout.setHorizontalGroup(
            jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AddStudentLayout.createSequentialGroup()
                .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AddStudentLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Head_count_logo5)
                        .addGap(86, 86, 86)
                        .addComponent(Add_student_title))
                    .addGroup(jPanel_AddStudentLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Choose_image_label)
                            .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Id_number_label)
                                .addComponent(First_name_label2)
                                .addComponent(Last_name_label2)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(First_name_text_field2)
                            .addComponent(Last_name_text_field2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(Id_number_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(Browse_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel_AddStudentLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(Cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Submit_button5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel_AddStudentLayout.setVerticalGroup(
            jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AddStudentLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_student_title)
                    .addComponent(Head_count_logo5))
                .addGap(57, 57, 57)
                .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(First_name_label2)
                    .addComponent(First_name_text_field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Last_name_label2)
                    .addComponent(Last_name_text_field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_number_label)
                    .addComponent(Id_number_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Choose_image_label)
                    .addComponent(Browse_button))
                .addGap(32, 32, 32)
                .addGroup(jPanel_AddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_button)
                    .addComponent(Submit_button5))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_AddStudent, "card7");

        jPanel_CalculateAttendence.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_CalculateAttendence.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Calculate_attendence_label.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Calculate_attendence_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Calculate_attendence_label.setText("Calculate Attendence");

        Head_count_logo6.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        Select_student_label.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Select_student_label.setText("Select Student:");

        Select_student_drop_down_menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Select_student_drop_down_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_student_drop_down_menuActionPerformed(evt);
            }
        });

        Back_button4.setText("Cancel");
        Back_button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_button4ActionPerformed(evt);
            }
        });

        Calculate_button.setText("Calculate Student");
        Calculate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_buttonActionPerformed(evt);
            }
        });

        Calculate_button1.setText("Calculate Class");
        Calculate_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_button1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Select Dates:");

        javax.swing.GroupLayout jPanel_CalculateAttendenceLayout = new javax.swing.GroupLayout(jPanel_CalculateAttendence);
        jPanel_CalculateAttendence.setLayout(jPanel_CalculateAttendenceLayout);
        jPanel_CalculateAttendenceLayout.setHorizontalGroup(
            jPanel_CalculateAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CalculateAttendenceLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Head_count_logo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calculate_attendence_label, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(140, 140, 140))
            .addGroup(jPanel_CalculateAttendenceLayout.createSequentialGroup()
                .addGroup(jPanel_CalculateAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CalculateAttendenceLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(Back_button4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CalculateAttendenceLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Calculate_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Calculate_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CalculateAttendenceLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel_CalculateAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(Select_student_label))
                        .addGap(37, 37, 37)
                        .addComponent(Select_student_drop_down_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_CalculateAttendenceLayout.setVerticalGroup(
            jPanel_CalculateAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CalculateAttendenceLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel_CalculateAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calculate_attendence_label)
                    .addComponent(Head_count_logo6))
                .addGap(52, 52, 52)
                .addGroup(jPanel_CalculateAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Select_student_label)
                    .addComponent(Select_student_drop_down_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(jPanel_CalculateAttendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calculate_button)
                    .addComponent(Calculate_button1))
                .addGap(18, 18, 18)
                .addComponent(Back_button4)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_CalculateAttendence, "card4");

        jPanel_GenerateReport.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_GenerateReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel42.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        javax.swing.GroupLayout jPanel_GenerateReportLayout = new javax.swing.GroupLayout(jPanel_GenerateReport);
        jPanel_GenerateReport.setLayout(jPanel_GenerateReportLayout);
        jPanel_GenerateReportLayout.setHorizontalGroup(
            jPanel_GenerateReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GenerateReportLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel42)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel_GenerateReportLayout.setVerticalGroup(
            jPanel_GenerateReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GenerateReportLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel42)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_GenerateReport, "card7");

        jPanel_Template.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_Template.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel43.setIcon(new javax.swing.ImageIcon("/Users/Owner/Desktop/HeadCount.png")); // NOI18N

        javax.swing.GroupLayout jPanel_TemplateLayout = new javax.swing.GroupLayout(jPanel_Template);
        jPanel_Template.setLayout(jPanel_TemplateLayout);
        jPanel_TemplateLayout.setHorizontalGroup(
            jPanel_TemplateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TemplateLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel43)
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel_TemplateLayout.setVerticalGroup(
            jPanel_TemplateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TemplateLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel43)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_Template, "card7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void Next_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_button1ActionPerformed
     //sets jtable with database values                                           
    try {
        Object course_identifier = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        System.out.println(course_identifier);
        timesNext++;
        String sql;
        Connection conn;
        PreparedStatement pstmt;
        Statement stmt;
        ResultSet rs;
        String commentBox = Notes_text_field.getText();
        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        String minsTardy = Minutes_late_text_field.getText();
        
        
        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT * FROM Students, StudentCourses WHERE Students.student_id = StudentCourses.student_id AND course_id like " + course_identifier);
        
        while(rs.next())
        {
            if(rs.getRow() == timesNext)
            {
                temp = rs.getInt("student_id");
            }
        }
        //interacts with present database
        if(isPresent)
        {
            
            isAbsent = false;
            excusedAbsence = false;
            isTardy = false;
            sql = "INSERT into AttendanceRecord (comments, course_id, date, isAbsent, isAbsentExc, isLate, isPresent, minsLate, student_id) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println("Did we make it this far?");
            pstmt.setString(1, commentBox);
            pstmt.setObject(2, course_identifier);
            pstmt.setDate(3, date);
            pstmt.setBoolean(4, false);
            pstmt.setBoolean(5, false);
            pstmt.setBoolean(6, false);
            pstmt.setBoolean(7, true);
            pstmt.setString(8, minsTardy);
            pstmt.setInt(9, temp);
            
            pstmt.executeUpdate();
            System.out.println("Student Present and recorded in databse hopefully");
        }
        //interacts with absent database
        if(isAbsent)
        {
            
            isPresent = false;
            excusedAbsence = false;
            isTardy = false;
            sql = "INSERT into AttendanceRecord (comments, course_id, date, isAbsent, isAbsentExc, isLate, isPresent, minsLate, student_id) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println("Did we make it this far?");
            pstmt.setString(1, commentBox);
            pstmt.setObject(2, course_identifier);
            pstmt.setDate(3, date);
            pstmt.setBoolean(4, true);
            pstmt.setBoolean(5, false);
            pstmt.setBoolean(6, false);
            pstmt.setBoolean(7, false);
            pstmt.setString(8, minsTardy);
            pstmt.setInt(9, temp);
            
            pstmt.executeUpdate();
            System.out.println("Student Present and recorded in databse hopefully");
        }
        //interacts with tardy database
        if(isTardy)
        {
            
            isAbsent = false;
            excusedAbsence = false;
            isPresent = false;
            sql = "INSERT into AttendanceRecord (comments, course_id, date, isAbsent, isAbsentExc, isLate, isPresent, minsLate, student_id) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println("Did we make it this far?");
            pstmt.setString(1, commentBox);
            pstmt.setObject(2, course_identifier);
            pstmt.setDate(3, date);
            pstmt.setBoolean(4, false);
            pstmt.setBoolean(5, false);
            pstmt.setBoolean(6, true);
            pstmt.setBoolean(7, false);
            pstmt.setString(8, minsTardy);
            pstmt.setInt(9, temp);
            
            pstmt.executeUpdate();
            System.out.println("Student Present and recorded in databse hopefully");
        }
        
        if(excusedAbsence)
        {
            
            isAbsent = false;
            isPresent = false;
            isTardy = false;
            sql = "INSERT into AttendanceRecord (comments, course_id, date, isAbsent, isAbsentExc, isLate, isPresent, minsLate, student_id) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            System.out.println("Did we make it this far?");
            pstmt.setString(1, commentBox);
            pstmt.setObject(2, course_identifier);
            pstmt.setDate(3, date);
            pstmt.setBoolean(4, false);
            pstmt.setBoolean(5, true);
            pstmt.setBoolean(6, false);
            pstmt.setBoolean(7, false);
            pstmt.setString(8, minsTardy);
            pstmt.setInt(9, temp);
            
            pstmt.executeUpdate();
            System.out.println("Student Present and recorded in databse hopefully");
            
            
        }
        
        
        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT * FROM Students, StudentCourses WHERE Students.student_id = StudentCourses.student_id AND course_id like " + course_identifier);
        System.out.println("All good here");
        
        while(rs.next())
        {
            if(rs.getRow() == timesNext)
            {
                String stuFirstName = rs.getString("f_name");
                String stuLastName = rs.getString("l_name");
                
                Student_name_label.setText(stuFirstName + " " + stuLastName); 
                
                
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
                
    }//GEN-LAST:event_Next_button1ActionPerformed

    private void Back_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Back_button2ActionPerformed

    private void Submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_buttonActionPerformed
        String username = Username_field.getText();
        String password = Password_field.getText();
        
         Connection conn = null;
         Statement stmt = null;
         ResultSet rs = null;
            
            try{
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rs= stmt.executeQuery("SELECT username, password FROM Users");
                System.out.println("Credentials submitted");
                
                try {
                  
        boolean giveAccess = Users.verifyUser(rs, username , password);    
        
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT username, password, user_id FROM Users");
        
        
        while(rs.next())
        {
            if(rs.getString("username").equals(Username_field.getText()) && rs.getString("password").equals(Password_field.getText()))
            {
                user_id = rs.getInt("user_id");
            }
        }
        if (user_id == 0)
        { error_label.setVisible(true);}   
        System.out.println("user_id = " + user_id);
        
        
                if(giveAccess)
                {
                jPanel_LogIn.setVisible(false);
                
                jPanel_ChooseClass.setVisible(true);
                ArrayList<Courses> courseList = new ArrayList<>();
                stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rs = stmt.executeQuery("SELECT * FROM Courses WHERE user_id=" + user_id);
                int x = 0;
                int course_id_display;
                String course_name_display;
                int course_num_display;
                int courseMins_display;
                int user_id_display;
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        while(rs.next())
                        {
                            course_id_display = rs.getInt("course_id");
                            course_name_display = rs.getString("course_name");
                            course_num_display = rs.getInt("CourseNumber");
                            courseMins_display = rs.getInt("courseMins");
                            user_id_display = rs.getInt("user_id");
                            
                            Object[] row = {course_id_display, course_num_display, course_name_display, courseMins_display, user_id_display};
                            
                            model.addRow(row);
                        }

                }
    } catch (SQLException ex) {
        System.err.println("Error during login");
        error_label.setVisible(true);
    }
                
            } catch (SQLException ex)
            {
                System.err.println("Error Connecting to database during login");
                error_label1.setVisible(true);
            }
        
    }//GEN-LAST:event_Submit_buttonActionPerformed

    private void Calculate_attendence_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_attendence_buttonActionPerformed
       jPanel_ManageView.setVisible(false);
       jPanel_CalculateAttendence.setVisible(true);
    }//GEN-LAST:event_Calculate_attendence_buttonActionPerformed

    private void Minutes_late_text_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Minutes_late_text_fieldKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar))
           || (vchar == KeyEvent.VK_BACKSPACE)
           || (vchar == KeyEvent.VK_DELETE))
                {
                    evt.consume();
                }
    }//GEN-LAST:event_Minutes_late_text_fieldKeyTyped

    private void Minutes_late_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minutes_late_text_fieldActionPerformed
        
    }//GEN-LAST:event_Minutes_late_text_fieldActionPerformed
/* Below is code that interacts with panels based on button clicks
    Each button opens different panels and may interact with the database 
  */  
    private void Edit_roster_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_roster_buttonActionPerformed
       
    try {
        Object course_identifier = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        Connection conn;
        Statement stmt;
        ResultSet rs;
        
        
        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT * FROM Students, StudentCourses WHERE course_id = " + course_identifier);
        int x = 0;
        int student_id_display;
        String f_name_display;
        String l_name_display;
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        while(rs.next())
        {
            try {
                student_id_display = rs.getInt("student_id");
                f_name_display = rs.getString("f_name");
                l_name_display = rs.getString("l_name");
                
                
                Object[] row = {student_id_display, f_name_display, l_name_display};
                
                model.addRow(row);
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        jPanel_ManageView.setVisible(false);
        jPanel_EditRoster.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_Edit_roster_buttonActionPerformed

    private void Create_new_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_new_buttonActionPerformed
        jPanel_LogIn.setVisible(false);
       jPanel_NewUser.setVisible(true);
    }//GEN-LAST:event_Create_new_buttonActionPerformed

    private void Create_New_Class_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_New_Class_buttonActionPerformed
        jPanel_ChooseClass.setVisible(false);
        jPanel_CreateClass.setVisible(true);
    }//GEN-LAST:event_Create_New_Class_buttonActionPerformed

    private void Submit_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_button1ActionPerformed
       
        
       Object table1 = jTable1.getValueAt(jTable1.getSelectedRow(), 0);
       System.out.println(table1);
       Connection conn = null;
       Statement stmt = null;
       ResultSet rs = null;
    try {
        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT * FROM Students, StudentCourses "
                + "WHERE Students.student_id = StudentCourses.student_id AND "
                + "course_id like " + table1);
        System.out.println("All good so far");
        
        int courseNum = 0;
        while(rs.next())
        {   if (rs.getRow() == 1)
            {
                String firstStudent = rs.getString("f_name");
                String stuLastName = rs.getString("l_name");
                Student_name_label.setText(firstStudent + " " + stuLastName);
                courseNum = rs.getInt("course_id");
            }
            int temp = rs.getInt("student_id");
           
            System.out.println(temp);
        }
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         
            rs = stmt.executeQuery("SELECT * FROM Courses WHERE course_id = " + courseNum);
        while(rs.next())
        {   
            
            
            String class_name = rs.getString("course_name");
            System.out.println(rs.getString("course_name"));
                Class_name_label_database.setText(class_name);
            
        }    
        
    } catch (SQLException ex) {
        System.err.println("Error getting class information");
    }   
        jPanel_ChooseClass.setVisible(false);
        jPanel_ManageView.setVisible(true);
    }//GEN-LAST:event_Submit_button1ActionPerformed

    private void Clear_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_button1ActionPerformed
        Class_name_text_field.setText(""); //setting text fields to null when clear is pressed
        Class_number_text_field.setText("");
        Class_minutes_text_field.setText("");
    }//GEN-LAST:event_Clear_button1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jPanel_EditRoster.setVisible(false);
       jPanel_AddStudent.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Browse_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse_buttonActionPerformed
       JFileChooser fc = new JFileChooser();
       FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files"
               , ImageIO.getReaderFileSuffixes());
       fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
       int result = fc.showOpenDialog(null);
       fc.setFileFilter(filter);
    }//GEN-LAST:event_Browse_buttonActionPerformed

    private void Submit_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_button3ActionPerformed
        String course_name = Class_name_text_field.getText();
        String courseMins = Class_number_text_field.getText();
        String CourseNumber = Class_minutes_text_field.getText();
        Connection conn = null;
        
        String sql = "INSERT into Courses (course_name, courseMins, CourseNumber, user_id) "
                + "VALUES (?, ?, ?, ?)" ;
        
        try{
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                

                stmt.setString(1, course_name);
                stmt.setString(2, courseMins);
                stmt.setString(3, CourseNumber);
                stmt.setInt(4, user_id);                
                stmt.executeUpdate();
                System.out.println("Course add attempted");
                
                
                
            } catch (SQLException ex)
            {
                System.err.println(ex);
            }
     
        jPanel_CreateClass.setVisible(false);
        jPanel_AddStudent.setVisible(true);
    }//GEN-LAST:event_Submit_button3ActionPerformed

    private void Submit_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_button2ActionPerformed
        
        String username1 = Username_text_field.getText();
        String firstname1 = First_name_text_field.getText();
        String lastname1 = Last_name_text_field.getText();
        String password1 = Password_text_field.getText();
        String password_confirmed1 = Password_confirmed_text_field.getText();     
        if (username1 != null && !username1.equals(""))        
        {   if (firstname1 != null && !firstname1.equals(""))
            {   if (lastname1 != null && !lastname1.equals(""))
                {   if (password1 != null && !password1.equals(""))
                    {   if (Objects.equals(password1, password_confirmed1) )
                        {jPanel_NewUser.setVisible(false);
                            jPanel_LogIn.setVisible(true); 
                        }
                        else
                        {
                        Field_not_filled_text_field.setVisible(true);
                        }
                    } else
                        {
                         Field_not_filled_text_field.setVisible(true);
                        } 
                } else 
                {Field_not_filled_text_field.setVisible(true);}
            } else
               {Field_not_filled_text_field.setVisible(true);}
        } else
        { Field_not_filled_text_field.setVisible(true);}
    }//GEN-LAST:event_Submit_button2ActionPerformed

    private void Username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_fieldActionPerformed

    private void Clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_buttonActionPerformed
        Username_field.setText("");
        Password_field.setText("");

    }//GEN-LAST:event_Clear_buttonActionPerformed

    private void Password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_fieldActionPerformed

    private void Cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_buttonActionPerformed
       jPanel_AddStudent.setVisible(false);
       jPanel_EditRoster.setVisible(true);
    }//GEN-LAST:event_Cancel_buttonActionPerformed

    private void Submit_button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_button5ActionPerformed
        jPanel_AddStudent.setVisible(false);
        jPanel_EditRoster.setVisible(true);
    }//GEN-LAST:event_Submit_button5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jPanel_EditRoster.setVisible(false);
        jPanel_ManageView.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        jPanel_NewUser.setVisible(false);
        jPanel_LogIn.setVisible(true);
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void Back_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_button1ActionPerformed
        jPanel_CreateClass.setVisible(false);
        jPanel_ChooseClass.setVisible(true);      
    }//GEN-LAST:event_Back_button1ActionPerformed

    private void Back_button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_button4ActionPerformed
        jPanel_CalculateAttendence.setVisible(false);
        jPanel_ManageView.setVisible(true);
    }//GEN-LAST:event_Back_button4ActionPerformed

    private void Select_student_drop_down_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_student_drop_down_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Select_student_drop_down_menuActionPerformed

    private void Password_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_text_fieldActionPerformed

    private void First_name_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First_name_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_First_name_text_fieldActionPerformed

    private void Last_name_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Last_name_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Last_name_text_fieldActionPerformed

    private void Calculate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_buttonActionPerformed
       jPanel_CalculateAttendence.setVisible(false);
       jPanel_GenerateReport.setVisible(true);
    }//GEN-LAST:event_Calculate_buttonActionPerformed

    private void Notes_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Notes_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Notes_text_fieldActionPerformed

    private void Username_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_text_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_text_fieldActionPerformed

    private void Calculate_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_button1ActionPerformed
         
        try {
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            
            JFreeChart chart = ChartFactory.createPieChart("Attendance Report "
                    + "Pie Chart", pieDataset, true, true, true);
            ChartPanel chartPanel = new ChartPanel(chart);
            PiePlot P = (PiePlot)chart.getPlot();
            // P.setForegroundAlpha(TOP_ALIGNMENT);
            // ChartFrame framePie = new ChartFrame("Pie Chart", chart);
            Connection conn;
            Statement stmt;
            ResultSet rs;
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement
        (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Object course_identifier = 
                    jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            Object student_identifier = 
                    jTable3.getValueAt(jTable3.getSelectedRow(), 0);
            rs = stmt.executeQuery("SELECT * FROM AttendanceRecord WHERE "
                    + " course_id = "+course_identifier+"and isPresent = true");
            
            chartPanel.setVisible(true);
            chartPanel.setSize(500,500);
            int present = 0;
            while(rs.next())
            {
                present++;
            }
            rs = stmt.executeQuery("SELECT * From 'AttendanceRecord' "
                    + "where course_id = "+course_identifier+"and isLate = true");
            
            int Late = 0;
            while(rs.next())
            {
                Late++;
            }
            rs = stmt.executeQuery("SELECT * From 'AttendanceRecord' "
                    + "where course_id = "+course_identifier+"and isAbsent = true");
            int Absent = 0;
            while(rs.next())
            {
                Absent++;
            }
            pieDataset.setValue("Present", present);
            pieDataset.setValue("Late",Late);
            pieDataset.setValue("Absent",Absent);
            //pieDataset.setValue("Janara",new Integer(17));
            //pieDataset.setValue("Konstantin",new Integer(26));
            jPanel1.removeAll();
            jPanel1.add(chartPanel);
            // jPanel1.updateUI();﻿
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Calculate_button1ActionPerformed

    private void Help_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Help_logoMouseClicked
     help_message.setVisible(true);
    }//GEN-LAST:event_Help_logoMouseClicked

    private void Excused_absense_toggle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excused_absense_toggle_buttonActionPerformed
        excusedAbsence = Excused_absense_toggle_button.isSelected();
    }//GEN-LAST:event_Excused_absense_toggle_buttonActionPerformed

    private void Present_toggle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Present_toggle_buttonActionPerformed
        isPresent = Present_toggle_button.isSelected();
    }//GEN-LAST:event_Present_toggle_buttonActionPerformed

    private void Tardy_toggle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tardy_toggle_buttonActionPerformed
        isTardy = Tardy_toggle_button.isSelected();
    }//GEN-LAST:event_Tardy_toggle_buttonActionPerformed

    private void Absent_toggle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Absent_toggle_buttonActionPerformed
        isAbsent = Absent_toggle_button.isSelected();
    }//GEN-LAST:event_Absent_toggle_buttonActionPerformed

    private void Help_logo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Help_logo1MouseClicked
        help_message1.setVisible(true);
        help_message2.setVisible(true);
    }//GEN-LAST:event_Help_logo1MouseClicked

    private void Help_logo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Help_logo2MouseClicked
       help_message4.setVisible(true);
       help_message5.setVisible(true);
       help_message6.setVisible(true);
    }//GEN-LAST:event_Help_logo2MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       Object course_identifier = 
               jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            Object student_identifier = 
                    jTable3.getValueAt(jTable3.getSelectedRow(), 0);
        try {                                          
            Connection conn;
            Statement stmt;
            ResultSet rs;
            PreparedStatement pstmt;
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement st = conn.prepareStatement("DELETE FROM Students "
                    + "WHERE student_id = ?");
            st.setObject(1,student_identifier);
            st.executeUpdate(); 
            
            
          
            } catch (SQLException ex) {
                System.err.println("Error deleting student from database");
            }
    }//GEN-LAST:event_jButton20ActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PieChartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Absent_toggle_button;
    private javax.swing.JLabel Add_student_title;
    private javax.swing.JButton Back_button;
    private javax.swing.JButton Back_button1;
    private javax.swing.JButton Back_button2;
    private javax.swing.JButton Back_button4;
    private javax.swing.JButton Browse_button;
    private javax.swing.JButton Calculate_attendence_button;
    private javax.swing.JLabel Calculate_attendence_label;
    private javax.swing.JButton Calculate_button;
    private javax.swing.JButton Calculate_button1;
    private javax.swing.JButton Cancel_button;
    private javax.swing.JLabel Choose_Class_title;
    private javax.swing.JLabel Choose_image_label;
    private javax.swing.JLabel Class_label;
    private javax.swing.JLabel Class_minutes_label;
    private javax.swing.JTextField Class_minutes_text_field;
    private javax.swing.JLabel Class_name_label;
    private javax.swing.JLabel Class_name_label_database;
    private javax.swing.JTextField Class_name_text_field;
    private javax.swing.JLabel Class_number_label;
    private javax.swing.JTextField Class_number_text_field;
    private javax.swing.JScrollPane Class_table;
    private javax.swing.JButton Clear_button;
    private javax.swing.JButton Clear_button1;
    private javax.swing.JButton Create_New_Class_button;
    private javax.swing.JLabel Create_New_Class_title;
    private javax.swing.JButton Create_new_button;
    private javax.swing.JLabel Create_new_user;
    private javax.swing.JLabel Date_label;
    private javax.swing.JButton Edit_roster_button;
    private javax.swing.JLabel Email_label;
    private javax.swing.JTextField Email_text_field;
    private javax.swing.JToggleButton Excused_absense_toggle_button;
    private javax.swing.JLabel Field_not_filled_text_field;
    private javax.swing.JLabel First_name_label;
    private javax.swing.JLabel First_name_label2;
    private javax.swing.JTextField First_name_text_field;
    private javax.swing.JTextField First_name_text_field2;
    private javax.swing.JButton Forgot_password_button;
    private javax.swing.JLabel Head_Count_logo2;
    private javax.swing.JLabel Head_count_logo;
    private javax.swing.JLabel Head_count_logo2;
    private javax.swing.JLabel Head_count_logo3;
    private javax.swing.JLabel Head_count_logo5;
    private javax.swing.JLabel Head_count_logo6;
    private javax.swing.JLabel Head_count_mini_logo;
    private javax.swing.JLabel Help_logo;
    private javax.swing.JLabel Help_logo1;
    private javax.swing.JLabel Help_logo2;
    private javax.swing.JLabel Id_number_label;
    private javax.swing.JTextField Id_number_text_field;
    private javax.swing.JLabel Last_name_label;
    private javax.swing.JLabel Last_name_label2;
    private javax.swing.JTextField Last_name_text_field;
    private javax.swing.JTextField Last_name_text_field2;
    private javax.swing.JLabel Login_label;
    private javax.swing.JLabel Manage_view_title;
    private javax.swing.JLabel Minutes_late_label;
    private javax.swing.JTextField Minutes_late_text_field;
    private javax.swing.JButton Next_button1;
    private javax.swing.JLabel Notes_label;
    private javax.swing.JTextField Notes_text_field;
    private javax.swing.JLabel Password_confirmed_label;
    private javax.swing.JTextField Password_confirmed_text_field;
    private javax.swing.JPasswordField Password_field;
    private javax.swing.JLabel Password_label;
    private javax.swing.JLabel Password_label1;
    private javax.swing.JTextField Password_text_field;
    private javax.swing.JToggleButton Present_toggle_button;
    private javax.swing.JComboBox<String> Select_student_drop_down_menu;
    private javax.swing.JLabel Select_student_label;
    private javax.swing.JLabel Student_name_label;
    private javax.swing.JLabel Student_photo_label;
    private javax.swing.JButton Submit_button;
    private javax.swing.JButton Submit_button1;
    private javax.swing.JButton Submit_button2;
    private javax.swing.JButton Submit_button3;
    private javax.swing.JButton Submit_button4;
    private javax.swing.JButton Submit_button5;
    private javax.swing.JToggleButton Tardy_toggle_button;
    private javax.swing.JTextField Username_field;
    private javax.swing.JLabel Username_label;
    private javax.swing.JTextField Username_text_field;
    private javax.swing.JLabel error_label;
    private javax.swing.JLabel error_label1;
    private javax.swing.JLabel help_message;
    private javax.swing.JLabel help_message1;
    private javax.swing.JLabel help_message2;
    private javax.swing.JLabel help_message4;
    private javax.swing.JLabel help_message5;
    private javax.swing.JLabel help_message6;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_AddStudent;
    private javax.swing.JPanel jPanel_CalculateAttendence;
    private javax.swing.JPanel jPanel_ChooseClass;
    private javax.swing.JPanel jPanel_CreateClass;
    private javax.swing.JPanel jPanel_EditRoster;
    private javax.swing.JPanel jPanel_GenerateReport;
    private javax.swing.JPanel jPanel_LogIn;
    private javax.swing.JPanel jPanel_ManageView;
    private javax.swing.JPanel jPanel_NewUser;
    private javax.swing.JPanel jPanel_Template;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void setLocationTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
}
