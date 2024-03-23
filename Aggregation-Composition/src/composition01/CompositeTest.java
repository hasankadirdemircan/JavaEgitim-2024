package composition01;

public class CompositeTest {
    public static void main(String[] args) {
        CompositeEmployee compositeEmployee = new CompositeEmployee(1, "bilgeadam", "street1", "city 1");
        compositeEmployee = null;
        System.out.println(compositeEmployee);
    }
}
