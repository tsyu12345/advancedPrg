public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello"));
        d1.display();

        CountDisplay d2 = new CountDisplay(new StringDisplayImpl("Hello, world."));
        d2.display();
        d2.multiDisplay(5);
        d2.randomDisplay(10);
    }
}
