public class MyThread implements Runnable {

    private Shared shared;

    public MyThread(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        
        for(int i = 0; i < 10000; i++) {
            
            this.shared.incrementValue();
            
        }
        
    }

}
