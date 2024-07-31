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
public class Loai {
    String maloai,tenloai;

    public Loai(String maloai, String tenloai) {
        this.maloai = maloai;
        this.tenloai = tenloai;
    }

    public Loai() {
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
    
    
    
}
