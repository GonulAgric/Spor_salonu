import java.util.Locale;
import java.util.Scanner;

public class SporSalonuTekrar {


    /*
    Proje : spor kursu için secilecek öğrencileri belirleyen
    bir uygulama yazınız.

    kurs gereklilikleri :
                          erkekler : boy : 1,60 ve üstü
                                     kilo : 70 -90 kg
                          kızlar  : boy : 1,50 ve üstü
                                    kilo : 50 -70 kg

     kullanıcıdan ögrenci sayısı ve her bır ögrencı ıcın
     isim,cinsiyet,kilo ve boy bilgilerini girmesini isteyınız.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ogrenci sayısını giriniz");
        int ogrenciSayisi = scan.nextInt();

        String[] student = new String[ogrenciSayisi];
        String[] cinsiyet = new String[ogrenciSayisi];
        double[] boy = new double[ogrenciSayisi];
        double[] kilo = new double[ogrenciSayisi];
        boolean basarili = true;

        do {
            for (int i = 0; i < ogrenciSayisi; i++) {
                System.out.println("isim: ");
                student[i] = scan.next();
                System.out.println("cinsiyet: ");
                String cins = scan.next().toUpperCase().substring(0, 1);
                if (cins.equals("K") || cins.equals("E")) {
                    cinsiyet[i] = cins;
                } else {
                    System.out.println("hatalı giris yaptınız");
                    basarili = false;
                    break;
                }
                System.out.println("boy: ");
                boy[i] = scan.nextDouble();
                System.out.println("kilo: ");
                kilo[i] = scan.nextDouble();
            }

        } while (!basarili);

        System.out.println("*****kursa secilenler");
        int counter = 0;


            for (int i = 0; i < ogrenciSayisi; i++) {
                if (cinsiyet[i].equals("E") && boy[i] >= 1.60 && kilo[i] >= 70 && kilo[i] <= 90) {
                    System.out.println("isim: " + student[i] + "cinsiyet: " + cinsiyet[i] + "boy: " + boy[i] + "kilo: " + kilo[i]);

                } else if (cinsiyet[i].equals("K") && boy[i] >= 1.55 && kilo[i] >= 50 && kilo[i] <= 70) {
                    System.out.println("isim: " + student[i] + "cinsiyet: " + cinsiyet[i] + "boy: " + boy[i] + "kilo: " + kilo[i]);
                    counter++;
                }
            }
                if (counter == 0) {
                    System.out.println("malesef kursa secilemediniz");
                }
            }

    }
