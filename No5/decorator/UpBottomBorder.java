public class UpBottomBorder extends Border{
    private final char UP_BOTTOM_MARK = '=';
    public UpBottomBorder(Display inside) {
        super(inside);
    }

    public int getColumns() {
        return inside.getColumns();
    }

    public int getRows() {
        return inside.getRows();
    }

    public String getRowText(int row) {
        if(row == 0 || row == inside.getRows()-1) {
            return makeEndLine();
        } else {
            return inside.getRowText(row-1);
        }
        
    }

    private String makeEndLine() {
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i < inside.getColumns(); i++) {
            buf.append(this.UP_BOTTOM_MARK);
        }
        return buf.toString();
    }

}
