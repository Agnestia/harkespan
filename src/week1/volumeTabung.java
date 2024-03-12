package week1;

public class volumeTabung {
    public static void main(String[] args) {
        double diameter = 5;
        double tinggi = 10;
        double volume = hitungVolumeTabung(diameter, tinggi);
        System.out.println("Volume tabung dengan diameter 5 dan tinggi 10 adalah: " + volume);
    }

    public static double hitungVolumeTabung(double diameter, double tinggi) {
        double jariJari = diameter / 2;
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
