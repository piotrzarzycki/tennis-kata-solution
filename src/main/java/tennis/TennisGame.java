package tennis;

/**
 * Created by Piotr on 2015-04-08.
 */
public class TennisGame {

    private String playerAScore = "0";

    public String getCurrentSocre(){
        return playerAScore+" 0";
    }

    public void playerAScores(){
        playerAScore = "15";
    }
}
