/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemadam;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author raz
 */
public class FormPengadaanBarang extends javax.swing.JFrame {
    DefaultTableModel model;
    
    // variable untuk menampung nilai baris yang diselect
    int row;

    /**
     * Creates new form FormPeralatan
     */
    public FormPengadaanBarang() {
        initComponents();
        
        // Biar Ketengah
        setLocationRelativeTo(null);
        
        // mengambil model table
        model = (DefaultTableModel) table.getModel();
        
        // Panggil Fungsi LoadTable
        loadTable();

        // Mengatur, date picker agar bisa berformat, senin, 01 Januari 2001
        DatePickerSettings settings = new DatePickerSettings();
        settings.setFormatForDatesCommonEra(DateTimeFormatter.ofPattern("eeee, d MMMM y"));
        
        txtTanggal.setDateToToday();
        txtTanggal.setSettings(settings);
        
        DatePickerSettings settingsB = new DatePickerSettings();
        settingsB.setFormatForDatesCommonEra(DateTimeFormatter.ofPattern("eeee, d MMMM y"));
        txtTanggalAwal.setDateToToday();
        txtTanggalAwal.setSettings(settingsB);
        
        DatePickerSettings settingsC = new DatePickerSettings();
        settingsC.setFormatForDatesCommonEra(DateTimeFormatter.ofPattern("eeee, d MMMM y"));
        txtTanggalAkhir.setDateToToday();
        txtTanggalAkhir.setSettings(settingsC);
    }
    
