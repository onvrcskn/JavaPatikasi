import java.util.Scanner;

public class UsHesabiRecursive {
    static int UsBulma(int taban, int us) {

        if (us>0) {
            return taban*UsBulma(taban,us-1);
        }
        else return 1;
    }
    public static void main(String[] args) {
        int taban=0,us = 0,sonuc;
        System.out.println("Taban değeri : ");
        Scanner tara = new Scanner(System.in);
        taban=tara.nextInt();
        System.out.println("Üs değeri : ");
        us=tara.nextInt();

        System.out.println( UsBulma(taban,us));
    }


}
