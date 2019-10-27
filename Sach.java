/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author weedc
 */
public class Sach extends Tailieu{
    private String id;
    private String tensach;
    private String tentacgia;
    
    Sach(){}        
    Sach(String tennxb, String namphathanh, String id, String tensach, String tentacgia,String tinhtrang) {
        this.id = id;
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.tennxb = tennxb;
        this.namphathanh = namphathanh;
        this.tinhtrang = tinhtrang;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    
    String scline(){
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        return str;             
    
    }
    
    @Override
    public void input(){
        super.input();
        System.out.print("nhập mã sách: ");
        id = scline();
        System.out.print("nhập tên sách: ");
        tensach = scline();
        System.out.print("nhập tên tác giả: ");
        tentacgia = scline();
    }
   
    @Override
    public void output(){
        super.output();
       System.out.println(" |Mã sách: "+id + " |Tên sách: "+tensach +" |Tên tác giả: "+tentacgia +" |tình trạng: "+tinhtrang);
    }
    
    @Override
    public String toString(){ 
        return  tennxb +"\n" +namphathanh +"\n" +id +"\n" +tensach +"\n" +tentacgia +"\n"+tinhtrang;
    
    }
}

