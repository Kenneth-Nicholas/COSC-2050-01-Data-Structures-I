public class CounterThread implements Runnable {
    
    private final int startingValue;

    public CounterThread(int startingValue) {
        this.startingValue = startingValue;
    }

    @Override
    public void run() {
        for (int i = startingValue; i <= 10; i += 2) {
            System.out.println(i);
            try {
                // Might be necessary to force a thread switch.
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
    
}