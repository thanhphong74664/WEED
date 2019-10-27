/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlithuvien;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import static quanlithuvien.Xuli.baolist;
import static quanlithuvien.Xuli.docgialist;
import static quanlithuvien.Xuli.muonlist;
import static quanlithuvien.Xuli.sachlist;
import static quanlithuvien.Xuli.tapchilist;
import static quanlithuvien.Xuli.tralist;

/**
 *
 * @author weedc
 */
public class IOFile {

   
     static void ghifilesach(Boolean dk){
        File file = new File("C://test//sach.txt");
        try(FileWriter fw = new FileWriter(file,dk);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)){
                for(int i=0;i<sachlist.size();i++){
                     pw.print(sachlist.get(i).toString());
                     pw.print("\n");
                  }
        }catch(Exception e){
            System.out.println(e);
        }
    }
     
    static void docfilesach(){
        sachlist.clear();
        File file = new File("C://test//sach.txt");
        try(Scanner sc = new Scanner(file)){
               String a,b,c,d,e,f;              
               while(sc.hasNext()){
                   a= sc.nextLine();
                   b= sc.nextLine();
                   c=sc.nextLine();
                   d=sc.nextLine();
                   e=sc.nextLine(); 
                   f=sc.nextLine();
                   sachlist.add(new Sach(a,b,c,d,e,f));
               }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
     static void ghifiletapchi(Boolean dk){
        File file = new File("C://test//tapchi.txt");
        try(FileWriter fw = new FileWriter(file,dk);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)){
                for(int i=0;i<tapchilist.size();i++){
                     pw.print(tapchilist.get(i).toString());
                     pw.print("\n");
                  }
        }catch(Exception e){
            System.out.println(e);
        }
    }
         
    static void docfiletapchi(){
        tapchilist.clear();
        File file = new File("C://test//tapchi.txt");
        try(Scanner sc = new Scanner(file)){
               String a,b,c,d,e;
               while(sc.hasNext()){
                   a= sc.nextLine();
                   b= sc.nextLine();
                   c=sc.nextLine();
                   d=sc.nextLine();  
                   e=sc.nextLine(); 
                   tapchilist.add(new Tapchi(a,b,c,d,e));
               }    
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
   static void ghifilebao(Boolean dk){
        File file = new File("C://test//bao.txt");
        try(FileWriter fw = new FileWriter(file,dk);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)){
                for(int i=0;i<baolist.size();i++){
                     pw.print(baolist.get(i).toString());
                     pw.print("\n");
                  }
        }catch(Exception e){
            System.out.println(e);
        }
    }
     
   static void docfilebao(){
        baolist.clear();
        File file = new File("C://test//bao.txt");
        try(Scanner sc = new Scanner(file)){
               String a,b,c,d,e;
               
               while(sc.hasNext()){
                   a= sc.nextLine();
                   b= sc.nextLine();
                   c=sc.nextLine();
                   d=sc.nextLine(); 
                   e=sc.nextLine(); 
                   baolist.add(new Bao(a,b,c,d,e));
               }
        }catch(Exception e){
            System.out.println(e);
        }
    }
   
      static void ghifiledocgia(Boolean dk){
        File file = new File("C://test//docgia.txt");
        try(FileWriter fw = new FileWriter(file,dk);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)){
                for(int i=0;i<docgialist.size();i++){
                     pw.print(docgialist.get(i).toString());
                     pw.print("\n");
                  }
        }catch(Exception e){
            System.out.println(e);
        }
    }

   static void docfiledocgia(){
        docgialist.clear();
        File file = new File("C://test//docgia.txt");
        try(Scanner sc = new Scanner(file)){
               String a,b,c;    
               while(sc.hasNext()){
                   a= sc.nextLine();
                   b= sc.nextLine();
                   c=sc.nextLine(); 
                   docgialist.add(new Docgia(a,b,c));
               }
        }catch(Exception e){
            System.out.println(e);
        }
    }  
   
   static void ghifilemuon(Boolean dk){
        File file = new File("C://test//muon.txt");
        try(FileWriter fw = new FileWriter(file,dk);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)){
                for(int i=0;i<muonlist.size();i++){
                     pw.print(muonlist.get(i).toString());
                     pw.print("\n");
                  }
        }catch(Exception e){
            System.out.println(e);
        }
    }

   static void docfilemuon(){
        muonlist.clear();
        File file = new File("C://test//muon.txt");
        try(Scanner sc = new Scanner(file)){
               String a,b,c,d;
               
               while(sc.hasNext()){
                   a= sc.nextLine();
                   b= sc.nextLine();
                   c=sc.nextLine();
                   d=sc.nextLine(); 
                   muonlist.add(new Muontailieu(a,b,c,d));
               }
        }catch(Exception e){
            System.out.println(e);
        }
    }   
    
   static void ghifiletra(Boolean dk){
        File file = new File("C://test//tra.txt");
        try(FileWriter fw = new FileWriter(file,dk);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)){
                for(int i=0;i<tralist.size();i++){
                     pw.print(tralist.get(i).toString());
                     pw.print("\n");
                  }
        }catch(Exception e){
            System.out.println(e);
        }
    }
   
   static void docfiletra(){
        tralist.clear();
        File file = new File("C://test//tra.txt");
        try(Scanner sc = new Scanner(file)){
               String a,b,c,d;
               while(sc.hasNext()){
                   a= sc.nextLine();
                   b= sc.nextLine();
                   c=sc.nextLine();
                   d=sc.nextLine(); 
                   tralist.add(new Tratailieu(a,b,c,d));
               }
        }catch(Exception e){
            System.out.println(e);
        }
    }  

   
}
