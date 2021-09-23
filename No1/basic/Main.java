import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Message: ");
        String msg = scan.nextLine();

        System.out.print("Mark: ");
        char mark = scan.next().charAt(0);

        Printer printer = new Printer(msg, mark);
        printer.printMsg();
        System.out.print("\n");
        printer.printStrongerMsg();
        System.out.print("\n");
        printer.printStrongestMsg();
    }
}
