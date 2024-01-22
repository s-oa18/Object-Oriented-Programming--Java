public class Lab4_2_2 {

    public static void main(String[] args) {

        int[] values = new int[4];
        int startValue = 1;
        int currentValue = startValue;
        int index = 0;
        for (int i = 0; i < 4; i++) {
            values[index] = currentValue;
            currentValue *= 3;
            index++;
        }
        //Code to display values here
    }
}
