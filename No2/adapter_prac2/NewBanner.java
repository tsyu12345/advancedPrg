public class NewBanner {
    private String str;
    public NewBanner(String str) {
        this.str = str;
    }

    public void showWithParen() {
        System.out.println("###" + str + "###");
    }

    public void showWithAster() {
        System.out.println("#####");
        System.out.println(str);
        System.out.println("#####");
    }
}
