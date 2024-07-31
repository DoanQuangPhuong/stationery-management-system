/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hethongquanlycuahangvanphongpham;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ConnectionDB {
    //kết nối đến Mysql
    
    
    public static Connection getConnectDB(){
        String db = "jdbc:mysql://localhost:3306/htquanlycuahangvanphongpham";
        String username ="root";
        String password = "Qp748664";
        Connection conn = null;
           try{
            conn = DriverManager.getConnection(db,username,password);
        }catch(Exception ex)
        {
            System.out.println("Not connected to mysql");
        }
           return conn;
    }
    
    public static void closeConnectionDB(Connection c)
    {
        try {
            if(c != null)
            {
                c.close();
            }
        }catch (SQLException ex) {
                Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    //Trả về số dòng bị thay đổi trong mysql
    public static int getRowChange(String sql)
    {  
        int check = 0;
        Connection conn = getConnectDB();//tạo kết nối 
        try {
            Statement st = conn.createStatement();
            check = st.executeUpdate(sql);
            closeConnectionDB(conn);//đống kết nối
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy");
        }
        return check;
    }
    
    //Trả về 1 hoặc nhiều dòng dữ liệu
    public static ResultSet getSelectResult(Connection conn,String sql)
    {  
        ResultSet kq = null;
        try {
            Statement st = conn.createStatement();
            kq = st.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Không thể thực hiện câu lênh sql");
        }
        return kq;
    }
    
}
