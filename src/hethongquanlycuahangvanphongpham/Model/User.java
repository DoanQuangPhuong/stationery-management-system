/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hethongquanlycuahangvanphongpham.Model;

/**
 *
 * @author MSI-VN
 */
public class User {
    public static String MaNV = "";
    public static String username = "";
    public static String quyen = "";

    public User() {
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static String getQuyen() {
        return quyen;
    }

    public static void setQuyen(String quyen) {
        User.quyen = quyen;
    }

    public static String getMaNV() {
        return MaNV;
    }

    public static void setMaNV(String MaNV) {
        User.MaNV = MaNV;
    }
    
    
    
    
}
