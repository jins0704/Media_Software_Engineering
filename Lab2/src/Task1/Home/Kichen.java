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
}
