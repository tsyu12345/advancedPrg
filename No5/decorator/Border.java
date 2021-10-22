public abstract class Border extends Display {
    protected Display inside;

    protected Border(Display inside) {
        this.inside = inside;
    }
}
