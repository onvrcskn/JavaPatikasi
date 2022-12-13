package PACKAGE_NAME;

import java.util.Scanner;

public class KDVHesap {
    public KDVHesap() {
    }

    public static void main(String[] args) {
        double kdvOran1 = 0.18;
        double kdvOran2 = 0.08;
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen Tutarı Giriniz : ");
        double tutar = tara.nextDouble();
        double kdvliTutar;
        if (tutar>1000){
            System.out.println("KDV Oranı : " +kdvOran2);
        }
        else {
            System.out.println("KDV Oranı : " +kdvOran1);
        }
        kdvliTutar=(tutar>1000)?(tutar * kdvOran2):(tutar * kdvOran1);
        System.out.println("Tutar : " + tutar);

        System.out.println("KDV tutarı : " + kdvliTutar);
        System.out.println("Sana Oluru Bu : " + (tutar + kdvliTutar));
    }
}
