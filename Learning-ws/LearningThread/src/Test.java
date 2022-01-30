public class Test {
    public static void main(String[] args) {
        System.out.println("I am here");

        Runnable threadState  = new ThreadState();
        Thread t1 = new Thread(threadState);
        Thread t2 = new Thread(new ThreadState());
        Thread t3 = new Thread(new ThreadState());

        System.out.println("Thread State 1:" + t1.getState());
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread State 2:" + t1.getState());
        System.out.println("Thread State 3:" + t3.getState());

        Thread t4 = new Thread(new DemoThread());
        Thread t5 = new Thread(new DemoThread());
        t4.start();
        t5.start();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread State 4:" + t4.getState());


    }
}
