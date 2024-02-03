package inheritance_examples.inheritance_example01;

public class Animal {

    private String name;
    private String gender;
    private int age;
    private boolean isSurungen;// = false;

    public void eat() {
        System.out.println("animal eats many things");
    }

    public void see() {
        System.out.println("I'm an animal I can see everything");
    }

    public boolean isSurungen() {
        return isSurungen;
    }

    public void setSurungen(boolean surungen) {
        isSurungen = surungen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
