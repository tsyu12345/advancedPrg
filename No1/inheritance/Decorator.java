public abstract class Decorator {
    public String msg;
    public char mark;

    public Decorator(String msg, char mark) {
        this.msg = msg;
        this.mark = mark;
    }

    public void printMarks(int count, boolean linefeed) {
        for(int i = 0; i < count; i++) {
            System.out.print(mark);
        }
        if(linefeed) {
            System.out.println();
        }
    }

    public abstract void printMsg();
}
