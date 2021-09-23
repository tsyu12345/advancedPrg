import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Message: ");
        String msg = scan.nextLine();

        Printable markPrinter = new MarkPrinter(msg);
        markPrinter.printMsg();
        markPrinter.printStrongMsg();

        Printable casePrinter = new CasePrinter(msg);
        casePrinter.printMsg();
        casePrinter.printStrongMsg();
    }
}
