import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the maximum number of values to output..>");
        Scanner scan = new Scanner(System.in);
        int upper_range = scan.nextInt();
        FizzBuzz fizzbuzz_obj = new UserQuestion(new FBPlayImp());
        
        for(int i = 0; i < upper_range; i++) {
            System.out.print(i+1);
            System.out.print(".");
            fizzbuzz_obj.displayFizzBuzz(i+1);
            System.out.println();
        }
    }
        
}