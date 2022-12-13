import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutfiyat = 2.14,
                elmafiyat = 3.67,
                domatesfiyat = 1.11,
                muzfiyat = 0.95,
                patlicanfiyat = 5.00;

        double armut, elma, domates, muz, patlican;

        System.out.print("Armut kaç kg : ");
        armut = input.nextDouble();
        System.out.print("Elma kaç kg : ");
        elma = input.nextDouble();
        System.out.print("Domates kaç kg : ");
        domates = input.nextDouble();
        System.out.print("Muz kaç kg : ");
        muz = input.nextDouble();
        System.out.print("Patlıcan kaç kg : ");
        patlican = input.nextDouble();
        System.out.println("Toplam Tutar : " + (armut * armutfiyat + elma * elmafiyat + domates * domatesfiyat + muz * muzfiyat + patlican * patlicanfiyat) + " TL");


    }
}
