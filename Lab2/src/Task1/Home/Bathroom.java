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
}
