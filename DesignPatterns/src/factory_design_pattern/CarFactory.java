package factory_design_pattern;

import java.lang.reflect.InvocationTargetException;

public class CarFactory {

    public static Car createCarInstanceClass(Class aClass) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (Car) aClass.getDeclaredConstructor().newInstance();
    }

/*
    public static Car createCar(Class aClass) throws IllegalAccessException, InstantiationException {
		return (Car) aClass.newInstance();
	}*/

}
