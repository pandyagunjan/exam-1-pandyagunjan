package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String result ="";
       if(handSign.equals(ROCK))
           result= PAPER;
       else
       if(handSign.equals(SCISSOR))
           result= ROCK;
       else
       if(handSign.equals(PAPER))
           result= SCISSOR;

    return result;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String result ="";
        if(handSign.equals(ROCK))
            result= SCISSOR;
        else
        if(handSign.equals(SCISSOR))
            result= PAPER;
        else
        if(handSign.equals(PAPER))
            result= ROCK;

        return result;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String resulthandSignOfPlayer1 = getLosingMove(handSignOfPlayer1);
        String sendResult= "";
        if(resulthandSignOfPlayer1.equals(handSignOfPlayer2))
            sendResult =handSignOfPlayer1;

return sendResult;
    }
}
