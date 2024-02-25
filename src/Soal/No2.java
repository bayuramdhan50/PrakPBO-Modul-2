package Soal; // Package untuk kelas No2

import java.util.Scanner;

public class No2 {
    private int tahun;

    // Constructor untuk inisialisasi objek dengan nilai tahun
    public No2(int tahun) {
        this.tahun = tahun;
    }

    // Getter dan Setter untuk atribut tahun
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Method untuk menentukan apakah tahun kabisat atau tidak
    public boolean isKabisat() {
        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            return true; // Mengembalikan true jika tahun kabisat
        } else {
            return false; // Mengembalikan false jika bukan tahun kabisat
        }
    }

    // Kelas Main sebagai tempat eksekusi utama program
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan tahun: ");
            int tahunInput = scanner.nextInt();

            // Membuat objek No2 dengan tahun yang dimasukkan pengguna
            No2 tahun = new No2(tahunInput);

            // Menentukan apakah tahun tersebut adalah tahun kabisat atau tidak
            if (tahun.isKabisat()) {
                System.out.println(tahun.getTahun() + " adalah tahun kabisat.");
            } else {
                System.out.println(tahun.getTahun() + " bukan tahun kabisat.");
            }

            scanner.close();
        }
    }
}
