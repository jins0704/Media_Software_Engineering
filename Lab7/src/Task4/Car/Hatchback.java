package Task4.Car;

import Task4.Car.Car;

public class Hatchback implements Car {
    private String model;
    private String version;

    public Hatchback(String model,String version) {
        this.model = model;
        this.version = version;
        showCar();
    }

    @Override
    public void showCar(){
        System.out.println("Hatchback...");
        System.out.println("Model : " + model);
        System.out.println("Version : " + version);
    }
}
