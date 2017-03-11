/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author dumindu
 */
import biometric.authentication.Cipher;
import biometric.authentication.DbConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
public class Hand_Biometry extends javax.swing.JFrame {
    
    
    Connection dbconnection;
    ResultSet resultset;
    PreparedStatement statement;
    Statement stmt;
    String ID;
   
    

    /**
     * Creates new form Hand_Biometry
     */
    public Hand_Biometry(String Id) {
        ID = Id;
        dbconnection = DbConnection.connect(); 
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Thumb_Length = new javax.swing.JTextField();
        Indexfin_Len = new javax.swing.JTextField();
        MiddleFin_len = new javax.swing.JTextField();
        RingFin_Len = new javax.swing.JTextField();
        SmallFin_Len = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Palm_length = new javax.swing.JTextField();
        Thumb_FS = new javax.swing.JTextField();
        IndexFin_FS = new javax.swing.JTextField();
        MiddleFin_Fs = new javax.swing.JTextField();
        RingFin_FS = new javax.swing.JTextField();
        Smallfin_FS = new javax.swing.JTextField();
        Thumb_sj = new javax.swing.JTextField();
        IndexFin_SC = new javax.swing.JTextField();
        MiddleFin_SC = new javax.swing.JTextField();
        RingFin_SC = new javax.swing.JTextField();
        SmallFin_sc = new javax.swing.JTextField();
        Thumb_width = new javax.swing.JTextField();
        IndexFin_width = new javax.swing.JTextField();
        MiddleFin_width = new javax.swing.JTextField();
        RingFin_width = new javax.swing.JTextField();
        SmallFin_width = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Palm_width = new javax.swing.JTextField();
        Cancelbtn = new javax.swing.JButton();
        Okaybtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Place your inputs here......");

        jLabel2.setText("Thumb");

        jLabel3.setText("Index Finger");

        jLabel4.setText("Middle Finger");

        jLabel5.setText("Ring Finger");

        jLabel6.setText("Small Finger");

        jLabel7.setText("Palm");

        jLabel8.setText("Length(cm)");

        jLabel9.setText("First_Joint(cm)");

        jLabel10.setText("Second_joint(cm)");

        jLabel11.setText("Width(cm)");

        Thumb_Length.setText("15.0");

        Indexfin_Len.setText("5.0");

        MiddleFin_len.setText("2.3");

        RingFin_Len.setText("5.2");
        RingFin_Len.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RingFin_LenActionPerformed(evt);
            }
        });

        SmallFin_Len.setText("8.5");

        jLabel12.setText("Length");

        Palm_length.setText("8.6");

        Thumb_FS.setText("10.0");

        IndexFin_FS.setText("6.3");

        MiddleFin_Fs.setText("8.6");

        RingFin_FS.setText("9.3");

        Smallfin_FS.setText("4.3");

        Thumb_sj.setText("2.0");

        IndexFin_SC.setText("7.5");

        MiddleFin_SC.setText("4.6");
        MiddleFin_SC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleFin_SCActionPerformed(evt);
            }
        });

        RingFin_SC.setText("10.3");
        RingFin_SC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RingFin_SCActionPerformed(evt);
            }
        });

        SmallFin_sc.setText("6.3");

        Thumb_width.setText("4.0");

        IndexFin_width.setText("9.6");
        IndexFin_width.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndexFin_widthActionPerformed(evt);
            }
        });

        MiddleFin_width.setText("4.6");

        RingFin_width.setText("9.3");

        SmallFin_width.setText("4.3");

        jLabel13.setText("Width");

        Palm_width.setText("1.6");

        Cancelbtn.setText("Cancel");
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });

        Okaybtn.setText("Ok");
        Okaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkaybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SmallFin_Len)
                                    .addComponent(RingFin_Len)
                                    .addComponent(MiddleFin_len)
                                    .addComponent(Indexfin_Len)
                                    .addComponent(Thumb_Length, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Smallfin_FS, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(RingFin_FS, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(MiddleFin_Fs, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IndexFin_FS, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Thumb_FS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Palm_length, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(Palm_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SmallFin_sc, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(RingFin_SC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addComponent(MiddleFin_SC, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IndexFin_SC, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Thumb_sj, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Thumb_width)
                            .addComponent(IndexFin_width)
                            .addComponent(MiddleFin_width)
                            .addComponent(RingFin_width)
                            .addComponent(SmallFin_width))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cancelbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Okaybtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Thumb_Length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thumb_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thumb_sj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Thumb_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Indexfin_Len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IndexFin_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IndexFin_SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IndexFin_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Cancelbtn)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(MiddleFin_len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MiddleFin_Fs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MiddleFin_SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MiddleFin_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Okaybtn))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RingFin_Len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RingFin_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RingFin_SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RingFin_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SmallFin_Len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Smallfin_FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SmallFin_sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SmallFin_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(Palm_length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Palm_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
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

    private void MiddleFin_SCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleFin_SCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiddleFin_SCActionPerformed

    private void RingFin_SCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RingFin_SCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RingFin_SCActionPerformed

    private void IndexFin_widthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndexFin_widthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IndexFin_widthActionPerformed

    private void OkaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkaybtnActionPerformed
           //Hand_Biometry hb = new Hand_Biometry();
           
        try {
            
            if(Authorize(ID)){
                JOptionPane.showMessageDialog(null, "You are an Authorized person");
            }else{
            
            Results r = new Results();
            r.show();
            };
        } catch (SQLException ex) {
            Logger.getLogger(Hand_Biometry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_OkaybtnActionPerformed

    public boolean Authorize(String Id) throws SQLException{
    
    
    
        String Thumb_len = this.Thumb_Length.getText().trim();
        //System.out.print("                                                               " + Thumb_len);
        String Thumb_width = this.Thumb_width.getText().trim();
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
    
    
        stmt = dbconnection.createStatement();
            String sql = "Select * from user where user_id="+Id+";";
     resultset = stmt.executeQuery(sql);
        
     Cipher c = new Cipher();
         String[] list = new String[21];
         while(resultset.next()){
         
         list[0] =c.decrypt(resultset.getString("indexfin_length"));
         list[1] = c.decrypt(resultset.getString("indexfin_width"));
         list[2] = c.decrypt(resultset.getString("indexfin_fir_joint"));
         list[3] = c.decrypt(resultset.getString("indexfin__sec_joint"));
         list[4] = c.decrypt(resultset.getString("thumb_length"));
         list[5] = c.decrypt(resultset.getString("thumb_width"));
         list[6] = c.decrypt(resultset.getString("thumb_fir_joint"));
         list[7] = c.decrypt(resultset.getString("middlefin_length"));
         list[8] = c.decrypt(resultset.getString("middlefin_width"));
         list[9] = c.decrypt(resultset.getString("middlefin_fir_joint"));
         list[10] = c.decrypt(resultset.getString("middlefin_sec_joint"));
         list[11] = c.decrypt(resultset.getString("ringfin_length"));
         list[12] = c.decrypt(resultset.getString("ringfin_width"));
         list[13] = c.decrypt(resultset.getString("ringfin_fir_joint"));
         list[14] = c.decrypt(resultset.getString("ringfin_sec_joint"));
         list[15] = c.decrypt(resultset.getString("smallfin_length"));
         list[16] = c.decrypt(resultset.getString("smallfin_width"));
         list[17] = c.decrypt(resultset.getString("smallfin_fir_joint"));
         list[18] = c.decrypt(resultset.getString("smallfin_sec_joint"));
         list[19] = c.decrypt(resultset.getString("palm_length"));
         list[20] = c.decrypt(resultset.getString("palm_width"));
         }
         
         
     if(Thumb_len.equals(list[4]) && Thumb_width.equals(list[5]) && Thumb_FirstJoint.equals(list[6])){
     if(Index_Length.equals(list[0]) && Index_width.equals(list[1]) && Index_FirstLen.equals(list[2]) && Index_SecLec.equals(list[3])){
     if(Middle_Len.equals(list[7]) && Middle_width.equals(list[8]) && Middle_FS.equals(list[9]) && Middle_SC.equals(list[10])){
     if(Ring_Len.equals(list[11]) && Ring_width.equals(list[12]) && Ring_FS.equals(list[13]) && Ring_SC.equals(list[14])){
     if(Small_Len.equals(list[15]) && Small_width.equals(list[16]) && Small_FS.equals(list[17]) && Small_SC.equals(list[18])){
     if(Palm_Len.equals(list[19]) && Palm_Width.equals(list[20])){
         
         return true;
     }else{return false;}
     }else{return false;}
     }else{return false;}
     }else{return false;}
     }else{return false;}
     }else{return false;}
     
     }
     
     
     
    
    
    
    
    
    
    private void RingFin_LenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RingFin_LenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RingFin_LenActionPerformed

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
         this.dispose();
    }//GEN-LAST:event_CancelbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JTextField IndexFin_FS;
    private javax.swing.JTextField IndexFin_SC;
    private javax.swing.JTextField IndexFin_width;
    private javax.swing.JTextField Indexfin_Len;
    private javax.swing.JTextField MiddleFin_Fs;
    private javax.swing.JTextField MiddleFin_SC;
    private javax.swing.JTextField MiddleFin_len;
    private javax.swing.JTextField MiddleFin_width;
    private javax.swing.JButton Okaybtn;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
