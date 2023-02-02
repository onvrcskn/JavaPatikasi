import java.util.Scanner;

public class GirilenSayiyiSiralama {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        int sayi3;
        System.out.println(" 3 tane sayı giriniz");
        Scanner tara = new Scanner(System.in);
        System.out.println("1. sayı : ");
        sayi1 = tara.nextInt();
        System.out.println("2. sayı : ");
        sayi2 = tara.nextInt();
        System.out.println("3. sayı : ");
        sayi3 = tara.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            System.out.println("En küçük sayi : " + sayi1);
            if (sayi2 < sayi3) {
                System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3);
            }
            else System.out.println(sayi1 + ", " + sayi3 + ", " + sayi2);
        }
        if (sayi2 < sayi1 && sayi2 < sayi3) {
            System.out.println("En küçük sayi : " + sayi2);
            if (sayi1 < sayi3) {
                System.out.println(sayi2 + ", " + sayi1 + ", " + sayi3);
            }
            else System.out.println(sayi2 + ", " + sayi3 + ", " + sayi1);
        }
        if (sayi3 < sayi2 && sayi3 < sayi1) {
            System.out.println("En küçük sayi : " + sayi3);
            if (sayi2 < sayi1) {
                System.out.println(sayi3 + ", " + sayi2 + ", " + sayi1);
            }
            else System.out.println(sayi3 + ", " + sayi1 + ", " + sayi2);
        }

    }
}
