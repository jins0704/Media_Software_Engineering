package Task3;

import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) {
        System.out.println("What Game do you want to play? 1.Dice 2.CoinFlipping");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 1){
            Game dicegame = new Dice();
            dicegame.playGame();
        }

        else if(num == 2){
            Game coinflipping = new CoinFlipping();
            coinflipping.playGame();
        }

        else{
            System.out.println("There is no game, Good bye~");
        }
    }
}
