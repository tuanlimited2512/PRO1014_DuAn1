package View;

import DomainModels.ChiTietSP;
import Services.IChiTietSPService;
import Services.lmpl.ChiTietSPServiceImpl;
import ViewModels.ChiTietSPViewModel;
import ViewModels.GioHangViewModel;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Tran Thi My Dung
 */
public class FormQuetQR extends javax.swing.JFrame implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;

    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    private final IChiTietSPService chiTietSPService;

    public FormQuetQR() {
        initComponents();
        initWebCam();
        setLocationRelativeTo(null);
        chiTietSPService = new ChiTietSPServiceImpl();
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
        result_field = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_ma = new javax.swing.JTextField();
        txt_ten = new javax.swing.JTextField();
        txt_soLuongTon = new javax.swing.JTextField();
        txt_donGia = new javax.swing.JTextField();
        txt_khuyenMai = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_soLuongMua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbl_thanhTien = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_soLuong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        result_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        result_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(result_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 590, 30));

        jSeparator1.setForeground(new java.awt.Color(75, 134, 132));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 470, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Kết quả :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 20));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 470, 280));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 372, 760, 10));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 120, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Thông Tin Sản Phẩm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Mã Sản Phẩm: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tên Sản Phẩm: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Số Lượng Tồn: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Đơn Giá: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Khuyến Mại: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, -1));

        txt_ma.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_ma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 270, 30));

        txt_ten.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_ten.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 270, 30));

        txt_soLuongTon.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_soLuongTon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_soLuongTon, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 270, 30));

        txt_donGia.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_donGia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_donGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 270, 30));

        txt_khuyenMai.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_khuyenMai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_khuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 270, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add to cart.png"))); // NOI18N
        jButton2.setText("Thêm Giỏ Hàng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 160, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        jButton4.setText("Hủy Bỏ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 160, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Số Lượng: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        txt_soLuongMua.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_soLuongMua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_soLuongMua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_soLuongMuaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_soLuongMuaKeyReleased(evt);
            }
        });
        jPanel1.add(txt_soLuongMua, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 270, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Thành tiền: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        lbl_thanhTien.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl_thanhTien.setForeground(new java.awt.Color(255, 51, 51));
        lbl_thanhTien.setText("0");
        jPanel1.add(lbl_thanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 230, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("VND");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 30, 30));

        lbl_soLuong.setBackground(new java.awt.Color(255, 0, 0));
        lbl_soLuong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_soLuong.setForeground(new java.awt.Color(255, 51, 0));
        lbl_soLuong.setText(" ");
        jPanel1.add(lbl_soLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 720, 310, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void result_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_result_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(result_field.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa quét mã BarCode");
        } else {
            String barcode = result_field.getText();
            List<ChiTietSPViewModel> li = chiTietSPService.getAll(barcode);
            if (li.size() > 0) {
                txt_ma.setText(li.get(0).getMaSP());
                txt_ten.setText(li.get(0).getTenSP());
                txt_soLuongTon.setText(String.valueOf(li.get(0).getSoLuongTon()));
                txt_donGia.setText(String.valueOf(li.get(0).getDonGia()));
                txt_khuyenMai.setText(li.get(0).getGiamGia());

            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm");
                return;
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_soLuongMuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_soLuongMuaKeyPressed
        // TODO add your handling code here:
        try {
            if (txt_soLuongMua.getText().equals("")) {
                lbl_thanhTien.setText("0");
            } else {
                String giamGia = txt_khuyenMai.getText();
                double donGia = Double.parseDouble(txt_donGia.getText());
                int soLuong = Integer.parseInt(txt_soLuongMua.getText());
                double thanhTien = 0;
                if (giamGia.endsWith("VNĐ")) {
                    char[] chars = giamGia.toCharArray();
                    char[] chars1 = new char[chars.length - 3];
                    for (int k = 0; k < chars.length - 3; k++) {
                        chars1[k] = chars[k];

                    }
                    String str = new String(chars1);
                    double giaGiam = Double.parseDouble(str);
                    double phanGiam = giaGiam * soLuong;
                    double dg = donGia * soLuong;
                    thanhTien = dg - phanGiam;

                } else if (giamGia.endsWith("%")) {

                    char[] chars = giamGia.toCharArray();
                    char[] chars1 = new char[chars.length - 1];
                    for (int l = 0; l < chars.length - 1; l++) {
                        chars1[l] = chars[l];

                    }
                    String str = new String(chars1);

                    double giaGiam = Double.parseDouble(str);
                    double thanhTienCua1SP = donGia * ((100 - giaGiam) / 100);
                    thanhTien = soLuong * thanhTienCua1SP;

                } else {
                    thanhTien = soLuong * donGia;

                }
                lbl_thanhTien.setText(String.valueOf(thanhTien));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_soLuongMuaKeyPressed

    private void txt_soLuongMuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_soLuongMuaKeyReleased
        // TODO add your handling code here:
        try {
            if (txt_soLuongMua.getText().toString().length() > 0) {
                if (chiTietSPService.kiemTraLaSo(txt_soLuongMua.getText().toString()) == false) {
                    lbl_soLuong.setText("Nhập không hợp lệ");
                    return;

                } else {

                    String giamGia = txt_khuyenMai.getText();
                    double donGia = Double.parseDouble(txt_donGia.getText());
                    int soLuong = Integer.parseInt(txt_soLuongMua.getText());
                    double thanhTien = 0;
                    if (giamGia.endsWith("VNĐ")) {
                        char[] chars = giamGia.toCharArray();
                        char[] chars1 = new char[chars.length - 3];
                        for (int k = 0; k < chars.length - 3; k++) {
                            chars1[k] = chars[k];

                        }
                        String str = new String(chars1);
                        double giaGiam = Double.parseDouble(str);
                        double phanGiam = giaGiam * soLuong;
                        double dg = donGia * soLuong;
                        thanhTien = dg - phanGiam;

                    } else if (giamGia.endsWith("%")) {

                        char[] chars = giamGia.toCharArray();
                        char[] chars1 = new char[chars.length - 1];
                        for (int l = 0; l < chars.length - 1; l++) {
                            chars1[l] = chars[l];

                        }
                        String str = new String(chars1);

                        double giaGiam = Double.parseDouble(str);
                        double thanhTienCua1SP = donGia * ((100 - giaGiam) / 100);
                        thanhTien = soLuong * thanhTienCua1SP;

                    } else {
                        thanhTien = soLuong * donGia;

                    }
                    lbl_thanhTien.setText(String.valueOf(thanhTien));
                }
            }
            if (txt_soLuongMua.getText().equals("")) {
                lbl_soLuong.setText("");

                lbl_thanhTien.setText("0");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_soLuongMuaKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (kiemTra()) {
            Object[] obj = new Object[6];
            obj[0] = txt_ma.getText();
            obj[1] = txt_ten.getText();
            obj[2] = txt_donGia.getText();
            obj[3] = txt_khuyenMai.getText();
            obj[4] = txt_soLuongMua.getText();
            obj[5] = lbl_thanhTien.getText();

            int dem = 0;

            String maSP = (String) obj[0];
            int soLuong = Integer.parseInt((String) obj[4]);

            for (int i = 0; i < FormBanHang.luuTam.size(); i++) {
                if (FormBanHang.luuTam.get(i).getMaSP().equals(maSP)) {
                    if (chiTietSPService.upDateSLKhiAnThayDoiSL(maSP, FormBanHang.luuTam.get(i).getSoLuong(), soLuong) != null) {
                        System.out.println("giam sl ok");
                        dem = 1;
                    } else {
                        System.out.println("giam sl !ok");
                    }
                }

            }
            FormBanHang.getGH = obj;

            if (dem == 0) {
                if (chiTietSPService.upDateSLKhiThemTrongBarcode((String) obj[0], soLuong) != null) {
                    System.out.println("giảm số lượng thành công1");
                } else {
                    System.out.println("giảm số lượng không thành công1");
                }

            }
            FormBanHang.checkQuetMa = true;
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        webcam.close();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    Boolean kiemTra() {
        if (txt_ma.getText().equals("") || txt_ten.getText().equals("") || txt_soLuongTon.getText().equals("")
                || txt_donGia.getText().equals("") || txt_khuyenMai.getText().equals("") || txt_soLuongMua.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Cần nhập đủ thông tin.");
            return false;
        }
        if (chiTietSPService.kiemTraLaSo(txt_soLuongMua.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ.");
            return false;
        }
        if (txt_soLuongMua.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Số lượng cần lớn hơn 0.");
            return false;
        }
        if (txt_soLuongTon.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Sản phẩm này đã hết.");
            return false;
        }
        int soLuong = Integer.parseInt(txt_soLuongMua.getText());
        int soLuongTon = Integer.parseInt(txt_soLuongTon.getText());
        if (soLuong > soLuongTon) {
            JOptionPane.showMessageDialog(this, "Số lượng trong kho không đủ.");
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormQuetQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormQuetQR().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_soLuong;
    private javax.swing.JLabel lbl_thanhTien;
    private javax.swing.JTextField result_field;
    private javax.swing.JTextField txt_donGia;
    private javax.swing.JTextField txt_khuyenMai;
    private javax.swing.JTextField txt_ma;
    private javax.swing.JTextField txt_soLuongMua;
    private javax.swing.JTextField txt_soLuongTon;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables

    private void initWebCam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0);
        webcam.setViewSize(size);

        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);

        jPanel3.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 280));

        executor.execute(this);
    }

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Result result = null;
            BufferedImage image = null;

            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }

            try {
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                result = new MultiFormatReader().decode(bitmap);
            } catch (Exception e) {
                //No result...
            }

            if (result != null) {
                result_field.setText(result.getText());
            }

        } while (true);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }
}
