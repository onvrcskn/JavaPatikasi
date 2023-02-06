import java.util.Scanner;

public class EBOBveEKOK {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("İlk sayıyı girin: ");
        int n1 = tara.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        int n2 = tara.nextInt();
        int a = n1;
        int b = n2;
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        int ebob = n1;
        int ekok = a * b / ebob;
        System.out.println("EBOB (" + a + "," + b + ")= " + ebob);
        System.out.println("EKOK (" + a + "," + b + ")= " + ekok);
    }
}
