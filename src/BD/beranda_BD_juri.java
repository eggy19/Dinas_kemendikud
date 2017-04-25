
package BD;
import Frame.Beranda_utama;
import Frame.Login;
import Frame.koneksi;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Abdul Aziz Tsabit A
 */
public class beranda_BD_juri extends javax.swing.JFrame {
    Connection con = new koneksi().buka_koneksi();
    ResultSet res;
    Statement stat;
    
    private Object[][] dataTable=null;
    private String[] header=
    {
       "nip","nama","pangakt","tempat lahir","tgl lahir","agama","P/L",
        "lomba","unit kerja","alamat kantor","telp kantor","alamat","no hp","katagori"
    };
    
    DefaultTableModel tbm;
    public beranda_BD_juri() {
        super("DATA JURI - DEBAT BAHASA - Registrasi Lomba 1.0.0");
        ImageIcon ico = new ImageIcon("src\\gambar1\\logo_dinas.png");
        setIconImage(ico.getImage());
        initComponents();
        setLocation(40, 80);
        masuk_ke_table();
        cmb_edit.setEnabled(false);
        cmb_hapus.setEnabled(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_juridb = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        cmb_hapus = new javax.swing.JButton();
        cmb_edit = new javax.swing.JButton();
        cmb_cari = new javax.swing.JComboBox();
        btn_cari = new javax.swing.JButton();
        txt_cari = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null), "Data Debat Bahasa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 15))); // NOI18N

        jButton1.setText("Data Peserta");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Data Pendamping");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Data Juri");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setText("Data Ketua kontingen");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("laporan");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("log out");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );

        tb_juridb.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_juridb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_juridbMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_juridb);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/plus.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        cmb_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/close_delete_2.png"))); // NOI18N
        cmb_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_hapusActionPerformed(evt);
            }
        });

        cmb_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/pencil_edit.png"))); // NOI18N
        cmb_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_editActionPerformed(evt);
            }
        });

        cmb_cari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cari Berdasarkan", "NIP", "Nama", "Jenis Kelamin", "pangkat", "lomba", "agama" }));

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/search.png"))); // NOI18N
        btn_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/refresh.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Laporan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cari))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_cari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(txt_cari)))
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Login().show();
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new beranda_BD_ketua().show();
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new beranda_BD_ketua().show();
        this.hide();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new beranda_BD_pendamping().show();
        this.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new beranda_BD_peserta().show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        bio_juri_BD juri = new bio_juri_BD();
        juri.btn_edit.setVisible(false);
        juri.show();
        this.hide();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cmb_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_hapusActionPerformed
        int i = tb_juridb.getSelectedRow();
        if(i == -1){
            return;
        }
        String nip = (String) tbm.getValueAt(i, 0);
        try {
            String sql = "DELETE FROM tb_juri WHERE nip='"+nip+"'";
            stat=con.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "berhasil hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "gagal  " + e);
        }finally{
            masuk_ke_table();
        }
    }//GEN-LAST:event_cmb_hapusActionPerformed

    private void tb_juridbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_juridbMouseClicked
        cmb_edit.setEnabled(true);
        cmb_hapus.setEnabled(true);
    }//GEN-LAST:event_tb_juridbMouseClicked

    private void cmb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_editActionPerformed
         bio_juri_BD juri = new bio_juri_BD();
         
        int i = tb_juridb.getSelectedRow();        
              
        String nip = (String) tbm.getValueAt(i, 0).toString();                
        String nama = (String) tbm.getValueAt(i, 1).toString();
        String gol = (String) tbm.getValueAt(i, 2).toString();            
        String lahir = (String) tbm.getValueAt(i, 3).toString();       
        String tgl = (String) tbm.getValueAt(i, 4).toString();        
        String agama = (String) tbm.getValueAt(i, 5).toString();
        String jenkel = (String) tbm.getValueAt(i, 6).toString();   
        String lomba = (String) tbm.getValueAt(i, 7).toString();        
        String alamat_kantor = (String) tbm.getValueAt(i, 8).toString();                
        String unit = (String) tbm.getValueAt(i, 9).toString();        
        String tlp_kantor = (String) tbm.getValueAt(i, 10).toString();              
        String rumah = (String) tbm.getValueAt(i, 11).toString();      
        String hp = (String) tbm.getValueAt(i, 12).toString();
              
        juri.txt_nip.setText(nip);
        juri.txt_nama.setText(nama);        
        juri.txt_kelas.setText(gol);        
        juri.txt_t4lahir.setText(lahir);
        juri.cmb_jenkel.setSelectedItem(jenkel); 
        juri.txt_lomba.setSelectedItem(lomba);
        juri.cmb_agama.setSelectedItem(agama);        
        juri.txt_alamat_skolah.setText(alamat_kantor);
        juri.txt_unit_kerja.setText(unit);        
        juri.txt_tlp_kantor.setText(tlp_kantor);  
        juri.alamat_rumah.setText(rumah);        
        juri.txt_no_hp.setText(hp);
        
        juri.btn_simpan.setVisible(false);
        juri.show();
        this.hide();
    }//GEN-LAST:event_cmb_editActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        cari_data();
    }//GEN-LAST:event_btn_cariActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new beranda_BD_juri().show();
        this.hide();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(beranda_BD_juri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(beranda_BD_juri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(beranda_BD_juri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(beranda_BD_juri
                    .class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new beranda_BD_juri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JComboBox cmb_cari;
    private javax.swing.JButton cmb_edit;
    private javax.swing.JButton cmb_hapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tb_juridb;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables

    private void cari_data(){
        try {
            String sql_cari;
            if(cmb_cari.getSelectedIndex()==0){
                sql_cari = "SELECT * FROM tb_juri";
            }
            else{
                String cari_berdasarkan = null;
                if(cmb_cari.getSelectedItem()=="NIP"){
                    cari_berdasarkan = "nip";
                }
                else if(cmb_cari.getSelectedItem()=="Nama"){
                    cari_berdasarkan = "nama";
                }
                else if(cmb_cari.getSelectedItem()=="lomba"){
                    cari_berdasarkan = "lomba";
                }
                else if(cmb_cari.getSelectedItem()=="agama"){
                    cari_berdasarkan = "agama";
                }
                else if(cmb_cari.getSelectedItem()=="Jenis Kelamin"){
                    cari_berdasarkan = "jenkel";
                }
                else if(cmb_cari.getSelectedItem()=="pangkat"){
                    cari_berdasarkan = "pangkat";
                }
                       sql_cari = "SELECT * FROM tb_juri WHERE "+ cari_berdasarkan +" LIKE '"+ "%" + txt_cari.getText() + "%" +"'";
            }
            
            stat = (Statement)   con.createStatement();
            res = stat.executeQuery(sql_cari);
            java.sql.ResultSetMetaData meta = res.getMetaData();
            
            int col = meta.getColumnCount();
            int baris = 0;
            while(res.next()){
                baris = res.getRow();
            }
            
            dataTable = new Object[baris][col];
            int x = 0;
            res.beforeFirst();
            
            while(res.next()){
                dataTable[x][0]     =res.getString("nip");
                dataTable[x][1]     =res.getString("nama");
                dataTable[x][2]     =res.getString("pangkat");
                dataTable[x][3]     =res.getString("tempat_lahir");
                dataTable[x][4]     =res.getString("tgl_lahir");
                dataTable[x][5]     =res.getString("agama");
                dataTable[x][6]     =res.getString("jenkel");
                dataTable[x][7]     =res.getString("lomba");
                dataTable[x][8]     =res.getString("unit_kerja");
                dataTable[x][9]     =res.getString("alamat_kantor");
                dataTable[x][10]    =res.getString("telp_kantor");
                dataTable[x][11]    =res.getString("alamat_rumah");
                dataTable[x][12]    =res.getString("no_hp");
                dataTable[x][13]     =res.getString("katagori");
                x++;
            }
            tb_juridb.setModel(new DefaultTableModel(dataTable,header));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }
    
    private void masuk_ke_table(){        
            try {
                stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            tbm = new DefaultTableModel();                 
            tbm.addColumn("nip");
            tbm.addColumn("Nama");
            tbm.addColumn("Pangkat");
            tbm.addColumn("tempat lahir");
            tbm.addColumn("tgl lahir");
            tbm.addColumn("agama");
            tbm.addColumn("P/L");
            tbm.addColumn("bidang lomba");
            tbm.addColumn("Unit Kerja");
            tbm.addColumn("alamat Kantor");
            tbm.addColumn("telp Kantor");
            tbm.addColumn("alamat rumah");
            tbm.addColumn("no hp");
            tbm.addColumn("Katagori");
            
            tb_juridb.setModel(tbm);
            res= stat.executeQuery("SELECT * FROM tb_juri WHERE katagori='debat bahasa'");
            while (res.next()) {
                tbm.addRow(new Object[]{                    
                    res.getString("nip"),
                    res.getString("nama"),
                    res.getString("pangkat"),
                    res.getString("tempat_lahir"),
                    res.getString("tgl_lahir"),
                    res.getString("agama"),
                    res.getString("jenkel"),
                    res.getString("lomba"),
                    res.getString("unit_kerja"),
                    res.getString("alamat_kantor"),
                    res.getString("telp_kantor"),
                    res.getString("alamat_rumah"),
                    res.getString("no_hp"),
                    res.getString("katagori"),
                });
                tb_juridb.setModel(tbm);
            }
            tb_juridb.setModel(tbm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
    }
}
