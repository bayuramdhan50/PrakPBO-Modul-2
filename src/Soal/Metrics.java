package Soal; // Package untuk kelas Metrics

import java.util.Scanner;

public class Metrics {
    private double panjang;

    // Constructor untuk inisialisasi objek dengan nilai panjang
    public Metrics(double panjang) {
        this.panjang = panjang;
    }

    // Getter dan Setter untuk atribut panjang
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Method untuk mengkonversi panjang ke mil
    public double getMiles() {
        return panjang * 0.621371; // Mengalikan panjang dengan faktor konversi kilometer ke mil
    }

    // Method untuk mengkonversi panjang ke meter
    public double getMeter() {
        return panjang * 1000; // Mengalikan panjang dengan faktor konversi kilometer ke meter
    }

    // Method untuk mengkonversi panjang ke centimeter
    public double getCentimeter() {
        return panjang * 100000; // Mengalikan panjang dengan faktor konversi kilometer ke centimeter
    }

    // Kelas Main sebagai tempat eksekusi utama program
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang dalam kilometer: ");
            double panjangKilometer = scanner.nextDouble();

            // Membuat objek Metrics dengan panjang yang dimasukkan pengguna
            Metrics metrics = new Metrics(panjangKilometer);

            // Menampilkan hasil konversi panjang ke mil, meter, dan centimeter
            System.out.println("Panjang dalam mil: " + metrics.getMiles());
            System.out.println("Panjang dalam meter: " + metrics.getMeter());
            System.out.println("Panjang dalam centimeter: " + metrics.getCentimeter());

            scanner.close();
        }
    }
}
