public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Stephen", 255);
        System.out.println("New score is " +  newScore);

        newScore = calculateScore(75);
        System.out.println("Unnamed player" + " scored " + newScore + " points");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return(score * 1000);
    }
    public static int calculateScore(int score) {

        return(score * 1000);
    }
}