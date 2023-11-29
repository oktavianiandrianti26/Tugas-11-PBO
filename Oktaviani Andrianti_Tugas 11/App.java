public class App {
    public static void main(String[] args) {
        TransaksiPembelian transaksi1 = new Pembeli(); // Objek Produk sebagai DetailTransaksi menggunakan polimorfisme
        TransaksiPembelian transaksi2 = new Produk();  // Memanggil metode sesuai dengan perilaku yang bervariasi
        System.out.println();
        transaksi1.tampilkanData(); 
        System.out.println();
        transaksi2.tampilkanData(); 
        System.out.println();
    }
}