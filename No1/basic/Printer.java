public class Printer {
    private String msg;
    private char mark;

    public Printer(String msg, char mark) {
        this.msg = msg;
        this.mark = mark;
    }
    public void printStrongerMsg() {
        for(int i = 0; i < 3; i++) {
            System.out.print(mark);
        }
        System.out.print(msg);
        for(int i = 0; i < 3; i++) {
            System.out.print(mark);
        }
        System.out.print("\n");
    }

    public void printStrongestMsg() {
        for(int i = 0; i < msg.length(); i++) {
            System.out.print(mark);
        }
        System.out.print('\n');
        System.out.println(msg);
        for(int i = 0; i < msg.length(); i++) {
            System.out.print(mark);
        }
    }
    public void printMsg() {
        System.out.println(mark + msg);
        System.out.print('\n');
    }
    
}
