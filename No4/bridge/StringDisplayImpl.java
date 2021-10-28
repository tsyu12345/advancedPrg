public class StringDisplayImpl extends DisplayImpl {
    private String str;

    public StringDisplayImpl(String str) {
        this.str = str;
    }

    public void rawOpen() {
        printLine();
    }

    public void rawPrint() {
        System.out.println("|" + str + "|");
    }

    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i = 0; i < str.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
