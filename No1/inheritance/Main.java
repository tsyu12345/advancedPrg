import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Message: ");
        String msg = scan.nextLine();

        System.out.print("Mark: ");
        char mark = scan.next().charAt(0);

        Decorator sdDecorator 
            = new SideDecorator(msg, mark);
        sdDecorator.printMsg();

        Decorator ubDecorator 
            = new UpBottomDecorator(msg, mark);
        ubDecorator.printMsg();
        
        Decorator SurDecorator = new SurroundingDecorator(msg, mark);
        SurDecorator.printMsg();
    }
}
