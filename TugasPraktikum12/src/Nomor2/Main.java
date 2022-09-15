package Nomor2;
public class Main {
    public static <kubus, balok, tabung> void main(String[] args) {
        class kubus {
            Kubus kubus = new Nomor2.Kubus();
            private int sisi;
            private int volume;

            public int getsisi() {
                return sisi;
            }

            public int hitungvolume() {
                volume = 3 * sisi;
                return volume;
            }

            class balok {
                Balok balok = new Balok();
                private int panjang;
                private int lebar;
                private int tinggi;

                public void Kubus(int panjang, int lebar, int tinggi) {
                    this.panjang = panjang;
                    this.lebar = lebar;
                    this.tinggi = tinggi;
                }

                public int getpanjang() {
                    return panjang;
                }

                public int getlebar() {
                    return lebar;
                }

                public int gettinggi() {
                    return tinggi;
                }

                public int hitungvolume() {
                    volume = panjang * lebar * tinggi;
                    return volume;
                }
            }

            class tabung {
                Tabung tabung = new Tabung();
                private int r;
                private int t;
                private int pi;

                public void tabung(int pi, int r, int t) {
                    this.pi = pi;
                    this.r = r;
                    this.t = t;
                }

                public int getr() {
                    return r;
                }

                public int gett() {
                    return t;
                }

                public int getpi() {
                    return pi;
                }

                public int hitungvolume() {
                    volume = pi * r ^ 2 * t;
                    return volume;
                }

            }
        }
    }
}