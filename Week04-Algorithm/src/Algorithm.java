import java.util.Random;
import java.util.Scanner;
// kullanıcıdan tahmini bir sayı isteyiniz 1 ile 100 arasında 1 ve 100 dahil. bunu da bir methodda yapınız.
//Yani methodumuz kullnıcıdan sayı alsın ve geri dönsün main methoduna.
//başka bir methodda 1 ile 100 arasında tek tek random sayı üretiniz,(1 ve 100 dahil.) eğer ilk denemede kullanıcının verdiği değer
//üretilirse, kullanıcı 100M dolar kazanır, eğer  1<x<=30 arasında 5M dolar kazansın, 30 ile 50(dahil) arasında 1M dolar,
//50. denemeden daha sonra ise üzgünüm hiç bişey kazanamadınız mesajı versin. (void method olsun)
public class Algorithm {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();

        int userGuessNumber = algorithm.getUserGuessNumber();
        int sayac = algorithm.matchNumberWithUserGuessNumber(userGuessNumber);
        algorithm.calculateMoneyForWinner(sayac);
    }

    public int getUserGuessNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("1 ve 100 arasında bir sayı giriniz: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 100);
        return number;
    }

    public int matchNumberWithUserGuessNumber(int userGuessNumber) {
        Random random = new Random();
        int randomNumberForUser;
        int sayac = 0;
        while(true) {
            randomNumberForUser = random.nextInt(100) + 1;
            sayac++;
            if(randomNumberForUser == userGuessNumber) {
                return sayac;
            }
        }
    }

    public void calculateMoneyForWinner(int sayac) {
        System.out.println(sayac + " . denemede bildiniz.");
        if(sayac == 1) {
            System.out.println("Tebrikler  100M dolar kazandınız..");
        }else if(sayac >1 && sayac <= 30) {
            System.out.println("Tebrikler  5M dolar kazandınız..");
        }else if(sayac > 30 && sayac <= 50) {
            System.out.println("Tebrikler  1M dolar kazandınız..");
        }else {
            System.out.println("Üzgünüm hiç bişey kazanamadınız.");
        }
    }
}
