import java.util.Scanner;

public class algoritma {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sayi1,sayi2;
        int sayac=0;

        System.out.print("1. sayisi giriniz: ");
        sayi1=s.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        sayi2=s.nextInt();

        if (sayi1<sayi2){
            for (int i=sayi1; i<sayi2; i++){
                 sayac++;
            }
            System.out.println("Cikarma sonucu: "+(-sayac));
        }else {
            for (int i=sayi2; i<sayi1; i++){
                sayac++;
            }
            System.out.println("Cikarma sonucu: "+sayac);
        }
    }
}
