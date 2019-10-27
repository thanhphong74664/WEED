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
public class Docgia implements InterfaceInout{
    private String madg;
    private String name;
    private String sdt;
    Scanner scan = new Scanner(System.in);
    
    Docgia(){} 
    Docgia(String madg, String name,String sdt) {
        this.madg = madg;
        this.name = name;
        this.sdt = sdt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg= madg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        madg = scline();
        System.out.print("nhap tên độc giả: ");
        name = scline();
        System.out.print("nhap sdt: ");
        sdt = scline();
    }
    
    @Override
    public void output() {
        System.out.println("Mã độc giả: "+madg +" |Tên đọc giả: " +name +" |sdt: " +sdt );
    }
    
    @Override
    public String toString(){ 
        return  madg +"\n" +name +"\n" +sdt ;
    }
    
}
