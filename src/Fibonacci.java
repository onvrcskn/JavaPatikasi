import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int sayi = 0;
        int temp1 = 0, temp2 = 1, temp3 = 0, temp4 = 0;
        System.out.println("Fibonacci Serisi için eleman sayısını giriniz : " + sayi);
        Scanner tara = new Scanner(System.in);
        sayi = tara.nextInt();
        for (int i = 0; i <= (sayi / 2 - 1); i++) {
            if (temp1 == 0) {
                System.out.print(temp1 + " " + temp2 + " ");
            }
            temp3 = temp1 + temp2;
            temp4 = temp2 + temp3;
            temp1 = temp3;
            temp2 = temp4;
            System.out.print(temp3 + " " + temp4 + " ");

        }
    }
}
