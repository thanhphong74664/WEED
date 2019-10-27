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
public class Tapchi extends Tailieu{
    private String tentapchi;
    private String matapchi;
    
    Tapchi(){}
    Tapchi(String tennxb, String namphathanh, String matapchi,String tentapchi,String tinhtrang) {
        this.tentapchi = tentapchi;
        this.matapchi = matapchi ;
        this.tennxb = tennxb;
        this.namphathanh = namphathanh;
    }

    public String getTentapchi() {
        return tentapchi;
    }

    public void setTentapchi(String tentapchi) {
        this.tentapchi = tentapchi;
    }

    public String getMatapchi() {
        return matapchi;
    }

    public void setMatapchi (String matapchi) {
        this.matapchi = matapchi;
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
       System.out.print("nhập mã tạp chí: ");
       matapchi = scline();
       System.out.print("nhập tên tạp chí: ");
       tentapchi = scline();
   }
   
   @Override
    public void output(){
        super.output();
        System.out.println(" |Mã tạp chí:" +matapchi +" |Tên tạp chí: "+ tentapchi +" |tình trạng: "+tinhtrang );
    }
    
     @Override
    public String toString(){ 
        return  tennxb +"\n" +namphathanh +"\n" +matapchi +"\n" +tentapchi +"\n"+tinhtrang;
    
    }
}
