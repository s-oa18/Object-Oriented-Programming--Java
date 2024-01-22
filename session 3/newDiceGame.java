
public class newDiceGame {

    public static void main(String[] args) {
        int tries = 0;
        int score;
        int numTimes = 10;

        boolean continueThrowing = true;
        for (int i = 0; i < numTimes; i++) {
            while (continueThrowing) {
                int dice1 = (int) (Math.random() * 6) + 1;
                int dice2 = (int) (Math.random() * 6) + 1;

                score = dice1 + dice2;
                System.out.print(score + ", ");
                if (score == 12) {
                    System.out.println("\nYou win");
                    continueThrowing = false;

                }
                tries++;

            }

        }
        System.out.println("\n It took you " + tries + " tries to win");

    }

}
