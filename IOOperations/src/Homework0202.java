import java.io.*;
import java.util.Scanner;

public class Homework0202 {
    public static void main(String[] args) {
        String fileName="homework02.txt";
        int sayi=0,toplam=0,ortalama=0,okunanDeger=0,n=2,sayac=0;
        try(FileWriter fileWriter2 = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2)) {
            Scanner scanner = new Scanner(System.in);
            for (int i=1;i<=n;i++)
            {
                System.out.println(i+".Sayı giriniz: ");
                sayi=scanner.nextInt();
                bufferedWriter.write(sayi + "\n");
            }
           }
        catch(IOException ioException)
        {
            System.out.println("hata"+ioException.getMessage());
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)))
        {
            String data = null;
            while((data=bufferedReader.readLine())!=null) //String değer -1 olamaz o yüzden null ile kontrol ediyoruz ve okuyoruz.
            {
                //  int okunanDeger=Integer.parseInt(data);
                //  toplam=toplam+okunanDeger;
              //  Integer.parseInt(data);//String ifadeyi int ifadeye çevirdim. Anladığım kadarıyla yazdırınca artık string oluyor ifadeler
                sayac++; //sayac=sayac+1
                toplam=toplam+Integer.parseInt(data);
                ortalama=toplam/sayac;
            }
            System.out.println("Toplam: "+toplam);
            System.out.println("Ortalama: "+ortalama);

        }
        catch(IOException fileNotFoundException)
        {
            System.out.println("hata:" + fileNotFoundException);
        }

    }
}
