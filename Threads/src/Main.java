package Threads.src;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HelloThread.integer = 1000;
        Object obj = new Object();

        Thread tr1 = new Thread(new HelloThread(1, obj));
        Thread tr2 = new Thread(new HelloThread(2, obj));

        tr1.start();
        tr2.start();

//        Thread.sleep(5000);
//        System.out.println("Value is changed");
//
//        HelloThread.integer = 2000;
//        Thread.sleep(5000);
//        System.out.println("Value is changed");
//
//        HelloThread.integer = 5000;


    }
}
