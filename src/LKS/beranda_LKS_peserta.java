
package LKS;
import Frame.Beranda_utama;
import Frame.Login;
import Frame.koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Abdul Aziz Tsabit A
 */
public class beranda_LKS_peserta extends javax.swing.JFrame {
    Connection con = new koneksi().buka_koneksi();
    ResultSet res;
    Statement stat;
    
    private Object[][] dataTable;
    private String[] header={
        "NISN","Nama","Kelas","Tempat Lahir","TGL lahir","agama","P/L",
        "lomba","Asal Sekolah","alamat Sekolah","telp Sekolah","Kota/Kabupaten","alamat","no hp","katagori"
    };
    
    DefaultTableModel tbm;
    public beranda_LKS_peserta() {
        super("DATA PESERTA - LKS -Registrasi Lomba 1.0.0");
        initComponents();
        setLocation(40, 80);
        btn_edit.setEnabled(false);
        btn_hapus.setEnabled(false);
        masuk_ke_table();
        
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
        tb_pesertalks = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_cari = new javax.swing.JButton();
        txt_cari = new javax.swing.JTextField();
        cmb_cari = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null), "Data LKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 15))); // NOI18N

        jButton1.setText("Data Peserta");
        jButton1.setEnabled(false);
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
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tb_pesertalks.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_pesertalks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_pesertalksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_pesertalks);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/plus.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/close_delete_2.png"))); // NOI18N
        btn_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/pencil_edit.png"))); // NOI18N
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button/search.png"))); // NOI18N
        btn_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        cmb_cari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cari berdasarkan:", "NISN", "nama", "agama", "asal sekolah", "jenis kelamin", "lomba" }));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar2/refresh.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cari, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmb_cari, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Login().show();
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new beranda_LKS_ketua().show();
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new beranda_LKS_juri().show();
        this.hide();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new beranda_LKS_pendamping().show();
        this.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new bio_peserta_LKS().show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        bio_peserta_LKS peserta = new bio_peserta_LKS();
        peserta.btn_edit.setVisible(false);
        peserta.show();
        this.hide();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int i = tb_pesertalks.getSelectedRow();
        
        if(i == -1){
            return;
        }
        String nisn = (String) tbm.getValueAt(i, 0);
        
        try {
            String sql = "DELETE FROM tb_peserta WHERE nisn= '"+nisn+"'";
            stat = con.createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "berhasil hapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "gagal hapus  "+e);
        }finally{
            masuk_ke_table();
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        bio_peserta_LKS juri = new bio_peserta_LKS();
         
        int i = tb_pesertalks.getSelectedRow();        
              
        String nis = (String) tbm.getValueAt(i, 0).toString();                
        String nama = (String) tbm.getValueAt(i, 1).toString();        
        String kelas = (String) tbm.getValueAt(i, 2).toString();        
        String lahir = (String) tbm.getValueAt(i, 3).toString();        
        String tgl = (String) tbm.getValueAt(i, 4).toString();        
        String agama = (String) tbm.getValueAt(i, 5).toString();        
        String jenkel = (String) tbm.getValueAt(i, 6).toString();        
        String lomba = (String) tbm.getValueAt(i, 7).toString();        
        String alamat_kantor = (String) tbm.getValueAt(i, 8).toString();                
        String sekolah = (String) tbm.getValueAt(i, 9).toString();        
        String tlp_sekolah = (String) tbm.getValueAt(i, 10).toString();              
        String kota = (String) tbm.getValueAt(i, 11).toString();     
        String rumah = (String) tbm.getValueAt(i, 12).toString();      
        String hp = (String) tbm.getValueAt(i, 13).toString();
        
        
        
        juri.txt_nis.setText(nis);
        juri.txt_nama.setText(nama);        
        juri.txt_kelas.setText(kelas);        
        juri.txt_t4lahir.setText(lahir); 
        
        juri.cmb_agama.setSelectedItem(agama);        
        juri.cmb_jenkel.setSelectedItem(jenkel);  
        juri.lomba.setSelectedItem(lomba);
        juri.txt_alamat_skolah.setText(alamat_kantor);
        juri.txt_asal_skolah.setText(sekolah);        
        juri.txt_tlp_sekolah.setText(tlp_sekolah);  
        juri.txt_kota.setText(kota);
        juri.alamat_rumah.setText(rumah);        
        juri.txt_no_hp.setText(hp);
        
        juri.btn_simpan.setVisible(false);
        juri.show();
       this.hide();
    }//GEN-LAST:event_btn_editActionPerformed

    private void tb_pesertalksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_pesertalksMouseClicked
        btn_hapus.setEnabled(true);
        btn_edit.setEnabled(true);
    }//GEN-LAST:event_tb_pesertalksMouseClicked

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        cari_data();
    }//GEN-LAST:event_btn_cariActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new beranda_LKS_peserta().show();
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
            java.util.logging.Logger.getLogger(beranda_LKS_peserta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(beranda_LKS_peserta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(beranda_LKS_peserta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(beranda_LKS_peserta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new beranda_LKS_peserta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JComboBox cmb_cari;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tb_pesertalks;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables

    private void masuk_ke_table(){
        
            try {
            stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            tbm = new DefaultTableModel();
            tbm.addColumn("NISN");            
            tbm.addColumn("Nama");            
            tbm.addColumn("Kelas");
            tbm.addColumn("tempat lahir");
            tbm.addColumn("tgl lahir");
            tbm.addColumn("agama");
            tbm.addColumn("P/L");
            tbm.addColumn("bidang lomba");
            tbm.addColumn("Alamat sekolah");
            tbm.addColumn("Asal sekolah");
            tbm.addColumn("telp skolah");
            tbm.addColumn("Kota/Kabupaten");
            tbm.addColumn("alamat rumah");
            tbm.addColumn("no hp");
            tbm.addColumn("Katagori");
            
            tb_pesertalks.setModel(tbm);
            
            int i = 1;
            res= stat.executeQuery("SELECT * FROM tb_peserta WHERE katagori='lks'");
            while (res.next()) {
                tbm.addRow(new Object[]{
                    res.getString("nisn"),                    
                    res.getString("nama"),                    
                    res.getString("kelas"),
                    res.getString("tempat_lahir"),
                    res.getString("tgl_lahir"),
                    res.getString("agama"),
                    res.getString("jenkel"),
                    res.getString("bidang_lomba"),                    
                    res.getString("alamat_Sekolah"),
                    res.getString("asal_sekolah"),
                    res.getString("telp_sekolah"),
                    res.getString("provinsi"),
                    res.getString("alamat_rumah"),
                    res.getString("hp_pribadi"),
                    res.getString("katagori"),
                });
                tb_pesertalks.setModel(tbm);                
                
                i++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "gagal memuat table" + e );
        }
        }    
    
    private void cari_data(){
        try {
            String sql_cari;
            if(cmb_cari.getSelectedIndex()==0){
                sql_cari = "SELECT * FROM tb_peserta";
            }
            else{
                String cari_berdasarkan = null;
                if(cmb_cari.getSelectedItem()=="nama"){
                    cari_berdasarkan = "nama";
                }
                else if(cmb_cari.getSelectedItem()=="agama"){
                    cari_berdasarkan = "agama";
                }
                else if(cmb_cari.getSelectedItem()=="lomba"){
                    cari_berdasarkan = "bidang_lomba";
                }
                else if(cmb_cari.getSelectedItem()=="asal sekolah"){
                    cari_berdasarkan = "asal_sekolah";
                }
                else if(cmb_cari.getSelectedItem()=="jenis kelamin"){
                    cari_berdasarkan = "jenkel";
                }
                else if(cmb_cari.getSelectedItem()=="NISN"){
                    cari_berdasarkan = "nisn";
                }
                       sql_cari = "SELECT * FROM tb_peserta WHERE "+ cari_berdasarkan +" LIKE '"+ "%" + txt_cari.getText() + "%" +"'";
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
                dataTable[x][0]     =res.getString("nisn");
                dataTable[x][1]     =res.getString("nama");
                dataTable[x][2]     =res.getString("kelas");
                dataTable[x][3]     =res.getString("tempat_lahir");
                dataTable[x][4]     =res.getString("tgl_lahir");
                dataTable[x][5]     =res.getString("agama");
                dataTable[x][6]     =res.getString("jenkel");
                dataTable[x][7]     =res.getString("bidang_lomba");
                dataTable[x][8]     =res.getString("asal_sekolah");
                dataTable[x][9]     =res.getString("alamat_sekolah");
                dataTable[x][10]    =res.getString("telp_sekolah");
                dataTable[x][11]    =res.getString("provinsi");
                dataTable[x][12]    =res.getString("alamat_rumah");
                dataTable[x][13]    =res.getString("hp_pribadi");
                dataTable[x][14]     =res.getString("katagori");
                x++;
            }
            tb_pesertalks.setModel(new DefaultTableModel(dataTable,header));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e);
        }
        
}

}
