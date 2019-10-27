/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;


import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author weedc
 */

public class Xuli {
    Scanner scan = new Scanner(System.in);
    static ArrayList<Sach> sachlist = new ArrayList<>();
    static ArrayList<Tapchi> tapchilist = new ArrayList<>();
    static ArrayList<Bao> baolist = new ArrayList<>();
    static ArrayList<Docgia> docgialist = new ArrayList<>();
    static ArrayList<Muontailieu> muonlist = new ArrayList<>();
    static ArrayList<Tratailieu> tralist = new ArrayList<>();
    static int numberS,numberT,numberB,numberD,numberM,numberTr;
    
       
    static String scline(){
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        return str;             
    }
     
    static int scint(){
        Scanner scan = new Scanner(System.in);
        int str;
        str = scan.nextInt();
        return str;             
    }
    
    static void themsach(){
    System.out.print("nhập số lượng sách cần thêm: ");
    numberS = scint();
    for(int i=0;i<numberS;i++){
        Sach s = new Sach();
        s.input();
        sachlist.add(s);
        System.out.println();
    }
        IOFile.ghifilesach(true);
    }
    
    static void themtapchi(){
    System.out.print("nhập số lượng tạp chí cần thêm: ");
    numberT = scint();
    for(int i=0;i<numberT;i++){
        Tapchi t = new Tapchi();
        t.input();
        tapchilist.add(t);
        System.out.println();
    }
        IOFile.ghifiletapchi(true);
    }
    
    static void thembao(){
    System.out.print("nhập số lượng Báo cần thêm: ");
    numberB = scint();
    for(int i=0;i<numberB;i++){
        Bao b = new Bao();
        b.input();
        baolist.add(b);
        System.out.println();
    }  
        IOFile.ghifilebao(true);
    }
    
    public void themdocgia(){
    System.out.print("nhập số lượng độc giả cần thêm: ");
    numberD = scint();
    for(int i=0;i<numberD;i++){
        Docgia dg = new Docgia();
        dg.input();
        docgialist.add(dg);
        System.out.println();
    } 
        IOFile.ghifiledocgia(true);
    }
    
    public void themtailieumuon(){

    System.out.print("nhập số lượng tài liệu cần mượn: ");
    numberM = scint();
    for(int i=0;i<numberM;i++){
        Muontailieu muon = new Muontailieu();
        muon.input();
        muonlist.add(muon);
        System.out.println();
    } 
        IOFile.ghifilemuon(true);
 
        if(muonlist.size()>=1){
        IOFile.docfilesach();
        for(int i=0;i<muonlist.size();i++){
            for(int j=0;j<sachlist.size();j++){
                if( muonlist.get(i).getMatailieumuon().equals(sachlist.get(j).getId()) || (muonlist.get(i).getTentailieumuon().equals(sachlist.get(j).getTensach() )) ){
                    sachlist.get(j).setTinhtrang("NOT");
                    IOFile.ghifilesach(false);
                 }
            }
        }
        
        IOFile.docfiletapchi();
        for(int i=0;i<muonlist.size();i++){
            for(int j=0;j<tapchilist.size();j++){
                if(muonlist.get(i).getMatailieumuon().equals(tapchilist.get(j).getMatapchi()) || (muonlist.get(i).getTentailieumuon().equals(tapchilist.get(j).getTentapchi() )) ){
                    tapchilist.get(j).setTinhtrang("NOT");
                    IOFile.ghifiletapchi(false);
                 }
            }
        }
          
        IOFile.docfilebao();
        for(int i=0;i<muonlist.size();i++){
            for(int j=0;j<baolist.size();j++){
                if( (muonlist.get(i).getMatailieumuon().equals(baolist.get(j).getMabao() )) || (muonlist.get(i).getTentailieumuon().equals(baolist.get(j).getTenbao() )) ){
                    baolist.get(j).setTinhtrang("NOT");
                    IOFile.ghifilebao(false);
                 }
            }
        }
        }
    }
    
