public class WordCounter {
    private final static long WAIT_TIME_MSEC = 500;
    private final static long ANALYSIS_TIME_MSEC = 500;
    // private final static long WAIT_TIME_MSEC = 5;
    // private final static long ANALYSIS_TIME_MSEC = 5;

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
        while(!downloader.isFinished()) {
            String line = downloader.getLine();
            if(line == null) {
                try {
                    Thread.sleep(WAIT_TIME_MSEC);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(ANALYSIS_TIME_MSEC);
                    int count = countWord(line);
                    System.out.println("\tWordCounter: " + line + " -> " + count);
                    result.addWordCount(count);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("\tWordCounter: FINISHED");
    }
}
