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
public class TaiKhoan {
    String username,password,quyen;

    public TaiKhoan(String username, String password, String quyen) {
        this.username = username;
        this.password = password;
        this.quyen = quyen;
    }

    public TaiKhoan() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }
    
    
}
