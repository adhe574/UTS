import java.util.Scanner;
public class stokBarangToko01 {
    public static void main(String[] args) {

        Scanner sc01 = new Scanner(System.in);
       
    class Barang {
        String nama;
        int stok;
        double harga;

       public Barang (String nama, int stok, double harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
       }

       double hitungTotalNilaiStok() {
        return stok * harga;
       }

       boolean cekStok(int jumlahPermintaan) {
        return stok >= jumlahPermintaan;
       }

       void kurangiStok(int jumlahPermintaan) {
       }
    }

            while (true) {
                System.out.println("Masukkan nama barang: ");
                String nama = sc01.nextLine();
                System.out.println("Masukkan jumlah stok: ");
                int stok = sc01.nextInt();
                System.out.println("Masukkan harga per unit: ");
                double harga = sc01.nextDouble();
                sc01.nextLine();

                Barang barang = new Barang(nama, stok, harga);
                System.out.println("Total Nilai Stok Barang: " + barang.hitungTotalNilaiStok() );

                System.out.print("Masukkan jumlah permintaan barang: ");
            int permintaan = sc01.nextInt();

            if (barang.cekStok(permintaan)) {
                barang.kurangiStok(permintaan);
                System.out.println("Permintaan dapat dipenuhi.");
                System.out.println("Sisa stok: " + stok);
            } else {
                System.out.println("Stok tidak mencukupi.");
            }
            
            System.out.print("Apakah Anda ingin melanjutkan? (y/n): ");
            char pilihan = sc01.next().charAt(0);
            sc01.nextLine();

            if (pilihan == 'n' || pilihan == 'N') {
    
            }
        }
    }
}