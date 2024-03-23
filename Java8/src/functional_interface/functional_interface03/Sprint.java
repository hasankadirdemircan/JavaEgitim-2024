package functional_interface.functional_interface03;

@FunctionalInterface
public interface Sprint {
    public boolean equals(Object obj); //java.lang.Object
    public String toString(); //java.lang.Object

    public void make();

    /*
    java.lang.Object sınıfındaki methodlar en az ve en fazla 1 abstract method kuralına girmezler.
     */
}
