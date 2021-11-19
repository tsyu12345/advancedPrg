public class Main {
    
    private final static int DEPOSIT_THREAD_COUNT = 3;

    public static void main(String[] args) throws InterruptedException {
        Account aliceAccount = new Account("Alice");
        
        Thread[] depositThreads = new Thread[DEPOSIT_THREAD_COUNT];
        for(int i = 0; i < depositThreads.length; i++) {
            depositThreads[i] = new Thread(new DepositThread(aliceAccount));
            depositThreads[i].start();
        }
        
        for(int i = 0; i < depositThreads.length; i++) {
            depositThreads[i].join();
        }
        
        aliceAccount.displayBalance();
    }

}
