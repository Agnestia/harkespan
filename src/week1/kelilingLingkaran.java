package week1;

public class kelilingLingkaran {
    public static void main(String[] args) {

        double diameter = 10;
        double keliling = hitungKelilingLingkaran(diameter);
        System.out.println("Keliling lingkaran dengan diameter 10 adalah: " + keliling);
    }


    public static double hitungKelilingLingkaran(double diameter) {
        return Math.PI * diameter;
    }
}
