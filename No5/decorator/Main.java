public class Main {
    public static void main(String[] args) {
        Display org = new StringDisplay("Hello, world.");
        Display side1 = new SideBorder(org);
        Display side2 = new SideBorder(side1);
        Display full1 = new FullBorder(side2);
        Display full2 = new FullBorder(full1);
        Display side3 = new SideBorder(full2);
        Display upbtm = new UpBottomBorder(side3);
        org.show();
        side1.show();
        side2.show();
        full1.show();
        full2.show();
        side3.show();
        upbtm.show();
    }
}
