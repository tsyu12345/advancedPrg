public class JudgeSpam implements Runnable{
    /**
     * インターネット調査の代替クラス。
     */
    private boolean isSpam;
    private String number;
    JudgeSpam(String phoneNumber) {
        this.isSpam = false;
        this.number = phoneNumber;
    }
    public void run() {

    }
}
