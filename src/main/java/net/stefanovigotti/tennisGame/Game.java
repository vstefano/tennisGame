package net.stefanovigotti.tennisGame;

/**
 * Created by io on 04/07/16.
 */
public class Game {


    private static String punteggio;
    private static int pointsPlayer1;
    private static int pointsPlayer2;

    public static String getPunteggio() {
        if(pointsPlayer1==3 && havePlayer2MoreThan3Points() || havePlayer1MoreThan3Points() && pointsPlayer2==3)
            return "vantaggio";

        if(isTwoScoresHigherThan2() && isSameScore())
            return "deuce";
        if(havePlayer1MoreThan3Points() && isPlayer2_MoreThan1PointsAdvantage())
            return "win 1";
        if(havePlayer2MoreThan3Points() && isPlayer1_MoreThan1PointsAdvantage())
            return "win 2";
        return null;
    }

    private static boolean havePlayer2MoreThan3Points() {
        return pointsPlayer2>3;
    }

    private static boolean havePlayer1MoreThan3Points() {
        return pointsPlayer1>3;
    }

    private static boolean isPlayer1_MoreThan1PointsAdvantage() {
        return pointsPlayer2-pointsPlayer1>1;
    }

    private static boolean isPlayer2_MoreThan1PointsAdvantage() {
        return pointsPlayer1-pointsPlayer2>1;
    }

    private static boolean isTwoScoresHigherThan2() {
        return pointsPlayer1 > 2 && pointsPlayer2 > 2;
    }

    private static boolean isSameScore() {
        return pointsPlayer1==pointsPlayer2;
    }

    public static void setPointsPlayer1(int pointsPlayer1) {
        Game.pointsPlayer1 = pointsPlayer1;
    }

    public static void setPointsPlayer2(int pointsPlayer2) {
        Game.pointsPlayer2 = pointsPlayer2;
    }
}
