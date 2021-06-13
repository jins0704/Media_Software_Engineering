package Task4.Car;

import Task4.Car.Car;

public class Sedan implements Car {
    private String model;
    private String price;

    public Sedan(String model, String price) {
        this.model = model;
        this.price = price;
        showCar();
    }

    @Override
    public void showCar(){
        System.out.println("creating Sedan...");
        System.out.println("Model : " + model);
        System.out.println("price : " + price);
    }
}
