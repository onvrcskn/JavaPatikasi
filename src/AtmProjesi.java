import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;

        while (right > 0) {
            System.out.println("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.println("Parolanız : ");
            password = input.nextLine();

            while (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Para miktarı : ");
                        price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                }
            } if (userName.equals("patika") && password.equals("dev123"))
            {
            }
            else { right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
