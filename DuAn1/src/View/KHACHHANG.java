/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DomainModels.KhachHang;
import Services.IKhachHangService;
import Services.lmpl.KhachHangServiceImpl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell Inpriron 5515
 */
public class KHACHHANG extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    DefaultTableModel dfmol = new DefaultTableModel();
    private final IKhachHangService khachHangService;

    public KHACHHANG() {
        initComponents();
        khachHangService = new KhachHangServiceImpl();
        load();
    }

    private void load() {
        dfmol = (DefaultTableModel) tbl_khachhang.getModel();
        dfmol.setRowCount(0);
        for (KhachHang kh : khachHangService.getSelectSql()) {
            dfmol.addRow(kh.toDataRow());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txt_timKHTheoSdt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_khachhang = new javax.swing.JTable();
        btn_chon = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_makh = new javax.swing.JTextField();
        txt_tenkh = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        rdo_nam = new javax.swing.JRadioButton();
        rdo_nu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tar_diachi = new javax.swing.JTextArea();
        btn_them1 = new javax.swing.JButton();
        btn_sua1 = new javax.swing.JButton();
        btn_xoa1 = new javax.swing.JButton();
        btn_lammoi1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_timKHTheoSdt.setText("Tìm kiếm theo số điện thoại .....");
        txt_timKHTheoSdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_timKHTheoSdtMouseClicked(evt);
            }
        });
        txt_timKHTheoSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timKHTheoSdtActionPerformed(evt);
            }
        });
        txt_timKHTheoSdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_timKHTheoSdtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timKHTheoSdtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_timKHTheoSdtKeyTyped(evt);
            }
        });

        tbl_khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "SDT", "Giới tính", "Email", "Địa chỉ"
            }
        ));
        tbl_khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khachhangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_khachhang);

        btn_chon.setBackground(new java.awt.Color(153, 255, 204));
        btn_chon.setText("Chọn");
        btn_chon.setEnabled(false);
        btn_chon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(txt_timKHTheoSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btn_chon)
                        .addGap(120, 120, 120)
                        .addComponent(jButton2)))
                .addContainerGap(319, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txt_timKHTheoSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_chon)
                    .addComponent(jButton2))
                .addGap(96, 96, 96))
        );

        jTabbedPane3.addTab("Danh Sách Khách Hàng", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết lập thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("Mã khách hàng");

        jLabel2.setText("Tên khách hàng");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Điện thoại");

        rdo_nam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdo_nam);
        rdo_nam.setText("Nam");
        rdo_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_namActionPerformed(evt);
            }
        });

        rdo_nu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdo_nu);
        rdo_nu.setText("Nữ");
        rdo_nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_nuActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        jLabel7.setText("Địa chỉ");

        tar_diachi.setColumns(20);
        tar_diachi.setRows(5);
        jScrollPane1.setViewportView(tar_diachi);

        btn_them1.setBackground(new java.awt.Color(153, 255, 204));
        btn_them1.setText("Thêm khách hàng");
        btn_them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them1ActionPerformed(evt);
            }
        });

        btn_sua1.setBackground(new java.awt.Color(153, 255, 204));
        btn_sua1.setText("Sửa khách hàng");
        btn_sua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sua1ActionPerformed(evt);
            }
        });

        btn_xoa1.setBackground(new java.awt.Color(153, 255, 204));
        btn_xoa1.setText("Xóa khách hàng");
        btn_xoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoa1ActionPerformed(evt);
            }
        });

        btn_lammoi1.setBackground(new java.awt.Color(153, 255, 204));
        btn_lammoi1.setText("Làm mới");
        btn_lammoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdo_nam)
                        .addGap(27, 27, 27)
                        .addComponent(rdo_nu))
                    .addComponent(txt_makh, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(txt_tenkh)
                    .addComponent(txt_sdt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btn_them1)
                .addGap(41, 41, 41)
                .addComponent(btn_sua1)
                .addGap(50, 50, 50)
                .addComponent(btn_xoa1)
                .addGap(51, 51, 51)
                .addComponent(btn_lammoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_tenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rdo_nam)
                            .addComponent(rdo_nu))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them1)
                    .addComponent(btn_xoa1)
                    .addComponent(btn_sua1)
                    .addComponent(btn_lammoi1))
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Cập Nhật Khách Hàng", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lammoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoi1ActionPerformed
        // TODO add your handling code here:
        clearF();
    }//GEN-LAST:event_btn_lammoi1ActionPerformed

    private void btn_xoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoa1ActionPerformed
        // TODO add your handling code here:

        int index = tbl_khachhang.getSelectedRow();
        KhachHang kh = khachHangService.getSelectSql().get(index);

        kh.setMa(txt_makh.getText());
        khachHangService.delete(kh);
        JOptionPane.showMessageDialog(this, "Xóa thành công");
        load();
        clearF();
    }//GEN-LAST:event_btn_xoa1ActionPerformed

    private void btn_sua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sua1ActionPerformed
        // TODO add your handling code here:

        int index = tbl_khachhang.getSelectedRow();
        KhachHang kh = khachHangService.getSelectSql().get(index);

        kh.setMa(txt_makh.getText());
        kh.setTen(txt_tenkh.getText());
        kh.setSdt(txt_sdt.getText());
        kh.setGioitinh(rdo_nam.isSelected() ? "Nam" : "Nữ");
        kh.setEmail(txt_email.getText());
        kh.setDiachi(tar_diachi.getText());
        khachHangService.update(kh);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        load();
        clearF();
    }//GEN-LAST:event_btn_sua1ActionPerformed

    private void btn_them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them1ActionPerformed
        // TODO add your handling code here:
        if (kiemTra()) {
            KhachHang kh = new KhachHang();

            kh.setMa(txt_makh.getText());
            kh.setTen(txt_tenkh.getText());
            kh.setSdt(txt_sdt.getText());
            kh.setGioitinh(rdo_nam.isSelected() ? "Nam" : "Nữ");
            kh.setEmail(txt_email.getText());
            kh.setDiachi(tar_diachi.getText());
            khachHangService.insert(kh);
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            load();
            clearF();
        }
    }//GEN-LAST:event_btn_them1ActionPerformed

    private void rdo_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_nuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_nuActionPerformed

    private void rdo_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_namActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_chonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chonActionPerformed
        // TODO add your handling code here:
        int row = tbl_khachhang.getSelectedRow();
        Object[] obj = new Object[1];
        obj[0] = tbl_khachhang.getValueAt(row, 0);
        FormBanHang.getKH = obj;
        FormBanHang.check = true;
    }//GEN-LAST:event_btn_chonActionPerformed

    private void tbl_khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khachhangMouseClicked
        // TODO add your handling code here:

        btn_chon.setEnabled(true);
    }//GEN-LAST:event_tbl_khachhangMouseClicked

    private void txt_timKHTheoSdtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKHTheoSdtKeyTyped
        // TODO add your handling code here:
        String sdt = "%" + txt_timKHTheoSdt.getText() + "%";
        dfmol = (DefaultTableModel) tbl_khachhang.getModel();
        dfmol.setRowCount(0);
        for (KhachHang kh : khachHangService.timSDT(sdt)) {
            dfmol.addRow(kh.toDataRow());
        }
    }//GEN-LAST:event_txt_timKHTheoSdtKeyTyped

    private void txt_timKHTheoSdtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKHTheoSdtKeyReleased
        // TODO add your handling code here:
        String sdt = "%" + txt_timKHTheoSdt.getText() + "%";
        dfmol = (DefaultTableModel) tbl_khachhang.getModel();
        dfmol.setRowCount(0);
        for (KhachHang kh : khachHangService.timSDT(sdt)) {
            dfmol.addRow(kh.toDataRow());
        }
    }//GEN-LAST:event_txt_timKHTheoSdtKeyReleased

    private void txt_timKHTheoSdtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKHTheoSdtKeyPressed
        // TODO add your handling code here:
        String sdt = "%" + txt_timKHTheoSdt.getText() + "%";
        dfmol = (DefaultTableModel) tbl_khachhang.getModel();
        dfmol.setRowCount(0);
        for (KhachHang kh : khachHangService.timSDT(sdt)) {
            dfmol.addRow(kh.toDataRow());
        }
    }//GEN-LAST:event_txt_timKHTheoSdtKeyPressed

    private void txt_timKHTheoSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timKHTheoSdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timKHTheoSdtActionPerformed

    private void txt_timKHTheoSdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_timKHTheoSdtMouseClicked
        // TODO add your handling code here:
        txt_timKHTheoSdt.setText("");
    }//GEN-LAST:event_txt_timKHTheoSdtMouseClicked

    public void clearF() {
        txt_makh.setText("");
        txt_tenkh.setText("");
        txt_sdt.setText("");
        txt_email.setText("");
        tar_diachi.setText("");
        buttonGroup1.clearSelection();
    }

    Boolean kiemTra() {
        if (txt_makh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã Khách Hàng Không Được Trống.");
            return false;
        }
        String maKH = txt_makh.getText();
        ArrayList<String> list = khachHangService.trungMa();
        for (String string : list) {
            if (maKH.equals(string)) {
                JOptionPane.showMessageDialog(this, "Mã Trùng.Bạn cần thêm 1 mã khác.");
                return false;
            }
        }
        if (txt_tenkh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên Khách Hàng Không Được Trống.");
            return false;
        }
        if (txt_email.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Email Khách Hàng Không Được Trống.");
            return false;
        }
        if (txt_sdt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số Điện Thoại Khách Hàng Không Được Trống.");
            return false;
        }
        if (tar_diachi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Địa Chỉ Khách Hàng Không Được Trống.");
            return false;
        }

        return true;
    }
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
            java.util.logging.Logger.getLogger(KHACHHANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KHACHHANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KHACHHANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KHACHHANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KHACHHANG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chon;
    private javax.swing.JButton btn_lammoi1;
    private javax.swing.JButton btn_sua1;
    private javax.swing.JButton btn_them1;
    private javax.swing.JButton btn_xoa1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JRadioButton rdo_nam;
    private javax.swing.JRadioButton rdo_nu;
    private javax.swing.JTextArea tar_diachi;
    private javax.swing.JTable tbl_khachhang;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_makh;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tenkh;
    private javax.swing.JTextField txt_timKHTheoSdt;
    // End of variables declaration//GEN-END:variables
}
