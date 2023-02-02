import java.util.Scanner;
import java.util.SortedMap;

public class Burclar {
    public static void main(String[] args) {
        int ay, gun;
        Scanner tara = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz : ");
        ay = tara.nextInt();
        System.out.println("Doğduğunuz günü giriniz : ");
        gun = tara.nextInt();

        if (ay == 1)
            if (0 < gun && gun < 22) {
                System.out.println("Oğlak Burcu");
            } else System.out.println("Kova Burcu");
        if (ay == 2)
            if (0 < gun && gun < 20) {
                System.out.println("Kova Burcu");
            } else System.out.println("Balık Burcu");
        if (ay == 3)
            if (0 < gun && gun < 21) {
                System.out.println("Balık Burcu");
            } else System.out.println("Koç Burcu");
        if (ay == 4)
            if (0 < gun && gun < 21) {
                System.out.println("Koç Burcu");
            } else System.out.println("Boğa Burcu");
        if (ay == 5)
            if (0 < gun && gun < 21) {
                System.out.println("Boğa Burcu");
            } else System.out.println("İkizler Burcu");
        if (ay == 6)
            if (0 < gun && gun < 22) {
                System.out.println("İkizler Burcu");
            } else System.out.println("Yengeç Burcu");
        if (ay == 7)
            if (0 < gun && gun < 23) {
                System.out.println("Yengeç Burcu");
            } else System.out.println("Aslan Burcu");
        if (ay == 8)
            if (0 < gun && gun < 24) {
                System.out.println("Aslan Burcu");
            } else System.out.println("Başak Burcu");
        if (ay == 9)
            if (0 < gun && gun < 24) {
                System.out.println("Başak Burcu");
            } else System.out.println("Terazi Burcu");
        if (ay == 10)
            if (0 < gun && gun < 24) {
                System.out.println("Terazi Burcu");
            } else System.out.println("Akrep Burcu");
        if (ay == 11)
            if (0 < gun && gun < 23) {
                System.out.println("Akrep Burcu");
            } else System.out.println("Yay Burcu");
        if (ay == 12)
            if (0 < gun && gun < 22) {
                System.out.println("Yay Burcu");
            } else System.out.println("Oğlak Burcu");
    }
}
