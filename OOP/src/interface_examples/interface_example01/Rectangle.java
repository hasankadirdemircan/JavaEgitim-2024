package interface_examples.interface_example01;

public class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is : " + (length * breadth));
    }
}
