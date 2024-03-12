package week1;

public class luasSegitiga {
    public static void main(String[] args) {
        double alas = 6;
        double tinggi = 8;
        double luas = hitungLuasSegitiga(alas, tinggi);
        System.out.println("Luas segitiga siku-siku dengan alas 6 dan tinggi 8 adalah: " + luas);
    }

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }
}
