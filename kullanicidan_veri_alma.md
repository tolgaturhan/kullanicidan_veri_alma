# Kullanıcıdan Veri Alma
Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır. Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil etmemiz gerekir. Bunun için import deyimi kullanılır ;

* import java.util.Scanner;

İmport deyimi projenin en başına yazılır.
Kullanıcıdan verileri almak için değişkenlere ihtiyacımız vardır.
İlk önce "a" adında veri tipi integer olan bir değişken oluşturalım.
Oluşturduğumuz "a" değişkenine veriyi kullanıcıdan almak için yapmamız gereken Scanner sınıfını kullanmak. Scanner sınıfından türeyen adı "input" olan bir nesne tanımlayalım. Sınıf ve Nesne kavramları ilerleyen derslerde detaylıca anlatılacaktır. Scanner sınıfından nesne ürettikten sonra değişkenimize veri almak için, değişkenimizin türüne göre bir kod yazmamız gerekecektir. Eğer değişkenimizin "integer" türünde ise "input.nextInt()" veya double türünde ise "input.nextDouble()" kod bloğu kullanılmalıdır.


    import java.util.Scanner;

    public class JavaPatika {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a,b;

            System.out.println("A sayısını giriniz : ");
            a = input.nextInt();

            System.out.println("B sayısını giriniz : ");
            b = input.nextInt();

            System.out.println("A Sayısı : " + a);
            System.out.println("B Sayısı : " + b);
        }
    }


# Veri Tiplerine Göre Scanner Metotları

![img.png](img.png)

    import java.util.Scanner;
    
    public class JavaPatika {public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
            // String ÖrneğiString adSoyad = inp.nextLine();
            
            // Sayı Örnekleriint yas = inp.nextInt();
            double maas = inp.nextDouble();
            
            // Çıktılar
            System.out.println("Ad Soyad: " + adSoyad);
            System.out.println("Yaş : " + yas);
            System.out.println("Maaş : " + maas);
        }
    }