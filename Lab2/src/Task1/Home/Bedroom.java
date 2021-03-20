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
}
