public class Main {	
    private final static int TH_COUNT = 3;
    private final static String DOC_FILE = "short.txt";
    // private final static int TH_COUNT = 10;
    // private final static String DOC_FILE = "long.txt";

    public static void main(String[] args) throws InterruptedException {
        long startTimeMsec = System.currentTimeMillis();
        
        DocDownloader downloader = new DocDownloader(DOC_FILE);
        downloader.start();
        
        Result result = new Result();
        WordCounter wordCounter = new WordCounter(downloader, result);
        wordCounter.start();

        System.out.println("Main: " + result.getWordCount() + " words");

        long endTimeMsec = System.currentTimeMillis();
        System.out.println("Processing time: " + (endTimeMsec - startTimeMsec) + " msec");
    } 
}
