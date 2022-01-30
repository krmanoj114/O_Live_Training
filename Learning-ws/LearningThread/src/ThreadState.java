public class ThreadState implements Runnable{

    @Override
    public void run() {
        commonResource();
    }

    public static synchronized void commonResource() {
        while(true) {
            // Infinite loop to mimic heavy processing
            // 't1' won't leave this method
            // when 't2' try to enter this
        }
    }
}


