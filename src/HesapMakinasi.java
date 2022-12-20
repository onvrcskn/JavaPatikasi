import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        double no1;
        double no2;
        double sonuc = 0.0d;
        Scanner tara = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        no1 = tara.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        no2 = tara.nextInt();
        System.out.println("yapılacak işlemi seçiniz \n 1-bol \n 2-carp \n 3-topla \n 4-cikar");
        int islem = 5;
        islem = tara.nextInt();
        switch (islem) {
            case 1:
                sonuc = no1 / no2;
                break;
            case 2:
                sonuc = no1 * no2;
                break;
            case 3:
                sonuc = no1 + no2;
                break;
            case 4:
                sonuc = no1 - no2;
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
                break;
        }
        System.out.println("işleminizi Sonucu : " + sonuc);
    }
}