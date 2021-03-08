/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author Danu Hartanto ( A11.2017.10606 )
 */
public class JavaApplication2 {

  public static void main(String[] args) {
	boolean isExit = false;
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("========= Kalkulator Console =========");
                System.out.println("========= Danu Hartanto =========");
                
		System.out.println("Menu : ");
		System.out.println("1. Soal 1");
		System.out.println("2. Soal 2");
		System.out.println("3. Soal 3");
		System.out.println("4. Soal 4");
		System.out.println("5. Keluar");
		System.out.print("Pilih salah satu menu : ");
		int menuSelect = scanner.nextInt();
                
                
                
		if (menuSelect == 5) {
			isExit = true;
		} else {
			if (menuSelect == 1) { //Penambahan
				System.out.println("Soal 1 ");//-5 + 8 * 6
			} else if (menuSelect == 2) { 
				System.out.println("Soal 2 ");//(55+9) % 9
			} else if (menuSelect == 3) { //20 + -3*5 / 8
				System.out.println("Soal 3 ");
			} else if (menuSelect == 4) { //5 + 15 / 3 * 2 - 8 % 3
				System.out.println("Soal 4 ");
			}
			int n=2;
                      
			
			
			int result=0 ;
			
			if (menuSelect == 1) { //soal 1
                              for(int a=1;a<n;a++){
                                   System.out.print("angka yang dihitung : ");
                            a=scanner.nextInt();
                            
                                 for(int b=1;b<n;b++ ){
                               System.out.print("angka yang dihitung : ");
                            b=scanner.nextInt();
                            for(int c=1;c<n;c++){
                                 System.out.print("angka yang dihitung : ");
                            c=scanner.nextInt();
                            
				result = (-a) + b * c;
                            }}}
			} else if (menuSelect == 2) { //soal 2
                             for(int i=1;i<n;i++){
                                   System.out.println("angka yang dihitung : ");
                            i=scanner.nextInt();
                                 for(int j=1;j<n;j++ ){
                               System.out.println("angka yang dihitung : ");
                            j=scanner.nextInt();
                            for(int k=1;k<n;k++){
                                 System.out.println("angka yang dihitung : ");
                            k=scanner.nextInt();
                            
				result = (i + j) % k;}
                                 }}
			} else if (menuSelect == 3) {// soal 3 
                              for(int i=1;i<n;i++){
                                   System.out.println("angka yang dihitung : ");
                            i=scanner.nextInt();
                                 for(int j=1;j<=n;j++ ){
                               System.out.println("angka yang dihitung : ");
                            j=scanner.nextInt();
                            for(int k=1;k<n;k++){
                                 System.out.println("angka yang dihitung : ");
                            k=scanner.nextInt();
                            for (int m =1;m<n;m++){
                             System.out.println("angka yang dihitung : ");
                            m=scanner.nextInt();
				result = i + (-j) * k / m;}
                                 }}}
			} else if (menuSelect == 4) { //soal 4
                              for(int i=1;i<n;i++){
                                   System.out.println("angka yang dihitung : ");
                            i=scanner.nextInt();
                                 for(int j=1;j<n;j++ ){
                               System.out.println("angka yang dihitung : ");
                            j=scanner.nextInt();
                            for(int k=1;k<n;k++){
                                 System.out.println("angka yang dihitung : ");
                            k=scanner.nextInt();
                            for (int m =1;m<n;m++){
                             System.out.println("angka yang dihitung : ");
                            m=scanner.nextInt();
                            for(int o=1;o<n;o++){
                                 System.out.println("angka yang dihitung : ");
                            o=scanner.nextInt();
                            for(int p=1;p<n;p++){
                                 System.out.println("angka yang dihitung : ");
                            o=scanner.nextInt();
				result = i + j / k * m -o % p;}
                                 }}}}}
			} 
			
			System.out.println("Hasil : " + result);
			System.out.print("Ketik 5 untuk keluar, ketik 0 untuk ke menu utama : ");
			menuSelect = scanner.nextInt();
			if (menuSelect == 5)
				isExit = true;
		}			
	} while (!isExit);
	scanner.close();
}
    
}
