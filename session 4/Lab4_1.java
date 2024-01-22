public class Lab4_1 {

    public static int[] createRandomArray(int n, int min, int max) {
        //create the array for so many elements (n)
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            //get value from 0 to 1
            double rand = Math.random();
            //musltiply the random value by the(max)
            //and typecast this value to an integer 
            int iVal = (int)(rand * max);
            //add the minmimum (min)to it
            int res = min + iVal;
            //store the value in the array element
            values[i] = res;
        }
        //return the array
        return values;
    }
    public static void main(String[] a){

        int[] values = createRandomArray(4, 1, 40) ;

         System.out.printf("%s%8s\n", "Index", "Value");
        for (int i = 0; i<values.length; i++){
            System.out.printf("%5d%8d\n", i, values[i]);
        }
    }
}
