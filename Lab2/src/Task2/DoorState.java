package Task2;

import java.util.Scanner;

public enum DoorState {
    Opening{
        @Override
        public DoorState doAction(String action){
            if(action.equals("sensor_opened")){
                return Opened;
            }
            else if(action.equals("close")){
                return Closing;
            }
            else{
                return null;
            }
        }
        @Override
        public void printState(){
            System.out.println("opening");
        }
    },
    Opened{
        @Override
        public DoorState doAction(String action){
            if(action.equals("close")){
                return Closing;
            }
            else{
                return null;
            }
        }
        @Override
        public void printState(){
            System.out.println("opened");
        }
    },
    Closing{
        @Override
        public DoorState doAction(String action){

            if(action.equals("open")){
                return Opening;
            }
            else if(action.equals("sensor_closed")){
                return Closed;
            }
            else{
                return null;
            }
        }
        @Override
        public void printState(){
            System.out.println("closing");
        }
    },
    Closed {
        @Override
        public DoorState doAction(String action) {

            if(action.equals("open")){
                return Opening;
            }
            else{
                return null;
            }
        }
        @Override
        public void printState(){
            System.out.println("closed");
        }
    };

    public abstract DoorState doAction(String action);
    public abstract void printState();
}
