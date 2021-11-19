public class Main {

    public static void main(String[] args) throws InterruptedException{
        Shared shared = new Shared();

        Thread[] threads = new Thread[3];
        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyThread(shared));
            threads[i].start();
        }

        for(int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(shared.getValue());
    }

}
