package Pertemuan14;
import java.util.Scanner;
public class RekapPenjualanCafe01 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[5][7];

    public static void inputData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Input penjualan untuk menu: "+menu[i]);
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print("Hari ke-"+(j + 1)+": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilData() {
        System.out.println("\nRekap Penjualan (5 Menu x 7 Hari)\n");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= 7; i++){
            System.out.print("H"+i+"\t");
        }
        System.out.println();

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i]+"\t");
            if (menu[i].length() < 8) {
                System.out.print("\t");
            }
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print(penjualan[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void menuTerbanyak() {
        int maxTotal = 0;
        int indexMenu = 0;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[0].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMenu = i;
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi : ");
        System.out.println(menu[indexMenu]+" = "+maxTotal);
    }

    public static void rataRataMenu() {
        System.out.println("\nRata-rata Penjualan Setiap Menu : ");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[0].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / 7;
            System.out.println(menu[i]+" : "+rata);
        }
    }

    public static void main(String[] args) {
        inputData();
        tampilData();
        menuTerbanyak();
        rataRataMenu();
    }
}
