import java.util.*;

public class UserQuestion extends FizzBuzz{
    
    public UserQuestion(FizzBuzzImpl fzImpl) {
        super(fzImpl);
    }

    @Override
    public void displayFizzBuzz(int i) {
        if(doQuestion(i)){
            boolean ans = questionFizzBuzz(i);
            if(ans == true) {
                System.out.print("##You are right.##");
            } else {
                System.out.print("##You worng!! Bye.##");
                System.exit(0);
            }
        }
        String result = judge_fizzbuzz(i);
        System.out.print(result);
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
