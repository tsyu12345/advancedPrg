public class MyThread3 implements Runnable {
    
    private final static long SLEEP_LEN_MSEC = 1000;
    private int id;
    public MyThread3(int thredId) {
        this.id = thredId;
    }
    
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("MyThread3 #" + id + ":" + i);
            try {
                Thread.sleep(SLEEP_LEN_MSEC);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
