import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int divider) {
        // sayı ikiden küçükse asal değildir(0 ve 1)
        if (number < 2) {
            return false;
        }
        // bölen her seferinde 1 azalır ve bölecek bir şey bulamadıysa girilen sayı asaldır
        if (divider == 1) {
            return true;

        }

        // divider her seferinde bir azalır ve herhangi bir divider değerinde kalan 0 olursa sayı asaldıır.
        if (number % divider == 0) {
            return false;
        }

        // divider 1 olana veya sayının asal olmadığı hesaplanana kadar fonksiyon kendini çağırır( her seferinde divider 1 azalır)
        return isPrime(number, divider - 1);

    }

    public static void main(String[] args) {
        int number, divider;

        // kullanıcıdan number değeri alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();
        // döngü sayısını azaltmak için /2 kullanılır çünkü 2ye bölünen zaten asal değildir...
        divider = number / 2;

        // fonksiyondan dönen değer kontrol edilir ve çıktı veirlir.
        if (isPrime(number, divider)) {
            System.out.println(number + " Sayısı asaldır.");
        } else {
            System.out.println(number + " Sayısı asal değildir.");
        }

    }
}