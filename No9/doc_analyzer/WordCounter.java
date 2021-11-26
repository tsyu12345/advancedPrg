public class WordCounter {
    private final static long ANALYSIS_TIME_MSEC = 500;

    private DocDownloader downloader;
    private Result result;

    public WordCounter(DocDownloader downloader, Result result) {
        this.downloader = downloader;
        this.result = result;
    }
    
    private int countWord(String string) {
        String[] words = string.split("\\s+");
        int count = words.length;
        return count;
    }

    public void start() {
        String line = downloader.getLine();
        while(line != null) {
            try {
                Thread.sleep(ANALYSIS_TIME_MSEC);
                int count = countWord(line);
                System.out.println("\tWordCounter: " + line + " -> " + count);
                result.addWordCount(count);
                line = downloader.getLine();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\tWordCounter: FINISHED");
    }
}
