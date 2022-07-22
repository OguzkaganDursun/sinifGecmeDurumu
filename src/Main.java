import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Geçme Notu : 55

        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */

        //Degiskenler tanimlandi.
        int mat, fizik, turkce, kimya, muzik;
        double ortalama;

        /*
        Kullanicidan ders notlari istendi.
        Girilen not for dongusu uzerinde 0'dan kucuk ya da 100'den buyukse degerlendirmeye alinmadi.
        Ders notlarinin ortalamasina gore sinif gecme, kalma durumu hakkinda bilgi verildi.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------" + "\nSinif Gecme Durumu "
                + "\n-------------------------------");
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = scan.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = scan.nextInt();

        System.out.print("Turkce Notunuzu Giriniz : ");
        turkce = scan.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = scan.nextInt();

        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik = scan.nextInt();

        int[] notlar = {mat,fizik,turkce,kimya,muzik};
        double toplam = 0, sayac = 0;
        for(int i =0; i < notlar.length; i++)
            if (!((notlar[i]<0)||(notlar[i]>100)))
            {
                sayac++;
                toplam = notlar[i]+toplam;
            }
        ortalama = toplam/sayac;

        if (ortalama < 55 && ortalama >= 0)
        {
            System.out.println("-------------------------------");
            System.out.println("Ortalamaniz 55'in Altinda Oldugu Icin Sinifi Gecemediniz! \nOrtalama :" + ortalama);
        }
        else if (ortalama >= 55 && ortalama <= 100)
        {
            System.out.println("-------------------------------");
            System.out.println("Tekrikler! Sinifi Gectiniz. \nOrtalamaniz : " + ortalama);
        }
        else
        {
            System.out.println("-------------------------------");
            System.out.println("Notlarinizi Hatali Girmis Olabilirsiniz. \nLutfen Kontrol Ederek Tekrar Deneyiniz!");
        }
    }
}
