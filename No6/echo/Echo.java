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
        WaitUserInput wui = new WaitUserInput();
        wui.start();
        while(n != 0) {
            System.out.print(n);
            Thread.sleep(SLEEP_LEN_MSEC);
            n = wui.m != -1 ? wui.m : n;
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        Echo ste = new Echo();
        ste.echo();
    }

}


class WaitUserInput extends Thread {
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
