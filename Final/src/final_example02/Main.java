package final_example02;

public class Main extends FinalMethodExample01{
    @Override
    public void display2() {
        super.display2();
    }

/*
Compile Time Error -> 'display()' cannot override 'display()' in 'final_example02.FinalMethodExample01'; overridden method is final
    @Override
    public final void display() {
        System.out.println("This is a final method");
    }
    */
}
