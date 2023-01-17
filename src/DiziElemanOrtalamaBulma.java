public class DiziElemanOrtalamaBulma {
    public static void main(String[] args) {
        double topla = 0;
        double harmonic = 0;
        int say = 0;
        double[] dizi = {1, 2, 3, 4, 5,8,85};
        for (double i : dizi) {
            topla += i;
            harmonic += 1 / i;
            say++;
        }
        System.out.println("Elemanların Toplamı : "+topla);
        System.out.println("Elemanların Aritmetik Ortalaması : " + topla / say);
        System.out.println("Elemanların Harmonik Serisi : " + harmonic);
        System.out.println("Elemanların Harmonik Ortalaması : " + say / harmonic);
    }


}
