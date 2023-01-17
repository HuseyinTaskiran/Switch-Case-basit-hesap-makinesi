import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select,sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin : ");
        n1=input.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        n2=input.nextInt();

        System.out.println("Hangi işlemi yapmak istiyorsun ? ");
        System.out.println("1 = Toplama \n2 = Çıkarma \n3 = Çarpma \n4 = Bölme");
        select=input.nextInt();

        switch (select){
            case 1:
                sonuc=n1+n2;
                System.out.println("Sonuç = " + sonuc);
                break;
            case 2:
                sonuc=n1-n2;
                System.out.println("Sonuç = " + sonuc);
                break;
            case 3:
                sonuc=n1*n2;
                System.out.println("Sonuç = " + sonuc);
                break;
            case 4:
                sonuc=n1/n2;
                System.out.println("Sonuç = " + sonuc);
                break;

        }



    }
}

