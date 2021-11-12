public class PlayFizzBuzz extends FizzBuzz {
    
    protected String judge_fizzbuzz(int i) {
        String result = "";
        if(i >=3 ) {
            if(i % 3 == 0) {
                result = "Fizz";
            }
            if(i % 5 == 0) {
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
