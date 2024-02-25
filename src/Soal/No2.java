package Soal;
import java.util.Scanner;

public class No2 {
    private int tahun;

    // Constructor
    public No2(int tahun) {
        this.tahun = tahun;
    }

    // Getter dan Setter
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Method untuk menentukan apakah tahun kabisat atau tidak
    public boolean isKabisat() {
        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan tahun: ");
            int tahunInput = scanner.nextInt();

            No2 tahun = new No2(tahunInput);

            if (tahun.isKabisat()) {
                System.out.println(tahun.getTahun() + " adalah tahun kabisat.");
            } else {
                System.out.println(tahun.getTahun() + " bukan tahun kabisat.");
            }

            scanner.close();
        }
    }
}
