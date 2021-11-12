public class Main {
    
    private final static long SLEEP_LEN_MSEC = 1000;

    
    public static void main(String[] args) throws InterruptedException {
        
        for(int i = 0; i < 10; i++) {
            //System.out.println("Main: " + i);
            MyThread1 thread = new MyThread1();
            thread.start();
            Thread.sleep(SLEEP_LEN_MSEC);
        }
    }

}
