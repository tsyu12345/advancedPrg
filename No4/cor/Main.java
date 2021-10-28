public class Main {
    public static void main(String[] args) {
        Support alice = new SpecialSupport("Alice", 4);
        Support bobby = new SpecialSupport("Bobby", 8);
        Support chris = new OddSupport("Chris");

        alice.setNext(bobby).setNext(chris);

        for(int i = 1; i <= 20; i++) {
            alice.support(new Trouble(i));
        }
    }
}
