package aggregation01;

public class AggregationTest {
    public static void main(String[] args) {
        Address address = new Address("street1", "ankara");
        AggregateEmployee aggregateEmployee = new AggregateEmployee(1, "bilgeadam", address);

      // aggregateEmployee = null;
        System.out.println(address);
        System.out.println(aggregateEmployee);
    }
}
