import java.time.Clock;

public class Lab4_5 {

    public static int sumArray(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static int sumArray2(int a, int n, int r) {
        int sum = 0;
        sum = a * (((int) Math.pow(r, n) - 1) / (r - 1));
        return sum;
    }

    // public static int sumArray2(int a, int n, int r){
    // int sum = 0;
    // int r_pow_n = (int) Math.pow(r, n);
    // sum = a * ((r_pow_n - 1) / (r -1));
    // return sum;
    // //sum = a * (((int) Math.pow(r, n) - 1) / (r -1));

    // }

    // Task 1
    public static void printArrayElements(int[] values) {
        System.out.println();
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + "\t");
        }
        System.out.println("The length of the array is: " + values.length);
    }

    // Task 1
    public static void displayArrayFullDetails(int[] values) {
        printArrayElements(values);
        System.out.print("sum 1 is: " + sumArray(values) + "\t");
    }

    // Task 2
    public static void displayArrayFullDetails(int a, int n, int r) {
        int[] values = createArray(a, n, r);
        printArrayElements(values);
        System.out.println("\nThe sum of all the array element is: " + sumArray2(a, n, r) + "\n");
    }

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

        int n = 4;
        int a = 1;
        int r = 3;

        int[] values = createArray(a, n, r);
        int sum = 0;
        //sum = sumArray(values);
        sum = sumArray2(a, n, r);


        System.out.println("\nThe sum of all elements of the array is: + " + sum + "\n");
    }

}

// int[] values = new int[4];
// values[0] = 1;
// values[1] = 3;
// values[2] = 9;
// values[3] = 27;

// //or
// values = createArray(1, 4,3);
// //then
// displayArrayFullDetails(values);
// }
// }

// printArrayElements(values);
// System.out.println("sum is: " + sumArray(values) + "\n");
// System.out.println(sumArray2(1, 4, 3));


        // int n = 1000000;
        // int a = 1;
        // int r = 3;

        // int[] values = createArray(a, n, r);
        // long time1 = System.currentTimeMillis();
        // int sum = 0;
        // //we repeat the expriment 10000!
        // for (int i = 0; i < 10000; i++) {
        //     sum = sumArray(values);
        // }
        // sum /= n;
        // long time2 = System.currentTimeMillis();
        // sum += sumArray2(a, n, r);
        // System.out.println("\nthe sum of all elements of the array is: " + sum + " Length " + values.length + "\n");
        // long time3 = System.currentTimeMillis();
        // long end1 = time2 - time1;
        // long end2 = time3 - time2;

        // System.out.println(" End 1: " + end1 + " End 2: " + end2+ "\n");