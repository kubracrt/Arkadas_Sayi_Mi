import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi1=new Scanner(System.in);
        Scanner girdi2=new Scanner(System.in);
        System.out.println("Arkadaş sayımı kontrol etmek istediğiniz 1.sayiyi giriniz:");
        int sayi1=girdi1.nextInt();
        System.out.println("Arkadaş sayımı kontrol etmek istediğiniz 2.sayiyi giriniz:");
        int sayi2=girdi2.nextInt();
        int toplam1=0;
        int toplam2=0;

        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                toplam1=toplam1+i;
            }
        }

        for(int i=1;i<sayi2;i++){
            if(sayi2%i==0){
                toplam2=toplam2+i;
            }
        }

        if(toplam1==sayi2 && toplam2==sayi1){
            System.out.println("Girdiğiniz sayılar arkadaş sayıdır");
        }
        else{
            System.out.println("Girdiğiniz sayılar arkadaş sayı değildir");
        }



    }
}