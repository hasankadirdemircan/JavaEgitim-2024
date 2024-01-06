public class NoteCalculate {
    public static void main(String[] args) {
        double firstExamNote = 70;
        double secondExamNote = 80;

        double visa = firstExamNote * 0.4;
        double finalNote = secondExamNote * 0.6;

        double resultNote = visa + finalNote;
        if(resultNote < 45) {
            System.out.println("büte kaldınız");
        } else if (resultNote>=45 && resultNote <= 60) {
            System.out.println("notunuz : CC");
        }else if (resultNote > 60 && resultNote <= 70) {
            System.out.println("notunuz : BB");
        }else {
            System.out.println("notunuz : AA" );
        }


        if(resultNote > 90)
            System.out.println("tebrikler");
            System.out.println("geçtiniz");


        if(resultNote > 90) {
            System.out.println("tebrikler");
        }
        System.out.println("geçtiniz");

    }
}
