package abstraction_examples.abstraction_example02;

public class Daire extends Sekil {

    private double yaricap;
    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI * Math.pow(yaricap, 2); // Math.pow yerine -> yaricap * yaricap ' da yazılabilir.
    }
}
