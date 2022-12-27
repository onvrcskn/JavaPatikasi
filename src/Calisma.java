import java.util.Scanner;

public class Calisma {

    public static void main(String[] args) {
        int a = 0;
        int total = 0;
        do {
            System.out.println("Tek bir sayı giriniz");
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
        }
        while (a%2 == 0);

        System.out.println("Girilen Sayı : " + a);
        for (int i = 0; i <= a; i++) {
            if (i % 4 == 0 && a > i) {
                total += i;
            } else {
            }
        }
        System.out.println("Total : " + total);
    }
}
