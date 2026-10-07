package praktikum2.soal1;

public class Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000, 16.0);
        Buah mangga = new Buah("Mangga", 0.2, 3500, 10.0);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000, 12.0);

        apel.info();
        mangga.info();
        alpukat.info();
    }
}
