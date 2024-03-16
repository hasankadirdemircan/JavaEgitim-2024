package generics_example05;

public class GenericsExample06 {
    public static void main(String[] args) {
       // GenericClass2<String> obj = new GenericClass2<>(); ERROR
        GenericClass2<Integer> obj2 = new GenericClass2<>();
        GenericClass2<Double> obj3 = new GenericClass2<>();
        GenericClass2<Long> obj4 = new GenericClass2<>();
        GenericClass2<Float> obj5 = new GenericClass2<>();
       // GenericClass2<Boolean> obj6 = new GenericClass2<>(); ERROR
    }
}
