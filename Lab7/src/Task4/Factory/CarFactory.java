package Task4.Factory;

import Task4.Car.Car;

import java.util.List;

public interface CarFactory {
    Car buildCar(String type, String model);
}
