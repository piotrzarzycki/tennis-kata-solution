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
    private final static String delimiter = " ";
    private final static String Advantage = "A";
    private final static String Won = "W";
    private final static String Nothing = "-";

    public TennisGame(){
        pointMap.put(0, "0");
        pointMap.put(1, "15");
        pointMap.put(2, "30");
        pointMap.put(3, "40");
        diffMap.put(0, "deuce");
        diffMap.put(1, Advantage + delimiter + Nothing);
        diffMap.put(-1, Nothing + delimiter + Advantage);
        diffMap.put(2, Won + delimiter + Nothing);
        diffMap.put(-2, Nothing + delimiter + Won);
    }



    public String getCurrentScore(){
        if (gameIsFinished()) {
            return diffMap.get((int)(2 * Math.signum(playerAScore - playerBScore)));
        }
        if (playerAScore >=3 && playerBScore >= 3){
            assert Math.abs(playerAScore-playerBScore) < 2;
            return diffMap.get(playerAScore - playerBScore);
        }
        return pointMap.get(playerAScore) + delimiter + pointMap.get(playerBScore);
    }

    public void playerAScores(){
        playerAScore += 1;
    }

    public void playerBScores(){
        if (gameIsFinished()) throw new IllegalStateException("Game Is finished");
        playerBScore += 1;
    }

    public boolean gameIsFinished(){
        return  ( ((playerBScore>=4) || (playerAScore>=4)) && (Math.abs(playerAScore - playerBScore) >= 2));
    }
}
