import java.util.Scanner;
import java.math.*;

public class UcgenAlanHesabi
{
    public static void main(String[] args){
        double a,b,c;
        Scanner kenar = new Scanner(System.in);
        System.out.println("Üçgenin Kenarlarını Sırayla Giriniz : ");
        System.out.println("Birinci Kenar : ");
        a=kenar.nextDouble();
        System.out.println("İkinci Kenar : ");
        b=kenar.nextDouble();
        System.out.println("Üçüncü Kenar : ");
        c=kenar.nextDouble();
        System.out.println("a = "+a+"b = "+b+"c = "+c);
        double cevre=a+b+c;
        double u=cevre/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı = "+alan);
    }
}
