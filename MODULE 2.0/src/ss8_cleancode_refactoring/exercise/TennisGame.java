package ss8_cleancode_refactoring.exercise;

public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    static String score = "";

    public static String getScore(String namePlayerOne, String namePlayerTwo, int scorePlayerOne, int scorePlayerTwo) {
//        String score = "";
        if (scorePlayerOne == scorePlayerTwo) {
            getScoreWhenEqual(scorePlayerOne);
        } else if (scorePlayerOne >= 4 || scorePlayerTwo >= 4) {
            getScoreWhenScorePlayerFromFourUp(scorePlayerOne, scorePlayerTwo);
        } else {
            getScoreWhenScorePlayerFromFourDown(scorePlayerOne, scorePlayerTwo);
        }
        return score;
    }

    public static void getScoreWhenEqual(int scorePlayerOne) {
//    String score = "";
        switch (scorePlayerOne) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
    }

    public static void getScoreWhenScorePlayerFromFourUp(int scorePlayerOne, int scorePlayerTwo) {
//        String score = "";
        int minusResult = scorePlayerOne - scorePlayerTwo;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
    }

    public static void getTempScoreOfTwoPlayer(int tempScore){
        switch (tempScore) {
            case LOVE:
                score += "Love";
                break;
            case FIFTEEN:
                score += "Fifteen";
                break;
            case THIRTY:
                score += "Thirty";
                break;
            case FORTY:
                score += "Forty";
                break;
        }
    }

    public static void getScoreWhenScorePlayerFromFourDown(int scorePlayerOne, int scorePlayerTwo) {
//        String score = "";
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1)
                tempScore = scorePlayerOne;
            else {
                score += "-";
                tempScore = scorePlayerTwo;
            }
            getTempScoreOfTwoPlayer(tempScore);
        }
    }
}
