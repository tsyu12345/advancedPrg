public class Account {
    
    private String owner;
    private int number;
    private int balance;
    
    public Account(String owner, int number, int balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }
    
    public void deposit(int amount) {
        balance += amount;
    }
    
    public void withdraw(int amount) {
        balance -= amount;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void displayBalance() {
        System.out.println(owner + "'s balance: " + balance);
    }

}
