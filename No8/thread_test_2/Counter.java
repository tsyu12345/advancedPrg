public class Counter implements Runnable {
    private final static long SLEEP_LEN_MSEC = 1000;
    private int id;
    
    public Counter(int id) {
        this.id = id;
    }
    
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Counter #" + id + ": " + i);
            try {
                Thread.sleep(SLEEP_LEN_MSEC);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
