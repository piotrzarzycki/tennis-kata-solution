package tennis;
import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

    @Test
    void whenNoOnePlayerScoresCurentScoreIs00(){

        TennisGame tennisGame = TennisGame();
        Assert.assertEquals(tennisGame.getCurrentSocre().equals("0 0"));

    }
}
