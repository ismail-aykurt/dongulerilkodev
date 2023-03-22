import java.util.Scanner;

public class donguler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,toplam=0;
        int a=0;
        System.out.print("sayıyı giriniz:");
        sayi=input.nextInt();
        for(int i=0; i<=sayi;i++) {

            if(i%3==0 && i%4==0) {
                a=a+1;
                toplam+=i;
            }

        }
        System.out.println("Giirlen sayıların toplamı="+toplam+"\n3 e ve 4 de bölünen toplam sayı="+a+"\nsayıların ortlaması="+toplam/a);
    }
}
