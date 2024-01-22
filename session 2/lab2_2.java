import java.util.Scanner;
public class lab2_2 {
    public static void main(String[] a){
        Scanner input = new Scanner(System.in);
        int passes = 0, failures = 0;
        boolean continueInput = true;
        while(continueInput){
            System.out.println("Enter result (1 - Pass, 2 = fail, Other value to Exit)");
            int result = input.nextInt();
            if(result == 1){
                passes ++;
            }else if (result == 2){
                failures++;
            }else{
                System.out.println("Data Entry finished, Program Ending");
                continueInput = false;
            }  
        } 
        System.out.printf("\nPasses: %d Fails %d\n", passes, failures);
        if(passes > 8){
            System.out.println("Bonus to instructor");
        }
        input.close();
    }
}
