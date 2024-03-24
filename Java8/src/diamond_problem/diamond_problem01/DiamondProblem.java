package diamond_problem.diamond_problem01;

public class DiamondProblem implements MyInterface1, MyInterface2 {

    @Override
    public void defaultMethod() {
        System.out.println("DiamondProblem defaultMethod");
        //2 interfacede de aynı isimde default method vardır.
        //biz bu 2 interface'i implement ettiğimizde, compiler hatası verir.
        //mutlaka default methodu da override etmemiz gerekir.
    }

    @Override
    public void test() {

    }
}
