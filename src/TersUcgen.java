import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int a = 0;
        System.out.println("Basamak sayısını giriniz :");
        a = tara.nextInt();
        for (int i = 0; i < a; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * (a-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
