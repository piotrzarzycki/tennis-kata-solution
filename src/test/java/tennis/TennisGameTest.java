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

    @Test
    public void whenBothPlayeraScoresCurrentScoreis15_15(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"15 15");
    }

    @Test
    public void whenFirstPlayerScoresTwoTimesCurrentScoreIs30_0(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"30 0");
    }

    @Test
    public void whenSecondPlayerScoresTwoTimesCurrentScoreIs0_30(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"0 30");
    }

    @Test
    public void whenSecondPlayerScoresThreeTimesCurrentScoreIs0_40(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"0 40");
    }

    @Test
    public void whenBothPlayersScoresThreeTimesCurrentScoreIsDeuce(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"deuce");
    }

    @Test
    public void whenBothPlayersScoresFourTimesCurrentScoreIsDeuce(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"deuce");
    }

    @Test
    public void whenFirstPlayerHasAdvantage(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"A -");
    }

    @Test
    public void whenSecondPlayerHasAdvantage(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"- A");

    }

    @Test
    public void whenFirstPlayerWon(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"W -");

    }

    @Test
    public void whenSecondPlayerWon(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(),"- W");

    }

}

