package Task4.Factory;

import Task4.Car.Car;
import Task4.Car.Hatchback;
import Task4.Car.SUV;
import Task4.Car.Sedan;

import java.util.ArrayList;
import java.util.List;

public class KoreaHyundaiFactory implements CarFactory {

    public List<Car> cars = new ArrayList<Car>();

    public KoreaHyundaiFactory() {
        this.cars = new ArrayList<>();
    }

    @Override
    public Car buildCar(String type, String model) {
        System.out.println("Building car in Korea factory");

        Car car = null;

        if (type.equals("Hatchback")){
            car = new Sedan(model,"2021");
            cars.add(car);
        }
        else if(type.equals("Sedan")){
            car = new Hatchback(model,"2");
            cars.add(car);
        }
        else if(type.equals("SUV")){
            car = new SUV(model,"red");
            cars.add(car);
        }

        System.out.println("Total Cars made by Korea Factory : " + cars.size());
        System.out.println();
        return car;
    }


}