public class NewDisplayImpl extends DisplayImpl{
    private char c;
    public NewDisplayImpl(char c) {
        this.c = c;
    }

    public void startRow() {
        System.out.print('<');
    }

    public void endRow() {
        System.out.print('>');
    }
    
    public void dipslayChar() {
        System.out.print(c);
    }
}
