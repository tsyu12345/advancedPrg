public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public void add(Entry entry) {
        System.out.println("Error");
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
