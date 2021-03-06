/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import biometric.authentication.Cipher;
import biometric.authentication.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dumindu
 */
public class CreateUser extends javax.swing.JFrame {

    /**
     * Creates new form CreateUser
     */
    
    Connection Conn;
    ResultSet resultset;
    private static Statement statement=null;
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////
    
    
        
        //////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    public CreateUser() {
        Conn = DbConnection.connect();
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Thumb_Length = new javax.swing.JTextField();
        Thumb_FS = new javax.swing.JTextField();
        Thumb_sj = new javax.swing.JTextField();
        Thumb_width = new javax.swing.JTextField();
        Indexfin_Len = new javax.swing.JTextField();
        IndexFin_FS = new javax.swing.JTextField();
        IndexFin_SC = new javax.swing.JTextField();
        IndexFin_width = new javax.swing.JTextField();
        MiddleFin_len = new javax.swing.JTextField();
        MiddleFin_Fs = new javax.swing.JTextField();
        MiddleFin_SC = new javax.swing.JTextField();
        MiddleFin_width = new javax.swing.JTextField();
        RingFin_Len = new javax.swing.JTextField();
        RingFin_FS = new javax.swing.JTextField();
        RingFin_SC = new javax.swing.JTextField();
        RingFin_width = new javax.swing.JTextField();
        SmallFin_Len = new javax.swing.JTextField();
        Smallfin_FS = new javax.swing.JTextField();
        SmallFin_sc = new javax.swing.JTextField();
        SmallFin_width = new javax.swing.JTextField();
        Palm_length = new javax.swing.JTextField();
        Palm_width = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        userid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User Name");

        UserName.setText("Dumindu");

        jLabel2.setText("Your User ID is ");

        jLabel4.setText("Length (cm)");

        jLabel5.setText("Length of First Joint");

        jLabel6.setText("Length of second joint");

        jLabel7.setText("width");

        jLabel8.setText("Thumb");

        jLabel9.setText("Index_Finger");

        jLabel10.setText("Middle Finger");

        jLabel11.setText("Ring Finger");

        jLabel12.setText("Small Finger");

        jLabel13.setText("Palm");

        jLabel14.setText("Length");

        jLabel15.setText("Width");

