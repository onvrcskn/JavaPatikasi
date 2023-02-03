import java.util.Scanner;

public class KombinasyonFormulu {
    public static void main(String[] args) {
        int n = 0, r = 0, nFaktoriyel = 1, rFaktoriyel = 1, nrFaktoriyel = 1;
        Scanner tara = new Scanner(System.in);
        System.out.println("n değeri için sayı giriniz : ");
        n = tara.nextInt();
        System.out.println("r değeri için sayı giriniz : ");
        r = tara.nextInt();

        for (int i = 1; i <= n; i++) {
            nFaktoriyel = nFaktoriyel * i;
        }
        for (int i = 1; i <= r; i++) {
            rFaktoriyel = rFaktoriyel * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nrFaktoriyel = nrFaktoriyel * i;
        }
        System.out.println("C(n,r)=" + "C(" + n + "," + r + ")=" + (nFaktoriyel / (rFaktoriyel * nrFaktoriyel)));
    }
}
