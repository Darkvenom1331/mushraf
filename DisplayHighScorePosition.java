publicclass DisplayHighScorePosition{
public static void main(String[]args)

    {
        int highScorePosition = calculateHighScorePosition(1500);
        DisplayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        DisplayHighScorePosition("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        DisplayHighScorePosition("Mim", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        DisplayHighScorePosition("Rim", highScorePosition);
    }
 {

    public static void DisplayHighScorePosition(String playername, int highScorePosition) {

        System.out.println(playername + "managed to get into position");
        System.out.println(highScorePosition + "on the highscore table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;

        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
}