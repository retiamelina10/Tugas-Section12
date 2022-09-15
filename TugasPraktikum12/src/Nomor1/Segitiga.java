package Nomor1;

public class Segitiga extends Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        int alas = 3;
        int tinggi = 4;
        int luas = alas * tinggi / 2;
        int keliling = 3 * alas;
        System.out.println("luas segitiga adalah " + luas);
        System.out.println("keliling segitiga adalah " + keliling);
    }
}
