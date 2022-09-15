package Nomor4;

public class OngkosKirim extends Main{
    public static void main (String[] args) {
        OngkosKirim ongkoskirim = new OngkosKirim();
        int panjang = 5;
        int lebar = 2;
        int tinggi = 4;
        double beratKG = 1;
        int hargaberatKG = 5000;
        double ongkir = beratKG * hargaberatKG;
        System.out.println("ongkir barang tersebut adalah " + ongkir);
    }
}
