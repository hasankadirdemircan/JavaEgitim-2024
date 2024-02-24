package enum_example03;

public enum EmployeeType {
    FULL_TIME(1), PART_TIME(2), PROJECT_BASE(3);

    private int key;
    EmployeeType(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
