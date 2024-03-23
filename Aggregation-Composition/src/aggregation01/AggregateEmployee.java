package aggregation01;

public class AggregateEmployee {
    private final int id;
    private final String name;
    private final Address address; //burada Address classındaki street ve city böyle eklenmiş oldu.

    public AggregateEmployee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
