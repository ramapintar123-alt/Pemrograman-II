package PRAK101;

import java.util.Scanner;

public class PRAK103_2510817210015_Muhammad_Ramadhon {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int angka = scanner.nextInt();
            int hitung = 0;
            do{
                if(angka %2 != 0){
                    System.out.print(angka);
                    hitung++;

                    if(hitung < N){
                        System.out.print(", ");
                }
                    }
                angka++;
            }while(hitung < N);
            scanner.close();
        }

}
