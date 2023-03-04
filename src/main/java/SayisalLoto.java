import java.util.Scanner;

public class SayisalLoto {

    /* Sayısal Loto uygulaması
       bilet icin rastgele n tane sayı uretisin
       loto sonucu rastgele n tane sayı ile uretisin.
       sayısal lotoda tekrarlı sayılar olmamalı.

       n(hane sayısı), sayılar icin min ve max degerler kullanıcıdan alınsın.

       sonuc ve bilet karsılastırılsın , kac eslesme oldugu kullanıcıya bildirilsin.
     */
    public static <Random> void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Sayısal loto icin hane sayısı giriniz");
        int slots= input.nextInt();
        System.out.println("Sayılar icin min deger giriniz");
        int min= input.nextInt();
        System.out.println("Saylar icin max deger giriniz");
        int max= input.nextInt();

        int[] lotoArr=new int[slots];
        int[] ticketArr=new int[slots];


    }
}