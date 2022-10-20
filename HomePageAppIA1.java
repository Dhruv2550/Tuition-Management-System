import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class HomePageAppIA1 extends javax.swing.JPanel {

    Connection con = null;//need for DB connection
    PreparedStatement pst = null;//need for DB connection
    ResultSet rs = null;//need for DB connection
    
    public HomePageAppIA1() throws Exception {
        initComponents();
        
        con = DBConnectionIA.ConnectionDB();//need for DB connection

        try{
            String insname = "SELECT Sfname FROM Sinfo";
            pst = con.prepareStatement(insname);
            rs = pst.executeQuery();
            
            while (rs.next()){
                studname.addItem(rs.getString("Sfname"));
            }
    }
        catch (Exception e){
        System.out.println(e);
    }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dispemail = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        y7 = new javax.swing.JButton();
        y8 = new javax.swing.JButton();
        y9 = new javax.swing.JButton();
        y10 = new javax.swing.JButton();
        y11 = new javax.swing.JButton();
        y12 = new javax.swing.JButton();
        y13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dbt = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cselect = new javax.swing.JComboBox<>();
        go = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dnm = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        present = new javax.swing.JButton();
        absent = new javax.swing.JButton();
        studid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        classid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nextstu = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dattend = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cattended = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        studname = new javax.swing.JComboBox<>();
        sdate = new com.toedter.calendar.JDateChooser();
        edate = new com.toedter.calendar.JDateChooser();
        outof = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        invlist = new javax.swing.JTable();
        paid = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        studentinfor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ves = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        sidves = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        sfnameves = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        slnameves = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        semailves = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        sylevelves = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        pemailves = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        vec = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        cidvec = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        sfnamevec = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        sylevelvec = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        semailvec = new javax.swing.JTextField();
        classinfor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        vea = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        aidvea = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        sidvea = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        sfnamevea = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        cidvea = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        datevea = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        attendancevea = new javax.swing.JTextField();
        attendanceinfor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        vei = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        inidvei = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        sidvei = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        sfnamevei = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        amountvei = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        sdatevei = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        edatevei = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        cattendedvei = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        paidvei = new javax.swing.JTextField();
        invoiceinfor = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        search1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        send1 = new javax.swing.JButton();
        studname1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();

        dispemail.setText("jLabel14");

        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));

        jTabbedPane6.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTabbedPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane6MouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel8.setText("Class List");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/classicon.png"))); // NOI18N

        y7.setBackground(new java.awt.Color(0, 51, 153));
        y7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        y7.setForeground(new java.awt.Color(255, 255, 255));
        y7.setText("Year 7 | Sun 1:30");
        y7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y7ActionPerformed(evt);
            }
        });

        y8.setBackground(new java.awt.Color(0, 51, 153));
        y8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        y8.setForeground(new java.awt.Color(255, 255, 255));
        y8.setText("Year 8 | Mon 4:30");
        y8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y8ActionPerformed(evt);
            }
        });

        y9.setBackground(new java.awt.Color(0, 51, 153));
        y9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        y9.setForeground(new java.awt.Color(255, 255, 255));
        y9.setText("Year 9 |  Tue 4:30");
        y9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y9ActionPerformed(evt);
            }
        });

        y10.setBackground(new java.awt.Color(0, 51, 153));
        y10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        y10.setForeground(new java.awt.Color(255, 255, 255));
        y10.setText("Year 10 | Wed 4:30");
        y10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y10ActionPerformed(evt);
            }
        });

        y11.setBackground(new java.awt.Color(0, 51, 153));
        y11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        y11.setForeground(new java.awt.Color(255, 255, 255));
        y11.setText("Year 11 | Thu 4:30");
        y11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y11ActionPerformed(evt);
            }
        });

        y12.setBackground(new java.awt.Color(0, 51, 153));
        y12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        y12.setForeground(new java.awt.Color(255, 255, 255));
        y12.setText("Year 12 | Fri 4:30");
        y12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y12ActionPerformed(evt);
            }
        });

        y13.setBackground(new java.awt.Color(0, 51, 153));
        y13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        y13.setForeground(new java.awt.Color(255, 255, 255));
        y13.setText("Year 13 | Sat 1:30");
        y13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y13ActionPerformed(evt);
            }
        });

        dbt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dbt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sfname", "Semail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dbt.setRowHeight(18);
        jScrollPane2.setViewportView(dbt);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(y7)
                        .addGap(18, 18, 18)
                        .addComponent(y8)
                        .addGap(18, 18, 18)
                        .addComponent(y9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(y10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(y11)
                .addGap(26, 26, 26)
                .addComponent(y12)
                .addGap(18, 18, 18)
                .addComponent(y13)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jTabbedPane6.addTab("Class List", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel1.setText("Attendance");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attendanceicon.png"))); // NOI18N

        cselect.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Year 7 | Sun 1:30", "Year 8 | Mon 4:30", "Year 9 | Tue 4:30", "Year 10 | Wed 4:30", "Year 11 | Thu 4:30", "Year 12 | Fri 4:30", "Year 13 | Sat 1:30" }));
        cselect.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        go.setBackground(new java.awt.Color(0, 51, 153));
        go.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        go.setForeground(new java.awt.Color(255, 255, 255));
        go.setText("Go");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        dnm.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dnm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SID", "Sfname", "Sylevel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dnmMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dnm);

        name.setEditable(false);
        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("Student ID");

        present.setBackground(new java.awt.Color(0, 51, 153));
        present.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        present.setForeground(new java.awt.Color(255, 255, 255));
        present.setText("Present");
        present.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentActionPerformed(evt);
            }
        });

        absent.setBackground(new java.awt.Color(0, 51, 153));
        absent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        absent.setForeground(new java.awt.Color(255, 255, 255));
        absent.setText("Absent");
        absent.setPreferredSize(new java.awt.Dimension(69, 23));
        absent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentActionPerformed(evt);
            }
        });

        studid.setEditable(false);
        studid.setBackground(new java.awt.Color(204, 204, 204));
        studid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setText("Student Name");

        classid.setEditable(false);
        classid.setBackground(new java.awt.Color(204, 204, 204));
        classid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setText("Class ID");

        nextstu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nextstu.setBorder(null);
        nextstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextstuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studid, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(classid, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(present)
                                        .addGap(28, 28, 28)
                                        .addComponent(absent, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(cselect, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(nextstu, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cselect, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(present, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(absent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(nextstu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jTabbedPane6.addTab("Attendance", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel6.setText("Invoicing");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoiceicon.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setText("Student Name");

        search.setBackground(new java.awt.Color(0, 51, 153));
        search.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        dattend.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dattend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SID", "Date", "Attendance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dattend);

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel10.setText("End Date");

        cattended.setBackground(new java.awt.Color(204, 204, 204));
        cattended.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel11.setText("Classes Attended");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel12.setText("Start Date");

        send.setBackground(new java.awt.Color(0, 51, 153));
        send.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        send.setForeground(new java.awt.Color(255, 255, 255));
        send.setText("Generate & Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        studname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        sdate.setBackground(new java.awt.Color(255, 255, 255));
        sdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        edate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        outof.setBackground(new java.awt.Color(204, 204, 204));
        outof.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("/");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(studname, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(edate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cattended, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(outof, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(398, 398, 398)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cattended, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outof, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Invoicing", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel14.setText("Invoice List");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoicelisticon.png"))); // NOI18N

        invlist.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        invlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sfname", "Amount", "Paid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        invlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invlistMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(invlist);

        paid.setBackground(new java.awt.Color(0, 51, 153));
        paid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        paid.setForeground(new java.awt.Color(255, 255, 255));
        paid.setText("Invoice Paid");
        paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                            .addComponent(paid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(41, 41, 41)
                .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Invoice List", jPanel13);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel17.setText("View & Edit Student Data");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewediticon.png"))); // NOI18N

        studentinfor.setBackground(new java.awt.Color(0, 51, 153));
        studentinfor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        studentinfor.setForeground(new java.awt.Color(255, 255, 255));
        studentinfor.setText("Update Student Info");
        studentinfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentinforActionPerformed(evt);
            }
        });

        ves.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ves.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "SID", "Sfname", "Slname", "Semail", "Sylevel", "Pemail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ves.setRowHeight(20);
        ves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ves);

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel19.setText("SID");

        sidves.setEditable(false);
        sidves.setBackground(new java.awt.Color(204, 204, 204));
        sidves.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel20.setText("Sfname");

        sfnameves.setBackground(new java.awt.Color(204, 204, 204));
        sfnameves.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel21.setText("Semail");

        slnameves.setBackground(new java.awt.Color(204, 204, 204));
        slnameves.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel22.setText("Sylevel");

        semailves.setBackground(new java.awt.Color(204, 204, 204));
        semailves.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel23.setText("Slname");

        sylevelves.setBackground(new java.awt.Color(204, 204, 204));
        sylevelves.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel24.setText("Pemail");

        pemailves.setBackground(new java.awt.Color(204, 204, 204));
        pemailves.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sylevelves, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(slnameves)
                            .addComponent(sidves))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pemailves, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(semailves)
                                        .addComponent(sfnameves)))
                                .addGap(86, 86, 86))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(studentinfor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sidves, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sfnameves, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(slnameves, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semailves, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sylevelves, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pemailves, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(studentinfor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Edit Student Data", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel25.setText("View & Edit Class Data");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewediticon.png"))); // NOI18N

        vec.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        vec.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CID", "Sfname", "Sylevel", "Semail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        vec.setRowHeight(20);
        vec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vecMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(vec);

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel27.setText("CID");

        cidvec.setEditable(false);
        cidvec.setBackground(new java.awt.Color(204, 204, 204));
        cidvec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel28.setText("Sfname");

        sfnamevec.setBackground(new java.awt.Color(204, 204, 204));
        sfnamevec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel29.setText("Sylevel");

        sylevelvec.setBackground(new java.awt.Color(204, 204, 204));
        sylevelvec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel30.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel30.setText("Semail");

        semailvec.setBackground(new java.awt.Color(204, 204, 204));
        semailvec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        classinfor.setBackground(new java.awt.Color(0, 51, 153));
        classinfor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        classinfor.setForeground(new java.awt.Color(255, 255, 255));
        classinfor.setText("Update Class Info");
        classinfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classinforActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addGap(330, 330, 330))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(cidvec, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(sylevelvec, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(sfnamevec, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(semailvec, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(classinfor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sfnamevec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidvec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sylevelvec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semailvec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(classinfor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jTabbedPane6.addTab("Edit Class Data", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel31.setText("View & Edit Attendance Data");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewediticon.png"))); // NOI18N

        vea.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        vea.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "AID", "SID", "Sfname", "CID", "Date", "Attendance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vea.setRowHeight(20);
        vea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veaMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(vea);

        jLabel33.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel33.setText("AID");

        aidvea.setEditable(false);
        aidvea.setBackground(new java.awt.Color(204, 204, 204));
        aidvea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel34.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel34.setText("SID");

        sidvea.setEditable(false);
        sidvea.setBackground(new java.awt.Color(204, 204, 204));
        sidvea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel35.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel35.setText("Sfname");

        sfnamevea.setBackground(new java.awt.Color(204, 204, 204));
        sfnamevea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel36.setText("CID");

        cidvea.setBackground(new java.awt.Color(204, 204, 204));
        cidvea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel37.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel37.setText("Date");

        datevea.setBackground(new java.awt.Color(204, 204, 204));
        datevea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel38.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel38.setText("Attendance");

        attendancevea.setBackground(new java.awt.Color(204, 204, 204));
        attendancevea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        attendanceinfor.setBackground(new java.awt.Color(0, 51, 153));
        attendanceinfor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        attendanceinfor.setForeground(new java.awt.Color(255, 255, 255));
        attendanceinfor.setText("Update Attendance Info");
        attendanceinfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceinforActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datevea)
                                    .addComponent(sfnamevea)
                                    .addComponent(aidvea, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(attendancevea, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cidvea)
                                                .addComponent(sidvea, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(73, 73, 73))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(attendanceinfor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aidvea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidvea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sfnamevea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidvea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datevea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attendancevea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(attendanceinfor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        jTabbedPane6.addTab("Edit Attendance Data", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        vei.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        vei.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "INID", "SID", "Sfname", "Amount", "StartDate", "EndDate", "Attendance", "Paid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vei.setRowHeight(20);
        vei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veiMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(vei);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewediticon.png"))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel40.setText("View & Edit Invoice Data");

        jLabel41.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel41.setText("INID");

        inidvei.setEditable(false);
        inidvei.setBackground(new java.awt.Color(204, 204, 204));
        inidvei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel42.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel42.setText("SID");

        sidvei.setBackground(new java.awt.Color(204, 204, 204));
        sidvei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel43.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel43.setText("Sfname");

        sfnamevei.setBackground(new java.awt.Color(204, 204, 204));
        sfnamevei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel44.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel44.setText("Amount");

        amountvei.setBackground(new java.awt.Color(204, 204, 204));
        amountvei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel45.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel45.setText("Start Date");

        sdatevei.setBackground(new java.awt.Color(204, 204, 204));
        sdatevei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel46.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel46.setText("End Date");

        edatevei.setBackground(new java.awt.Color(204, 204, 204));
        edatevei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel47.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel47.setText("Class Attended");

        cattendedvei.setBackground(new java.awt.Color(204, 204, 204));
        cattendedvei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel48.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel48.setText("Paid");

        paidvei.setBackground(new java.awt.Color(204, 204, 204));
        paidvei.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        invoiceinfor.setBackground(new java.awt.Color(0, 51, 153));
        invoiceinfor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        invoiceinfor.setForeground(new java.awt.Color(255, 255, 255));
        invoiceinfor.setText("Update Invoice Info");
        invoiceinfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceinforActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inidvei, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sidvei, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sfnamevei, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(amountvei, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sdatevei, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edatevei, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cattendedvei, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paidvei, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(invoiceinfor)
                        .addGap(183, 183, 183)))
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inidvei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sidvei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sfnamevei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountvei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sdatevei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edatevei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cattendedvei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paidvei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(invoiceinfor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );

        jTabbedPane6.addTab("Edit Invoice Data", jPanel6);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel49.setText("Comments");

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoiceicon.png"))); // NOI18N

        jLabel51.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel51.setText("Student Name");

        search1.setBackground(new java.awt.Color(0, 51, 153));
        search1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        search1.setForeground(new java.awt.Color(255, 255, 255));
        search1.setText("Search");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        send1.setBackground(new java.awt.Color(0, 51, 153));
        send1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        send1.setForeground(new java.awt.Color(255, 255, 255));
        send1.setText("Send");
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });

        studname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel52.setText("Next Steps");

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel53.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel53.setText("Commendations");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel49)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(send1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(studname1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192)
                                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(137, 137, 137))))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(650, Short.MAX_VALUE)))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel53)
                    .addContainerGap(902, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studname1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                    .addContainerGap(249, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(95, 95, 95)))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(209, 209, 209)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(374, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        jTabbedPane6.addTab("Comments", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void y7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y7ActionPerformed
                try{
                    String view = "SELECT Sfname, Semail FROM Sclasslist WHERE Sylevel='7'";
                    pst = con.prepareStatement(view);
                    rs = pst.executeQuery();
                    dbt.setModel(DbUtils.resultSetToTableModel(rs));
                    System.out.println("Data Displayed");
                    }
        
                catch (Exception e){
                        System.out.println("DB Connection Failed" + e);
                    }
    }//GEN-LAST:event_y7ActionPerformed

    private void y8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y8ActionPerformed
                try{
                    String view = "SELECT Sfname, Semail FROM Sclasslist WHERE Sylevel='8'";
                    pst = con.prepareStatement(view);
                    rs = pst.executeQuery();
                    dbt.setModel(DbUtils.resultSetToTableModel(rs));
                    System.out.println("Data Displayed");
                    }
        
                catch (Exception e){
                        System.out.println("DB Connection Failed" + e);
                    }
    }//GEN-LAST:event_y8ActionPerformed

    private void y9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y9ActionPerformed
                try{
                    String view = "SELECT Sfname, Semail FROM Sinfo WHERE Sylevel='9'";
                    pst = con.prepareStatement(view);
                    rs = pst.executeQuery();
                    dbt.setModel(DbUtils.resultSetToTableModel(rs));
                    System.out.println("Data Displayed");
                    }
        
                catch (Exception e){
                        System.out.println("DB Connection Failed" + e);
                    }
    }//GEN-LAST:event_y9ActionPerformed

    private void y10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y10ActionPerformed
                try{
                    String view = "SELECT Sfname, Semail FROM Sinfo WHERE Sylevel='10'";
                    pst = con.prepareStatement(view);
                    rs = pst.executeQuery();
                    dbt.setModel(DbUtils.resultSetToTableModel(rs));
                    System.out.println("Data Displayed");
                    }
        
                catch (Exception e){
                        System.out.println("DB Connection Failed" + e);
                    }
    }//GEN-LAST:event_y10ActionPerformed

    private void y11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y11ActionPerformed
                try{
                    String view = "SELECT Sfname, Semail FROM Sinfo WHERE Sylevel='11'";
                    pst = con.prepareStatement(view);
                    rs = pst.executeQuery();
                    dbt.setModel(DbUtils.resultSetToTableModel(rs));
                    System.out.println("Data Displayed");
                    }
        
                catch (Exception e){
                        System.out.println("DB Connection Failed" + e);
                    }
    }//GEN-LAST:event_y11ActionPerformed

    private void y12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y12ActionPerformed
                try{
                    String view = "SELECT Sfname, Semail FROM Sinfo WHERE Sylevel='12'";
                    pst = con.prepareStatement(view);
                    rs = pst.executeQuery();
                    dbt.setModel(DbUtils.resultSetToTableModel(rs));
                    System.out.println("Data Displayed");
                    }
        
                catch (Exception e){
                        System.out.println("DB Connection Failed" + e);
                    }
    }//GEN-LAST:event_y12ActionPerformed

    private void y13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y13ActionPerformed
                try{
                    String view = "SELECT Sfname, Semail FROM Sinfo WHERE Sylevel='13'";
                    pst = con.prepareStatement(view);
                    rs = pst.executeQuery();
                    dbt.setModel(DbUtils.resultSetToTableModel(rs));
                    System.out.println("Data Displayed");
                    }
        
                catch (Exception e){
                        System.out.println("DB Connection Failed" + e);
                    }
    }//GEN-LAST:event_y13ActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        String yr = cselect.getSelectedItem().toString();

        if (yr.equals("Year 7 | Sun 1:30")){
                        try{
                            String view = "SELECT SID, Sfname, Sylevel FROM Sinfo WHERE Sylevel='7'";
                            pst = con.prepareStatement(view);
                            rs = pst.executeQuery();
                            dnm.setModel(DbUtils.resultSetToTableModel(rs));
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
        }

        if (yr.equals("Year 8 | Mon 4:30")){
                        try{
                            String view = "SELECT SID, Sfname, Sylevel FROM Sinfo WHERE Sylevel='8'";
                            pst = con.prepareStatement(view);
                            rs = pst.executeQuery();
                            dnm.setModel(DbUtils.resultSetToTableModel(rs));
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
        }

        if (yr.equals("Year 9 | Tue 4:30")){
                        try{
                            String view = "SELECT SID, Sfname, Sylevel FROM Sinfo WHERE Sylevel='9'";
                            pst = con.prepareStatement(view);
                            rs = pst.executeQuery();
                            dnm.setModel(DbUtils.resultSetToTableModel(rs));
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
        }

        if (yr.equals("Year 10 | Wed 4:30")){
                        try{
                            String view = "SELECT SID, Sfname, Sylevel FROM Sinfo WHERE Sylevel='10'";
                            pst = con.prepareStatement(view);
                            rs = pst.executeQuery();
                            dnm.setModel(DbUtils.resultSetToTableModel(rs));
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
        }

        if (yr.equals("Year 11 | Thu 4:30")){
                        try{
                            String view = "SELECT SID, Sfname, Sylevel FROM Sinfo WHERE Sylevel='11'";
                            pst = con.prepareStatement(view);
                            rs = pst.executeQuery();
                            dnm.setModel(DbUtils.resultSetToTableModel(rs));
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
        }

        if (yr.equals("Year 12 | Fri 4:30")){
                        try{
                            String view = "SELECT SID, Sfname, Sylevel FROM Sinfo WHERE Sylevel='12'";
                            pst = con.prepareStatement(view);
                            rs = pst.executeQuery();
                            dnm.setModel(DbUtils.resultSetToTableModel(rs));
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
        }

        if (yr.equals("Year 13 | Sat 1:30")){
                        try{
                            String view = "SELECT SID, Sfname, Sylevel FROM Sinfo WHERE Sylevel='13'";
                            pst = con.prepareStatement(view);
                            rs = pst.executeQuery();
                            dnm.setModel(DbUtils.resultSetToTableModel(rs));
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
        }
    }//GEN-LAST:event_goActionPerformed

    private void dnmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dnmMouseClicked
        present.setEnabled(true);
        absent.setEnabled(true);
        
        String nm = dnm.getValueAt(dnm.getSelectedRow(), 1).toString();
        name.setText(nm);
        
        String sid = dnm.getValueAt(dnm.getSelectedRow(), 0).toString();
        studid.setText(sid);
        
        String cid = dnm.getValueAt(dnm.getSelectedRow(), 2).toString();
        
        if (cid.equals("7")){
            classid.setText("1");
        }
        
        if (cid.equals("8")){
            classid.setText("2");
        }
        
        if (cid.equals("9")){
            classid.setText("3");
        }
        
        if (cid.equals("10")){
            classid.setText("4");
        }
        
        if (cid.equals("11")){
            classid.setText("5");
        }
        
        if (cid.equals("12")){
            classid.setText("6");
        }
        
        if (cid.equals("13")){
            classid.setText("7");
        }
        
    }//GEN-LAST:event_dnmMouseClicked

    private void presentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentActionPerformed
        nextstu.setText("Present: Please Select Next Student"); 
        present.setEnabled(false);
        absent.setEnabled(false);
        
        
        try{    
                            String txtDate = new SimpleDateFormat("dd MMMM yyyy", Locale.UK).format(new Date());
                            
                            String sqldt = "INSERT INTO Sattendance VALUES (?,?,?,?,?,?)";
                            pst = con.prepareStatement(sqldt);
                            pst.setString(1, null);
                            pst.setString(2, studid.getText());
                            pst.setString(3, name.getText());
                            pst.setString(4, classid.getText());
                            pst.setString(5, txtDate);
                            pst.setString(6, "Yes");     
                            pst.execute();
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
    }//GEN-LAST:event_presentActionPerformed

    private void absentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentActionPerformed
        nextstu.setText("Absent: Please Select Next Student");                
        present.setEnabled(false);
        absent.setEnabled(false);
        
        try{
                            String txtDate = new SimpleDateFormat("dd MMMM yyyy", Locale.UK).format(new Date());

                            String sqldt = "INSERT INTO Sattendance VALUES (?,?,?,?,?,?)";
                            pst = con.prepareStatement(sqldt);
                            pst.setString(1, null);
                            pst.setString(2, studid.getText());
                            pst.setString(3, name.getText());
                            pst.setString(4, classid.getText());
                            pst.setString(5, txtDate);
                            pst.setString(6, "No");     
                            pst.execute();
                            }

                        catch (Exception e){
                                System.out.println("DB Connection Failed" + e);
                            }
    }//GEN-LAST:event_absentActionPerformed

    private void nextstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextstuActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String x = studname.getSelectedItem().toString();
        
        try{
                    String view = "SELECT SID, Date, Attendance FROM Sattendance WHERE Sfname='"+x+"'";
                    pst = con.prepareStatement(view);
                    rs = pst.executeQuery();
                    dattend.setModel(DbUtils.resultSetToTableModel(rs));
                    }
        
                catch (Exception e){
                        System.out.println("DB Connection Failed" + e);
                    }
    }//GEN-LAST:event_searchActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
         JOptionPane.showMessageDialog(null, "Invoice Sent");
        
        try{
            String x = studname.getSelectedItem().toString();
            String file_name = "C:\\Users\\dhruv\\OneDrive - Innoventures Education\\Year 12\\Computer Science\\CS IA\\CS_IA_Product\\src\\PDF\\Invoice "+x+".pdf";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(file_name));
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMMM yyyy");
            String stdate = sdf.format(sdate.getDate());
            String endate = sdf.format(edate.getDate());
            

            String cat1 = cattended.getText();
            int cat = Integer.parseInt(cat1);
            int ad = cat*150;

            Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
            Font boldFontTitle = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);
            
            document.open();
            
            Paragraph intro = new Paragraph("            Invoice for " + x, boldFontTitle);
            Paragraph space1 = new Paragraph("\n");
            document.add(intro);
            document.add(space1);

            PdfPTable table = new PdfPTable(2);
            
            PdfPCell c1 = new PdfPCell(new Phrase("Amount Due ", boldFont));
            table.addCell(c1);
            table.addCell("AED "+(ad)+".00");
            
            PdfPCell c2 = new PdfPCell(new Phrase("Classes Attended ", boldFont));
            table.addCell(c2);
            table.addCell((cat1)+"/"+(outof.getText()));
            
            PdfPCell c3 = new PdfPCell(new Phrase("Start Date ", boldFont));
            table.addCell(c3);
            table.addCell(stdate);
            
            PdfPCell c4 = new PdfPCell(new Phrase("End Date ", boldFont));
            table.addCell(c4);
            table.addCell(endate);
            document.add(table);
            
            
            Paragraph space2 = new Paragraph("\n");
            document.add(space2);
           
            PdfPTable table2 = new PdfPTable(2);
            
            Paragraph intro2 = new Paragraph("            Attendance Details for " + x, boldFontTitle);
            document.add(intro2);
            
            Paragraph space3 = new Paragraph("\n");
            document.add(space3);
                                    
            PdfPCell c21 = new PdfPCell(new Phrase("Date", boldFont));
            PdfPCell c22 = new PdfPCell(new Phrase("Attendance", boldFont));
            table2.addCell(c21);
            table2.addCell(c22);
            
            
            //ADD SELECT COUNT FEAUTRE ASK TEACHER HOW TO MAKE IT WORK (NULL POINTER EXCEPTION)
            
            
            String dateoa = "SELECT Date, Attendance FROM Sattendance WHERE Sfname='"+x+"'";
            pst = con.prepareStatement(dateoa);
            rs = pst.executeQuery();
                while (rs.next()){
                                
                    table2.addCell(rs.getString("Date"));

                    table2.addCell(rs.getString("Attendance"));
                }

            document.add(table2);
            document.close();
            
            System.out.println("Sent");
            
            
            String add = Integer.toString(ad);
            String catt = Integer.toString(cat);
            
            String studentidatt = "SELECT SID FROM Sinfo WHERE Sfname='"+x+"'";
                pst = con.prepareStatement(studentidatt);
                rs = pst.executeQuery();
                String stdid = rs.getString("SID");
            
             String sql = "INSERT INTO Sinvoice VALUES (?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, null);
                pst.setString(2, stdid);
                pst.setString(3, x);
                pst.setString(4, add);
                pst.setString(5, stdate);
                pst.setString(6, endate);
                pst.setString(7, catt);
                pst.setString(8, null);
                pst.execute();

                System.out.println("Invoice Data Added");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put( "mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);
        
        String myAccountEmail = "dhruvtreddy@gmail.com";
        String password = "lmsohedgtpyqwwlm";

        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
            
            
        });
        
        try {
            String x = studname.getSelectedItem().toString();
            String parentsemail = "SELECT Pemail FROM Sinfo WHERE Sfname='"+x+"'";
            pst = con.prepareStatement(parentsemail);
            rs = pst.executeQuery();
            String paemail = rs.getString("Pemail");   
            System.out.println(paemail);
            
            Message message = new MimeMessage(session);
            message.setSubject("Ms. Sangeetha's French Tution");
            
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress());
            

            Address addressTo = new InternetAddress("dhruvreddy@hotmail.com");       //PAEMAIL
            message.setRecipient(Message.RecipientType.TO, addressTo);
            //message.addRecipient(Message.RecipientType.TO, )
            
            MimeMultipart multipart = new MimeMultipart();
            MimeBodyPart attachment = new MimeBodyPart();
            attachment.attachFile(new File("C:\\Users\\dhruv\\OneDrive - Innoventures Education\\Year 12\\Computer Science\\CS IA\\CS_IA_Product\\src\\PDF\\Invoice "+x+".pdf"));

            multipart.addBodyPart(attachment);     
            
            message.setContent(multipart);
            
            Transport.send(message);

            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        try{
                 
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    

    }//GEN-LAST:event_sendActionPerformed

    private void jTabbedPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane6MouseClicked
        try{
            String infoview = "SELECT * FROM Sinfo";
            pst = con.prepareStatement(infoview);
            rs = pst.executeQuery();
            ves.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
        
        try{
            String clistview = "SELECT * FROM Sclasslist";
            pst = con.prepareStatement(clistview);
            rs = pst.executeQuery();
            vec.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
        
        try{
            String attendanceview = "SELECT * FROM Sattendance";
            pst = con.prepareStatement(attendanceview);
            rs = pst.executeQuery();
            vea.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
        
                try{
            String invoiceview = "SELECT * FROM Sinvoice";
            pst = con.prepareStatement(invoiceview);
            rs = pst.executeQuery();
            vei.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
        
        
        
        
         try{
            String invoview = "SELECT Sfname, Amount, Paid FROM Sinvoice";
            pst = con.prepareStatement(invoview);
            rs = pst.executeQuery();
            invlist.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
    }//GEN-LAST:event_jTabbedPane6MouseClicked

    private void studentinforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentinforActionPerformed
            JOptionPane.showMessageDialog(null, "Data Updated");
            
        try{   
            String idofs = sidves.getText();
            
            String paid = "UPDATE Sinfo SET Sfname=?, Slname=?, Semail=?, Sylevel=?, Pemail=? WHERE SID='"+idofs+"' ";
   
                pst = con.prepareStatement(paid);
                pst.setString(1, sfnameves.getText());
                pst.setString(2, slnameves.getText());
                pst.setString(3, semailves.getText());
                pst.setString(4, sylevelves.getText());
                pst.setString(5, pemailves.getText());
                pst.execute();
                System.out.println("Student Info Updated");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        try{
            String invoview = "SELECT * FROM Sinfo ";
            pst = con.prepareStatement(invoview);
            rs = pst.executeQuery();
            ves.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
    }//GEN-LAST:event_studentinforActionPerformed

    private void vesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vesMouseClicked
        String id = ves.getValueAt(ves.getSelectedRow(), 0).toString();
        sidves.setText(id);
        
        String fname = ves.getValueAt(ves.getSelectedRow(), 1).toString();
        sfnameves.setText(fname);
        
        String lname = ves.getValueAt(ves.getSelectedRow(), 2).toString();
        slnameves.setText(lname);
        
        String email = ves.getValueAt(ves.getSelectedRow(), 3).toString();
        semailves.setText(email);
        
        String ylvl = ves.getValueAt(ves.getSelectedRow(), 4).toString();
        sylevelves.setText(ylvl);
        
        String pemail = ves.getValueAt(ves.getSelectedRow(), 5).toString();
        pemailves.setText(pemail);

    }//GEN-LAST:event_vesMouseClicked

    private void invlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invlistMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_invlistMouseClicked

    private void paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidActionPerformed
        try{  
            String paid = "UPDATE Sinvoice SET Paid=?";
   
                pst = con.prepareStatement(paid);
                pst.setString(1, "Yes");
                pst.execute();
                System.out.println("Paid");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        try{
            String invoview = "SELECT Sfname, Amount, Paid FROM Sinvoice";
            pst = con.prepareStatement(invoview);
            rs = pst.executeQuery();
            invlist.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
    }//GEN-LAST:event_paidActionPerformed

    private void vecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vecMouseClicked
        String cid = vec.getValueAt(vec.getSelectedRow(), 0).toString();
        cidvec.setText(cid);
        
        String sid = vec.getValueAt(vec.getSelectedRow(), 1).toString();
        sfnamevec.setText(sid);
        
        String ylvl = vec.getValueAt(vec.getSelectedRow(), 2).toString();
        sylevelvec.setText(ylvl);
        
        String email = vec.getValueAt(vec.getSelectedRow(), 3).toString();
        semailvec.setText(email);
        
    }//GEN-LAST:event_vecMouseClicked

    private void classinforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classinforActionPerformed
            JOptionPane.showMessageDialog(null, "Data Updated");
            
        try{   
            String idofe = semailvec.getText();
            
            String paid = "UPDATE Sclasslist SET Sfname=?, Sylevel=?, Semail=? WHERE Semail='"+idofe+"' ";
   
                pst = con.prepareStatement(paid);
                pst.setString(1, sfnamevec.getText());
                pst.setString(2, sylevelvec.getText());
                pst.setString(3, semailvec.getText());
                pst.execute();
                System.out.println("Class Info Updated");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        try{
            String clistview = "SELECT * FROM Sclasslist";
            pst = con.prepareStatement(clistview);
            rs = pst.executeQuery();
            vec.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
    }//GEN-LAST:event_classinforActionPerformed

    private void veaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veaMouseClicked
        String aid = vea.getValueAt(vea.getSelectedRow(), 0).toString();
        aidvea.setText(aid);
        
        String sid = vea.getValueAt(vea.getSelectedRow(), 1).toString();
        sidvea.setText(sid);
        
        String fname = vea.getValueAt(vea.getSelectedRow(), 2).toString();
        sfnamevea.setText(fname);
        
        String cid = vea.getValueAt(vea.getSelectedRow(), 3).toString();
        cidvea.setText(cid);
        
        String date = vea.getValueAt(vea.getSelectedRow(), 4).toString();
        datevea.setText(date);
        
        String attend = vea.getValueAt(vea.getSelectedRow(), 5).toString();
        attendancevea.setText(attend);
    }//GEN-LAST:event_veaMouseClicked

    private void attendanceinforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceinforActionPerformed
            JOptionPane.showMessageDialog(null, "Data Updated");

        try{   
            String idofa = aidvea.getText();
            
            String attendance = "UPDATE Sattendance SET Sfname=?, CID=?, Date=?, Attendance=? WHERE AID='"+idofa+"' ";
   
                pst = con.prepareStatement(attendance);
                pst.setString(1, sfnamevea.getText());
                pst.setString(2, cidvea.getText());
                pst.setString(3, datevea.getText());
                pst.setString(4, attendancevea.getText());
                pst.execute();
                System.out.println("Attendance Info Updated");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        
        try{
            String attendanceview = "SELECT * FROM Sattendance";
            pst = con.prepareStatement(attendanceview);
            rs = pst.executeQuery();
            vea.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
    }//GEN-LAST:event_attendanceinforActionPerformed

    private void veiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veiMouseClicked
        String inid = vei.getValueAt(vei.getSelectedRow(), 0).toString();
        inidvei.setText(inid);
      
        String sid = vei.getValueAt(vei.getSelectedRow(), 1).toString();
        sidvei.setText(sid);
        
        String fname = vei.getValueAt(vei.getSelectedRow(), 2).toString();
        sfnamevei.setText(fname);
        
        String am = vei.getValueAt(vei.getSelectedRow(), 3).toString();
        amountvei.setText(am);
        
        String startdate = vei.getValueAt(vei.getSelectedRow(), 4).toString();
        sdatevei.setText(startdate);
        
        String enddate = vei.getValueAt(vei.getSelectedRow(), 5).toString();
        edatevei.setText(enddate);
        
        String cat = vei.getValueAt(vei.getSelectedRow(), 6).toString();
        cattendedvei.setText(cat);
        
        String paid = vei.getValueAt(vei.getSelectedRow(), 7).toString();
        paidvei.setText(paid);
    }//GEN-LAST:event_veiMouseClicked

    private void invoiceinforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceinforActionPerformed
            JOptionPane.showMessageDialog(null, "Data Updated");
        
        try{   
            String idofi = inidvei.getText();
            
            String invoice = "UPDATE Sinvoice SET SID=?, Sfname=?, Amount=?, StartDate=?, EndDate=?, CAttended=?, Paid=? WHERE INID='"+idofi+"' ";
   
                pst = con.prepareStatement(invoice);
                pst.setString(1, sidvei.getText());
                pst.setString(2, sfnamevei.getText());
                pst.setString(3, amountvei.getText());
                pst.setString(4, sdatevei.getText());
                pst.setString(5, edatevei.getText());
                pst.setString(6, cattendedvei.getText());
                pst.setString(7, paidvei.getText());
                pst.execute();
                System.out.println("Invoice Info Updated");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        
        try{
            String invoiceview = "SELECT * FROM Sinvoice";
            pst = con.prepareStatement(invoiceview);
            rs = pst.executeQuery();
            vei.setModel(DbUtils.resultSetToTableModel(rs));
            }

        catch (Exception e){
            System.out.println("DB Connection Failed" + e);
                           }
    }//GEN-LAST:event_invoiceinforActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
                 JOptionPane.showMessageDialog(null, "Invoice Sent");
        
        try{
            String x = studname.getSelectedItem().toString();
            String file_name = "C:\\Users\\dhruv\\OneDrive - Innoventures Education\\Year 12\\Computer Science\\CS IA\\CS_IA_Product\\src\\PDF\\Invoice "+x+".pdf";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(file_name));
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMMM yyyy");
            String stdate = sdf.format(sdate.getDate());
            String endate = sdf.format(edate.getDate());
            

            String cat1 = cattended.getText();
            int cat = Integer.parseInt(cat1);
            int ad = cat*150;

            Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
            Font boldFontTitle = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);
            
            document.open();
            
            Paragraph intro = new Paragraph("            Invoice for " + x, boldFontTitle);
            Paragraph space1 = new Paragraph("\n");
            document.add(intro);
            document.add(space1);

            PdfPTable table = new PdfPTable(2);
            
            PdfPCell c1 = new PdfPCell(new Phrase("Amount Due ", boldFont));
            table.addCell(c1);
            table.addCell("AED "+(ad)+".00");
            
            PdfPCell c2 = new PdfPCell(new Phrase("Classes Attended ", boldFont));
            table.addCell(c2);
            table.addCell((cat1)+"/"+(outof.getText()));
            
            PdfPCell c3 = new PdfPCell(new Phrase("Start Date ", boldFont));
            table.addCell(c3);
            table.addCell(stdate);
            
            PdfPCell c4 = new PdfPCell(new Phrase("End Date ", boldFont));
            table.addCell(c4);
            table.addCell(endate);
            document.add(table);
            
            
            Paragraph space2 = new Paragraph("\n");
            document.add(space2);
           
            PdfPTable table2 = new PdfPTable(2);
            
            Paragraph intro2 = new Paragraph("            Attendance Details for " + x, boldFontTitle);
            document.add(intro2);
            
            Paragraph space3 = new Paragraph("\n");
            document.add(space3);
                                    
            PdfPCell c21 = new PdfPCell(new Phrase("Date", boldFont));
            PdfPCell c22 = new PdfPCell(new Phrase("Attendance", boldFont));
            table2.addCell(c21);
            table2.addCell(c22);
            
            
            //ADD SELECT COUNT FEAUTRE ASK TEACHER HOW TO MAKE IT WORK (NULL POINTER EXCEPTION)
            
            
            String dateoa = "SELECT Date, Attendance FROM Sattendance WHERE Sfname='"+x+"'";
            pst = con.prepareStatement(dateoa);
            rs = pst.executeQuery();
                while (rs.next()){
                                
                    table2.addCell(rs.getString("Date"));

                    table2.addCell(rs.getString("Attendance"));
                }

            document.add(table2);
            document.close();
            
            System.out.println("Sent");
            
            
            String add = Integer.toString(ad);
            String catt = Integer.toString(cat);
            
            String studentidatt = "SELECT SID FROM Sinfo WHERE Sfname='"+x+"'";
                pst = con.prepareStatement(studentidatt);
                rs = pst.executeQuery();
                String stdid = rs.getString("SID");
            
             String sql = "INSERT INTO Sinvoice VALUES (?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, null);
                pst.setString(2, stdid);
                pst.setString(3, x);
                pst.setString(4, add);
                pst.setString(5, stdate);
                pst.setString(6, endate);
                pst.setString(7, catt);
                pst.setString(8, null);
                pst.execute();

                System.out.println("Invoice Data Added");
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put( "mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);
        
        String myAccountEmail = "dhruvtreddy@gmail.com";
        String password = "lmsohedgtpyqwwlm";

        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
            
            
        });
        
        try {
            String x = studname.getSelectedItem().toString();
            String parentsemail = "SELECT Pemail FROM Sinfo WHERE Sfname='"+x+"'";
            pst = con.prepareStatement(parentsemail);
            rs = pst.executeQuery();
            String paemail = rs.getString("Pemail");   
            System.out.println(paemail);
            
            Message message = new MimeMessage(session);
            message.setSubject("Ms. Sangeetha's French Tution");
            
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress());
            

            Address addressTo = new InternetAddress("dhruvreddy@hotmail.com");       //PAEMAIL
            message.setRecipient(Message.RecipientType.TO, addressTo);
            
            Transport.send(message);

            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        try{
                 
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_send1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absent;
    private javax.swing.JTextField aidvea;
    private javax.swing.JTextField amountvei;
    private javax.swing.JButton attendanceinfor;
    private javax.swing.JTextField attendancevea;
    private javax.swing.JTextField cattended;
    private javax.swing.JTextField cattendedvei;
    private javax.swing.JTextField cidvea;
    private javax.swing.JTextField cidvec;
    private javax.swing.JTextField classid;
    private javax.swing.JButton classinfor;
    private javax.swing.JComboBox<String> cselect;
    private javax.swing.JTextField datevea;
    private javax.swing.JTable dattend;
    private javax.swing.JTable dbt;
    private javax.swing.JLabel dispemail;
    private javax.swing.JTable dnm;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JTextField edatevei;
    private javax.swing.JButton go;
    private javax.swing.JTextField inidvei;
    private javax.swing.JTable invlist;
    private javax.swing.JButton invoiceinfor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nextstu;
    private javax.swing.JTextField outof;
    private javax.swing.JButton paid;
    private javax.swing.JTextField paidvei;
    private javax.swing.JTextField pemailves;
    private javax.swing.JButton present;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTextField sdatevei;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    private javax.swing.JTextField semailvec;
    private javax.swing.JTextField semailves;
    private javax.swing.JButton send;
    private javax.swing.JButton send1;
    private javax.swing.JTextField sfnamevea;
    private javax.swing.JTextField sfnamevec;
    private javax.swing.JTextField sfnamevei;
    private javax.swing.JTextField sfnameves;
    private javax.swing.JTextField sidvea;
    private javax.swing.JTextField sidvei;
    private javax.swing.JTextField sidves;
    private javax.swing.JTextField slnameves;
    private javax.swing.JButton studentinfor;
    private javax.swing.JTextField studid;
    private javax.swing.JComboBox<String> studname;
    private javax.swing.JComboBox<String> studname1;
    private javax.swing.JTextField sylevelvec;
    private javax.swing.JTextField sylevelves;
    private javax.swing.JTable vea;
    private javax.swing.JTable vec;
    private javax.swing.JTable vei;
    private javax.swing.JTable ves;
    private javax.swing.JButton y10;
    private javax.swing.JButton y11;
    private javax.swing.JButton y12;
    private javax.swing.JButton y13;
    private javax.swing.JButton y7;
    private javax.swing.JButton y8;
    private javax.swing.JButton y9;
    // End of variables declaration//GEN-END:variables
}
