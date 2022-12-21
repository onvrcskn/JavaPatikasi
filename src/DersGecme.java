import java.util.Scanner;

public class DersGecme {
    public static void main(String[] args) {
        int mat, fiz, kim, turk, muzik;
        int total = 0;
        int dersSayisi=0;
        System.out.println("Matematik Notunu Giriniz : ");
        Scanner tara = new Scanner(System.in);
        mat = tara.nextInt();
        if (0 < mat && mat < 100) {
            total = +mat;
            dersSayisi++;
        }
        System.out.println("Fizik Notunu Giriniz : ");
        fiz = tara.nextInt();
        if (0 < fiz && fiz < 100) {
            total = total+fiz;
            dersSayisi++;
        }
        System.out.println("Kimya Notunu Giriniz : ");
        kim = tara.nextInt();
        if (0 < kim && kim < 100) {
            total = total+kim;
            dersSayisi++;
        }
        System.out.println("Türkçe Notunu Giriniz : ");
        turk = tara.nextInt();
        if (0 < turk && turk < 100) {
            total = total+turk;
            dersSayisi++;
        }
        System.out.println("Müzik Notunu Giriniz : ");
        muzik = tara.nextInt();
        if (0 < muzik && muzik < 100) {
            total = total+muzik;
            dersSayisi++;
        }
        System.out.println("Ortalama : "+total/dersSayisi);
    }
}
