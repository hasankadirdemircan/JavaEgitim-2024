public class Main {

    int itemChancePercentage = 10;
    int x = 5;
    public static void main(String[] args) {
        Main myObject = new Main();
        System.out.println("myObject :" + myObject.x);
        myObject.x = 15;
        System.out.println("myObject :" + myObject.x);
        Main myObject2 = new Main();
        System.out.println("myObject2 :" + myObject2.x);
        myObject.itemChancePercentage = 50;
    }
}
