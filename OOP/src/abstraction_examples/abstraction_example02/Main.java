package abstraction_examples.abstraction_example02;

public class Main {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(3, 5);
        double dikdortgenAlan = dikdortgen.alanHesapla();
        System.out.println("dikdörtgen alanı : " + dikdortgenAlan);
        dikdortgen.yazdir();

        Daire daire = new Daire(4);
        double daireAlan = daire.alanHesapla();
        System.out.println("daire alanı : " + daireAlan);
        daire.yazdir();
    }
}
