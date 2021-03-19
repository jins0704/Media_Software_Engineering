package Task2;

import java.util.Scanner;

public class DoorController {

    private DoorState currentState = DoorState.Closed;

    public static void main(String[] args) {
        DoorController dc = new DoorController();

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("State : ");
            dc.currentState.printState();

            System.out.println("Please insert an action (open, sensor_opened, close, sensor_closed), or empty to quit:");
            String action = scan.nextLine();

            if(action == null || action.equals("")){
                System.out.print("bye bye!");
                break;
            }
            else{
                DoorState result = dc.currentState.doAction(action);
                if(result == null){
                    System.out.println("Invalid action!");
                }
                else{
                    dc.currentState = result;
                    System.out.println("State changed.");
                }
            }
        }

    }
}
