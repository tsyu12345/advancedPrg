
public class FBPlayImp extends FizzBuzzImpl {

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
        String result = judge_fizzbuzz(i);
        System.out.print(result);
    }
    
}
