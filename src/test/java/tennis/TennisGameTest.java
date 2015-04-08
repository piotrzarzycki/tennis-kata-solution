package tennis;
import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

    @Test
    public void whenNoOnePlayerScoresCurrentScoreIs00(){

        TennisGame tennisGame = new TennisGame();
        Assert.assertEquals(tennisGame.getCurrentScore(),"0 0");
    }

    @Test
    public void whenFirstPlayerScoresCurrentScore15_0(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"15 0");
    }

    @Test
    public void whenSecondPlayerScoresCurrentScoreis0_15(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"0 15");
    }

}
