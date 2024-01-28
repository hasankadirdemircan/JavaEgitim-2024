package memory_model;

public class ImmutableExample03 {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {1,2,3};

        if(a == b) {
            System.out.println("aynı adresi referans ediyor");
        }else{
            System.out.println("aynı adresi referans etmiyor!");
        }
    }
}
