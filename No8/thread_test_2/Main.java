public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c0 = new Counter(0);
        Thread thread0 = new Thread(c0);

        Counter c1 = new Counter(1);
        Thread thread1 = new Thread(c1);
        
        /*(1)
        thread0.start();
        thread1.start();
        thread0.join();
        thread1.join();
        */
        //(2)
        thread0.start();
        thread0.join();
        thread1.start();
        thread1.join();

        System.out.println("FINISH");
    }
}
