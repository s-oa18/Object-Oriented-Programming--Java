public class DiceGame2 {

    public static void main(String[] a) {

        int dice1, dice2, score, tries = 0;
        boolean continueThrowing = true;
        int overallTries = 0;

        for (int games = 0; games < 10; games++) {

            while (continueThrowing) {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                score = dice1 + dice2;
                System.out.print(score + " - ");
                overallTries++;
                tries++;
                if (tries >= 4) {
                    continueThrowing = false;
                } else {
                    if (score == 12) {
                        continueThrowing = false;
                    }
                }
            }
            tries = 0;
            continueThrowing = true;
        }
         System.out.println("\nYou attempted a total of " + overallTries + " tries to complete the 10 games");
    }
}
