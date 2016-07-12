package net.stefanovigotti.tennisGame;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by io on 04/07/16.
 * I punteggi da zero a tre punti sono descritti rispettivamente come "amore", "quindici", "trenta", e "quaranta" .
 Se almeno tre punti sono stati segnato da ogni gicatore il giocatore che ha un punto in più del suo avversario, ha un punteggio chiamato  "vantaggio".
 Se almeno tre punti sono stati segnati da ogni giocatore, ed i punteggi sono uguali, il punteggio è "deuce".
 Una partita è vinta dal primo giocatore ad aver vinto almeno quattro punti in totale e almeno due punti in più rispetto l'avversario.
 */



public class GameTest {


    @Test
    public void getResultShouldReturnVantaggioIfOnePlayerHave4PointAndTheOtherOne3(){
        Game.setPointsPlayer1(4);
        Game.setPointsPlayer2(3);
        Assert.assertEquals("vantaggio",Game.getPunteggio());
    }

    @Test
    public void getResultShouldReturnDeuceIfOnePlayerHave3PointsAndTheOtherOne3() {
        Game.setPointsPlayer1(3);
        Game.setPointsPlayer2(3);
        Assert.assertEquals("deuce",Game.getPunteggio());
    }

    @Test
    public void getResultShouldReturnWin1IfOnePlayerHaveReach4PointsAndItHas2PointsMoreThanTheOtherPlayer(){
        Game.setPointsPlayer1(4);
        Game.setPointsPlayer2(2);
        Assert.assertEquals("win 1",Game.getPunteggio());
    }

    @Test
    public void playerOneWin_with_6_2(){
        Game.setPointsPlayer1(6);
        Game.setPointsPlayer2(2);
        Assert.assertEquals("win 1",Game.getPunteggio());
    }



    @Test
    public void getResultShouldReturnWin2IfTwoPlayerHaveReach4PointsAndItHas2PointsMoreThanTheOtherPlayer(){
        Game.setPointsPlayer1(2);
        Game.setPointsPlayer2(4);
        Assert.assertEquals("win 2",Game.getPunteggio());
    }

    @Test
    public void whenTwoPlayersHaveEqualPointsAndHigherThan3(){
        Game.setPointsPlayer1(6);
        Game.setPointsPlayer2(6);
        Assert.assertEquals("deuce",Game.getPunteggio());
    }
}
