package praktikum2.soal1;

public class Buah {
    private String name;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public Buah(String name, double berat, double harga, double jumlahBeli) {
        this.name = name;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public double getHargaPerKg() {
        return harga / berat;
    }

    public double getTotalSebelumDiskon() {
        return getHargaPerKg() * jumlahBeli;
    }

    public double getDiskon() {
        int kelipatanEmpat = (int) (jumlahBeli / 4);
        double hargaEmpatKg = getHargaPerKg() * 4;
        return kelipatanEmpat * (0.02 * hargaEmpatKg);
    }

    public double getTotalSetelahDiskon() {
        return getTotalSebelumDiskon() - getDiskon();
    }

    public void info() {
        System.out.println("Nama Buah: " + name);
        System.out.printf("Berat: %.2f kg\n", berat);
        System.out.printf("Harga: Rp%.0f\n", harga);
        System.out.printf("Jumlah Beli: %.1f kg\n", jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getTotalSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f\n", getDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", getTotalSetelahDiskon());
        System.out.println();
    }
}
