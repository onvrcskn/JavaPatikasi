public class FibonacciSerisi {
    static int ilk = 1;
    static int onceki = 1;
    static int son;
    static int sonSayi = 852;

    public static void main(String[] args) {
        Fibo(sonSayi);
        // System.out.println(sonSayi);
    }

    static int Fibo(int n) {
        System.out.println(son);
        System.out.println(ilk);
        System.out.println(onceki);
        n = sonSayi;
        while (n > son) {
            if (son != 0) {
                System.out.println(son);
            }
            son = ilk + onceki;
            ilk = onceki;
            onceki = son;
        }
        return 1;
    }
}
