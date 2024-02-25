package Soal; // Package untuk kelas No1

public class No1 {
    private int jam;
    private int menit;
    private int detik;

    // Constructor untuk inisialisasi objek dengan nilai jam, menit, dan detik
    public No1(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    // Getter dan Setter untuk atribut jam, menit, dan detik
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    // Method untuk menghitung selisih waktu antara dua objek No1
    public void hitungSelisih(No1 waktu2) {
        // Menghitung total detik untuk masing-masing waktu
        int totalDetik1 = this.jam * 3600 + this.menit * 60 + this.detik;
        int totalDetik2 = waktu2.getJam() * 3600 + waktu2.getMenit() * 60 + waktu2.getDetik();

        // Menghitung selisih detik
        int selisihDetik = totalDetik2 - totalDetik1;

        // Mengkonversi selisih detik ke jam, menit, dan detik
        int jamSelisih = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int menitSelisih = sisaDetik / 60;
        int detikSelisih = sisaDetik % 60;

        // Menampilkan hasil selisih waktu
        System.out.println("Selisih: " + jamSelisih + " Jam " + menitSelisih + " Menit " + detikSelisih + " Detik");
    }

    // Kelas Main sebagai tempat eksekusi utama program
    public static class Main {
        public static void main(String[] args) {
            // Membuat dua objek No1 dengan waktu yang berbeda
            No1 waktu1 = new No1(2, 3, 25);
            No1 waktu2 = new No1(2, 3, 27);

            // Menampilkan waktu pertama dan kedua
            System.out.println("Jam pertama: " + waktu1.getJam() + " Jam " + waktu1.getMenit() + " Menit " + waktu1.getDetik() + " Detik");
            System.out.println("Jam kedua: " + waktu2.getJam() + " Jam " + waktu2.getMenit() + " Menit " + waktu2.getDetik() + " Detik");

            // Menghitung dan menampilkan selisih waktu antara waktu1 dan waktu2
            waktu1.hitungSelisih(waktu2);
        }
    }
}
