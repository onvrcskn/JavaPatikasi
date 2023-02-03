import java.util.Scanner;

public class CiftSayilariBulma
{
    public static void main(String[] args) {
        int sayi=0,toplam=0,sayac=0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        sayi=tara.nextInt();
        for (int i=1;i<=sayi;i++){
            if (i%3==0 && i%4==0){
                System.out.println("3 ve 4'e tam bölünen sayı : "+i);
                toplam = toplam+i;
                sayac++;
            }
        }
        System.out.println("Girilen sayıların toplamı ="+toplam);
        System.out.println("Girilen sayıların ortalaması ="+toplam/sayac);
    }
}
