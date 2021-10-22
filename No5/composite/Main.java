public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");

        Directory homeDir = new Directory("home");
        rootDir.add(homeDir);

        Directory aliceDir = new Directory("alice");
        Directory bobbyDir = new Directory("bobby");
        Directory chrisDir = new Directory("chris");
        homeDir.add(aliceDir);
        homeDir.add(bobbyDir);
        homeDir.add(chrisDir);

        aliceDir.add(new File("Main.java", 1000));
        aliceDir.add(new File("Analyze.java", 3200));
        aliceDir.add(new File("Output.java", 2050));

        chrisDir.add(new File("index.html", 500));
        chrisDir.add(new File("main.js", 2500));

        rootDir.printList();
    }
}
