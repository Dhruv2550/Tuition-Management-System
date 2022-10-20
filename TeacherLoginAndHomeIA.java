import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class TeacherLoginAndHomeIA extends javax.swing.JFrame {
    
    Connection con = null;//need for DB connection
    PreparedStatement pst = null;//need for DB connection
    ResultSet rs = null;//need for DB connection
    
    public TeacherLoginAndHomeIA() {
        initComponents();
        con = DBConnectionIA.ConnectionDB();//need for DB connection
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        login2 = new javax.swing.JButton();
        error = new javax.swing.JTextField();
        password21 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        semail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        pemail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ylevel = new javax.swing.JComboBox<>();
        signup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 255));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel7.setText("Teacher Login");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teachericon.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setText("Password");

        login2.setBackground(new java.awt.Color(0, 51, 153));
        login2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        login2.setForeground(new java.awt.Color(255, 255, 255));
        login2.setText("Login");
        login2.setBorder(null);
        login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login2ActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        error.setBorder(null);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });

        password21.setBackground(new java.awt.Color(204, 204, 204));
        password21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        password21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(login2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(436, 436, 436))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(password21, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(95, 95, 95)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(password21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(login2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Teacher", jPanel6);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        jLabel10.setText("Student Sign Up");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/studenticon.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setText("First Name");

        lname.setBackground(new java.awt.Color(204, 204, 204));
        lname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setText("Last Name");

        fname.setBackground(new java.awt.Color(204, 204, 204));
        fname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setText("Student Email");

        semail.setBackground(new java.awt.Color(204, 204, 204));
        semail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        semail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        semail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semailActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel15.setText("Year Level");

        pemail.setBackground(new java.awt.Color(204, 204, 204));
        pemail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemailActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel16.setText("Parent Email");

        ylevel.setBackground(new java.awt.Color(204, 204, 204));
        ylevel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ylevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "7", "8", "9", "10", "11", "12", "13" }));
        ylevel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        signup.setBackground(new java.awt.Color(0, 51, 153));
        signup.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign Up");
        signup.setBorder(null);
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(pemail, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ylevel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(170, 170, 170))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ylevel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pemail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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

    private void login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login2ActionPerformed
        
        try{
            String pass = "";
            pass = password21.getText();    
        
        if (pass.equals("123")) {
            setContentPane(new HomePageAppIA1());
            pack();
        }
        else 
            error.setText("Wrong Password, Try Again");
        }
        
        catch (Exception exy){
            System.out.println(exy);
        }
        
    }//GEN-LAST:event_login2ActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void semailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semailActionPerformed

    private void pemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemailActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        String paremail = pemail.getText();
        String stemail = semail.getText();
        valEmail(paremail);
        valEmail2(stemail);
        //signup.setEnabled(false);
        
        
        if (valEmail(paremail) == true && valEmail2(stemail) == true){
            
            try{
                String sql = "INSERT INTO Sinfo VALUES (?,?,?,?,?,?)";//insert into sinfo table

                pst = con.prepareStatement(sql);
                pst.setString(1, null);
                pst.setString(2, fname.getText());
                pst.setString(3, lname.getText());
                pst.setString(4, semail.getText());
                pst.setString(5, ylevel.getSelectedItem().toString());
                pst.setString(6, pemail.getText());
                pst.execute();

                System.out.println("New User Added");
            
            if (ylevel.getSelectedItem().toString().equals("7")){//insert into year 7 class
                String sql7 = "INSERT INTO Sclasslist VALUES (?,?,?,?)";
                String a = "1";
                pst = con.prepareStatement(sql7);
                pst.setString(1, a);
                pst.setString(2, fname.getText());
                pst.setString(3, ylevel.getSelectedItem().toString());
                pst.setString(4, semail.getText());   
                pst.execute();
        }
            if (ylevel.getSelectedItem().toString().equals("8")){//insert into year 8 class
                String sql8 = "INSERT INTO Sclasslist VALUES (?,?,?,?)";
                String b = "2";
                pst = con.prepareStatement(sql8);
                pst.setString(1, b);
                pst.setString(2, fname.getText());
                pst.setString(3, ylevel.getSelectedItem().toString());
                pst.setString(4, semail.getText());   
                pst.execute();
        }
            if (ylevel.getSelectedItem().toString().equals("9")){//insert into year 9 class
                String sql9 = "INSERT INTO Sclasslist VALUES (?,?,?,?)";
                String c = "3";
                pst = con.prepareStatement(sql9);
                pst.setString(1, c);
                pst.setString(2, fname.getText());
                pst.setString(3, ylevel.getSelectedItem().toString());
                pst.setString(4, semail.getText());   
                pst.execute();
        }
            if (ylevel.getSelectedItem().toString().equals("10")){//insert into year 10 class
                String sql10 = "INSERT INTO Sclasslist VALUES (?,?,?,?)";
                String d = "4";
                pst = con.prepareStatement(sql10);
                pst.setString(1, d);
                pst.setString(2, fname.getText());
                pst.setString(3, ylevel.getSelectedItem().toString());
                pst.setString(4, semail.getText());   
                pst.execute();
        }
            if (ylevel.getSelectedItem().toString().equals("11")){//insert into year 11 class
                String sql11 = "INSERT INTO Sclasslist VALUES (?,?,?,?)";
                String e = "5";
                pst = con.prepareStatement(sql11);
                pst.setString(1, e);
                pst.setString(2, fname.getText());
                pst.setString(3, ylevel.getSelectedItem().toString());
                pst.setString(4, semail.getText());   
                pst.execute();
        }
        if (ylevel.getSelectedItem().toString().equals("12")){//insert into year 12 class
                String sql12 = "INSERT INTO Sclasslist VALUES (?,?,?,?)";
                String f = "6";
                pst = con.prepareStatement(sql12);
                pst.setString(1, f);
                pst.setString(2, fname.getText());
                pst.setString(3, ylevel.getSelectedItem().toString());
                pst.setString(4, semail.getText());   
                pst.execute();
        }
        if (ylevel.getSelectedItem().toString().equals("13")){//insert into year 13 class
                String sql13 = "INSERT INTO Sclasslist VALUES (?,?,?,?)";
                String g = "7";
                pst = con.prepareStatement(sql13);
                pst.setString(1, g);
                pst.setString(2, fname.getText());
                pst.setString(3, ylevel.getSelectedItem().toString());
                pst.setString(4, semail.getText());   
                pst.execute();
        }
        }
        catch(Exception e) {
            System.out.println("DB Connection Failed" + e);
            
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Fill Valid Emails");
            }

    }//GEN-LAST:event_signupActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorActionPerformed

    private void password21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password21ActionPerformed
    
    public static boolean valEmail (String input){
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(input);
        return matcher.find();
         
    }
    
    public static boolean valEmail2 (String input2){
        String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(input2);
        return matcher.find();
         
    }
    

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherLoginAndHomeIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherLoginAndHomeIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherLoginAndHomeIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherLoginAndHomeIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLoginAndHomeIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField error;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JButton login2;
    private javax.swing.JPasswordField password21;
    private javax.swing.JTextField pemail;
    private javax.swing.JTextField semail;
    private javax.swing.JButton signup;
    private javax.swing.JComboBox<String> ylevel;
    // End of variables declaration//GEN-END:variables
}
