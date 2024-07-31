/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hethongquanlycuahangvanphongpham;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author ACER
 */
public class frmNhanVien extends javax.swing.JFrame {
        PreparedStatement pst = null;
        ResultSet rs = null;
        int q,i;
        
        public void GetDataTable() throws SQLException
        {
            Connection con = ConnectionDB.getConnectDB();
            String sql = "select * from htquanlycuahangvanphongpham.nhanvien";
            try
            {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                for(i=1; i<=q; i++)
                {
                    columnData.add(rs.getString("MaNhanVien"));
                    columnData.add(rs.getString("TenNhanVien"));
                    columnData.add(rs.getString("Email"));
                    columnData.add(rs.getString("CCCD"));
                    columnData.add(rs.getString("SDT"));
                    columnData.add(rs.getString("DiaChi"));
                    columnData.add(rs.getString("Username"));
                    
                }
                RecordTable.addRow(columnData);
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
            ConnectionDB.closeConnectionDB(con);
        }
        
    public frmNhanVien() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);//Chỉnh JFrame ra giữa màn hình
        GetDataTable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_MaNV = new javax.swing.JTextField();
        tf_HoTen = new javax.swing.JTextField();
        tf_Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_cccd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_sdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_diaChi = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tf_userName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_dong = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Họ Tên", "Email", "CCCD", "SĐT", "Địa chỉ", "User Name"
            }
        ));
        jTable1.setRowHeight(27);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Họ Tên:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Mã NV:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        tf_MaNV.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        tf_HoTen.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        tf_Email.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("CCCD:");

        tf_cccd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("SĐT:");

        tf_sdt.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Địa chỉ:");

        tf_diaChi.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        btn_Them.setBackground(new java.awt.Color(255, 255, 255));
        btn_Them.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setBackground(new java.awt.Color(255, 255, 255));
        btn_Sua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setBackground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Reset.setBackground(new java.awt.Color(255, 255, 255));
        btn_Reset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("User name:");

        tf_userName.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("QUẢN LÝ NHÂN VIÊN");

        btn_dong.setBackground(new java.awt.Color(255, 255, 255));
        btn_dong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_dong.setText("Đóng");
        btn_dong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_diaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btn_dong, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_cccd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        Connection con = ConnectionDB.getConnectDB();
        String checkMaNV = "SELECT * FROM htquanlycuahangvanphongpham.nhanvien WHERE MaNhanVien=?";
        String sql = "insert into htquanlycuahangvanphongpham.nhanvien(MaNhanVien, TenNhanVien, Email, CCCD, SDT, DiaChi, Username) value (?,?,?,?,?,?,?)";
        try{
            pst = con.prepareStatement(checkMaNV);
            pst.setString(1, tf_MaNV.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Mã Nhân Viên Đã Tồn Tại!!!");
                return; // Dừng thực hiện nếu tên người dùng đã tồn tại
            }
            pst = con.prepareStatement(sql);
            pst.setString(1, tf_MaNV.getText());
            pst.setString(2, tf_HoTen.getText());
            pst.setString(3, tf_Email.getText());
            pst.setString(4, tf_cccd.getText());
            pst.setString(5, tf_sdt.getText());
            pst.setString(6, tf_diaChi.getText());
            pst.setString(7, tf_userName.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã hoàn thành việc thêm mới");
            GetDataTable();
        
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        ConnectionDB.closeConnectionDB(con);
        

    }//GEN-LAST:event_btn_ThemActionPerformed

    
    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        Connection con = ConnectionDB.getConnectDB();
        String sql = "delete from htquanlycuahangvanphongpham.nhanvien where (MaNhanVien = ?)";
        try{
        pst = con.prepareStatement(sql);
        
        pst.setString(1, tf_MaNV.getText());
                
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Đã hoàn thành việc xóa bỏ");
        GetDataTable();
        
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        ConnectionDB.closeConnectionDB(con);
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        tf_MaNV.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        tf_MaNV.setEditable(false);
        tf_HoTen.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        tf_Email.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        tf_cccd.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        tf_sdt.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        tf_diaChi.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        tf_userName.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        tf_userName.setEditable(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_dongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dongActionPerformed
         if(JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi ứng dụng này không?", "Thoát khỏi ứng dụng", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
    }//GEN-LAST:event_btn_dongActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        tf_MaNV.setText("");
        tf_MaNV.setEditable(true);
        tf_HoTen.setText("");
        tf_Email.setText("");
        tf_cccd.setText("");
        tf_sdt.setText("");
        tf_diaChi.setText("");
        tf_userName.setText("");
        tf_userName.setEditable(true);
        
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        Connection con = ConnectionDB.getConnectDB();
        String sql = "UPDATE htquanlycuahangvanphongpham.nhanvien SET TenNhanVien = ?, Email=?, CCCD=?, SDT=?, DiaChi=?, Username=? WHERE MaNhanVien=?";
        try {
        pst = con.prepareStatement(sql);

        pst.setString(1, tf_HoTen.getText());
        pst.setString(2, tf_Email.getText());
        pst.setString(3, tf_cccd.getText());
        pst.setString(4, tf_sdt.getText());
        pst.setString(5, tf_diaChi.getText());
        pst.setString(6, tf_userName.getText());
        pst.setString(7, tf_MaNV.getText());


        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Đã hoàn thành việc cập nhật");
        GetDataTable();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
        ConnectionDB.closeConnectionDB(con);
    }//GEN-LAST:event_btn_SuaActionPerformed

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
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            try {
                new frmNhanVien().setVisible(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton btn_dong;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_HoTen;
    private javax.swing.JTextField tf_MaNV;
    private javax.swing.JTextField tf_cccd;
    private javax.swing.JTextField tf_diaChi;
    private javax.swing.JTextField tf_sdt;
    private javax.swing.JTextField tf_userName;
    // End of variables declaration//GEN-END:variables
}
