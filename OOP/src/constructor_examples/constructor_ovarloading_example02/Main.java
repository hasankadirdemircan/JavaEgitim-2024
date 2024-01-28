package constructor_examples.constructor_ovarloading_example02;

class Main {

    String language;

    // constructor with no parameter
    Main() {
        this.language = "Java";
    }

    // constructor with a single parameter
    Main(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Language: " + this.language);
    }

    public static void main(String[] args) {

        // call constructor with no parameter
        Main obj1 = new Main();

        // call constructor with a single parameter
        Main obj2 = new Main("Python");

        obj1.getName();
        obj2.getName();
    }
}
