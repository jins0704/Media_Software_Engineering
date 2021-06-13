package Task4.Car;

import Task4.Car.Car;

public class SUV implements Car {
    private String model;
    private String color;

    public SUV(String model, String color) {
        this.model = model;
        this.color = color;
        showCar();
    }

    @Override
    public void showCar(){
        System.out.println("Sedan...");
        System.out.println("Model : " + model);
        System.out.println("color : " + color);
    }
}
