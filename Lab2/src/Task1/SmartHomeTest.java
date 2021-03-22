package Task1;

import Task1.Home.Bathroom;
import Task1.Home.Bedroom;
import Task1.Home.Kichen;
import Task1.Home.Livingroom;
import Task1.SmartMachine.Door;
import Task1.SmartMachine.Light;
import Task1.SmartMachine.Vacuum;

public class SmartHomeTest {
    public static void main(String args[]){
        Bathroom bathroom = new Bathroom();
        bathroom.printName();
        bathroom.cleanRoom();
        bathroom.deodorize();
        System.out.println("");

        Bedroom bedroom = new Bedroom();
        bedroom.printName();
        bedroom.cleanRoom();
        bedroom.playMusic();
        System.out.println("");

        Kichen kichen = new Kichen();
        kichen.printName();
        kichen.cleanRoom();
        kichen.soundFireAlarm();
        System.out.println("");

        Livingroom livingroom = new Livingroom();
        livingroom.printName();
        livingroom.cleanRoom();
        livingroom.turnOnTV();
        System.out.println("");

        Door door = new Door();
        door.printName();
        door.powerOn();
        door.open();
        door.close();
        System.out.println("");

        Light light = new Light();
        light.printName();
        light.powerOn();
        light.lightOn();
        light.lightOff();
        System.out.println("");

        Vacuum vacuum = new Vacuum();
        vacuum.printName();
        vacuum.powerOn();
        vacuum.autoClean();
    }
}
