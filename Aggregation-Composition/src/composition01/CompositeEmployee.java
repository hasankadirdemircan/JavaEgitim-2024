package composition01;

import aggregation01.Address;

public class CompositeEmployee {
    private final int id;
    private final String name;
    private final Address address; //burada Address classındaki street ve city böyle eklenmiş oldu.

    public CompositeEmployee(int id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(street, city);
    }

    @Override
    public String toString() {
        return "CompositeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    private static class Address {
        private final String street;
        private final String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
