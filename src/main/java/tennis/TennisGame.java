package tennis;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Piotr on 2015-04-08.
 */
public class TennisGame {

    private int playerAScore = 0;
    private int playerBScore = 0;
    private Map<Integer,String>  diffMap = new HashMap<Integer, String>();
    private Map<Integer, String> pointMap = new HashMap<Integer,String>();
    private final static String DELIMITER = " ";
    private final static String ADVANTAGE = "A";
    private final static String WON = "W";
    private final static String NOTHING = "-";
    private final static String MESSAGE = "Game Is finished";

    public TennisGame(){
        pointMap.put(0, "0");
        pointMap.put(1, "15");
        pointMap.put(2, "30");
        pointMap.put(3, "40");
        diffMap.put(0, "deuce");
        diffMap.put(1, ADVANTAGE + DELIMITER + NOTHING);
        diffMap.put(-1, NOTHING + DELIMITER + ADVANTAGE);
        diffMap.put(2, WON + DELIMITER + NOTHING);
        diffMap.put(-2, NOTHING + DELIMITER + WON);
    }



    public String getCurrentScore(){
        if (gameIsFinished()) {
            int  diff = playerAScore - playerBScore;
            return diffMap.get((int)(Math.min(2,Math.abs(diff)) * Math.signum(diff)));
        }
        if (playerAScore >=3 && playerBScore >= 3){
            assert Math.abs(playerAScore-playerBScore) < 2;
            return diffMap.get(playerAScore - playerBScore);
        }
        return pointMap.get(playerAScore) + DELIMITER + pointMap.get(playerBScore);
    }

    public void playerAScores(){

        if (gameIsFinished()) throw new IllegalStateException(MESSAGE);
        playerAScore += 1;
    }

    public void playerBScores(){
        if (gameIsFinished()) throw new IllegalStateException(MESSAGE);
        playerBScore += 1;
    }

    public boolean gameIsFinished(){
        if (playerAScore==Integer.MAX_VALUE) return true;
        return  ( ((playerBScore>=4) || (playerAScore>=4)) && (Math.abs(playerAScore - playerBScore) >= 2));
    }
}
