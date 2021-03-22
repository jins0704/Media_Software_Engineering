package Task1.Home;

import Task1.SmartMachine.Door;
import Task1.SmartMachine.Light;

public class Bedroom extends Home {
    private Door door;
    private Light light;
    private int darknessLevel;

    @Override
    public void cleanRoom() {
        System.out.println("clean Bedroom");
    }
    public void playMusic() {
        System.out.println("Bedroom calls playMusic()" );
    }
    public void printName() {
        System.out.println("class : Bedroom");
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void setDarknessLevel(int darknessLevel) {
        this.darknessLevel = darknessLevel;
    }

    public Door getDoor() {
        return door;
    }

    public Light getLight() {
        return light;
    }

    public int getDarknessLevel() {
        return darknessLevel;
    }
}
