public class SynchronizationDemo {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread thread1 = new IncrementThread("Thread 1");
        Thread thread2 = new IncrementThread("Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter: " + counter);
    }

    private static synchronized void incrementCounter() {
        counter++;
    }

    static class IncrementThread extends Thread {
        public IncrementThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
            System.out.println(Thread.currentThread().getName() + " completed.");
        }
    }
}
