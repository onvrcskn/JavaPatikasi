import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        int sayi = 0, basamak = 0;
        int modSayi, taban;
        double sonuc = 0.0;
        Scanner tara = new Scanner(System.in);
        sayi = tara.nextInt();
        int gecici = sayi;
        while (gecici != 0) {
            gecici /= 10;
            basamak++;
        }
        modSayi = sayi;
        while (modSayi != 0) {
            taban = modSayi % 10;
            modSayi /= 10;
            sonuc = sonuc + Math.pow(taban, basamak);
        }
        System.out.println("Sonuç = "+sonuc);
    }
}
