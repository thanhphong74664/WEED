/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import java.util.Scanner;

/**
 *
 * @author weedc
 */
public class Muontailieu implements InterfaceInout{
    private String madgmuon;
    private String matailieumuon;
    private String tentailieumuon;
    private String Ngaymuon;
    Scanner scan = new Scanner(System.in);
    
    Muontailieu(){}
    
    Muontailieu(String madgmuon, String matailieumuon, String tentailieumuon, String Ngaymuon) {
        this.madgmuon = madgmuon;
        this.matailieumuon = matailieumuon;
        this.tentailieumuon = tentailieumuon;
        this.Ngaymuon = Ngaymuon;
    }

    public String getMadgmuontailieu() {
        return madgmuon;
    }

    public void setMadgmuontailieu(String madgmuon) {
        this.madgmuon = madgmuon;
    }

    public String getMatailieumuon() {
        return matailieumuon;
    }

    public void setMatailieumuon(String matailieumuon) {
        this.matailieumuon = matailieumuon;
    }

    public String getTentailieumuon() {
        return tentailieumuon;
    }

    public void setTentailieumuon(String tentailieumuon) {
        this.tentailieumuon = tentailieumuon;
    }

    public String getNgaymuon() {
        return Ngaymuon;
    }

    public void setNgaymuon(String Ngaymuon) {
        this.Ngaymuon = Ngaymuon;
    }
    
      String scline(){
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        return str;             
    
    }
    
    @Override
    public void input(){
        System.out.print("nhap ma doc gia: ");
        madgmuon = scline();
        System.out.print("nhap ma tai lieu: ");
        matailieumuon = scline();
        System.out.print("nhap tên tài liệu: ");
        tentailieumuon = scline();
        System.out.print("nhap ngay muon: ");
        Ngaymuon = scline();
    }
    
    @Override
    public void output() {
        System.out.println("Mã độc giả: " +madgmuon +" |Mã tài liệu: " +matailieumuon +" |Tên tài liệu: " +tentailieumuon +" |Ngày mượn: " +Ngaymuon);
    }
    
    @Override
     public String toString(){ 
        return  madgmuon +"\n" +matailieumuon +"\n" +tentailieumuon+"\n" +Ngaymuon ;
    }
    
    
    
}
