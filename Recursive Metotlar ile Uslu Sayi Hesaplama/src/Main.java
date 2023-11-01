import java.util.Scanner;

public class Main {

    static int power(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {

            result *= n1;

        }
        return result;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int bos = 5;

        while (bos > 0) {


            int select;
            System.out.print("İşlem Yapmak İstiyorsanız '1'\nÇıkış Yapmak İstiyorsanız '0' tuşlayınız : ");
            select = inp.nextInt();

            if (select == 0) {
                System.out.println("Tekrar görüşmek üzere!");
                break;
            }

            System.out.print("Tabanı giriniz :");
            int n1 = inp.nextInt();

            System.out.print("Üssü giriniz");
            int n2 = inp.nextInt();

            System.out.println("Sonuç :" + power(n1, n2));
        }


    }
}