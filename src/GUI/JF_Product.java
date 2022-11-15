/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.DonVi_BUS;
import DTO.DonVi_DTO;
import BUS.SanPham_BUS;
import DTO.SanPham_DTO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author datsu
 */
public class JF_Product extends javax.swing.JFrame {

    /**
     * Creates new form JF_Customer
     */
    
    List<DonVi_DTO> listDVTChinh;
    List<DonVi_DTO> listDVTPhu;
    DefaultTableModel defaultTableModel;
    SanPham_BUS product_BUS;
    DonVi_BUS donVi_BUS;
    List<SanPham_DTO> listProduct;
    
    
    public JF_Product() {
        initComponents();
        
        
        JTB_Product.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        JTB_Product.getTableHeader().setForeground(Color.black);
        JTB_Product.getTableHeader().setPreferredSize(new Dimension(1234, 40));
        JTB_Product.getColumnModel().getColumn(0).setPreferredWidth(100);
        JTB_Product.getColumnModel().getColumn(0).setMaxWidth(100);
        JTB_Product.getColumnModel().getColumn(2).setPreferredWidth(100);
        JTB_Product.getColumnModel().getColumn(2).setMaxWidth(100);
        JTB_Product.getColumnModel().getColumn(6).setPreferredWidth(100);
        JTB_Product.getColumnModel().getColumn(6).setMaxWidth(100);
        
        product_BUS = new SanPham_BUS();
        donVi_BUS = new DonVi_BUS();
        defaultTableModel = (DefaultTableModel) JTB_Product.getModel();
        listProduct = product_BUS.getAllProduct();

        LoadCBDatat();
        LoadTableData(listProduct);
        EventSelectRow();  

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
        jPanel4 = new javax.swing.JPanel();
        JTxt_Header1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JTF_MaSP = new GUI.JTextFieldCustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTF_GiaBanLe_DVTC = new GUI.JTextFieldCustom();
        jLabel4 = new javax.swing.JLabel();
        JCB_DVTChinh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        JTF_GiaNhap_DVTC = new GUI.JTextFieldCustom();
        JTF_SL_DVTP = new GUI.JTextFieldCustom();
        JTF_GiaBanSI_DVTC = new GUI.JTextFieldCustom();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        JTF_GiaBanSi_DVTP = new GUI.JTextFieldCustom();
        jLabel10 = new javax.swing.JLabel();
        JTF_GiaBanLe_DVTP = new GUI.JTextFieldCustom();
        JCB_DVTPhu = new javax.swing.JComboBox<>();
        JTF_TenSP = new GUI.JTextFieldCustom();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        JLB_DVTC = new javax.swing.JLabel();
        JTF_SearchProduct = new GUI.JTextFieldCustom();
        jPanel7 = new javax.swing.JPanel();
        JBtn_AddProduct = new com.k33ptoo.components.KButton();
        JBtn_UpdateProduct = new com.k33ptoo.components.KButton();
        JBtn_BackHome = new com.k33ptoo.components.KButton();
        JBtn_DeleteProduct = new com.k33ptoo.components.KButton();
        JBtn_Refresh = new com.k33ptoo.components.KButton();
        JBtn_SearchProduct = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTB_Product = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(1329, 93));

        JTxt_Header1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JTxt_Header1.setForeground(new java.awt.Color(255, 255, 255));
        JTxt_Header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JTxt_Header1.setText("QUẢN LÝ SẢN PHẨM");
        JTxt_Header1.setPreferredSize(new java.awt.Dimension(1236, 93));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTxt_Header1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JTxt_Header1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Tên sản phẩm:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Giá bán sỉ:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Giá bán lẻ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Giá nhập:");

        JCB_DVTChinh.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        JCB_DVTChinh.setBorder(null);
        JCB_DVTChinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_DVTChinhActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("ĐVT (chính):");

