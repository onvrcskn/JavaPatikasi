import java.util.Arrays;
import java.util.Scanner;

public class DizininMaksElemaniBulma {

    public static void main(String[] args) {

 /*       int[] dizi = {3,345,67,8,67,67,-6,546,465,43,56,435,110,120};
        int max =dizi[0];
        for(int j=0; j<dizi.length;j++) {
            if (max < dizi[j]) {
                max = dizi[j];
            }
        }
        Arrays.sort(dizi);
        Scanner tara= new Scanner(System.in);
        int giris=tara.nextInt();
        int enbuyukKucuk=dizi[0];

        for (int i=0;i<dizi.length;i++){
            if (giris>dizi[i]  ){
                enbuyukKucuk=dizi[i];
            }
        }
        System.out.println("Girilen sayıya en yakın küçük sayı : "+enbuyukKucuk);
        System.out.println("Dizinin Maksimum Elemanı : "+max);*/
        String[] str = {"Onur COŞKUN", "Ceren COŞKUN", "Aden COŞKUN","Onur Karan COŞKUN"};
        String ara="Onur";
        int j=0;
        for(String i:str){
            if (i.contains(ara)){
                System.out.println(ara+" İçeren dizi elemanları : "+i);
                j++;
            }
        }
        if(j==0) System.out.println("Aranan eleman bulunamadı!");

    }
}
