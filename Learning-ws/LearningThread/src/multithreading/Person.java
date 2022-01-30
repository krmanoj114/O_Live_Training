package multithreading;

public class Person implements Runnable{
    private String name;
    private  String job;
    private String address;

    public Person(String name, String job, String address) {
        this.name = name;
        this.job = job;
        this.address = address;
    }

    @Override
    public void run() {
        printPersonDetails();
    }

    public synchronized void printPersonDetails() {
        String threadName = Thread.currentThread().getName();
        System.out.println("--------------------------------");
        System.out.println(threadName +" holds lock?-" + Thread.currentThread().holdsLock(this));
        if(threadName.equals("FirstThread")){
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName  +"Name -" +this.name);
        System.out.println(threadName +"Job -"+ this.job);
        System.out.println(threadName + "Address -" + this.address);
        System.out.println("--------------------------------");
    }

    private synchronized void printPersonDetail() {
        String threadName = Thread.currentThread().getName();
        System.out.println("--------------------------------");
        System.out.println(threadName + " Hold lock? - " + Thread.currentThread().holdsLock(this));
        System.out.println(threadName  +"Name -" +this.name);
        System.out.println(threadName +"Job -"+ this.job);
        System.out.println(threadName + "Address -" + this.address);

    }
}
