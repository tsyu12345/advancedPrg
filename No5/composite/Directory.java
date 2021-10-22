import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> entries = new ArrayList<Entry>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        // Do something.
        Iterator it = entries.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    public void add(Entry entry) {
        entries.add(entry);
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + toString());
        Iterator it = entries.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
