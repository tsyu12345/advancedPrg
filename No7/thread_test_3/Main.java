public class Main {
    
    private final static long SLEEP_LEN_MSEC = 1000;

    
    public static void main(String[] args) throws InterruptedException {
        //MyThread3 mt = new MyThread3();
        
        
        for(int i = 0; i < 10; i++) {
            //System.out.println("Main: " + i);
            MyThread3 mt = new MyThread3(i);
            Thread thread = new Thread(mt);
            thread.start();
            Thread.sleep(SLEEP_LEN_MSEC);
        }
    }

}
