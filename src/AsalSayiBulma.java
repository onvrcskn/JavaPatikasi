import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        int sayac = 0;
        /*System.out.println("bir sayı giriniz : ");
        Scanner tara = new Scanner(System.in);
        n = tara.nextInt();*/
        for (int n=1; n<200;n++) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 1) {
                System.out.print(n+" ");
            }
            sayac=0;
        }
    }
}
