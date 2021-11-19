public class Account {
    
    private String owner;
    private int balance;
    
    public Account(String owner) {
        this.owner = owner;
        balance = 0;
    }
    
    public void deposit(int amount) {
        balance += amount;
    }
    
    public void displayBalance() {
        System.out.println(owner + "'s balance: " + balance);
    }

}
