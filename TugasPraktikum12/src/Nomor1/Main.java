package Nomor1;

public class Main {
    public static <persegi, persegipanjang, segitiga> void main(String[] args) {
        class persegi{
            public final Persegi persegi = new Persegi();
            private int sisi;
            private int luas;
            private int keliling;

            public void Persegi(int sisi) {
                this.sisi = sisi;
            }

            public int getsisi() {
                return sisi;
            }

            public int hitungluas() {
                luas = sisi * sisi;
                return luas;
            }

            public int hitungkeliling() {
                keliling = 4 * sisi;
                return keliling;
            }
        }

        class PersegiPanjang {
            PersegiPanjang persegipanjang = new PersegiPanjang();
            private int panjang;
            private int lebar;
            private int luas;
            private int keliling;

            public void PersegiPanjang(int panjang, int lebar) {
                this.panjang = panjang;
                this.lebar = lebar;
            }
            public int getpanjang(){
                return panjang;
            }
            public int getlebar(){
                return lebar;
            }
            public int hitungluas(){
                luas = panjang * lebar;
                return luas;
            }
            public int hitungkeliling(){
                keliling = 2 * (panjang+lebar);
                return keliling;
            }

        }
        class Segitiga{
            Segitiga segitiga = new Segitiga();
            private int alas;
            private int tinggi;
            private int luas;
            private int keliling;

            public void Segitiga(int alas, int tinggi) {
                this.alas = alas;
                this.tinggi = tinggi;
            }
            public int getalas(){
                return alas;
            }
            public int gettinggi(){
                return tinggi;
            }
            public int hitungluas(){
                luas = alas * tinggi/2;
                return luas;
            }
            public int hitungkeliling(){
                keliling = 3*alas;
                return keliling;
            }
        }



        }
    }