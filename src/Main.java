import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner (System.in);

        System.out.print("Lütfen Sayı Giriniz: ");
        a = input.nextInt();
        System.out.println(a);

        System.out.print("Lütfen Sayı Giriniz: ");
        int b = input.nextInt(); // Buda farklı bir kullanım değer oluşturup bu değere girdi isteyebiliriz
        System.out.println(b);


    }
}
