/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms_making;

import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class fees_slip extends javax.swing.JFrame {

    /**
     * Creates new form fees_slip
     */
    public fees_slip() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        p_id = new javax.swing.JTextField();
        patient_name = new javax.swing.JTextField();
        doctor_name = new javax.swing.JTextField();
        fees = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        room_number = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/bedroom.png"))); // NOI18N
        jLabel1.setText("ROON NO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 190, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/user (6).png"))); // NOI18N
        jLabel3.setText("PATIENT NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, 50));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 450, 30));

        p_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idActionPerformed(evt);
            }
        });
        p_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p_idKeyReleased(evt);
            }
        });
        getContentPane().add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 450, 30));
        getContentPane().add(patient_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 450, 30));
        getContentPane().add(doctor_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 450, 30));
        getContentPane().add(fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 450, 30));

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 500, 510));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/submit (3).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 180, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/reset-password.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 190, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/printer.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 170, 50));
        getContentPane().add(room_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 450, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/fingerprint.png"))); // NOI18N
        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/user (4).png"))); // NOI18N
        jLabel8.setText("DOCTOR NAME");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 220, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/money.png"))); // NOI18N
        jLabel9.setText("FEE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/receiver.png"))); // NOI18N
        jLabel2.setText("CONTACT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 160, 40));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/updated.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1390, 670));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/fees.png"))); // NOI18N
        jLabel4.setText("FEE SUBMIT");
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 900, 90));

        jButton4.setText("jButton4");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/exit-full-screen.png"))); // NOI18N
        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 310, 90));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 102, 51));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms_making/previous.png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  DB_Connection db = new DB_Connection();
        
        db.addAppointment(p_id.getText(), patient_name.getText(), doctor_name.getText(), 
                fees.getText(), contact.getText(), room_number.getText());
        



        // TODO add your handling code here:
        area.setText("************************************\n");
        area.setText(area.getText()+"*               HOSPITAL MANEGMENT SYSYTEM             *\n");
        area.setText(area.getText()+"************************************\n");

        Date obj = new Date();
        String date =obj.toString();
        area.setText(area.getText()+"\n"+date+"\n\n");
        area.setText(area.getText()+"ID:"+p_id.getText()+"\n\n");
        area.setText(area.getText()+"Patient Name:"+patient_name.getText()+"\n\n");
        area.setText(area.getText()+"Doctor Name:"+doctor_name.getText()+"\n\n");
        area.setText(area.getText()+"Fees:"+fees.getText()+"\n\n");
        area.setText(area.getText()+"Contact:"+contact.getText()+"\n\n");
        area.setText(area.getText()+"Room No:"+room_number.getText()+"\n\n");
        area.setText(area.getText()+"\n        Develop By Muhammad Umer      ");

        
        JOptionPane.showMessageDialog(this, "DATA SUBMIT","Message",1);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        area.setText("");
        p_id.setText("");
        patient_name.setText("");
        doctor_name.setText("");
        fees .setText("");
        contact.setText("");
        room_number.setText("");
        
        JOptionPane.showMessageDialog(this, "DATA RESENT","Message",1);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {
            

            area.print();
            
            // TODO add your handling code here:
        } catch (PrinterException ex) {
            Logger.getLogger(fees_slip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void p_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_idKeyReleased

 DB_Connection db = new DB_Connection();
  ResultSet rs;
  rs=db.getDetailsFeesByid(p_id.getText());
        try {
            if(rs.next());
            patient_name.setText(rs.getString("patient_name"));
             doctor_name.setText(rs.getString("doctor_name"));
     fees.setText(rs.getString("fees"));
                     contact.setText(rs.getString("contact"));
                      room_number.setText(rs.getString("room_number"));
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(fees_slip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p_idKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dashboard d = new dashboard();
        d.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void p_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_idActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DB_Connection db = new DB_Connection();
        db.updateafees(patient_name.getText(), doctor_name.getText(), fees.getText(), contact.getText(), room_number.getText(), p_id.getText());
       
        JOptionPane.showMessageDialog(this, "UPDATE SUCCESSFULL SAVE","Message",1);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(fees_slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fees_slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fees_slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fees_slip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fees_slip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField doctor_name;
    private javax.swing.JTextField fees;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField patient_name;
    private javax.swing.JTextField room_number;
    // End of variables declaration//GEN-END:variables
}
