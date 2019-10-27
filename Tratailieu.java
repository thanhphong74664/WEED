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
public class Tratailieu implements InterfaceInout{
    private String madgtra;
    private String matailieutra;
    private String tentailieutra;
    private String Ngaytra;
    Scanner scan = new Scanner(System.in);
    
    Tratailieu(){}

    public Tratailieu(String madgtra, String matailieutra, String tentailieutra, String Ngaytra) {
        this.madgtra = madgtra;
        this.matailieutra = matailieutra;
        this.tentailieutra = tentailieutra;
        this.Ngaytra = Ngaytra;
    }

    
    public String getMadgtra() {
        return madgtra;
    }

    public void setMadgtra(String madgtra) {
        this.madgtra = madgtra;
    }

    public String getMatailieutra() {
        return matailieutra;
    }

    public void setMatailieutra(String matailieutra) {
        this.matailieutra = matailieutra;
    }

    public String getTentailieutra() {
        return tentailieutra;
    }

    public void setTentailieutra(String tentailieutra) {
        this.tentailieutra = tentailieutra;
    }

    public String getNgaytra() {
        return Ngaytra;
    }

    public void setNgaytra(String Ngaytra) {
        this.Ngaytra = Ngaytra;
    }
    
     String scline(){
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        return str;             
    
    }
    
    @Override
     public void input(){
        System.out.print("nhập mã độc giả: ");
        madgtra = scline();
        System.out.print("nhập mã tài liệu: ");
        matailieutra = scline();
        System.out.print("nhập tên tài liệu: ");
        tentailieutra = scline();
        System.out.print("nhập ngày trả: ");
        Ngaytra = scline();
    }
    
    @Override
    public void output() {
        System.out.println("Mã độc giả: " +madgtra +" |Mã tài liệu: " +matailieutra +" |Tên tài liệu: " +tentailieutra +" |Ngày mượn: " +Ngaytra);
    }
    
    @Override
     public String toString(){ 
        return  madgtra +"\n" +matailieutra +"\n" +tentailieutra+"\n" +Ngaytra ;
    }   
}
