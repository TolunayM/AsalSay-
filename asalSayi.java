import java.util.ArrayList;
import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {
        System.out.println("Kaça kadar olan asal sayıları listemek istiyorsun ?");
        Scanner input = new Scanner(System.in);
        int giris = input.nextInt();
        int durum = 0;
        for (int i = 2; i <= giris; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    durum = 1;
                }
            }

            if (durum == 0) {
                ArrayList<Integer> asal = new ArrayList<Integer>();
                asal.add(i);
                System.out.println(asal);
            } else {
                durum = 0;
            }

        }
    }
}


