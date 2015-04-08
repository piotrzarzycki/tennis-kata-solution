package tennis;

import java.util.HashMap;

/**
 * Created by Piotr on 2015-04-08.
 */
public class TennisGame {

    private int playerAScore = 0;
    private int playerBScore = 0;
    private HashMap<Integer, String> pointMap = new HashMap<Integer,String>();

    public TennisGame(){
        pointMap.put(0, "0");
        pointMap.put(1, "15");
        pointMap.put(2, "30");
        pointMap.put(3, "40");
    }

    public String getCurrentScore(){
        if (playerAScore >=3 || playerBScore >= 3){
            if (playerAScore == playerBScore) {
                return "deuce";
            }
            if (playerAScore-playerBScore==1) {
                return "A -";
            }
        }
        return pointMap.get(playerAScore) + " " + pointMap.get(playerBScore);
    }

    public void playerAScores(){
        playerAScore += 1;
    }

    public void playerBScores(){
        playerBScore += 1;
    }
}
