/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdul Aziz Tsabit A
 */
public class pengguna extends javax.swing.JFrame {
    Connection con = new koneksi().buka_koneksi();
    ResultSet res;
    Statement stat;
    DefaultTableModel tbm;
    
    /**
     * Creates new form pengguna
     */
    public pengguna() {
        super("Data Pengguna - Registrasi Lomba 1.0.0");
        initComponents();        
        masuk_table();
        setLocation(330, 150);
        btn_cancel.setEnabled(false);        
        btn_simpan.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pengguna = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        txt_hp = new javax.swing.JTextField();
        btn_edit = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txt_level = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_pengguna.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_pengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_penggunaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_pengguna);

        jLabel1.setText("Nama");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("No Hp");

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/pencil_edit.png"))); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/record.png"))); // NOI18N
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/check_2.png"))); // NOI18N
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        txt_level.setEnabled(false);

        jLabel5.setText("Level");

        jLabel6.setText("No");

        txt_no.setEnabled(false);

        jButton1.setText("kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_nama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_user, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_pass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_hp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_level, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_no, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_edit)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(txt_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_pass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_hp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_edit, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bersih(){
        txt_hp.setText("");
        txt_level.setText("");
        txt_nama.setText("");
        txt_no.setText("");
        txt_pass.setText("");
        txt_user.setText("");
    }
    
    
    private void tb_penggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_penggunaMouseClicked
   
        
    }//GEN-LAST:event_tb_penggunaMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try {
            String sql = "UPDATE login SET"                    
                    +"   nama=   '"+txt_nama.getText()
                    +"', user=   '"+txt_user.getText()
                    +"', pass=   '"+txt_pass.getText()
                    +"', no_hp=  '"+txt_hp.getText()
                    +"', level=  '"+txt_level.getText()
                    +"'WHERE no= '"+txt_no.getText()+"'";
            stat=con.createStatement();
            stat.executeUpdate(sql);            
            JOptionPane.showMessageDialog(rootPane, "berhasil");
            bersih();
            masuk_table();
            btn_cancel.setEnabled(false);
            btn_simpan.setEnabled(false);
            btn_edit.setEnabled(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
         int i = tb_pengguna.getSelectedRow();
    if(i == -1){
        return;
    }
    String no = (String) tbm.getValueAt(i, 0);
    txt_no.setText(no);
    
    String nama = (String) tbm.getValueAt(i, 1);
    txt_nama.setText(nama);
    
    String user = (String) tbm.getValueAt(i, 2);
    txt_user.setText(user);
    
    String pass = (String) tbm.getValueAt(i, 3);
    txt_pass.setText(pass);
    
    String hp = (String) tbm.getValueAt(i, 4);
    txt_hp.setText(hp);
    
    String lvl = (String) tbm.getValueAt(i, 5);
    txt_level.setText(lvl);
    
    btn_cancel.setEnabled(true);
        btn_edit.setEnabled(false);
        btn_simpan.setEnabled(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        bersih();
        btn_cancel.setEnabled(false);
        btn_edit.setEnabled(true);
        btn_simpan.setEnabled(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tb_pengguna;
    private javax.swing.JTextField txt_hp;
    private javax.swing.JTextField txt_level;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables


    private void masuk_table(){
        try {
            stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            tbm = new DefaultTableModel();
            tbm.addColumn("No");
            tbm.addColumn("Nama");
            tbm.addColumn("Username");
            tbm.addColumn("Password");
            tbm.addColumn("No HP");
            tbm.addColumn("Level");
            
            tb_pengguna.setModel(tbm);
            res = stat.executeQuery("SELECT * FROM login");
            while(res.next()){
                tbm.addRow(new Object[]{
                    res.getString("no"),
                    res.getString("nama"),
                    res.getString("user"),
                    res.getString("pass"),
                    res.getString("no_hp"),
                    res.getString("level"),
                });
                tb_pengguna.setModel(tbm);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
}
