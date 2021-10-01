public class PrintBanner implements Print {
    private NewBanner banner;
    private String str;
    public PrintBanner(String string) {
        banner = new NewBanner(string);
        str = string;
    }

    public void printWeak() {
        banner.showWithParen();
       
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
