package week1;

public class kelilingLingkaran {
    public static void main(String[] args) {
        // Menghitung keliling lingkaran
        double diameter = 10;
        double keliling = hitungKelilingLingkaran(diameter);
        System.out.println("Keliling lingkaran dengan diameter 10 adalah: " + keliling);
    }

    // Metode untuk menghitung keliling lingkaran
    public static double hitungKelilingLingkaran(double diameter) {
        return Math.PI * diameter;
    }
}
