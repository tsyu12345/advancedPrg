public class SideBorder extends Border {
    private final char SIDE_MARK = '*';

    public SideBorder(Display inside) {
        super(inside);
    }

    public int getColumns() {
        return inside.getColumns() + 2;
    }

    public int getRows() {
        return inside.getRows();
    }

    public String getRowText(int row) {
        return SIDE_MARK + inside.getRowText(row) + SIDE_MARK;
    }
}
