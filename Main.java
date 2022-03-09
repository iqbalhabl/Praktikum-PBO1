import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Main {
        public static void main(String[] args) {
        boolean ulangPertama = true;
        Scanner input = new Scanner (System.in);
        
        while(ulangPertama){
            System.out.println("===========================");
            System.out.println(" PROGRAM KONVERSI SUHU AIR ");
            System.out.println("===========================");
            System.out.println("Input Data");
            System.out.println("----------");
            System.out.printf("Suhu Dalam Celcius\t: ");
            double suhuCelcius = input.nextInt();
            System.out.println("");
            
            Konversi pilihanSuhu = new Konversi(suhuCelcius);
            boolean ulangKedua = true;

            do{
                System.out.println("Opsi");
                System.out.println("----");
                System.out.println("1. Lihat Data Konversi");
                System.out.println("2. Edit Data Konversi");
                System.out.println("3. Exit");
                System.out.printf("Pilih\t: ");
                int pilih = input.nextInt();
                System.out.println("");

                if (pilih==1){
                    pilihanSuhu.hasilSuhu();
                }
                else if (pilih==2){
                    ulangKedua=false;
                }
                else if (pilih==3){
                    ulangKedua=false;
                    ulangPertama=false;
                }
                else{
                    System.out.println("Opsi tidak ada. Mohon masukkan dengan benar!!\n");
                    continue;
                }
            }while(ulangKedua);
        }
    }
}