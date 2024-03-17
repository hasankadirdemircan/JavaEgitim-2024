package factory_design_pattern;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            Bmw bmw = (Bmw) CarFactory.createCarInstanceClass(Bmw.class);//Bmw bmw2 = new Bmw();

            bmw.name();
            bmw.price(1111);

            Porsche porsche = (Porsche) CarFactory.createCarInstanceClass(Porsche.class);
            porsche.name();
            porsche.price(22222);
        }catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
