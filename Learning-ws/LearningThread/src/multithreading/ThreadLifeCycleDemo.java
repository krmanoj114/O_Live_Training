package multithreading;

class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("We are inside the run function. The thread is in the" +Thread.currentThread().getState() + " state" );
    }
}

public class ThreadLifeCycleDemo {

    public  static void printThreadState(Thread threadToCheck){
        System.out.println("The thread is in the " + threadToCheck.getState()+ " state");
    }


    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        printThreadState(thread1);
        thread1.start();
        printThreadState(thread1);

        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                
            }

        }
        printThreadState(thread1);
    }
}


