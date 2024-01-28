package garbage_collector;

public class GarbageCollectorExample03 {
    public static void main(String[] args) {
        new Employee(); // hiç bir atama olmadığı için garbage collector tarafından silinecek
    }
}
