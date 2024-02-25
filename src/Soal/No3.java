package Soal;
import java.util.Scanner;

public class No3 {
    private double panjang;

    // Constructor
    public No3(double panjang) {
        this.panjang = panjang;
    }

    // Getter dan Setter
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Method untuk mengkonversi ke mil
    public double getMiles() {
        return panjang * 0.621371;
    }

    // Method untuk mengkonversi ke meter
    public double getMeter() {
        return panjang * 1000;
    }

    // Method untuk mengkonversi ke centimeter
    public double getCentimeter() {
        return panjang * 100000;
    }
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan panjang dalam kilometer: ");
            double panjangKilometer = scanner.nextDouble();

            No3 metrics = new No3(panjangKilometer);

            System.out.println("Panjang dalam mil: " + metrics.getMiles());
            System.out.println("Panjang dalam meter: " + metrics.getMeter());
            System.out.println("Panjang dalam centimeter: " + metrics.getCentimeter());

            scanner.close();
        }
    }
}
