package tennis;
import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest {

    private final static String ADVANTAGE_B = "- A";
    private final static String ADVANTAGE_A = "A -";
    private final static String WIN_B = "- W";
    private final static String WIN_A = "W -";
    private final static String DEUCE = "deuce";
    @Test
    public void whenNoOnePlayerScoresCurrentScoreIs00(){

        TennisGame tennisGame = new TennisGame();
        Assert.assertEquals(tennisGame.getCurrentScore(), "0 0");
        Assert.assertEquals(tennisGame.isGameFinished(), false);
    }

    @Test
    public void whenFirstPlayerScoresCurrentScore15_0(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), "15 0");
        Assert.assertEquals(tennisGame.isGameFinished(), false);
    }

    @Test
    public void whenSecondPlayerScoresCurrentScoreis0_15(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), "0 15");
        Assert.assertEquals(tennisGame.isGameFinished(), false);
    }

    @Test
    public void whenBothPlayeraScoresCurrentScoreis15_15(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), "15 15");
        Assert.assertEquals(tennisGame.isGameFinished(), false);
    }

    @Test
    public void whenFirstPlayerScoresTwoTimesCurrentScoreIs30_0(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), "30 0");
        Assert.assertEquals(tennisGame.isGameFinished(), false);
    }

    @Test
    public void whenSecondPlayerScoresTwoTimesCurrentScoreIs0_30(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), "0 30");
        Assert.assertEquals(tennisGame.isGameFinished(), false);
    }

    @Test
    public void whenSecondPlayerScoresThreeTimesCurrentScoreIs0_40(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), "0 40");
        Assert.assertEquals(tennisGame.isGameFinished(), false);
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
        Assert.assertEquals(tennisGame.getCurrentScore(), DEUCE);
        Assert.assertEquals(tennisGame.isGameFinished(), false);
    }

    @Test
    public void whenBothPlayersScoresFourTimesCurrentScoreIsDeuce(){

        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), DEUCE);
        Assert.assertEquals(tennisGame.isGameFinished(), false);
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
        Assert.assertEquals(tennisGame.getCurrentScore(), ADVANTAGE_A);
        Assert.assertEquals(tennisGame.isGameFinished(), false);
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
        Assert.assertEquals(tennisGame.getCurrentScore(), ADVANTAGE_B);
        Assert.assertEquals(tennisGame.isGameFinished(), false);


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
        Assert.assertEquals(tennisGame.getCurrentScore(), WIN_A );
        Assert.assertEquals(tennisGame.isGameFinished(), true);

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
        Assert.assertEquals(tennisGame.getCurrentScore(), WIN_B);
        Assert.assertEquals(tennisGame.isGameFinished(), true);

    }

    @Test
    public void whenSecondPlayerWonButWithMoreScores(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), WIN_B);
        Assert.assertEquals(tennisGame.isGameFinished(), true);

    }


    @Test
    public void whenFirstPlayerWonButSecondHas0Points(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), WIN_A);
        Assert.assertEquals(tennisGame.isGameFinished(), true);

    }


    @Test
    public void whenSecondPlayerWonButFirstHas0Points(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), WIN_B);
        Assert.assertEquals(tennisGame.isGameFinished(), true);

    }


    @Test
    public void whenSecondPlayerWonButFirstHas2Points(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.getCurrentScore(), WIN_B);
        Assert.assertEquals(tennisGame.isGameFinished(), true);

    }

    @Test(expected = IllegalStateException.class)
    public void whenGameIsFinishedCallingScoreMethodsIsForbidden() {
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
    }

    @Test(expected = IllegalStateException.class)
    public void whenGameIsFinishedCallingScoreMethodsIsForbidden2() {
        TennisGame tennisGame = new TennisGame();
        tennisGame.playerAScores();
        tennisGame.playerAScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerBScores();
        tennisGame.playerAScores();
    }

    @Test
    public void whenInnerScoreImplementationExceedsMAXINTGameShouldFinished() {
        TennisGame tennisGame = new TennisGame();
        for (int i=0;i<Integer.MAX_VALUE-1;i++) {
            tennisGame.playerAScores();
            tennisGame.playerBScores();
            Assert.assertEquals(tennisGame.isGameFinished(), false);
        }

        tennisGame.playerAScores();
        Assert.assertEquals(tennisGame.isGameFinished(), true);
        Assert.assertEquals(tennisGame.getCurrentScore(), ADVANTAGE_A);
    }

    @Test
    public void whenInnerScoreImplementationExceedsMAXINTGameShouldFinished2() {
        TennisGame tennisGame = new TennisGame();
        for (int i=0;i<Integer.MAX_VALUE-1;i++) {
            tennisGame.playerAScores();
            tennisGame.playerBScores();
            Assert.assertEquals(tennisGame.isGameFinished(), false);
        }

        tennisGame.playerBScores();
        Assert.assertEquals(tennisGame.isGameFinished(), true);
        Assert.assertEquals(tennisGame.getCurrentScore(), ADVANTAGE_B);
    }
}

