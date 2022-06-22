import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, secim, sonuc;

        System.out.print("1.Sayiyi giriniz : ");
        sayi1 = scan.nextInt();
        System.out.print("2.Sayiyi giriniz : ");
        sayi2 = scan.nextInt();
        System.out.println("Hangi islemi yaapmak istiyorsunuz ?");
        System.out.println("1-Toplama / 2-Cikarma / 3-Carpma / 4-Bolme");
        secim = scan.nextInt();

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Hatali secim yaptiniz.");
        }
    }
}
