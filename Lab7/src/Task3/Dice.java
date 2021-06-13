package Task3;

public class Dice extends Game {

    @Override
    void initializeRandDevice(){
        System.out.println("Initial Dice");
    }

    @Override
    void playTurn(){
        System.out.println("Round " + currentRound + " : All players roll dice");
        for(int i=0; i<players.size(); i++){
            int diceNum = random.nextInt((6-1)+1)+1;
            System.out.println(players.get(i).getName() + " gets " + diceNum);
            players.get(i).setScore(diceNum);
        }
        currentRound += 1;
    }

    @Override
    boolean hasGameEnded(){
        int winnerCnt = 0;
        int winnerScore = 0;

        for(int i=0; i<players.size(); i++){
            if(winnerScore < players.get(i).getScore()){
                winnerCnt = 1;
                winnerScore = players.get(i).getScore();
            }
            else if(winnerScore == players.get(i).getScore()){
                winnerCnt++;
            }
        }

        if(winnerCnt == 1){
            return false;
        }
        else{
            if(currentRound !=1){
                System.out.println("Draw, Next Round");
            }
            return true;
        }
    }
}