        JTF_SL_DVTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_SL_DVTPActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("ĐƠN VỊ TÍNH PHỤ");

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("Giá bán sỉ:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("Giá bán lẻ:");

        JCB_DVTPhu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        JCB_DVTPhu.setBorder(null);
        JCB_DVTPhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_DVTPhuActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("Mã SP:");

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLB_DVTC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLB_DVTC.setText("1 THÙNG =");
        jPanel5.add(JLB_DVTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JTF_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_TenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(JTF_GiaNhap_DVTC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(JTF_GiaBanSI_DVTC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_GiaBanLe_DVTC, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCB_DVTChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_SL_DVTP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCB_DVTPhu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(JTF_GiaBanSi_DVTP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(JTF_GiaBanLe_DVTP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(JCB_DVTChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_GiaBanLe_DVTC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_GiaNhap_DVTC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(JTF_GiaBanSI_DVTC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTF_SL_DVTP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JCB_DVTPhu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(JTF_GiaBanSi_DVTP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(JTF_GiaBanLe_DVTP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(245, 245, 245));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBtn_AddProduct.setText("Thêm");
        JBtn_AddProduct.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBtn_AddProduct.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        JBtn_AddProduct.setkBorderRadius(30);
        JBtn_AddProduct.setkEndColor(new java.awt.Color(255, 153, 0));
        JBtn_AddProduct.setkHoverEndColor(new java.awt.Color(255, 153, 0));
        JBtn_AddProduct.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        JBtn_AddProduct.setkHoverStartColor(new java.awt.Color(255, 102, 0));
        JBtn_AddProduct.setkSelectedColor(new java.awt.Color(255, 102, 0));
        JBtn_AddProduct.setkStartColor(new java.awt.Color(255, 153, 0));
        JBtn_AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_AddProductActionPerformed(evt);
            }
        });
        jPanel7.add(JBtn_AddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, -1));

        JBtn_UpdateProduct.setText("Cập nhật");
        JBtn_UpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBtn_UpdateProduct.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        JBtn_UpdateProduct.setkBorderRadius(30);
        JBtn_UpdateProduct.setkEndColor(new java.awt.Color(255, 153, 0));
        JBtn_UpdateProduct.setkHoverEndColor(new java.awt.Color(255, 153, 0));
        JBtn_UpdateProduct.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        JBtn_UpdateProduct.setkHoverStartColor(new java.awt.Color(255, 102, 0));
        JBtn_UpdateProduct.setkSelectedColor(new java.awt.Color(255, 102, 0));
        JBtn_UpdateProduct.setkStartColor(new java.awt.Color(255, 153, 0));
        JBtn_UpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_UpdateProductActionPerformed(evt);
            }
        });
        jPanel7.add(JBtn_UpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));

        JBtn_BackHome.setText("Về trang chủ");
        JBtn_BackHome.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBtn_BackHome.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        JBtn_BackHome.setkBorderRadius(30);
        JBtn_BackHome.setkEndColor(new java.awt.Color(51, 153, 255));
        JBtn_BackHome.setkHoverEndColor(new java.awt.Color(51, 102, 255));
        JBtn_BackHome.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        JBtn_BackHome.setkHoverStartColor(new java.awt.Color(51, 102, 255));
        JBtn_BackHome.setkSelectedColor(new java.awt.Color(255, 102, 0));
        JBtn_BackHome.setkStartColor(new java.awt.Color(51, 153, 255));
        JBtn_BackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_BackHomeActionPerformed(evt);
            }
        });
        jPanel7.add(JBtn_BackHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        JBtn_DeleteProduct.setText("Xóa");
        JBtn_DeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBtn_DeleteProduct.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        JBtn_DeleteProduct.setkBorderRadius(30);
        JBtn_DeleteProduct.setkEndColor(new java.awt.Color(255, 153, 0));
        JBtn_DeleteProduct.setkHoverEndColor(new java.awt.Color(255, 153, 0));
        JBtn_DeleteProduct.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        JBtn_DeleteProduct.setkHoverStartColor(new java.awt.Color(255, 102, 0));
        JBtn_DeleteProduct.setkSelectedColor(new java.awt.Color(255, 102, 0));
        JBtn_DeleteProduct.setkStartColor(new java.awt.Color(255, 153, 0));
        JBtn_DeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_DeleteProductActionPerformed(evt);
            }
        });
        jPanel7.add(JBtn_DeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        JBtn_Refresh.setText("Làm mới");
        JBtn_Refresh.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBtn_Refresh.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        JBtn_Refresh.setkBorderRadius(30);
        JBtn_Refresh.setkEndColor(new java.awt.Color(255, 153, 0));
        JBtn_Refresh.setkHoverEndColor(new java.awt.Color(255, 153, 0));
        JBtn_Refresh.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        JBtn_Refresh.setkHoverStartColor(new java.awt.Color(255, 102, 0));
        JBtn_Refresh.setkSelectedColor(new java.awt.Color(255, 102, 0));
        JBtn_Refresh.setkStartColor(new java.awt.Color(255, 153, 0));
        JBtn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtn_RefreshActionPerformed(evt);
            }
        });
        jPanel7.add(JBtn_Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, -1));

        JBtn_SearchProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBtn_SearchProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_search.png"))); // NOI18N
        JBtn_SearchProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBtn_SearchProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtn_SearchProductMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JTF_SearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 1159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtn_SearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTF_SearchProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBtn_SearchProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.CardLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        JTB_Product.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        JTB_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSP", "Tên sản phẩm", "ĐVT (Chính)", "Giá nhập", "Giá bán sỉ", "Giá bán lẻ", "ĐVT (Phụ)", "Giá bán sỉ", "Giá bán lẻ", "Quy đổi"
            }
        ));
        JTB_Product.setGridColor(new java.awt.Color(204, 204, 204));
        JTB_Product.setRowHeight(40);
        JTB_Product.setSelectionBackground(new java.awt.Color(153, 153, 153));
        JTB_Product.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JTB_Product.setShowGrid(false);
        jScrollPane1.setViewportView(JTB_Product);

        jPanel6.add(jScrollPane1, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void LoadTableData(List<SanPham_DTO> listProduct){ 
        
        defaultTableModel.setRowCount(0);
        
        
        String quiDoi;
        String giaNhapDVTC;
        String giaSiDVTC;
        String giaLeDVTC;
        String giaSiDVTP;
        String giaLeDVTP;
        for(SanPham_DTO product : listProduct){
            giaNhapDVTC = String.format("%.0f", product.getGiaNhap_DVTC());
            giaSiDVTC = String.format("%.0f", product.getGiaBanSi_DVTC());
            giaLeDVTC = String.format("%.0f", product.getGiaBanLe_DVTC());
            giaSiDVTP = String.format("%.0f", product.getGiaBanSi_DVTP());
            giaLeDVTP = String.format("%.0f", product.getGiabanLe_DVTP());
            quiDoi = "1 " + product.getDvtChinh() + " = " + product.getQuiDoi() + " " + product.getDvtPhu();
            defaultTableModel.addRow(new Object[] {product.getMaSP(), product.getTenSP(), product.getDvtChinh(), giaNhapDVTC, giaSiDVTC, 
            giaLeDVTC, product.getDvtPhu(), giaSiDVTP, giaLeDVTP, quiDoi });
        }
    }
    
    private void LoadCBDatat(){
        listDVTChinh = donVi_BUS.getAllDVTChinh();
        for(DonVi_DTO dvtc : listDVTChinh){
            JCB_DVTChinh.addItem(dvtc);
        }
        
        listDVTPhu = donVi_BUS.getAllDVTPhu();
        for(DonVi_DTO dvtp : listDVTPhu){
            JCB_DVTPhu.addItem(dvtp);
        }
    }
    
    private void ClearTextFiled(){
        JTF_MaSP.setText("");
        JTF_TenSP.setText("");
        JTF_GiaNhap_DVTC.setText("");
        JTF_GiaBanSI_DVTC.setText("");
        JTF_GiaBanLe_DVTC.setText("");
        JTF_SL_DVTP.setText("");
        JTF_GiaBanSi_DVTP.setText("");
        JTF_GiaBanLe_DVTP.setText("");
    }
    
    private void EventSelectRow(){
        ListSelectionModel listSelectionModel = JTB_Product.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = JTB_Product.getSelectedRow();
                
                if(row >= 0){
                    String maSP = String.valueOf(JTB_Product.getValueAt(row, 0));
                    String tenSP = String.valueOf(JTB_Product.getValueAt(row, 1));
                    String dvtChinh = String.valueOf(JTB_Product.getValueAt(row, 2));
                    String giaNhapDVTC = String.valueOf(JTB_Product.getValueAt(row, 3));
                    String giaBanSiDVTC = String.valueOf(JTB_Product.getValueAt(row, 4));
                    String giaBanLeDVTC = String.valueOf(JTB_Product.getValueAt(row, 5));
                    String dvtPhu = String.valueOf(JTB_Product.getValueAt(row, 6));
                    String giaBanSiDVTP = String.valueOf(JTB_Product.getValueAt(row, 7));
                    String giaBanLeDVTP = String.valueOf(JTB_Product.getValueAt(row, 8));
                    
                    JTF_MaSP.setText(maSP);
                    JTF_TenSP.setText(tenSP);
                    JCB_DVTChinh.setSelectedItem(donVi_BUS.getDVTCByTenDVT(dvtChinh, listDVTChinh));
                    JTF_GiaNhap_DVTC.setText(giaNhapDVTC);
                    JTF_GiaBanSI_DVTC.setText(giaBanSiDVTC);
                    JTF_GiaBanLe_DVTC.setText(giaBanLeDVTC);
                    int slQuyDoi = product_BUS.getQuiDoiByMASP(maSP);
                    JTF_SL_DVTP.setText(String.valueOf(slQuyDoi));
                    JCB_DVTPhu.setSelectedItem(donVi_BUS.getDVTCByTenDVT(dvtPhu, listDVTPhu));
                    JTF_GiaBanSi_DVTP.setText(giaBanSiDVTP);
                    JTF_GiaBanLe_DVTP.setText(giaBanLeDVTP);
                    
                    
                    JTF_MaSP.setEnabled(false);
                    JBtn_AddProduct.setEnabled(false);
                    
                    
                }
           }
        });
    }
    
    private SanPham_DTO getDataProductFromGUI(){
        
        String maSP = JTF_MaSP.getText();
        String tenSP = JTF_TenSP.getText();
        DonVi_DTO dvtc = (DonVi_DTO) JCB_DVTChinh.getSelectedItem();
        String maDVC = dvtc.getMaDV();
        float giaBanLeDVTC = Float.parseFloat(JTF_GiaBanLe_DVTC.getText());
        float giaBanSiDVTC = Float.parseFloat(JTF_GiaBanSI_DVTC.getText());
        float giaNhapDVTC = Float.parseFloat(JTF_GiaNhap_DVTC.getText());
        String slDVTP = JTF_SL_DVTP.getText();
        DonVi_DTO dvtp = (DonVi_DTO) JCB_DVTPhu.getSelectedItem();
        String maDVP = dvtp.getMaDV();
        float giaBanSiDVTP = Float.parseFloat(JTF_GiaBanSi_DVTP.getText());
        float giaBanLeDVTP = Float.parseFloat(JTF_GiaBanLe_DVTP.getText());
        int quyDoi = Integer.parseInt(JTF_SL_DVTP.getText());
        
        SanPham_DTO product = new SanPham_DTO();
        product.setMaSP(maSP);
        product.setTenSP(tenSP);
        product.setDvtChinh(maDVC);
        product.setGiaBanLe_DVTC(giaBanLeDVTC);
        product.setGiaBanSi_DVTC(giaBanSiDVTC);
        product.setGiaNhap_DVTC(giaNhapDVTC);
        product.setDvtPhu(maDVP);
        product.setGiaBanSi_DVTP(giaBanSiDVTP);
        product.setGiabanLe_DVTP(giaBanLeDVTP);
        product.setQuiDoi(quyDoi);
        
        return product;
    }
    
    private void JBtn_BackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_BackHomeActionPerformed
        JF_Home jF_Home = new JF_Home();
        jF_Home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBtn_BackHomeActionPerformed

    private void JCB_DVTChinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_DVTChinhActionPerformed
        String dvtChinh = String.valueOf(JCB_DVTChinh.getSelectedItem());
        JLB_DVTC.setText("1 " + dvtChinh + " = ");
    }//GEN-LAST:event_JCB_DVTChinhActionPerformed

    private void JTF_SL_DVTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_SL_DVTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_SL_DVTPActionPerformed

    private void JCB_DVTPhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_DVTPhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCB_DVTPhuActionPerformed

    private void JBtn_AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_AddProductActionPerformed
        
        if(JTF_MaSP.getText().compareTo("") != 0 && JTF_TenSP.getText().compareTo("") != 0){
            product_BUS.AddProduct(getDataProductFromGUI());
            listProduct = product_BUS.getAllProduct();
            LoadTableData(listProduct);
            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            ClearTextFiled();  
        }
        else{
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin sản phẩm", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_JBtn_AddProductActionPerformed

    private void JBtn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_RefreshActionPerformed
        ClearTextFiled();
        LoadCBDatat();
        listProduct = product_BUS.getAllProduct();
        LoadTableData(listProduct);
        JTF_MaSP.setEnabled(true);
        JBtn_AddProduct.setEnabled(true);
    }//GEN-LAST:event_JBtn_RefreshActionPerformed

    private void JBtn_UpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_UpdateProductActionPerformed
        int row = JTB_Product.getSelectedRow();
            
            if(row >= 0){
                defaultTableModel.setRowCount(0);

                product_BUS.UpdateProduct(getDataProductFromGUI());

                listProduct = product_BUS.getAllProduct();
                LoadTableData(listProduct);
                JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                ClearTextFiled();
                JTF_MaSP.setEnabled(true);
                JBtn_AddProduct.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm cần sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_JBtn_UpdateProductActionPerformed

    private void JBtn_DeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtn_DeleteProductActionPerformed
        int row = JTB_Product.getSelectedRow();
        
        if(row >= 0){
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        
            if(confirm == JOptionPane.YES_OPTION){
                String maSP = JTF_MaSP.getText();
                product_BUS.DeleteProduct(maSP);
                
                listProduct = product_BUS.getAllProduct();
                LoadTableData(listProduct);
                JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                ClearTextFiled();  
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm cần xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_JBtn_DeleteProductActionPerformed

    private void JBtn_SearchProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtn_SearchProductMouseClicked
        if(JTF_SearchProduct.getText().length() > 0){
            String tenSP = JTF_SearchProduct.getText();
 
            defaultTableModel.setRowCount(0);
            List<SanPham_DTO> listProductSearch = product_BUS.SearchProduct(tenSP);
            LoadTableData(listProductSearch);
        }
        else{
            LoadTableData(listProduct);
        }
    }//GEN-LAST:event_JBtn_SearchProductMouseClicked

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
            java.util.logging.Logger.getLogger(JF_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton JBtn_AddProduct;
    private com.k33ptoo.components.KButton JBtn_BackHome;
    private com.k33ptoo.components.KButton JBtn_DeleteProduct;
    private com.k33ptoo.components.KButton JBtn_Refresh;
    private javax.swing.JLabel JBtn_SearchProduct;
    private com.k33ptoo.components.KButton JBtn_UpdateProduct;
    private javax.swing.JComboBox<DonVi_DTO> JCB_DVTChinh;
    private javax.swing.JComboBox<DonVi_DTO> JCB_DVTPhu;
    private javax.swing.JLabel JLB_DVTC;
    private javax.swing.JTable JTB_Product;
    private GUI.JTextFieldCustom JTF_GiaBanLe_DVTC;
    private GUI.JTextFieldCustom JTF_GiaBanLe_DVTP;
    private GUI.JTextFieldCustom JTF_GiaBanSI_DVTC;
    private GUI.JTextFieldCustom JTF_GiaBanSi_DVTP;
    private GUI.JTextFieldCustom JTF_GiaNhap_DVTC;
    private GUI.JTextFieldCustom JTF_MaSP;
    private GUI.JTextFieldCustom JTF_SL_DVTP;
    private GUI.JTextFieldCustom JTF_SearchProduct;
    private GUI.JTextFieldCustom JTF_TenSP;
    private javax.swing.JLabel JTxt_Header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}