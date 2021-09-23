public class UpBottomDecorator extends Decorator {
    public UpBottomDecorator(String msg, char mark) {
        super(msg, mark);
    }

    public void printMsg() {
        System.out.println();
        System.out.println("UpBottomDecorator: printMsg()");
        printMarks(msg.length(), true);
        System.out.println(msg);
        printMarks(msg.length(), true);
    }
}
