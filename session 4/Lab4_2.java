public class Lab4_2 {

    public static void main(String[] a){

        //int[] array = new int[5];
        int[] array = {12,37,54,48,65};

        System.out.printf("%s%8s\n", "Index", "Value");
        for (int i = 0; i<array.length; i++){
            System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
    
}
