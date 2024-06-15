
package crudapplication;

import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Update extends javax.swing.JFrame {
        String imgPath = null;
        public Update(String uid,String pword){
        initComponents();
        setLocationRelativeTo(null);
        try{
        java.sql.Connection con = MyConnection.connect();
        PreparedStatement ps=con.prepareStatement("select * from student where uid=? and pass=?");
        ps.setString(1,uid);
        ps.setString(2,pword);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            user.setText(rs.getString(1));
            name.setText(rs.getString(2));
            if(rs.getString(5).equalsIgnoreCase("male")){
                male.setSelected(true);
            }
            else if(rs.getString(5).equalsIgnoreCase("female")){
                female.setSelected(true);
            }
            course.setText(rs.getString(3));
            qualification.setSelectedItem(rs.getString(6));
            fees.setText(rs.getString(4));
            password.setText(rs.getString(8));
            cpassword.setText(rs.getString(8));
            byte[] img = rs.getBytes(7);
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image imgIcon = im.getScaledInstance(myImage.getWidth(), myImage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(imgIcon);
                myImage.setIcon(newImage);
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        user.setEditable(false);
        
    }

    private Update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minize = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        uid1 = new javax.swing.JLabel();
        uid2 = new javax.swing.JLabel();
        uid3 = new javax.swing.JLabel();
        uid4 = new javax.swing.JLabel();
        uid5 = new javax.swing.JLabel();
        uid6 = new javax.swing.JLabel();
        qualification = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        showpwd = new javax.swing.JCheckBox();
        myImage = new javax.swing.JLabel();
        choice = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        fees = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        uid7 = new javax.swing.JLabel();
        cpassword = new javax.swing.JPasswordField();
        showpwd1 = new javax.swing.JCheckBox();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE");

        close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        minize.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        minize.setForeground(new java.awt.Color(255, 255, 255));
        minize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minize.setText("-");
        minize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(minize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(close))
                            .addComponent(minize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        uid.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        uid.setText("USER ID :");

        uid1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        uid1.setText("COURSE :");

        uid2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        uid2.setText("NAME :");

        uid3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        uid3.setText("GENDER :");

        uid4.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        uid4.setText("CONFIRM PASSWORD :");

        uid5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        uid5.setText("QUALIFICATIONS :");

        uid6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        uid6.setText("FEES :");

        qualification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "not select", "Under-Gradugate", "Gradugate", "post-Gradugate" }));
        qualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        male.setText("MALE");

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI Semibold", 3, 12)); // NOI18N
        female.setText("FEMALE");

        submit.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        showpwd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showpwd.setText("SHOW PASSWORD");
        showpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpwdActionPerformed(evt);
            }
        });

        myImage.setBorder(new javax.swing.border.MatteBorder(null));

        choice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        choice.setText("CHOOSE>>");
        choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        course.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        fees.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        uid7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        uid7.setText("PASSWORD :");

        cpassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpasswordActionPerformed(evt);
            }
        });

        showpwd1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        showpwd1.setText("SHOW PASSWORD");
        showpwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpwd1ActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(uid4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uid6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188)
                                .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(uid5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(uid7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uid2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uid3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uid1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(154, 154, 154)
                                .addComponent(male)
                                .addGap(72, 72, 72)
                                .addComponent(female)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(showpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(showpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(myImage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(submit)
                        .addGap(94, 94, 94)
                        .addComponent(exit)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uid2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(uid3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(male)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uid1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(choice))
                    .addComponent(uid5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uid6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showpwd))
                    .addComponent(uid7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uid4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showpwd1)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(exit))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feesActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

     public ImageIcon resizePic (String picpath){
        ImageIcon myimg = new ImageIcon(picpath);
        java.awt.Image img = myimg.getImage().getScaledInstance(myImage.getWidth(), myImage.getHeight(), java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }
    private void choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceActionPerformed
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filefilter = new FileNameExtensionFilter(".Images","jpg","png","gif");
        filec.addChoosableFileFilter(filefilter);
        int filestate = filec.showSaveDialog(null);
        if(filestate == JFileChooser.APPROVE_OPTION){
            File selectedfile = filec.getSelectedFile();
            String path = selectedfile.getAbsolutePath();
            resizePic(path);
            myImage.setIcon(resizePic(path));
            imgPath = path;
        }
        else if(filestate == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null,"No image selected ...");
        }
    }//GEN-LAST:event_choiceActionPerformed

    private void showpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpwdActionPerformed

        if (showpwd.isSelected()==true) {
            password.setEchoChar((char) 0);
        } else if (showpwd.isSelected()==false) {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showpwdActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
         
        if(password.getText().equals(cpassword.getText())){
            try{
                InputStream img=new FileInputStream(new File(imgPath));
                java.sql.Connection con = MyConnection.connect();
                java.sql.PreparedStatement ps=con.prepareStatement("update student set name=?,course=?,fees=?,gender=?,qualification=?,photo=?,pass=? where uid=?");
                ps.setString(1, name.getText());
                ps.setString(2, course.getText());
                ps.setInt(3, Integer.parseInt(fees.getText()));
                if(male.isSelected()==true){
                    ps.setString(4, "male");
                }
                else if(female.isSelected()==true){
                    ps.setString(4, "female");
                }
                ps.setString(5,String.valueOf(qualification.getSelectedItem()));
                ps.setBlob(6, img);
                ps.setString(7, password.getText());
                ps.setString(8, user.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Account  Updated.........");
                dispose();
                new LoginPage().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Image need to be Selected again");e.printStackTrace();
            }
        }
        else{
            password.setForeground(Color.red);
            cpassword.setForeground(Color.red);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void qualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationActionPerformed

    }//GEN-LAST:event_qualificationActionPerformed

    private void minizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minizeMouseClicked
        this.setState(LoginPage.ICONIFIED);
    }//GEN-LAST:event_minizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void showpwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpwd1ActionPerformed
        if (showpwd1.isSelected()==true) {
            cpassword.setEchoChar((char) 0);
        } else if (showpwd1.isSelected()==false) {
            cpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showpwd1ActionPerformed

    private void cpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpasswordActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed

    }//GEN-LAST:event_userActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton choice;
    private javax.swing.JLabel close;
    private javax.swing.JTextField course;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fees;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel minize;
    private javax.swing.JLabel myImage;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> qualification;
    private javax.swing.JCheckBox showpwd;
    private javax.swing.JCheckBox showpwd1;
    private javax.swing.JButton submit;
    private javax.swing.JLabel uid;
    private javax.swing.JLabel uid1;
    private javax.swing.JLabel uid2;
    private javax.swing.JLabel uid3;
    private javax.swing.JLabel uid4;
    private javax.swing.JLabel uid5;
    private javax.swing.JLabel uid6;
    private javax.swing.JLabel uid7;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

   
}