    public void themtailieutra(){
    System.out.print("nhập số lượng tài liệu cần trả: ");
    numberTr = scint();
    for(int i=0;i<numberTr;i++){
        Tratailieu tra = new Tratailieu();
        tra.input();
        tralist.add(tra);
        System.out.println();
    }
        IOFile.ghifiletra(true);
        
        if(tralist.size()>=1){
          for(int i=0;i<tralist.size();i++){
            for(int j=0;j<muonlist.size();j++){
                if(tralist.get(i).getMatailieutra().equals(muonlist.get(j).getMatailieumuon())){
                    muonlist.remove(j);
                   IOFile.ghifilemuon(false);
                }
            }
         }
          
          for(int i=0;i<tralist.size();i++){
            for(int j=0;j<sachlist.size();j++){
                if( (tralist.get(i).getMatailieutra().equals(sachlist.get(j).getId())) || (tralist.get(i).getTentailieutra().equals(sachlist.get(j).getTensach()))){
                    sachlist.get(j).setTinhtrang("OK");
                   IOFile.ghifilesach(false);
                }
            }
         }
          
          for(int i=0;i<tralist.size();i++){
            for(int j=0;j<tapchilist.size();j++){
                if( (tralist.get(i).getMatailieutra().equals(tapchilist.get(j).getMatapchi())) || (tralist.get(i).getTentailieutra().equals(tapchilist.get(j).getTentapchi()))){
                    tapchilist.get(j).setTinhtrang("OK");
                   IOFile.ghifiletapchi(false);
                }
            }
         }
          
          for(int i=0;i<tralist.size();i++){
            for(int j=0;j<muonlist.size();j++){
                if( (tralist.get(i).getMatailieutra().equals(baolist.get(j).getMabao())) || (tralist.get(i).getTentailieutra().equals(baolist.get(j).getTenbao()))){
                    baolist.get(j).setTinhtrang("OK");
                   IOFile.ghifilebao(false);
                }
            }
         }
       }
    }
    public void indstailieu(){
        IOFile.docfilesach();
        System.out.println("SACH");
        if(sachlist.isEmpty()){
         System.out.println("Chưa có sách nào !!!");
        }else{
         for(int i=0;i<sachlist.size();i++){
            System.out.println("sách thứ "+(i+1) +" : ");
            sachlist.get(i).output();
        }
        }
        IOFile.docfiletapchi();
        System.out.println("TẠP CHÍ");
        if(tapchilist.isEmpty()){
           System.out.println("Chưa có tạp chí nào !!!");
        }else{
          for(int i=0;i<tapchilist.size();i++){
            System.out.println("tạp chí thứ "+(i+1) +" : ");
            tapchilist.get(i).output();
        }
        }
        IOFile.docfilebao();
        System.out.println("BÁO");
        if(baolist.isEmpty()){
           System.out.println("Chưa có báo nào !!!");
        }else{
          for(int i=0;i<baolist.size();i++){
            System.out.println("báo thứ "+(i+1) +" : ");
            baolist.get(i).output();
        }
        }
    }
    
    public void indsdocgia(){
        IOFile.docfiledocgia();
        if(docgialist.size()>=1){
            for(int i=0;i<docgialist.size();i++){
            System.out.println("độc giả thứ "+(i+1) +" : ");
            docgialist.get(i).output();
            System.out.println("");
            }
            return;
        }
        System.out.println("không có độc giả nào !!! ");
        
    }
    
    public void indsmuon(){
        IOFile.docfilemuon();
        if(muonlist.size()>=1){
            for(int i=0;i<muonlist.size();i++){
            System.out.println("Tài liệu mượn thứ "+(i+1) +" : ");
            muonlist.get(i).output();
            System.out.println("");
            }
            return;
        } 
        System.out.print("Danh sách trống !!! ");
        System.out.println("");
    }
    
    public void indstra(){
        IOFile.docfiletra();
        if(tralist.size()>=1){
            for(int i=0;i<tralist.size();i++){
            System.out.println("Tài liệu trả thứ "+(i+1) +" : ");
            tralist.get(i).output();
            System.out.println("");
             }
        }
        System.out.print("Danh sách trống !!! ");  
        System.out.println("");
    }
    
    static void Searchtailieu(){
        String search;
        
        System.out.print("nhập tên hoặc mã tài liệu cần tìm kiếm: ");
        search = scline();
        if(search.length()>1){
         IOFile.docfilesach();;
         IOFile.docfiletapchi();
         IOFile.docfilebao();
          
         for(int i =0; i<sachlist.size();i++){
            if((sachlist.get(i).getTensach().equals(search)) || (sachlist.get(i).getId().equals(search)) ){
                System.out.println("SÁCH");
                sachlist.get(i).output();
                System.out.println();
                return;
            }
         }
         
         for(int i=0;i<tapchilist.size();i++){
            if((tapchilist.get(i).getTentapchi().equals(search)) || (tapchilist.get(i).getMatapchi().equals(search)) ) {
                System.out.println("TẠP CHÍ");
                tapchilist.get(i).output();
                System.out.println();
                  return;
            }
         }       
         
         for(int i=0;i<baolist.size();i++){
            if( (baolist.get(i).getTenbao().equals(search)) || (baolist.get(i).getMabao().equals(search)) ){
                System.out.println("BÁO");
                baolist.get(i).output();
                System.out.println();
                return;
            }
         }
         }
        System.out.println("Không tồn tại tên hoặc mã tài liệu cần tìm ");
    }
    
    static void Searchdocgia(){
        IOFile.docfiledocgia();
        String search1;
        System.out.print("nhập mã hoặc tên độc giả cần tìm: ");
        search1 = scline();
        if(search1.length()>1){
            for(int i=0;i<docgialist.size();i++){
            if( (docgialist.get(i).getMadg().equals(search1)) || (docgialist.get(i).getName().equals(search1)) ){
                docgialist.get(i).output();
                return;
            }
        }  
        }
        System.out.println("không tồn tại mã hoặc tên cần tìm !!! ");
    }
    
