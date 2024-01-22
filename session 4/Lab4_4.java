public class Lab4_4 {

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

    public static void swapFirstLast(int[] array) {
        int lastValue = array.length - 1;
        int temp = array[0];
        array[0] = array[lastValue];
        array[lastValue] = temp;
    }

    public static void displayArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println();
    }

    public static void rotateValuesRight(int[] array) {
        int lastValueIndex = array.length - 1;
        int lastValue = array[lastValueIndex];
        for (int i = lastValueIndex; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastValue;
    }

    public static void rotateValuesleft(int[] array) {
        int firstvalue = 0;
        int temp = array[firstvalue];
        for (int i = firstvalue; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }

    public static void swapValues(int[] array, int index1, int index2) {
        if ((index1 < 0 || index1 > array.length - 1) || (index2 < 0 || index2 > array.length - 1)) {
            System.out.println("Values out of range");
            return;
        } else {
            int firstValue = array[index1];
            array[index1] = array[index2];
            array[index2] = firstValue;
        }
    }





    public static void main(String[] args) {

        int[] values = createArray(1, 6, 2);
      
        displayArrayValues(values);

        rotateValuesRight(values);
        displayArrayValues(values);

        rotateValuesleft(values);
        displayArrayValues(values);

        // swapFirstLast(values);
        // displayArrayValues(values);

        swapValues(values, 0, values.length -1);
        displayArrayValues(values);
    }
}
