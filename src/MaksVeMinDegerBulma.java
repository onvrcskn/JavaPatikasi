import java.util.Scanner;

public class MaksVeMinDegerBulma {
    public static void main(String[] args) {
        int sayiAdedi, sayi = 0, n = 1, temp1 = 0, temp2 = 0, max = 0, min = 0, a = 0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz :");
        sayiAdedi = tara.nextInt();
        boolean durum = true;
        do {
            if (n <= sayiAdedi) {
                System.out.print(n + ". sayıyı giriniz : ");
                sayi = tara.nextInt();
                n++;
                if (a == 0) {
                    temp2 = sayi;
                    a++;
                }
                if (sayi > temp1) {
                    temp1 = sayi;
                    max = temp1;
                }
                if (sayi <= temp2) {
                    temp2 = sayi;
                    min = temp2;
                }
            } else durum = false;
        }
        while (durum);
        System.out.println("Maksimum Sayı : " + max);
        System.out.println("Minimum Sayı : " + min);
    }
}