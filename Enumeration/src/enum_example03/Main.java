package enum_example03;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.comparison(2);
    }

    public void comparison(int value) {
        for (EmployeeType employeeType : EmployeeType.values()) {
            if(employeeType.getKey() == value) {
                System.out.println("Gelen değer : " + value + " olan kişinin çalışma şekli : " + employeeType.name());
            }
        }
    }
}
