package Task1.Home;

import Task1.SmartMachine.Door;
import Task1.SmartMachine.Light;

public class Bathroom extends Home {
    private Door door;
    private Light light;
    private int odorLevel;

    @Override
    public void cleanRoom() {
        System.out.println("clean Bathroom");
    }
    public void deodorize(){
        System.out.println("Bathroom calls deodorize()");
    }
    public void printName() {
        System.out.println("class : Bathroom");
    }
    public void setDoor(Door door) {
        this.door = door;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void setOdorLevel(int odorLevel) {
        this.odorLevel = odorLevel;
    }

    public Door getDoor() {
        return door;
    }

    public Light getLight() {
        return light;
    }

    public int getOdorLevel() {
        return odorLevel;
    }
}
