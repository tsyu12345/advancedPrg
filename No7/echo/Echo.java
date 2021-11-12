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
        SubThread userInput = new SubThread();
        Thread thread = new Thread(userInput);
        thread.start();
        while(n != 0) {
            System.out.print(n);
            if(userInput.m != -1) {
                n = userInput.m;
            }
            Thread.sleep(SLEEP_LEN_MSEC);
        }
    }


    
    public static void main(String[] args) throws InterruptedException {
        Echo ste = new Echo();
        ste.echo();
    }

}

class SubThread implements Runnable {
    private Scanner scanner;
    public int m = -1;

    public void run() {
        while(true) {
            scanner = new Scanner(System.in);
            m = scanner.nextInt();
            if(m == 0) {
                break;
            }
        }        
    }
}
