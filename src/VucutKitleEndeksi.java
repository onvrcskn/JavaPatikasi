import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args){
double boy,kilo,kitleEndeksi;
        Scanner tara= new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu (metre cinsinden) giriniz : ");
        boy=tara.nextDouble();
        System.out.println("Lütfen Kilonuzu (kg cinsinden) giriniz : ");
        kilo= tara.nextDouble();
        kitleEndeksi=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : "+kitleEndeksi);
    }
}
