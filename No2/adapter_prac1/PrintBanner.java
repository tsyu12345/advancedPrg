public class PrintBanner implements Print{
    public Banner banner;
    public PrintBanner(String str) {
        banner = new Banner(str);
    }

    public void printWeak() {
        banner.showWithAster();
    }

    public void printStrong() {
        banner.showWithParen();
    }
}