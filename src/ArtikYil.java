import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil=0, artik=0;
        Scanner tara= new Scanner(System.in);
        System.out.println("Hesaplanmasını istediğiniz yılı giriniz : ");
        yil=tara.nextInt();
        artik=yil%4;
        if (artik==0){
            System.out.println(yil+" bir artık yıldır !");
        }
        else System.out.println(yil+" bir artık yıl değildir !");


    }
}
