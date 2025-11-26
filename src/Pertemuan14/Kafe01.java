package Pertemuan14;
import java.util.Scanner;
public class Kafe01 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, "+namaPelanggan+"!");

        if (isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Berikan diskon 50%");
        }
        else if (kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Berikan diskon 30%");
        }
        else {
            System.out.println("Kode invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
        }
public static int hitungTotalHarga (int pilihanMenu, int banyakItem, String kodePromo){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Mendapat diskon 50%");
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        }
        else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Mendapat diskon 30%");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        }
        else {
            System.out.println("Kode invalid");
        }

        return hargaTotal;
}
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "diskon50");
        
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan anda: Rp."+totalHarga);
    }
}