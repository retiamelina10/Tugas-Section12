package Nomor3;

public class Main {
    public static <penjumlahan, pengurangan, perkalia, pembagian> void main(String[] args) {
        class penjumlahan {
            Penjumlahan penjumlahan = new Penjumlahan();
            private int nilai1;
            private int nilai2;

            public void Penjumlahan(int nilai1, int nilai2){
                this.nilai1 = nilai1;
                this.nilai2 = nilai2;
            }

            public int getnilai1() {
                return nilai1;
            }
            public int getnilai2(){
                return nilai2;
            }
            public int penjumlahan(){
                int penjumlahan = nilai1 + nilai2;
                return penjumlahan;

            }
        }
        class pengurangan {
            Pengurangan pengurangan = new Pengurangan();
            private int nilai1;
            private int nilai2;

            public void Pengurangan(int nilai1, int nilai2){
                this.nilai1 = nilai1;
                this.nilai2 = nilai2;
            }

            public int getnilai1() {
                return nilai1;
            }
            public int getnilai2(){
                return nilai2;
            }
            public int pengurangan() {
                int pengurangan = nilai1 - nilai2;
                return pengurangan;
            }
        }
        class perkalian {
            Perkalian perkalian = new Perkalian();
            private int nilai1;
            private int nilai2;

            public void Perkalian(int nilai1, int nilai2){
                this.nilai1 = nilai1;
                this.nilai2 = nilai2;
            }

            public int getnilai1() {
                return nilai1;
            }
            public int getnilai2(){
                return nilai2;
            }
            public int perkalian() {
                int perkalian = nilai1 * nilai2;
                return perkalian;
            }

        }
        class pembagian {
            Pembagian pembagian = new Pembagian();
            private int nilai1;
            private int nilai2;

            public void Pembagian(int nilai1, int nilai2){
                this.nilai1 = nilai1;
                this.nilai2 = nilai2;
            }

            public int getnilai1() {
                return nilai1;
            }
            public int getnilai2(){
                return nilai2;
            }
            public int pembagian() {
                int pembagian = nilai1 / nilai2;
                return pembagian;
            }

        }


    }

}
