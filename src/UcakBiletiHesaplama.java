import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        double mesafe, yas, tutar = 0, indirimliTutar = 0, indirim = 0, indirimOrani = 0;
        int yolculukTipi = 0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Mesafeyi KM türünden giriniz : ");
        mesafe = tara.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        yas = tara.nextInt();
        System.out.println("Yolculuk Tipini giriniz \n Tek Yön İçin => 1  Gidiş-Dönüş İçin =>2: ");
        yolculukTipi = tara.nextInt();

        if ((yolculukTipi != 1 || yolculukTipi != 2) && yas > 0 && mesafe > 0) {
            tutar = mesafe * (0.1);
            System.out.println("Tek Yön Normal Tutar : " + tutar);
            if (yolculukTipi == 2) {
                tutar = tutar * 2;
                indirimOrani = 0.2;
                indirim = tutar * indirimOrani;
                indirimliTutar = tutar - indirim;
                System.out.println("%20 indirim uygulandı");
                System.out.println("Normal Tutar : " + mesafe * (0.1) * 2);
            } else {
            }
            if (yas <= 12) {
                indirimOrani = 0.5;
                System.out.println("%50 indirim uygulandı");
                indirim = tutar * indirimOrani;
                indirimliTutar = tutar - indirim;
            } else if (12 < yas && yas < 24) {
                indirimOrani = 0.1;
                System.out.println("%10 indirim uygulandı");
                indirim = tutar * indirimOrani;
                indirimliTutar = indirimliTutar - indirim;
            } else if (65 < yas) {
                indirimOrani = 0.3;
                System.out.println("%30 indirim uygulandı");
                indirim = tutar * indirimOrani;
                indirimliTutar = tutar - indirim;
            }
            System.out.println("İndirimli Tutar : " + indirimliTutar);
        } else {
            System.out.println("Hatalı Giriş yaptınız");
        }
    }
}
