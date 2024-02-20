package interface_examples.interface_example02;

public class ProgrammingLanguage implements Language{

    @Override
    public void getName(String name) {
        System.out.println("programing language is : " + name);
    }
}
