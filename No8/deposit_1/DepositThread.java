public class DepositThread implements Runnable {
    
    private final static int DEPOSIT_COUNT = 1000;
    private final static int DEPOSIT_AMOUNT= 1;
    private Object lock = new Object();
    private Account account;
    
    public DepositThread(Account account) {
        this.account = account;
    }
    
    public void run() {
        for(int i = 0; i < DEPOSIT_COUNT; i++) {
            synchronized(lock) {
                account.deposit(DEPOSIT_AMOUNT);
            }
        }
        
    }
}

