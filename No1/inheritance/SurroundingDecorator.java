public class SurroundingDecorator extends Decorator{
    public SurroundingDecorator(String msg, char mark) {
        super(msg, mark);
    }

    public void printMsg() {
        System.out.println("SurroundingDecorator: printMsg()\n");
        printMarks(msg.length(), true);
        printMarks(1, false);
        System.out.print(msg);
        printMarks(1, true);
        printMarks(msg.length(), true);
    }

}
