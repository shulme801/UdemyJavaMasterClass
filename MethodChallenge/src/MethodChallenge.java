public class MethodChallenge {
    public static void main(String[] args) {
        // test upper boundaries
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Stephen", highScorePosition); //

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition); //

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);//

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition); //

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);

        // test lower boundaries
        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("James", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName +
                " managed to get into position " +
                highScorePosition +
                " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int highScorePosition = 4;
        if (playerScore >= 1000) {
            highScorePosition = 1;
        } else if (playerScore >= 500) {
            highScorePosition = 2;
        } else if (playerScore >= 100) {
            highScorePosition = 3;
        }

        return (highScorePosition);
    }

}
