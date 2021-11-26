import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class DocDownloader {
    private final static long DOWNLOAD_TIME_MSEC = 100;

    private Deque<String> deque = new ArrayDeque<String>();
    private String docFile;

    public DocDownloader(String docFile) {
        this.docFile = docFile;
    }

    public void start() {
        Stream<String> stream = null;
        try {
            stream = Files.lines(Paths.get(docFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        stream.forEach(line -> {
            try {
                Thread.sleep(DOWNLOAD_TIME_MSEC);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            deque.addLast(line);
            System.out.println("DocDownloader: " + line);
        });
        
        System.out.println("DocDownloader: FINISHED");
    }
    
    public String getLine() {
        if(deque.isEmpty()) {
            return null;
        } else {
            return deque.removeFirst();
        }
    }
}
