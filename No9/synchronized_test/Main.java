public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        Account aliceAccount = new Account("Alice", 100, 5000);
        Account bobbyAccount = new Account("Bobby", 200, 4000);
        
        Thread a2bThread = new Thread(new TransferThread(aliceAccount, bobbyAccount));
        Thread b2aThread = new Thread(new TransferThread(bobbyAccount, aliceAccount));

        a2bThread.start();
        b2aThread.start();
        
        a2bThread.join();
        b2aThread.join();
        
        aliceAccount.displayBalance();
        bobbyAccount.displayBalance();
    }

}
