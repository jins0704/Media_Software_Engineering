package Task1.Home;

import Task1.Home.Home;
import Task1.SmartMachine.Door;
import Task1.SmartMachine.Light;

public class Kichen extends Home {
    private Door door;
    private Light light;
    private String recipe;

    @Override
    public void cleanRoom() {
        System.out.println("clean Kichen");
    }
    public void soundFireAlarm(){
        System.out.println("Kichen calls soundFireAlarm()");
    }
    public void printName() {
        System.out.println("class : Kichen");
    }
    public void setDoor(Door door) {
        this.door = door;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public Door getDoor() {
        return door;
    }

    public Light getLight() {
        return light;
    }

    public String getRecipe() {
        return recipe;
    }
}
