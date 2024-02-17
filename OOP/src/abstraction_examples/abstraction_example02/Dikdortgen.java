package abstraction_examples.abstraction_example02;

public class Dikdortgen extends Sekil{
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }
}
