package diamond_problem.diamond_problem02;

public class DiamondProblem02 extends BaseClass implements BaseInterface {
    public static void main(String[] args) {
        DiamondProblem02 diamondProblem02 = new DiamondProblem02();
        diamondProblem02.message();
        //ekrana/console'a BaseClass message.. yazar
        //çünkü class win kuralı vardır.
        //Yani aynı isimde 1'den fazla method varsa class'da bulunan method tercih edilir.
        //burdaki durumda extends Class implements Interface yapısı olduğunu unutmayalım.
        //ClassWin kuralı geçerlidir.
    }
}
