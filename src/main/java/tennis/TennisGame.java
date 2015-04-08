package tennis;

/**
 * Created by Piotr on 2015-04-08.
 */
public class TennisGame {

    private String playerAScore = "0";
    private String playerBScore = "0";
    private static final String value = "15";

    public String getCurrentScore(){
        return playerAScore + " " + playerBScore;
    }

    public void playerAScores(){
        playerAScore = value;
    }

    public void playerBScores(){
        playerBScore = value;
    }
}
