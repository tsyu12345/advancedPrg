
public class FizzBuzz {
    private FizzBuzzImpl fzImpl;
    public FizzBuzz(FizzBuzzImpl fzImpl) {
        this.fzImpl = fzImpl;
    } 

    protected String judge_fizzbuzz(int i) {
        String result;
        result = fzImpl.judge_fizzbuzz(i);
        return result;
    }

    public void displayFizzBuzz(int i) {
        fzImpl.displayFizzBuzz(i);
    }
}
