package Soal;

public class No1 {
    private int jam;
    private int menit;
    private int detik;

    // Constructor
    public No1(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    // Getter dan Setter
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

    // Method untuk menghitung selisih waktu
    public void hitungSelisih(No1 waktu2) {
        int totalDetik1 = this.jam * 3600 + this.menit * 60 + this.detik;
        int totalDetik2 = waktu2.getJam() * 3600 + waktu2.getMenit() * 60 + waktu2.getDetik();
        int selisihDetik = totalDetik2 - totalDetik1;

        int jamSelisih = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int menitSelisih = sisaDetik / 60;
        int detikSelisih = sisaDetik % 60;

        System.out.println("Selisih: " + jamSelisih + " Jam " + menitSelisih + " Menit " + detikSelisih + " Detik");
    }
    public static class Main {
        public static void main(String[] args) {
            No1 waktu1 = new No1(2, 3, 25);
            No1 waktu2 = new No1(2, 3, 27);

            System.out.println("Jam pertama: " + waktu1.getJam() + " Jam " + waktu1.getMenit() + " Menit " + waktu1.getDetik() + " Detik");
            System.out.println("Jam kedua: " + waktu2.getJam() + " Jam " + waktu2.getMenit() + " Menit " + waktu2.getDetik() + " Detik");

            waktu1.hitungSelisih(waktu2);
        }
    }
}


