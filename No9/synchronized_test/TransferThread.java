public class TransferThread implements Runnable {
    
    private final static int TRANSFER_COUNT  = 1000;
    private final static int TRANSFER_AMOUNT = 1;
    
    private Account fromAccount;
    private Account toAccount;
    
    public TransferThread(Account fromAccount,
                          Account toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount   = toAccount;
    }
    
    public void run() {
        for(int i = 0; i < TRANSFER_COUNT; i++) {
            synchronized(fromAccount) {
                synchronized(toAccount) {
                    fromAccount.withdraw(TRANSFER_AMOUNT);
                    toAccount.deposit(TRANSFER_AMOUNT);
                }
            }
        }
    }
}
