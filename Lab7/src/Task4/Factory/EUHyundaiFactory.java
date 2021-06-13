package Task4.Factory;

import Task2.Component;
import Task4.Car.Car;
import Task4.Car.Hatchback;
import Task4.Car.SUV;
import Task4.Car.Sedan;

import java.util.ArrayList;
import java.util.List;

public class EUHyundaiFactory implements CarFactory {

    public List<Car> cars = new ArrayList<Car>();

    public EUHyundaiFactory() {
        this.cars = new ArrayList<>();
    }

    @Override
    public Car buildCar(String type,String model) {

        System.out.println("Building car in EU factory");

        Car car = null;

        if (type.equals("Hatchback")){
            car = new Hatchback(model,"2021");
            cars.add(car);
        }
        else if(type.equals("Sedan")){
            car = new Sedan(model,"1000");
            cars.add(car);
        }
        else if(type.equals("SUV")){
            car = new SUV(model,"blue");
            cars.add(car);
        }

        System.out.println("Total Cars made by EU Factory : " + cars.size());
        System.out.println();

        return car;
    }
}
