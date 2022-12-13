package PACKAGE_NAME;

import java.util.Scanner;

public class KDVHesap {
    public KDVHesap() {
    }

    public static void main(String[] args) {
        double kdvOran = 0.18;
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen Tutarı Giriniz : ");
        double tutar = tara.nextDouble();
        double kdvliTutar = tutar * kdvOran;
        System.out.println("Tutar : " + tutar);
        System.out.println("KDV tutarı : " + kdvliTutar);
        System.out.println("KDV'li Tutar : " + (tutar + kdvliTutar));
    }
}
