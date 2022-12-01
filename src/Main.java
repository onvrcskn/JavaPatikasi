import java.io.Console;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       /* System.out.println("Merhaba DÜnya");
       // Console.writeln("konsol");
        char karakter= 'A';
        System.out.println(karakter+0);

        int a=-12;
        a%=-5;
        System.out.println(a);
        String b;
        int c=6;
        b=(c==4)? "1":"yanlış";
        System.out.println(b);
        int a;
        Scanner tara = new Scanner(System.in);
        a=tara.nextInt();

        System.out.println("sayı : "+a);*/

        int mat;
        int fizik;
        int kimya;
        Scanner tara= new Scanner(System.in);
        System.out.println("Matematik Notunu giriniz : ");
        mat =tara.nextInt();
        String durum;
        durum=(mat>60)?"Geçti":"Kaldı";
        System.out.println("Matematik Notu : "+mat+" "+durum);

    }
}