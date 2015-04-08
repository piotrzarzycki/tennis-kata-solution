package tennis;

import java.util.HashMap;

/**
 * Created by Piotr on 2015-04-08.
 */
public class TennisGame {

    private int playerAScore = 0;
    private String playerBScore = "0";
    private static final String value = "15";
    private HashMap<Integer,String> pointMap = new HashMap<Integer,String>();

    public TennisGame(){
        pointMap.put(0,"0");
        pointMap.put(1,"15");
        pointMap.put(2,"30");
    }

    public String getCurrentScore(){
        return pointMap.get(playerAScore) + " " + playerBScore;
    }

    public void playerAScores(){
        playerAScore += 1;
    }

    public void playerBScores(){
        playerBScore = value;
    }
}
