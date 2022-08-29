package ss08_Refactoring.bt;

public class TennisGame {
    public static String getScore(String playerName1, String playerName2, int pointForPlayer1, int pointForPlayer2) {
        String score = "";
        if (pointForPlayer1 == pointForPlayer2) {
            switch (pointForPlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (pointForPlayer1 >= 4 || pointForPlayer2 >= 4) {
            score = getFinalResult(pointForPlayer1, pointForPlayer2);
        } else {
            score = plusPoint(pointForPlayer1, pointForPlayer2, score);
        }
        return score;
    }

    private static String plusPoint(int pointForPlayer1, int pointForPlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = pointForPlayer1;
            else {
                score += "-";
                tempScore = pointForPlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getFinalResult(int pointForPlayer1, int pointForPlayer2) {
        String score;
        int minusResult = pointForPlayer1 - pointForPlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
