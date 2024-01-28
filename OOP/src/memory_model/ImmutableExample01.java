package memory_model;

public class ImmutableExample01 {
    public static void main(String[] args) {

        // Java Memory Immutable
        String x = "Java ";
        System.out.println("ilk hali " + x);
        x =  x.concat("Rules"); //x + "Rules";
        System.out.println("son hali : " + x);
        x = x.toUpperCase();
        System.out.println(x);

        System.out.println();
    }
}
