package PRAK101;

import java.util.Scanner;

public class PRAK104_2510817210015_Muhammad_Ramadhon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String pilihanAbu = input.nextLine();
        String[] barisAbu = pilihanAbu.split(" ");

        System.out.print("Tangan Bagas: ");
        String pilihanBagas = input.nextLine();
        String[] barisBagas = pilihanBagas.split(" ");

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i < 3; i++) {
            String abu = barisAbu[i];
            String bagas = barisBagas[i];

            if (abu.equals(bagas)) {
                continue;
            } else if ((abu.equals("B") && bagas.equals("G")) ||
                    (abu.equals("G") && bagas.equals("K")) ||
                    (abu.equals("K") && bagas.equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        input.close();
    }
}