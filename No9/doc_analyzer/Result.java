public class Result {
    private final static long ADD_TIME_MSEC = 500;

    private int wordCount;

    public Result() {
        wordCount = 0;
    }

    public void addWordCount(int count) throws InterruptedException {
        Thread.sleep(ADD_TIME_MSEC);
        wordCount += count;
    }

    public int getWordCount() {
        return wordCount;
    }
}
