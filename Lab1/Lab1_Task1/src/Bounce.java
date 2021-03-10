import java.util.Scanner;

public class Bounce {
        public static void main(String[] args){
            bounce();
        }

        public static void bounce() {

            Scanner scan = new Scanner(System.in);

            int num = scan.nextInt();

            if (num < 0){
                System.out.println("Error! Input cannot be negative.");
            }
            else{
                for(int i=num; i>0; i--){
                    System.out.print(i + " ");
                }
                for(int i=0; i<=num; i++){
                    System.out.print(i + " ");
                }
            }
        }


}
