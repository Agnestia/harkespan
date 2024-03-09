package week1;

public class luasSegitiga {
    public static void main(String[] args) {
        // Menghitung luas segitiga siku-siku
        double alas = 6;
        double tinggi = 8;
        double luas = hitungLuasSegitiga(alas, tinggi);
        System.out.println("Luas segitiga siku-siku dengan alas 6 dan tinggi 8 adalah: " + luas);
    }

    // Metode untuk menghitung luas segitiga siku-siku
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }
}
