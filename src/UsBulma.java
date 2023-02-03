import java.util.Scanner ;

public class UsBulma {
    public static void main(String[] args) {
        int n,k,sayi=1;
        Scanner kuvvet = new Scanner(System.in);
        System.out.print("taban degerini girin: ");
        k = kuvvet.nextInt();
        System.out.print("üs degerini giriniz: ");
        n = kuvvet.nextInt();

        for (int i=1 ; i<=n ; i++) {
            sayi *=k;
        }
        System.out.print("sonuç= " +sayi );
    }
}
