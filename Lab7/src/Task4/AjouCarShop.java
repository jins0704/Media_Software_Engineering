package Task4;

import Task4.Factory.CarFactory;
import Task4.Factory.EUHyundaiFactory;
import Task4.Factory.KoreaHyundaiFactory;

public class AjouCarShop {
    public static void main(String[] args) {

        CarFactory cf = new KoreaHyundaiFactory();
        CarFactory cf2 = new EUHyundaiFactory();

        cf.buildCar("Sedan", "Sonata");
        cf.buildCar("SUV", "Santafe");
        cf2.buildCar("Hatchback", "HatchMan");
        cf2.buildCar("SUV", "PorscheSUV");
        cf2.buildCar("Sedan", "BMWSedan");
    }
}
