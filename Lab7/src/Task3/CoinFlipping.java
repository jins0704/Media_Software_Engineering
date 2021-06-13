package Task3;

public class CoinFlipping extends Game {

    private int winnerCoin;
    private int totalRounds;

    private String[] coin = {"Front", "Back"};

    @Override
    void initializeRandDevice() {
        winnerCoin = random.nextInt((1 - 0) + 1);
        totalRounds = random.nextInt((10-1)+1)+1;
        System.out.println("If you pick " + coin[winnerCoin] + ", you gets score!");
        System.out.println("All Rounds : " + totalRounds);
    }

    @Override
    void playTurn() {
        System.out.print("Round " + currentRound + " : ");
        for (int i = 0; i < players.size(); i++) {
            int turn = random.nextInt((1 - 0) + 1);
            if (turn == winnerCoin) {
                int currentScore = players.get(i).getScore();
                players.get(i).setScore(currentScore + 1);
            }
            System.out.print(players.get(i).getName() + " : " + coin[turn] + "! ");
        }

        System.out.println();
        currentRound += 1;
    }


    @Override
    boolean hasGameEnded() {
        if (currentRound <= totalRounds) {
            return true;
        } else {
            return false;
        }
    }
}

