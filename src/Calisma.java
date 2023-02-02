import java.util.Scanner;

public class Calisma extends AtaSinif {
    int a;
    int b;

    public static void main(String[] args) {
        Calisma();
    }

    public void Calisma(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Alan : " + (this.a * this.b));
    }

    public void Calisma(int a) {
        this.a = a;
        System.out.println("Kenar Uzunluğu : " + this.a);
    }

    public static void Calisma() {
        int a = 0;
        int total = 0;
        do {
            System.out.println("Tek bir sayı giriniz");
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
        }
        while (a % 2 == 0);

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
