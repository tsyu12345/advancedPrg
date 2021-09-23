public class SideDecorator extends Decorator {
    public SideDecorator(String msg, char mark) {
        super(msg, mark);
    }

    public void printMsg() {
        System.out.println();
        System.out.println("SideDecorator: printMsg()");
        printMarks(1, false);
        System.out.print(msg);
        printMarks(1, true);
    }
}
