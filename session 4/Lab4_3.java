public class Lab4_3 {

    public static int getSum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static int getSum2(int a, int n, int ratio) {
        return a * (int) ((Math.pow(ratio, n) - 1) / (ratio - 1));
    }

    public static int[] fillArray(int[] values, int n, int a, double r) {
        for (int i = 0; i < n; i++) {
            values[i] = (int) (a * Math.pow(r, i));
        }
        return values;
    }

    public static void printArrayValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] values = new int[4];
        int a = 1;
        int ratio = 3;

        fillArray(values, values.length, a, ratio);
        printArrayValues(values);

        int sum = getSum(values);

        System.out.println();
        int total2 = getSum2(1, values.length, 3);
        System.out.println(total2 + " " + sum);

    }

}

/**
 * public static void main(String[] a){
 * 
 * int[] values = new int[4];
 * int counter = 1;
 * for (int i = 0; i < values.length; i++){
 * values[i] = counter * 3;
 * counter *= 3;
 * System.out.print(counter + " ");
 * 
 * }
 * System.out.println();
 * for (int i = 0; i < values.length; i++){
 * System.out.print(values[i] + " ");
 * }
 * System.out.println();
 * int sum = 0;
 * for (int i = 0; i< values.length;i++){
 * sum += values[i];
 * System.out.print(sum + " ");
 * }
 * System.out.println();
 * int total = 3 * (int)((Math.pow(3,4)-1)/(3-1));
 * System.out.println(total + " " + sum);
 * 
 * 
 * }
 */
