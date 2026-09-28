package PRAK101;

import java.time.format.TextStyle;
import java.util.Scanner;
import java.time.Month;
import java.util.Locale;

public class PRAK101_2510817210015_Muhammad_Ramadhon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



            System.out.print("Masukkan Nama Lengkap: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Tempat Lahir: ");
            String tempat_lahir = input.nextLine();
            int tanggal_lahir;
            while(true){
                System.out.print("Masukkan Tanggal Lahir: ");
                tanggal_lahir = input.nextInt();
                if(tanggal_lahir >= 1 && tanggal_lahir <= 31){
                    break;
                }else{
                    System.out.print("Tanggal tidak terpenuhi!\n");
                }
            }

            int bulan_lahir;
            while (true){
                System.out.print("Masukkan Bulan Lahir: ");
                bulan_lahir = input.nextInt();
                if(bulan_lahir >= 1 && bulan_lahir <= 12){
                    break;
                }else{
                    System.out.print("Bulan tidak terpenuhi!\n");
                }
            }
            String namaBulan = Month.of(bulan_lahir)
                .getDisplayName(TextStyle.FULL, new Locale("id", "ID"));

            System.out.print("Masukkan Tahun Lahir: ");
            int tahun_lahir = input.nextInt();

            System.out.print("Masukkan Tinggi Badan: ");
            int tinggi_badan = input.nextInt();

            System.out.print("Masukkan Berat Badan: ");
            double berat_badan = input.nextDouble();


            System.out.println("Nama Lengkap " + nama + " Lahir di " + tempat_lahir + " pada Tanggal " + tanggal_lahir +" " +namaBulan +" " +tahun_lahir + "\nTinggi Badan "
                    + tinggi_badan +" cm "+ " dan Berat Badan " +berat_badan + " kilogram");
            input.close();
    }
}

