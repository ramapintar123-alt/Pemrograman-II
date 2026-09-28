package PRAK101;

import java.util.Scanner;

public class PRAK105_2510817210015_Muhammad_Ramadhon {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = scanner.nextDouble();

        double volume = PHI * r * r * t;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", r, t, volume);

        scanner.close();
    }
}
