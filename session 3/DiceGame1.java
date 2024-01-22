public class DiceGame1 {

    public static void main(String[] a) {

        int dice1, dice2, score, tries = 0;
        boolean continueThrowing = true;

        for (int games = 0; games < 10; games++) {

            while (continueThrowing) {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                score = dice1 + dice2;
                System.out.print(score + " - ");
                if (score == 12) {
                    continueThrowing = false;

                }
                tries++;
            }
            continueThrowing = true;

        }
        System.out.println("\nYou attempted a total of " + tries + " tries to compete the 10 games");
    }
}

/**
 * public class DiceGame1 {
 * 
 * public static void main(String[] a) {
 * 
 * int dice1, dice2, score;
 * int gameTries = 0;
 * int totalTries = 0;
 * boolean keepGoing = true;
 * //int gameswon = 0;
 * 
 * for (int games = 0; games < 10; games++) {
 * 
 * while (keepGoing) {
 * dice1 = (int) (Math.random() * 6) + 1;
 * dice2 = (int) (Math.random() * 6) + 1;
 * score = dice1 + dice2;
 * //System.out.print(score + " - ");
 * gameTries++;
 * // if (gameTries >= 4) {
 * // //System.out.println("You have lost");
 * // keepGoing = false;
 * // } else {
 * if (score == 12) {
 * //System.out.println("You have won!");
 * keepGoing = false;
 * //gameswon++;
 * }
 * // }
 * totalTries++;
 * System.out.println(totalTries);
 * }
 * 
 * gameTries = 0;
 * keepGoing = true;
 * }
 * // System.out.println("You attempted tries: " + totalTries + " and won " +
 * gameswon + " games");
 * System.out.println("You attempted tries: " + totalTries);
 * }
 * 
 * }
 * 
 */