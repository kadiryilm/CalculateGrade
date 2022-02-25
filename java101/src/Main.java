import java.util.Scanner;

public class Main {public static void main(String[] args) {
    int Math, Fizik, Kimya, Turkce, Tarih, Muzik ;
    Scanner input = new Scanner(System.in);
    System.out.print("Lütfen Matematik dersi notunuzu giriniz.");
    Math = input.nextInt();
    System.out.print("Lütfen Fizik dersi notunuzu giriniz.");
    Fizik = input.nextInt();
    System.out.print("Lütfen Kimya dersi notunuzu giriniz.");
    Kimya = input.nextInt();
    System.out.print("Lütfen Türkçe dersi notunuzu giriniz.");
    Turkce = input.nextInt();
    System.out.print("Lütfen Tarih dersi notunuzu giriniz.");
    Tarih = input.nextInt();
    System.out.print("Lütfen Müzik dersi notunuzu giriniz.");
    Muzik = input.nextInt();
    double sonuc = ((Math+Fizik+Kimya+Turkce+Tarih+Muzik)/6);
    System.out.println("Not ortalaması = " + sonuc);
    System.out.println(sonuc > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");



}

}