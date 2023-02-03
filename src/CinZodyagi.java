import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int tarih=0,sonuc=0;
        Scanner tara = new Scanner(System.in);
        System.out.println("Doğum Yılını Giriniz : ");
        tarih=tara.nextInt();
        sonuc= tarih%12;
        switch (sonuc){
            case 0:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 1:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 2:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 3:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 4:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 5:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 6:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 7:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 8:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 9:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 10:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
            case 11:
                System.out.println("Çin Zodyağına Göre Burç : Maymun ("+sonuc+")");
                break;
        }
    }
}
