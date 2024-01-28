package garbage_collector;

public class GarbageCollectorExample01 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "bilgeadam";

        System.out.println("name : " + employee.name);
        employee = null;

       /* System.out.println("name : " + employee.name);*/ // NullPointer
        //employee.name = "bilgeadam2";  //NullPointer
        employee = new Employee();
        employee.name = "bilgeadam2";
        System.out.println("name : " + employee.name);
    }
}
