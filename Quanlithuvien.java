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
public class Quanlithuvien {

    Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    void menu(){
        System.out.println("Wellcome to Thu Vien");
        System.out.println("1.thêm tài liệu");
        System.out.println("2.danh sách tài liệu");
        System.out.println("3.thêm độc giả");
        System.out.println("4.danh sách độc giả");
        System.out.println("5.mượn tài liệu");
        System.out.println("6.danh sách mượn tài liệu");
        System.out.println("7.trả tài liệu");
        System.out.println("8.danh sách trả tài liệu");
        System.out.println("9.tìm kiếm ");
        System.out.println("10.thoát"); 
    }
    
    public static void main(String[] args) {
        Xuli xl = new Xuli();

        Scanner scan = new Scanner(System.in);
        boolean flag;
        int choice;
        flag = true;
        Quanlithuvien qltv = new Quanlithuvien();
        do{
            qltv.menu();
            System.out.print("lựa chọn của bạn: ");
            choice = scan.nextInt();
            System.out.println();
            switch(choice){
                case 1:
                    xl.Themtailieu();
                    break;
                case 2:
                    xl.indstailieu();
                    int choice3;
                    System.out.println("1.Xóa tài liệu: ");
                    System.out.println("2.thoát: ");
                    System.out.print("Lựa chọn của bạn: ");
                    choice3 = scan.nextInt();
                    switch(choice3){
                        case 1:
                            xl.Xoatailieu();
                            break;
                        case 2:
                            System.out.println("");
                            break;
                    }
                    break;
                case 3:
                    xl.themdocgia();
                    break;
                case 4:
                    xl.indsdocgia();
                    int choice4;
                    System.out.println("1.Xóa độc giả: ");
                    System.out.println("2.thoát: ");
                    System.out.print("Lựa chọn của bạn: ");
                    choice4 = scan.nextInt();
                    switch(choice4){
                        case 1:
                            xl.Xoadocgia();
                            break;
                        case 2:
                            System.out.println("");
                            break;
                    }
                    break;
                case 5:
                    xl.themtailieumuon();
                    break;    
                case 6:
                    xl.indsmuon();
                    break;
                case 7:
                    xl.themtailieutra();
                    break;
                case 8:
                    xl.indstra();
                    break;
                case 9:
                    xl.Search();
                    break;
                case 10:
                    flag = false;
                    System.exit(0);
            }
        }while(flag == true);
     
    }
    
    
}
