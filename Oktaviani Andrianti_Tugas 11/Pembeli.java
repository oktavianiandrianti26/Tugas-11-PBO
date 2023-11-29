import java.util.Scanner;

public class Pembeli implements TransaksiPembelian 
{
    private String namaPembeli;
    private String nomorHP;

    public Pembeli() {
        inputData();
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Pembeli: ");
        this.namaPembeli = scanner.nextLine();
        System.out.println("Nomor HP: ");
        this.nomorHP = scanner.nextLine();
    }

    @Override
    public void tampilkanData() {
        System.out.println("Detail Pembeli:");
        System.out.println("Nama: " + namaPembeli);
        System.out.println("Nomor HP: " + nomorHP);
    }
}
