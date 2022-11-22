/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anhtu
 */
public class GiaoDienPhanMem extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienPhanMem
     */
    private JPanel panelChid;
    
    public GiaoDienPhanMem() {
        initComponents();
        setLocationRelativeTo(null);
        setColor(btn_banhang);
        resetColor(new JPanel[]{btn_sanpham, btn_hoadon, btn_khuyenmai, btn_nhanvien, btn_khachhang, btn_thongke, btn_dangxuat});
        setpanal(new FormBanHang());
        
    }
    
    private void setColor(JPanel pane){
        pane.setBackground(new Color(204,204,204));
    }
    
    private void resetColor(JPanel[] pane){
        for(int i = 0;i < pane.length; i++){
            pane[i].setBackground(new Color(153,255,204));
        }
    }
    
    private void setpanal(JPanel panel){
        panelChid = panel;
        formPhanMem.removeAll();
        formPhanMem.add(panelChid);
        formPhanMem.validate();
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
        btn_sanpham = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_banhang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_khuyenmai = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_hoadon = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_nhanvien = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_khachhang = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_thongke = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_dangxuat = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        formPhanMem = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHẦN MỀM QUẢN LÝ BÁN HÀNG");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tên nhân viên");

        btn_sanpham.setBackground(new java.awt.Color(153, 255, 204));
        btn_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_sanphamMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/product.png"))); // NOI18N
        jLabel4.setText("Sản phẩm");

        javax.swing.GroupLayout btn_sanphamLayout = new javax.swing.GroupLayout(btn_sanpham);
        btn_sanpham.setLayout(btn_sanphamLayout);
        btn_sanphamLayout.setHorizontalGroup(
            btn_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sanphamLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_sanphamLayout.setVerticalGroup(
            btn_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_banhang.setBackground(new java.awt.Color(153, 255, 204));
        btn_banhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_banhangMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping-cart.png"))); // NOI18N
        jLabel3.setText("Bán hàng");

        javax.swing.GroupLayout btn_banhangLayout = new javax.swing.GroupLayout(btn_banhang);
        btn_banhang.setLayout(btn_banhangLayout);
        btn_banhangLayout.setHorizontalGroup(
            btn_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_banhangLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        btn_banhangLayout.setVerticalGroup(
            btn_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_banhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_khuyenmai.setBackground(new java.awt.Color(153, 255, 204));
        btn_khuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_khuyenmaiMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/promotions.png"))); // NOI18N
        jLabel6.setText("Khuyến mãi");

        javax.swing.GroupLayout btn_khuyenmaiLayout = new javax.swing.GroupLayout(btn_khuyenmai);
        btn_khuyenmai.setLayout(btn_khuyenmaiLayout);
        btn_khuyenmaiLayout.setHorizontalGroup(
            btn_khuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_khuyenmaiLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        btn_khuyenmaiLayout.setVerticalGroup(
            btn_khuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_khuyenmaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_hoadon.setBackground(new java.awt.Color(153, 255, 204));
        btn_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_hoadonMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/receipt.png"))); // NOI18N
        jLabel5.setText("Hóa đơn");

        javax.swing.GroupLayout btn_hoadonLayout = new javax.swing.GroupLayout(btn_hoadon);
        btn_hoadon.setLayout(btn_hoadonLayout);
        btn_hoadonLayout.setHorizontalGroup(
            btn_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_hoadonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_hoadonLayout.setVerticalGroup(
            btn_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_hoadonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_nhanvien.setBackground(new java.awt.Color(153, 255, 204));
        btn_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_nhanvienMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employees.png"))); // NOI18N
        jLabel8.setText("Nhân viên");

        javax.swing.GroupLayout btn_nhanvienLayout = new javax.swing.GroupLayout(btn_nhanvien);
        btn_nhanvien.setLayout(btn_nhanvienLayout);
        btn_nhanvienLayout.setHorizontalGroup(
            btn_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_nhanvienLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_nhanvienLayout.setVerticalGroup(
            btn_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_nhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_khachhang.setBackground(new java.awt.Color(153, 255, 204));
        btn_khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_khachhangMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/traveling.png"))); // NOI18N
        jLabel7.setText("Khách hàng");

        javax.swing.GroupLayout btn_khachhangLayout = new javax.swing.GroupLayout(btn_khachhang);
        btn_khachhang.setLayout(btn_khachhangLayout);
        btn_khachhangLayout.setHorizontalGroup(
            btn_khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_khachhangLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_khachhangLayout.setVerticalGroup(
            btn_khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_khachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_thongke.setBackground(new java.awt.Color(153, 255, 204));
        btn_thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_thongkeMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar-chart.png"))); // NOI18N
        jLabel9.setText("Thống kê");

        javax.swing.GroupLayout btn_thongkeLayout = new javax.swing.GroupLayout(btn_thongke);
        btn_thongke.setLayout(btn_thongkeLayout);
        btn_thongkeLayout.setHorizontalGroup(
            btn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_thongkeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_thongkeLayout.setVerticalGroup(
            btn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_thongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_dangxuat.setBackground(new java.awt.Color(153, 255, 204));
        btn_dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dangxuatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dangxuatMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log-out.png"))); // NOI18N
        jLabel10.setText("Đăng xuất");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_dangxuatLayout = new javax.swing.GroupLayout(btn_dangxuat);
        btn_dangxuat.setLayout(btn_dangxuatLayout);
        btn_dangxuatLayout.setHorizontalGroup(
            btn_dangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_dangxuatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_dangxuatLayout.setVerticalGroup(
            btn_dangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_banhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_sanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_hoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_khuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_nhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_khachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_thongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_dangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(btn_banhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        formPhanMem.setLayout(new java.awt.BorderLayout());
        getContentPane().add(formPhanMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1030, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?","Phần mềm bán hàng",JOptionPane.YES_NO_OPTION);
        if(i == 0){
            setColor(btn_dangxuat);
            resetColor(new JPanel[]{btn_banhang, btn_sanpham, btn_hoadon, btn_khuyenmai, btn_nhanvien, btn_khachhang, btn_thongke});
            new GiaoDienDangNhap().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btn_banhangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_banhangMousePressed
        // TODO add your handling code here:
        setColor(btn_banhang);
        resetColor(new JPanel[]{btn_sanpham, btn_hoadon, btn_khuyenmai, btn_nhanvien, btn_khachhang, btn_thongke, btn_dangxuat});
        setpanal(new FormBanHang());
    }//GEN-LAST:event_btn_banhangMousePressed

    private void btn_sanphamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sanphamMousePressed
        // TODO add your handling code here:
        setColor(btn_sanpham);
        resetColor(new JPanel[]{btn_banhang, btn_hoadon, btn_khuyenmai, btn_nhanvien, btn_khachhang, btn_thongke, btn_dangxuat});
        setpanal(new FormSanPham());
    }//GEN-LAST:event_btn_sanphamMousePressed

    private void btn_hoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hoadonMousePressed
        // TODO add your handling code here:
        setColor(btn_hoadon);
        resetColor(new JPanel[]{btn_banhang, btn_sanpham, btn_khuyenmai, btn_nhanvien, btn_khachhang, btn_thongke, btn_dangxuat});
        setpanal(new FormHoaDon());
    }//GEN-LAST:event_btn_hoadonMousePressed

    private void btn_khuyenmaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_khuyenmaiMousePressed
        // TODO add your handling code here:
        setColor(btn_khuyenmai);
        resetColor(new JPanel[]{btn_banhang, btn_sanpham, btn_hoadon, btn_nhanvien, btn_khachhang, btn_thongke, btn_dangxuat});
        setpanal(new FormKhuyenMai());
    }//GEN-LAST:event_btn_khuyenmaiMousePressed

    private void btn_nhanvienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nhanvienMousePressed
        // TODO add your handling code here:
        setColor(btn_nhanvien);
        resetColor(new JPanel[]{btn_banhang, btn_sanpham, btn_hoadon, btn_khuyenmai, btn_khachhang, btn_thongke, btn_dangxuat});
        setpanal(new FormNhanVien());
    }//GEN-LAST:event_btn_nhanvienMousePressed

    private void btn_khachhangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_khachhangMousePressed
        // TODO add your handling code here:
        setColor(btn_khachhang);
        resetColor(new JPanel[]{btn_banhang, btn_sanpham, btn_hoadon, btn_khuyenmai, btn_nhanvien, btn_thongke, btn_dangxuat});
        setpanal(new FormKhachHang());
    }//GEN-LAST:event_btn_khachhangMousePressed

    private void btn_thongkeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thongkeMousePressed
        // TODO add your handling code here:
        setColor(btn_thongke);
        resetColor(new JPanel[]{btn_banhang, btn_sanpham, btn_hoadon, btn_khuyenmai, btn_nhanvien, btn_khachhang, btn_dangxuat});
        setpanal(new FormThongKe());
    }//GEN-LAST:event_btn_thongkeMousePressed

    private void btn_dangxuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dangxuatMousePressed
        // TODO add your handling code here:    
        int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?","Phần mềm bán hàng",JOptionPane.YES_NO_OPTION);
        if(i == 0){
            setColor(btn_dangxuat);
            resetColor(new JPanel[]{btn_banhang, btn_sanpham, btn_hoadon, btn_khuyenmai, btn_nhanvien, btn_khachhang, btn_thongke});
            new GiaoDienDangNhap().setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btn_dangxuatMousePressed

    private void btn_dangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dangxuatMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_dangxuatMouseClicked

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
            java.util.logging.Logger.getLogger(GiaoDienPhanMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienPhanMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienPhanMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienPhanMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienPhanMem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_banhang;
    private javax.swing.JPanel btn_dangxuat;
    private javax.swing.JPanel btn_hoadon;
    private javax.swing.JPanel btn_khachhang;
    private javax.swing.JPanel btn_khuyenmai;
    private javax.swing.JPanel btn_nhanvien;
    private javax.swing.JPanel btn_sanpham;
    private javax.swing.JPanel btn_thongke;
    private javax.swing.JPanel formPhanMem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
