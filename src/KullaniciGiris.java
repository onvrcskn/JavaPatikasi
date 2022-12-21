import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, n1;

        Scanner tara = new Scanner(System.in);
        System.out.println("Kullanıcı adını giriniz : ");
        kullaniciAdi = tara.nextLine();
        System.out.println("Şifre giriniz : ");
        sifre = tara.nextLine();

        if (kullaniciAdi.equals("onur") && sifre.equals("123")) {
            System.out.println("Kullanıcı Girişi Başarılı ");
        } else {
            System.out.println("Hatalı Şifre!! \n Şifre sıfırlamak istemisiniz? \n Evet ise 1 \n Hayır ise 2 yazınız");
            if (tara.nextInt() == 1) {
                System.out.println("Yeni bir şifre giriniz : ");
                tara.nextLine();
                n1 = tara.nextLine();
                if (n1.equals("123")) {
                    System.out.println("Şifreniz eski şifreniz ile aynı olamaz");
                } else {
                    System.out.println("Şifreniz başarıyla yenilendi");
                }
            } else {
            }
        }
    }
}
