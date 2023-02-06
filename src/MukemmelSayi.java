import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz :");
        Scanner tara = new Scanner(System.in);
        int sayi;
        sayi= tara.nextInt();
        int temp=0;

        for (int i=1; i<sayi;i++) {
            if (sayi % i == 0) {
                temp += i;
            }
        }
            if (temp==sayi){
                System.out.println(sayi+" Mükemmel Sayıdır");
            }
            else System.out.println(sayi+" Mükemmel Sayı değildir.");
    }
}
