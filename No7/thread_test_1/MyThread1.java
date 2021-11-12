public class MyThread1 extends Thread {
    
    private final static long SLEEP_LEN_MSEC = 1000;
    
    
    public void run() {
        for(int i = 0; i < 10; i++) {
            //System.out.print("MyThread1 # " + i + ":");
            System.out.print("MyThread1 # " + i + ":");
            try {
                System.out.println(i);
                Thread.sleep(SLEEP_LEN_MSEC);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