    private void loadTable() {
        try {
            // mengambil koneksi dari database
            Connection c = Koneksi.getKoneksi();
            
            // mengambil hasil dari eksekusi query
            ResultSet rs = c.createStatement().executeQuery("SELECT * FROM pengadaanbarang");
            
            // menghapus data yang ada di table output
            model.getDataVector().clear();
            
            while (rs.next()) {
                // menambah 1 bari data ke table output
                model.addRow(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                });
            }
            
            // memberitahu table, untuk merubah tampilannya
            model.fireTableDataChanged();
        } catch (SQLException ex) {
            // menampilkan dialog jika ada error
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogLaporan = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTanggalAwal = new com.github.lgooddatepicker.components.DatePicker();
        jLabel8 = new javax.swing.JLabel();
        txtTanggalAkhir = new com.github.lgooddatepicker.components.DatePicker();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIdPeralatan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtTanggal = new com.github.lgooddatepicker.components.DatePicker();

        dialogLaporan.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogLaporan.setPreferredSize(new java.awt.Dimension(300, 100));
        dialogLaporan.setResizable(false);
        dialogLaporan.setSize(new java.awt.Dimension(500, 150));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Awal");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Akhir");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cetak");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtTanggalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTanggalAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTanggalAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogLaporanLayout = new javax.swing.GroupLayout(dialogLaporan.getContentPane());
        dialogLaporan.getContentPane().setLayout(dialogLaporanLayout);
        dialogLaporanLayout.setHorizontalGroup(
            dialogLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        dialogLaporanLayout.setVerticalGroup(
            dialogLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PENGADAAN BARANG");
        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Id Peralatan");
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        txtIdPeralatan.setBackground(new java.awt.Color(255, 255, 255));
        txtIdPeralatan.setForeground(new java.awt.Color(0, 0, 0));
        txtIdPeralatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPeralatanActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setForeground(new java.awt.Color(0, 0, 0));

        txtJumlah.setBackground(new java.awt.Color(255, 255, 255));
        txtJumlah.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Jumlah");
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Tanggal");
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        btnSimpan.setText("SIMPAN");
        btnSimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnSimpan.setForeground(new java.awt.Color(0, 0, 0));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setEnabled(false);
        btnHapus.setForeground(new java.awt.Color(0, 0, 0));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setText("EDIT");
        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setEnabled(false);
        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        txtCari.setBackground(new java.awt.Color(255, 255, 255));
        txtCari.setForeground(new java.awt.Color(0, 0, 0));
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        jLabel5.setText("CARI");
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jButton4.setText("LAPORAN");
        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Peralatan", "Nama", "Tanggal", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton1.setText("KEMBALI");
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtJumlah, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(txtIdPeralatan)))
                                    .addComponent(jButton1)
                                    .addComponent(jButton4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdPeralatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnHapus)
                            .addComponent(btnEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(128, 128, 128)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // isi variable dari inputan
        String idperalatan = txtIdPeralatan.getText();
        String nama = txtNama.getText();
        String jumlah = txtJumlah.getText();
        String tanggal = txtTanggal.getDate().format(DateTimeFormatter.ofPattern("y-M-d"));
        
        try {
            // mengambil koneksi dari database
            Connection c = Koneksi.getKoneksi();
            
            // membuat statement yang di amankan
            PreparedStatement ps = c.prepareStatement("INSERT INTO pengadaanbarang VALUES (null, ?, ?, ?, ?)");
            
            // mengisi nilai statement sesuai urutan
            ps.setString(1, idperalatan);
            ps.setString(2, nama);
            ps.setString(3, tanggal);
            ps.setString(4, jumlah);
            
            // mengeksekusi query, lalu mengambil nilai, berapa baris yang berhasil ditambahkan
            if (ps.executeUpdate() > 0) {
                // menampilkan dialog berhasil
                JOptionPane.showMessageDialog(this, "Berhasil tambah");
                
                // mengosongkan text field, jika sudah berhasil menambah data
                txtIdPeralatan.setText("");
                txtNama.setText("");
                txtJumlah.setText("");
                txtTanggal.setText("");
                
            } else {
                JOptionPane.showMessageDialog(this, "Gagal input");
            }
            
            // mereload table output, untuk mengambil data terbaru
            loadTable();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // menyembunyikan form yang sekarang
        setVisible(false);
        
        // memunculkan form master
        new FormMenu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // mengecek apakah ada baris yang dipilih
        if (row > -1) {
            try {
                // mengambil koneksi
                Connection c = Koneksi.getKoneksi();
                
                // membuat statement yang diamankan
                PreparedStatement ps = c.prepareStatement("DELETE FROM pengadaanbarang WHERE id = ?");
            
                // mengisi nilai statement sesuai urutan, lalu mengisi nya dengan nilai dari baris yang dipilih,
                // diisi dengan idperalatan yang ada dikolom 0
                ps.setString(1, (String) model.getValueAt(row, 0));
                
                // mengeksekusi query, lalu mengecek apakah berhasil hapus
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(this, "Berhasil hapus pengadaanbarang");
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal hapus pengadaanbarang");
                }

		loadTable();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // ambil baris yang dipilih di table
        row = table.rowAtPoint(evt.getPoint());
        
        // cek apakah ada baris yang terpilih
        if (row > -1) {
            // mengisi field dengan baris yang dipilih
            txtIdPeralatan.setText((String) model.getValueAt(row, 1));
            txtNama.setText((String) model.getValueAt(row, 2));
            txtTanggal.setDate(LocalDate.parse((String) model.getValueAt(row, 3)));
            txtJumlah.setText((String) model.getValueAt(row, 4));
            
            // ketika ada baris yang terpilih, matikan tombol simpan
            btnSimpan.setEnabled(false);
            
            // ketika ada baris yang terpilih, nyalakan tombol hapus, dan edit
            btnHapus.setEnabled(true);
            btnEdit.setEnabled(true);
        } else {
            // ketika ada baris yang terpilih, nyalakan tombol simpan
            btnSimpan.setEnabled(true);
            
            // ketika ada baris yang terpilih, matikan tombol hapus, dan edit
            btnHapus.setEnabled(false);
            btnEdit.setEnabled(false);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // mengisi variable dari field
        String idperalatan = txtIdPeralatan.getText();
        String nama = txtNama.getText();
        String jumlah = txtJumlah.getText();
        String tanggal = txtTanggal.getDate().format(DateTimeFormatter.ofPattern("y-M-d"));
        
        if (row > -1) {
            try {
                Connection c = Koneksi.getKoneksi();

                PreparedStatement ps = c.prepareStatement("UPDATE pengadaanbarang SET idperalatan = ?, namaperalatan = ?, tanggal = ?, jumlah = ? WHERE id = ?");

                // mengisi statement sesuai urutan
                ps.setString(1, idperalatan);
                ps.setString(2, nama);
                ps.setString(3, tanggal);
                ps.setString(4, jumlah);
                
                // mengisi nilai where idperalatan dengan mengambil id dari baris table
                ps.setString(5, (String) model.getValueAt(row, 0));

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(this, "Berhasil edit");

                    
                    txtIdPeralatan.setText("");
                    txtNama.setText("");
                    txtJumlah.setText("");
                    txtTanggal.setDateToToday();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal input");
                }

                loadTable();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        // ambil cari dari field, lalu tambahkan wildcard
        String cari = "%" + txtCari.getText() + "%";
        
        try {
            Connection c = Koneksi.getKoneksi();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM pengadaanbarang WHERE idperalatan LIKE ? OR namaperalatan LIKE ?");
            
            ps.setString(1, cari);
            ps.setString(2, cari);
            
            ResultSet rs = ps.executeQuery();
            
            // menghapus semua data di table output
            model.getDataVector().clear();
            
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                });
            }
            
            model.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(FormPengadaanBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void txtIdPeralatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPeralatanActionPerformed
        String idperalatan = txtIdPeralatan.getText();
        
        try {
            Connection c = Koneksi.getKoneksi();
            
            PreparedStatement ps = c.prepareStatement("SELECT * FROM peralatan WHERE idperalatan = ?");
            
            ps.setString(1, idperalatan);
            
            ResultSet rs = ps.executeQuery();
            
            // menghapus semua data di table output
            model.getDataVector().clear();
            
            if (rs.next()) {
                txtNama.setText(rs.getString("namaperalatan"));
            }
            
            model.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(FormPengadaanBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtIdPeralatanActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dialogLaporan.setLocationRelativeTo(this);
        dialogLaporan.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String tanggalAwal = txtTanggalAwal.getDate().format(DateTimeFormatter.ofPattern("y-M-d"));
        String tanggalAkhir = txtTanggalAkhir.getDate().format(DateTimeFormatter.ofPattern("y-M-d"));
        
        String tanggalAwalString = txtTanggalAwal.getDate().format(DateTimeFormatter.ofPattern("eeee, d MMMM y"));
        String tanggalAkhirString = txtTanggalAkhir.getDate().format(DateTimeFormatter.ofPattern("eeee, d MMMM y"));
        
        try {
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("gambar", "report/cop.png");
            parameters.put("tanggal_awal", tanggalAwal);
            parameters.put("tanggal_akhir", tanggalAkhir);
            parameters.put("tanggal_awal_string", tanggalAwalString);
            parameters.put("tanggal_akhir_string", tanggalAkhirString);
            
            JasperDesign jasperDesign = JRXmlLoader.load(getClass().getClassLoader().getResourceAsStream("report/PengadaanBarang.jrxml"));
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, Koneksi.getKoneksi());
            
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception ex) {
            Logger.getLogger(FormPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPengadaanBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengadaanBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengadaanBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengadaanBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPengadaanBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JDialog dialogLaporan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdPeralatan;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private com.github.lgooddatepicker.components.DatePicker txtTanggal;
    private com.github.lgooddatepicker.components.DatePicker txtTanggalAkhir;
    private com.github.lgooddatepicker.components.DatePicker txtTanggalAwal;
    // End of variables declaration//GEN-END:variables
}
