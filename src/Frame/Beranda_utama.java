/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import BD.beranda_BD_peserta;
import FLS2N.beranda_FLS2N_ketua;
import FLS2N.beranda_FLS2N_peserta;
import LKS.beranda_LKS_peserta;
import OSTN.beranda_OSTN_peserta;
import javax.swing.ImageIcon;

/**
 *
 * @author Abdul Aziz Tsabit A
 */
public class Beranda_utama extends javax.swing.JFrame {

    /**
     * Creates new form Beranda_utama
     */
    public Beranda_utama() {
        super("Menu Utama - Registrasi Lomba 1.0.0");
        ImageIcon ico = new ImageIcon("src\\gambar1\\logo_dinas.png");
        setIconImage(ico.getImage());
        initComponents();
        setLocation(300, 70);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_lks = new javax.swing.JLabel();
        btn_db = new javax.swing.JLabel();
        btn_ostn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        btn_lks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_lks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_lksMouseClicked(evt);
            }
        });
        jPanel2.add(btn_lks);
        btn_lks.setBounds(220, 110, 170, 130);

        btn_db.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dbMouseClicked(evt);
            }
        });
        jPanel2.add(btn_db);
        btn_db.setBounds(220, 260, 170, 130);

        btn_ostn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ostn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ostnMouseClicked(evt);
            }
        });
        jPanel2.add(btn_ostn);
        btn_ostn.setBounds(410, 110, 160, 130);

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(410, 260, 160, 130);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/menu-.jpg"))); // NOI18N
        jPanel2.add(bg);
        bg.setBounds(0, 0, 800, 500);

        jMenu1.setText("File");

        jMenuItem1.setText("pengguna");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("LogOut");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Login().show();
        this.hide();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_lksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lksMouseClicked
        new beranda_LKS_peserta().show();
        this.hide();
    }//GEN-LAST:event_btn_lksMouseClicked

    private void btn_dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dbMouseClicked
        new beranda_BD_peserta().show();
        this.hide();
            
    }//GEN-LAST:event_btn_dbMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new pengguna().show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_ostnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ostnMouseClicked
        // TODO add your handling code here:
        new beranda_OSTN_peserta().show();
        this.hide();
    }//GEN-LAST:event_btn_ostnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new beranda_FLS2N_peserta().show();
        this.hide();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Beranda_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btn_db;
    private javax.swing.JLabel btn_lks;
    private javax.swing.JLabel btn_ostn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
