package echo;

import java.util.Scanner;

public class Echo {
    
    private final static long SLEEP_LEN_MSEC = 100;

    private Scanner scanner;
    private int n;
    
    
    public Echo() {
        scanner = new Scanner(System.in);
        System.out.print("n > ");
        n = scanner.nextInt();
    }
    
    
    private void echo() throws InterruptedException {
        while(n != 0) {
            System.out.print(n);
            Thread.sleep(SLEEP_LEN_MSEC);
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        Echo ste = new Echo();
        ste.echo();
    }

}
