public class Main {	
    private final static int TH_COUNT = 3;
    private final static String DOC_FILE = "short.txt";
    // private final static int TH_COUNT = 10;
    // private final static String DOC_FILE = "long.txt";

    public static void main(String[] args) throws InterruptedException {
        long startTimeMsec = System.currentTimeMillis();
        
        DocDownloader downloader = new DocDownloader(DOC_FILE);
        Thread dlThread = new Thread(downloader);
        dlThread.start();
        
        Result result = new Result();
        //WordCounter wc = new WordCounter(downloader, result);
        //Thread wcThread = new Thread(wc);
        //wcThread.start();

        Thread[] counterThreadArray = new Thread[TH_COUNT];
        for(int i = 0; i < counterThreadArray.length; i++) {
            WordCounter counter = new WordCounter(downloader, result);
            counterThreadArray[i] = new Thread(counter);
            counterThreadArray[i].start();

        }
        dlThread.join();
        for(int i = 0 ; i < counterThreadArray.length; i++) {
            counterThreadArray[i].join();
        }
        //wcThread.join();

        System.out.println("Main: " + result.getWordCount() + " words");

        long endTimeMsec = System.currentTimeMillis();
        System.out.println("Processing time: " + (endTimeMsec - startTimeMsec) + " msec");
    } 
}
