package garbage_collector;

public class GarbageCollectorExample02 {

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1=e2;//now the first object referred by e1 is available for garbage collection

    }
}
