public class FullBorder extends Border {
    private final char CORNER_MARK = '+';
    private final char HORIZONTAL_MARK = '-';
    private final char VERTICAL_MARK = '|';

    public FullBorder(Display inside) {
        super(inside);
    }

    public int getColumns() {
        return inside.getColumns() + 2;
    }

    public int getRows() {
        return inside.getRows() + 2;
    }

    public String getRowText(int row) {
        if(row == 0 || row == inside.getRows() + 1) {
            return CORNER_MARK + makeLine(inside.getColumns()) + CORNER_MARK;
        } else {
            return VERTICAL_MARK + inside.getRowText(row - 1) + VERTICAL_MARK;
        }
    }

    private String makeLine(int count) {
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i < count; i++) {
            buf.append(HORIZONTAL_MARK);
        }
        return buf.toString();
    }
}
