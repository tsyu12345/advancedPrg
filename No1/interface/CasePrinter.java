public class CasePrinter implements Printable {
    private String msg;

    public CasePrinter(String msg) {
        this.msg = msg;
    }

    public void printMsg() {
        System.out.println();
        System.out.println("CasePrinter: printMsg()");
        System.out.println(msg);
    }

    public void printStrongMsg() {
        System.out.println();
        System.out.println("CasePrinter: printStrongMsg()");
        System.out.println(msg.toUpperCase());
    }
}

