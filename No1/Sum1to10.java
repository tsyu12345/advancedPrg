public class Sum1to10 {
    public static void main(String[] args) {
        int upper = 10;
        int lower = 1;
        int sum = 0;
        for(int i = lower; i <= upper; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
