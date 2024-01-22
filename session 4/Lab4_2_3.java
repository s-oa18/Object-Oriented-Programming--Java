public class Lab4_2_3 {

    public static int[] createArray(int startValue, int n, int ratio) {
        int[] values = new int[n];
        int currentValue = startValue;
        int index = 0;
        for (int i = 0; i < n; i++) {
            values[index] = currentValue;
            currentValue *= ratio;
            index++;
        }
        return values;
    }

    public static void main(String[] args) {
        int[] values = createArray(1, 4, 3);
        // Code to display values here
        for (int value : values) {
            System.out.println(value);
        }
    }
}
