public class Main {
    public static void main(String[] args) {
        calculateScore("Stephen", 255);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return(score);
    }
}