public class MarkPrinter implements Printable {
    private final char MARK = '!';
    private String msg;

    public MarkPrinter(String msg) {
        this.msg = msg;
    }

    public void printMsg() {
        System.out.println();
        System.out.println("MarkPrinter: printMsg()");
        System.out.println(msg);
    }

    public void printStrongMsg() {
        System.out.println();
        System.out.println("MarkPrinter: printStrongMsg()");
        System.out.println(msg + MARK);
    }
}
