import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k;
        int sayac =0;

        Scanner inp = new Scanner(System.in);


        do
        {   System.out.println("Sayı Giriniz: ");
            k = inp.nextInt();
            if (k%2==0 && k%4==0)
            {
                sayac +=k;

            }


        }while(k>0 && k%2==0);
        System.out.println("Toplam"+sayac);

    }
}