import java.util.Scanner;

public class DortVBesinKuvvetleriniBulma {
    public static void main(String[] args) {
        int sayi = 0, kuvvet=0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        sayi = tara.nextInt();
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println("4 üzeri "+kuvvet +" ="+ i);
            kuvvet++;
        }
        kuvvet=0;
        for (int j = 1; j <= sayi; j *= 5) {
            System.out.println("5 üzeri "+kuvvet +" ="+ j);
            kuvvet++;
        }
    }
}
