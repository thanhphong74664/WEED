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
public abstract class Tailieu {
    protected String tennxb;
    protected String namphathanh;
    protected String tinhtrang;
    Scanner scan = new Scanner(System.in);
    Tailieu(){}
    Tailieu(String tennxb, String namphathanh) {
        this.tennxb = tennxb;
        this.namphathanh = namphathanh;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    public String getNamphathanh() {
        return namphathanh;
    }

    public void setNamphathanh(String namphathanh) {
        this.namphathanh = namphathanh;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    
    public void input(){
        System.out.print("nhap ten nxb: ");
        tennxb = scan.nextLine();
        System.out.print("nhap nam phat hanh: ");
        namphathanh = scan.nextLine();
        tinhtrang = "OK" ;
    }
    
    public void output(){
        System.out.print("Tên nxb: "+tennxb +" |Năm phát hành: "+namphathanh);
    }
}
