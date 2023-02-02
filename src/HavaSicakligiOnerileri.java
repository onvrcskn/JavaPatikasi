import java.util.Scanner;

public class HavaSicakligiOnerileri {
    public static void main(String[] args) {
        System.out.println("Sicaklık Değerleri Aralığı Seçiniz \n 1- Sıcaklık 5 derecenin altında \n 2- Sıcaklık 5 ile 15 derece arasında \n Sıcaklık 15 ile 25 derece arasında \n Sıcaklık 25 derecenin üzerinde");
        Scanner tara = new Scanner(System.in);
        int sicaklikDegeri = tara.nextInt();
        switch (sicaklikDegeri) {
            case 1:
                System.out.println("Kayak Yap");
                break;
            case 2:
                System.out.println("Sinemaya Git");
                break;
            case 3:
                System.out.println("Parka Git");
                break;
            case 4:
                System.out.println("Yüzmeye Git");
                break;
        }
    }
}
