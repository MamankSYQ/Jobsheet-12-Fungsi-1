package Pertemuan14;
import java.util.Scanner;
public class Kubus01 {
    static int hitungVolume (int s){
        int v;
        v = s* s * s;
        return v;
    }
    static int hitungLuasPermukaan (int s){
        int luasP;
        luasP = 6 * s * s;
        return luasP;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sisi;

        System.out.print("Masukkan sisi : ");
        sisi = sc.nextInt();

        System.out.println("Volume kubus adalah " + hitungVolume(sisi));
        System.out.println("Luas permukaan kubus adalah " + hitungLuasPermukaan(sisi));
    }
}
