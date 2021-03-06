import java.util.Arrays;


public class JudgeSpam implements Runnable{
    /**
     * インターネット調査の代替クラス。
     */
    public boolean isSpam;
    private String number;
    public boolean searching;
    private String[] spamNumbers = {"07040749322", "0458927610", "1234567890"};

    JudgeSpam() {
        this.isSpam = false;
    }

    /**
     * 代替実装メソッド
     * インターネット上での番号検索に時間がかかっているように見せるため、
     * Thread.sleep()を使用。
     */
    @Override
    public void run() {
        this.searching = true;
        try {
            //検索処理の代替
            Thread.sleep(10000);
            if(Arrays.asList(this.spamNumbers).contains(this.number)) {
                this.isSpam = true;
            }
            //結果集約処理の代替
            Thread.sleep(5000);
            this.searching = false;
            System.out.println("End");

        }catch(InterruptedException error) {
            System.out.println("InterrupptedException!!");
        }
    }

    public void inputNumber(String num) {
        this.number = num;
    }
}