    static void Searchmuon(){
        IOFile.docfilemuon();
        String search2;
        System.out.print("nhập mã độc giả hoặc tên (mã) tài liệu cần tìm : ");
        search2 = scline();
        if(search2.length()>1){
            for(int i=0;i<muonlist.size();i++){
            if( (muonlist.get(i).getMatailieumuon().equals(search2)) || (muonlist.get(i).getMadgmuontailieu().equals(search2)) || (muonlist.get(i).getTentailieumuon().equals(search2)) ){
                muonlist.get(i).output();
                System.out.println("");
                return;
             }
            }
        }
        System.out.println("không tồn tại mã hoặc tên cần tìm !!! ");
    }
    
    static void Searchtra(){
        IOFile.docfiletra();
        String search3;
        System.out.print("nhập mã độc giả hoặc tên (mã) tài liệu cần tìm : ");
        search3 = scline();
        if(search3.length()>1){
            for(int i=0;i<tralist.size();i++){
            if( (tralist.get(i).getMadgtra().equals(search3)) || (tralist.get(i).getMatailieutra().equals(search3)) || (tralist.get(i).getTentailieutra().equals(search3)) ){
                tralist.get(i).output();
                System.out.println("");
                return;
             }
          }
        }
        System.out.println("không tồn tại mã hoặc tên cần tìm !!! "); 
    }
    
    public void Themtailieu(){
    int choice1;
    System.out.println("Chọn loại tài liệu muốn thêm:");
    System.out.println("1.Sach");
    System.out.println("2.Tạp chí"); 
    System.out.println("3.Báo");
    System.out.print("lựa chọn: ");
    choice1 = scan.nextInt();
    switch(choice1){
         case 1:
            Xuli.themsach();
            break;
         case 2:
             Xuli.themtapchi();
             break;
         case 3:
             Xuli.thembao();
             break;
    } 
    }
    
    public void Search(){
    int choice2;
    System.out.println("Bạn muốn tìm gì ? ");
    System.out.println("1.tìm tài liệu");
    System.out.println("2.tìm độc giả");
    System.out.println("3.tìm độc giả mượn or sách mượn");
    System.out.println("4.tìm độc giả trả");
    System.out.println("lựa chọn: ");
    choice2 = scan.nextInt(); 
    switch(choice2){
        case 1:
            Xuli.Searchtailieu();
            break;
        case 2:
            Xuli.Searchdocgia();
            break;
        case 3:
            Xuli.Searchmuon();
            break;
        case 4:
            Xuli.Searchtra();
            break;
    }
    }
    
    public void Xoadocgia(){
        IOFile.docfiledocgia();
        System.out.print("nhập mã hoặc tên độc giả cần xóa: ");
        String dgxoa = scline();
        if(docgialist.size()>=1){
            for(int i=0 ;i<docgialist.size();i++){
                if( (docgialist.get(i).getMadg().equals(dgxoa)) || (docgialist.get(i).getName().equals(dgxoa)) ){
                   docgialist.remove(i);
                   IOFile.ghifiledocgia(false);
                } 
            }
            System.out.println(" tên hoặc mã không tồn tại !!! ");
        }
        System.out.println("Danh sách đang trống !!! ");
        
    }
    public void Xoatailieu(){
        IOFile.docfilesach();
        IOFile.docfiletapchi();
        IOFile.docfilebao();
        System.out.print("nhập mã hoặc tên tài liệu cần xóa: ");
        String tailieuxoa = scline();
        if(sachlist.size()>=1 || tapchilist.size()>=1 || baolist.size()>=1){
            for(int i =0; i<sachlist.size();i++){
            if((sachlist.get(i).getTensach().equals(tailieuxoa)) || (sachlist.get(i).getId().equals(tailieuxoa)) ){
                sachlist.remove(i);
                IOFile.ghifilesach(false);
                return;
            }
         }
            
         for(int i=0;i<tapchilist.size();i++){
            if((tapchilist.get(i).getTentapchi().equals(tailieuxoa)) || (tapchilist.get(i).getMatapchi().equals(tailieuxoa)) ) {
                tapchilist.remove(i);
                IOFile.ghifiletapchi(false);
                  return;
            }
         }       
 
         for(int i=0;i<baolist.size();i++){
            if( (baolist.get(i).getTenbao().equals(tailieuxoa)) || (baolist.get(i).getMabao().equals(tailieuxoa)) ){
                baolist.remove(i);
                IOFile.ghifilebao(false);
                return;
            }
        }
        System.out.print("Danh sách đang trống !!! ");
        }
            System.out.println("mã hoặc tên không chính xác !!! ");
        
        
    }
     //dùng object 
    /*
    public void ghifile(){
        try{
            FileOutputStream fos = new FileOutputStream("C://file.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(sachlist);
        }catch(Exception e){
            System.out.println(" loi ");
        }
       
    }
    
    public void docfile(){
    try{
    FileInputStream fis = new FileInputStream("C://file.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    sachlist1 = (ArrayList<Sach>) ois.readObject();
    ois.close();
    fis.close();
    }catch(Exception ex){
        System.out.println(" loi : "+ex);
    }
    
    System.out.println(" thong tin :");
    for(int i=0;i<sachlist1.size();i++){
    System.out.print(" hoc sinh thu "+(i+1) );
    sachlist1.get(i).output();
    }
    
  }
    */
     
}
    
    
    
    

