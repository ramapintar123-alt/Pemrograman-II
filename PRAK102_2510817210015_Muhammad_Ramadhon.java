package PRAK101;

import java.util.Scanner;
public class PRAK102_2510817210015_Muhammad_Ramadhon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;

        while(i <= 10){
            int angkaSekarang = input + i;
            int hasil;

            if(angkaSekarang % 5 == 0){
                hasil = (angkaSekarang / 5) - 1;
            }
            else{
                hasil = angkaSekarang;
            }

            System.out.print(hasil);

            if(i < 10){
            System.out.print(", ");
            }
            i++;
        }
        scanner.close();
    }
}
