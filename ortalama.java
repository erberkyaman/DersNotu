import java.util.Scanner;
public class DersNotu {
    public static void main(String[] args) {
        int matematik,turkce,fizik,kimya,muzik;
        int toplam = 0;
        int sayi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        matematik = input.nextInt();
        if (matematik > 0 && matematik <= 100)
        {
           toplam = toplam + matematik;
           sayi++ ;
        }
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();;
        if (turkce > 0 && turkce <= 100)
        {
            toplam = toplam + turkce;
            sayi++;

        }
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik > 0 && fizik <= 100)
        {
            toplam = toplam + fizik;
            sayi++;
        }
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya > 0 && kimya <= 100)
        {
            toplam = toplam + kimya;
            sayi++;
        }
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik > 0 && muzik <= 100)
        {
            toplam = toplam + muzik;
            sayi++;
        }
        if(sayi!=0){
            double ortalama = toplam / sayi;
            if (ortalama <= 55){
                System.out.print("Sınıfı Geçemediniz!");
            }else if (ortalama > 55){
                System.out.print("Sınıfı Geçtiniz!");
            }

            System.out.print("Ortalamanız: " + ortalama);
        } else if (sayi==0) {
            System.out.print("Ders Notlarınız 0 ile 100 arasında olmalıdır!");
        }


    }

}
