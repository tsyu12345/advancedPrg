import java.util.*;
public class GameFizzBuzz extends FizzBuzz {
    
    protected String judge_fizzbuzz(int i) {
        String result = "";
        if(i >=3 ) {
            if(i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
            } else if(i % 3 == 0) {
                result = "Fizz";
            }else if(i % 5 == 0) {
                result = "Buzz";
            }
        }
        return result;
    }

    public void displayFizzBuzz(int i) {
        if(doQuestion(i)){
            boolean result = questionFizzBuzz(i);
            if(result == true) {
                System.out.print("##You are right.##");
            } else {
                System.out.print("##You worng!! Bye.##");
                System.exit(0);
            }
        }
    }

    private boolean doQuestion(int i) {
        String result = judge_fizzbuzz(i);
        if(result != "") {
            return true;
        } else {
            return false;
        }
    }

    protected boolean questionFizzBuzz(int i) {
        String ans = judge_fizzbuzz(i);
        Scanner scan = new Scanner(System.in);
        String userAns = "";
        if(ans != "") {
            System.out.print(
                "Is this number 'Fizz'? Or is it 'Buzz', or is it 'FizzBuzz'? > "
                );
            userAns = scan.nextLine();
        }
        if(ans.equals(userAns) == false) {
            return false;
        } else {
            return true;
        }
    }
}
