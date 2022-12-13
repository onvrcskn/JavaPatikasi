import java.util.Scanner;
import java.math.*;

public class DaireninAlanVeCevreHesabi {
    public static void main(String[] args){
        Scanner cap = new Scanner(System.in);
        System.out.println("Dairenin Çapını Giriniz : ");
        double daireninCapi;
        daireninCapi=cap.nextDouble();
        System.out.println("Dairenin Çapı :" +daireninCapi);
        double alan= (Math.PI)*daireninCapi*daireninCapi;
        double cevre = (Math.PI)*2*daireninCapi;

        System.out.println("Dairenin Alanı : "+alan);
        System.out.println("Dairenin Çevresi : "+cevre);

    }
}
