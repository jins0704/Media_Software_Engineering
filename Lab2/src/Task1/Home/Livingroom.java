package Task1.Home;

import Task1.Home.Home;
import Task1.SmartMachine.Door;
import Task1.SmartMachine.Light;

public class Livingroom extends Home {
    private Door door;
    private Light light;
    private int airCleanLevel;

    @Override
    public void cleanRoom() {
        System.out.println("clean Livingroom");
    }

    public void turnOnTV(){
        System.out.println("Livingroom calls turnOnTV()");
    }

}
