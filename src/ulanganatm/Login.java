/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulanganatm;

import javax.swing.JOptionPane;

/**
 *
 * @author elvina
 */
public class Login extends javax.swing.JFrame {
    String nomor="";
    int pilih;
    /**
     * Creates new form NewJFrame
     */
    public Login() {
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
        apin = new javax.swing.JTextField();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jb11 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO ATM BANK");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 40, 220, 30);

        apin.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(apin);
        apin.setBounds(80, 100, 190, 80);

        jb1.setBackground(new java.awt.Color(0, 51, 153));
        jb1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(80, 200, 50, 50);

        jb2.setBackground(new java.awt.Color(0, 51, 153));
        jb2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2);
        jb2.setBounds(150, 200, 50, 50);

        jb3.setBackground(new java.awt.Color(0, 51, 153));
        jb3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        getContentPane().add(jb3);
        jb3.setBounds(220, 200, 50, 50);

        jb4.setBackground(new java.awt.Color(0, 51, 153));
        jb4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jb4);
        jb4.setBounds(80, 260, 50, 50);

        jb5.setBackground(new java.awt.Color(0, 51, 153));
        jb5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        getContentPane().add(jb5);
        jb5.setBounds(150, 260, 50, 50);

        jb6.setBackground(new java.awt.Color(0, 51, 153));
        jb6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        getContentPane().add(jb6);
        jb6.setBounds(220, 260, 50, 50);

        jb7.setBackground(new java.awt.Color(0, 51, 153));
        jb7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });
        getContentPane().add(jb7);
        jb7.setBounds(80, 320, 50, 50);

        jb8.setBackground(new java.awt.Color(0, 51, 153));
        jb8.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        getContentPane().add(jb8);
        jb8.setBounds(150, 320, 50, 50);

        jb9.setBackground(new java.awt.Color(0, 51, 153));
        jb9.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        getContentPane().add(jb9);
        jb9.setBounds(220, 320, 50, 50);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Masukkan PIN Anda");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 80, 140, 16);

        jb11.setBackground(new java.awt.Color(0, 51, 153));
        jb11.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jb11.setText("0");
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });
        getContentPane().add(jb11);
        jb11.setBounds(150, 380, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\elvina\\Downloads\\bright-blue-tech-shapes-background-video-animation-hd-1920x1080_vljhd_nhg__M0000.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 360, 630);

        setSize(new java.awt.Dimension(366, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
    nomor+="7";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
    nomor+="8";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
    nomor+="9";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();    
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
    nomor+="1";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
     nomor+="2";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
     nomor+="3";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
    nomor+="4";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
    nomor+="5";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
    nomor+="6";
    apin.setText(nomor);
    pilih+=1;
    pengecekan();
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb11ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    // End of variables declaration//GEN-END:variables

    private void pengecekan() {
        if(pilih == 4){
            String pin=apin.getText();
            if("1234".equals(pin)){
                new Home().show();
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Pin ERROR");
                apin.setText("");
                pilih=0;
                nomor="";
            }
        }
    }
}
