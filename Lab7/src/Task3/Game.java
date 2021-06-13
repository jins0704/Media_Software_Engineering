package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Game {

    protected List<Player> players = new ArrayList<Player>();
    protected String winner;
    protected int currentRound = 1;
    protected Random random = new Random();

    void playGame(){

        initializePlayers();
        initializeRandDevice();

        while(hasGameEnded()){
            playTurn();
        }

        declareWinner();
    }

    void initializePlayers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Player Numbers : ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            System.out.println("Input Player" + (i) + " Name : ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            players.add(new Player(name));
        }
    }

    void initializeRandDevice(){ }

    void playTurn() { }

    boolean hasGameEnded() {
        return true;
    }

    void declareWinner(){
        int winnerIndex = -1;
        int winnerScore = -1;

        System.out.println("Result!");
        for(int i=0; i<players.size(); i++){
            System.out.println(players.get(i).getName() + " : " + players.get(i).getScore());
        }
        for(int i=0; i<players.size(); i++){
            if(players.get(i).getScore() == winnerScore){
                winner += players.get(i).getName() + " ";
            }
            else if(players.get(i).getScore() > winnerScore){
                winner = players.get(i).getName() + " ";
                winnerScore = players.get(i).getScore();
            }
        }

        if(winner.length() > 0 && winner != null){
            System.out.println("winner is " + winner);
        }
        else{
            System.out.println("Draw : There is no winner, play next time.");
        }
    }
}
