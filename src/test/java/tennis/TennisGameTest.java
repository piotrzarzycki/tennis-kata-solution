package tennis;
import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

    @Test
    public void whenNoOnePlayerScoresCurrentScoreIs00(){

        TennisGame tennisGame = new TennisGame();
        Assert.assertEquals(tennisGame.getCurrentSocre(),"0 0");
    }

    @Test
    public void whenFirstPlayerSoresCurrentScore15_0(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentSocre(),"15 0");
    }
}