        Thumb_Length.setText("15.0");
        Thumb_Length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thumb_LengthActionPerformed(evt);
            }
        });

        Thumb_FS.setText("10.0");
        Thumb_FS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thumb_FSActionPerformed(evt);
            }
        });

        Thumb_sj.setText("2.0");
        Thumb_sj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thumb_sjActionPerformed(evt);
            }
        });

        Thumb_width.setText("4.0");

        Indexfin_Len.setText("5.0");
        Indexfin_Len.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Indexfin_LenActionPerformed(evt);
            }
        });

        IndexFin_FS.setText("6.3");

        IndexFin_SC.setText("7.5");

        IndexFin_width.setText("9.6");

        MiddleFin_len.setText("2.3");

        MiddleFin_Fs.setText("8.6");
        MiddleFin_Fs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleFin_FsActionPerformed(evt);
            }
        });

        MiddleFin_SC.setText("4.6");

        MiddleFin_width.setText("4.6");

        RingFin_Len.setText("5.2");

        RingFin_FS.setText("9.3");

        RingFin_SC.setText("10.3");

        RingFin_width.setText("9.3");

        SmallFin_Len.setText("8.5");
        SmallFin_Len.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SmallFin_LenActionPerformed(evt);
            }
        });

        Smallfin_FS.setText("4.3");

        SmallFin_sc.setText("6.3");

        SmallFin_width.setText("4.3");

        Palm_length.setText("8.6");

        Palm_width.setText("1.6");

        jButton1.setText("Okay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        userid.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(36, 36, 36)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(RingFin_Len, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                                        .addComponent(MiddleFin_len, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Indexfin_Len, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Thumb_Length, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(SmallFin_Len))
                                                    .addComponent(jLabel14))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(Palm_length)
                                                        .addGap(17, 17, 17))
                                                    .addComponent(jLabel5)
                                                    .addComponent(Smallfin_FS)
                                                    .addComponent(RingFin_FS)
                                                    .addComponent(MiddleFin_Fs))))
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(SmallFin_sc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                                .addComponent(RingFin_SC, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(MiddleFin_SC, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(IndexFin_SC, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Thumb_sj, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(jLabel7))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(SmallFin_width, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                                .addComponent(RingFin_width, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(MiddleFin_width, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(IndexFin_width, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Thumb_width, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IndexFin_FS, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Thumb_FS, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jLabel15)
                                .addGap(40, 40, 40)
                                .addComponent(Palm_width, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(81, 81, 81))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Thumb_Length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Thumb_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Thumb_sj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Thumb_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IndexFin_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IndexFin_SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IndexFin_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(Indexfin_Len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(MiddleFin_len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiddleFin_Fs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiddleFin_SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiddleFin_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton2)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RingFin_Len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RingFin_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RingFin_SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RingFin_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SmallFin_Len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Smallfin_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SmallFin_sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SmallFin_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(Palm_length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Palm_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Indexfin_LenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Indexfin_LenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Indexfin_LenActionPerformed

    private void Thumb_FSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thumb_FSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Thumb_FSActionPerformed

    private void SmallFin_LenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmallFin_LenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SmallFin_LenActionPerformed

    private void MiddleFin_FsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleFin_FsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiddleFin_FsActionPerformed

    private void Thumb_sjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thumb_sjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Thumb_sjActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Cipher ob = new Cipher();
        
        String Thumb_len = this.Thumb_Length.getText().trim();
        String Thumb_width1 = this.Thumb_width.getText().trim();
        String Thumb_FirstJoint = this.Thumb_FS.getText().trim();
        String Thumb_SecondJoint = this.Thumb_sj.getText().trim();
        
        String Index_Length = this.Indexfin_Len.getText().trim();
        String Index_width = this.IndexFin_width.getText().trim();
        String Index_FirstLen= this.IndexFin_FS.getText().trim();
        String Index_SecLec = this.IndexFin_SC.getText().trim();
        
        String Middle_Len = this.MiddleFin_len.getText().trim();
        String Middle_width = this.MiddleFin_width.getText().trim();
        String Middle_FS = this.MiddleFin_Fs.getText().trim();
        String Middle_SC = this.MiddleFin_SC.getText().trim();
       
        
        String Ring_Len = this.RingFin_Len.getText().trim();
        String Ring_width = this.RingFin_width.getText().trim();
        String Ring_FS = this.RingFin_FS.getText().trim();
        String Ring_SC = this.RingFin_SC.getText().trim();
        
        
        String Small_Len = this.SmallFin_Len.getText().trim();
        String Small_width = this.SmallFin_width.getText().trim();
        String Small_FS = this.Smallfin_FS.getText().trim();
        String Small_SC = this.SmallFin_sc.getText().trim();
        
        String Palm_Len = this.Palm_length.getText().trim();
        String Palm_Width = this.Palm_width.getText().trim();
        
        String Username = this.UserName.getText().trim();
        String UserID = this.userid.getText().trim();
        
        
        
        String sql  = "Insert into user (\"user_id\",\"user_name\" ,\"indexfin_length\",\"indexfin_width\",\"indexfin_fir_joint\",\n" +
"        \"indexfin__sec_joint\",\"thumb_length\",\"thumb_width\" ,\"thumb_fir_joint\"\n" +
"        ,\"middlefin_length\" ,\"middlefin_width\" ,\"middlefin_fir_joint\" ,\n" +
"        \"middlefin_sec_joint\",\"ringfin_length\" ,\"ringfin_width\"  ,\"ringfin_fir_joint\" ,\n" +
"        \"ringfin_sec_joint\"  ,\"smallfin_length\"  ,\"smallfin_width\"  ,\"smallfin_fir_joint\" ,\"smallfin_sec_joint\" ,\n" +
"        \"palm_length\" ,\"palm_width\" )"
                + " values (\'"+
                (UserID)+"\',\'"+
                (Username)+"\',\'"+
                ob.encrypt(Index_Length)+"\',\'"+
                ob.encrypt(Index_width)+"\',\'"+
                ob.encrypt(Index_FirstLen)+"\',\'"+
                ob.encrypt(Index_SecLec)+"\',\'"+
                ob.encrypt(Thumb_len)+"\',\'"+
                ob.encrypt(Thumb_width1)+"\',\'"+
                ob.encrypt(Thumb_FirstJoint)+"\',\'"+
                ob.encrypt(Middle_Len)+"\',\'"+
                ob.encrypt(Middle_width)+"\',\'"+
                ob.encrypt(Middle_FS)+"\',\'"+
                ob.encrypt(Middle_SC)+"\',\'"+
                ob.encrypt(Ring_Len)+"\',\'"+
                ob.encrypt(Ring_width)+"\',\'"+
                ob.encrypt(Ring_FS)+"\',\'"+
                ob.encrypt(Ring_SC)+"\',\'"+
                ob.encrypt(Small_Len)+"\',\'"+
                ob.encrypt(Small_width)+"\',\'"+
                ob.encrypt(Small_FS)+"\',\'"+
                ob.encrypt(Small_SC)+"\',\'"+
                ob.encrypt(Palm_Len)+"\',\'"+
                ob.encrypt(Palm_Width)+"\'"+
                
                ");";
        
        try {
            statement = Conn.createStatement();
        } catch (SQLException ex) {
            
            System.out.println("Error when connecting to database");
        }
        try {
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Succesfully create the profile");
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Thumb_LengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thumb_LengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Thumb_LengthActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IndexFin_FS;
    private javax.swing.JTextField IndexFin_SC;
    private javax.swing.JTextField IndexFin_width;
    private javax.swing.JTextField Indexfin_Len;
    private javax.swing.JTextField MiddleFin_Fs;
    private javax.swing.JTextField MiddleFin_SC;
    private javax.swing.JTextField MiddleFin_len;
    private javax.swing.JTextField MiddleFin_width;
    private javax.swing.JTextField Palm_length;
    private javax.swing.JTextField Palm_width;
    private javax.swing.JTextField RingFin_FS;
    private javax.swing.JTextField RingFin_Len;
    private javax.swing.JTextField RingFin_SC;
    private javax.swing.JTextField RingFin_width;
    private javax.swing.JTextField SmallFin_Len;
    private javax.swing.JTextField SmallFin_sc;
    private javax.swing.JTextField SmallFin_width;
    private javax.swing.JTextField Smallfin_FS;
    private javax.swing.JTextField Thumb_FS;
    private javax.swing.JTextField Thumb_Length;
    private javax.swing.JTextField Thumb_sj;
    private javax.swing.JTextField Thumb_width;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
