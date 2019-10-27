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
public class Bao extends Tailieu {
    private String tenbao;
    private String mabao;
    
    Bao(){}

    public Bao(String tennxb, String namphathanh,String tenbao, String mabao,String tinhtrang) {
        this.tenbao = tenbao;
        this.mabao = mabao;
        this.tennxb = tennxb;
        this.namphathanh = namphathanh;
    }

    public String getTenbao() {
        return tenbao;
    }

    public void setTenbao(String tenbao) {
        this.tenbao = tenbao;
    }

    public String getMabao() {
        return mabao;
    }

    public void setMabao(String mabao) {
        this.mabao = mabao;
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
       System.out.print("nhập mã báo: ");
       mabao = scline();
       System.out.print("nhập tên báo: ");
       tenbao = scline();
 
   }
   
   @Override
    public void output(){
        super.output();
        System.out.println(" |Mã báo: "+mabao +" |Tên báo: "+tenbao +" |tình trạng: "+tinhtrang);
    }
    
     @Override
    public String toString(){ 
        return  tennxb +"\n" +namphathanh +"\n" +mabao+"\n" +tenbao +"\n"+tinhtrang ;
    }
    
}
