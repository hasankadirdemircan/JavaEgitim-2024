package memory_model;

public class ImmutableExample02 {

    public static void main(String[] args) {
        String name1 = "bilgeadam";

        String name2 = "bilgeadam";

        if(name1 == name2) {
            System.out.println("aynı değer.");
        }else {
            System.out.println("aynı değer değildir");
        }
    }
}
