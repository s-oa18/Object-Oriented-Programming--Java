public class DiceGame0 {

    public static void main(String[] a) {
        int dice1, dice2, score, tries = 0;
        boolean continueThrowing = true;
            while (continueThrowing) {
                dice1 = (int) (Math.random() * 6) + 1;
                dice2 = (int) (Math.random() * 6) + 1;
                score = dice1 + dice2;
                System.out.print(score + " - ");
                if (score == 12) {
                    System.out.println("You have won!");
                    continueThrowing = false;
                }
                tries++;
            }
            System.out.println("Took you " + tries + " tries");
    }
}
