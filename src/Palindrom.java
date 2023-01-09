import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Sayı Giriniz : ");
        Scanner tara = new Scanner(System.in);
        int tersi=tara.nextInt();
        recursiveMethod(tersi);
    }

    public static int recursiveMethod(int num) {
        int temp = num, reverse = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverse = (reverse * 10) + lastNumber;
            temp=temp/10;
        }
        System.out.println("Girilen Sayının Tersi : "+reverse);

        if(num==reverse){
            System.out.println("Girilen sayı Palindrom");
        }
        else {
            System.out.println("Girilen sayı Palindrom değil!!");
        }
        return temp;
    }
}
