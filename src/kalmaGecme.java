import java.util.Scanner;
//Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
//
//Geçme Notu : 55
//
//Ödev
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
public class kalmaGecme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notu: ");int matematik=input.nextInt();
        System.out.print("Fizik notu: ");int fizik=input.nextInt();
        System.out.print("Türkçe notu: ");int turkce=input.nextInt();
        System.out.print("Kimya notu: ");int kimya=input.nextInt();
        System.out.print("Müzik notu: ");int muzik=input.nextInt();

        double ortalama=(matematik+fizik+turkce+kimya+muzik)/5;
        if (ortalama>=55 && ortalama<=100){
            System.out.println("Tebrikler Geçtiniz..!\nOrtalaman: "+ortalama);
        }
        else if (ortalama>0 && ortalama<55) {
            System.out.println("Sınıfta Kaldınız!!!\nOrtalaman: "+ortalama);
        }
        else {
            System.out.println("Notları girerken hata yaptınız...");
        }


    }
}
