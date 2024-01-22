public class DiceGame3 {

    public static void main(String[] a) {
        int dice1, dice2, score, tries = 0;
        boolean continueThrowing = true;
        int overallTries = 0;
        int extraMoves = 0;
        int gameWon = 0, gameLost = 0;;
        for (int games = 0; games < 10; games++) {
            while (continueThrowing) {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                score = dice1 + dice2;
                System.out.print(score + " - ");
                if (dice1 == dice2) {
                    tries--;
                    extraMoves++;
                }
                tries++;
                overallTries++;
                if (tries >= 4) {
                    gameLost++;
                    continueThrowing = false;
                } else {
                    if (score == 12) {
                        gameWon++;
                        continueThrowing = false;
                    }
                }
            }
            tries = 0;
            continueThrowing = true;
        }
        System.out.println("Y\nou attempted tries: " + overallTries + " and got " 
            + extraMoves + " extra moves Games won: " + gameWon +" Game Lost: " + gameLost);
    }
}
