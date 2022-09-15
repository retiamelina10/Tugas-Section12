package Nomor1;

public class PersegiPanjang extends Main{
    public static void main (String[] args){
        PersegiPanjang persegipanjang = new PersegiPanjang ();
        int panjang = 8;
        int lebar = 7;
        int luas = panjang * lebar;
        int keliling = 2*(panjang+lebar);
        System.out.println("luas persegi panjang adalah "+ luas);
        System.out.println("keliling persegi panjang adalah "+ keliling);
    }
}
