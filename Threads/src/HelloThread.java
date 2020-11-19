package Threads.src;

class HelloThread implements Runnable {
    static Integer integer;
    final int count;
    Object obj;

    public HelloThread(int count, Object obj) {
        this.count = count;
        this.obj = obj;
    }


    @Override
    public void run() {
        while (true) {
            iterate();
            System.out.println("Thread " + count + ": " + integer);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void iterate() {
    synchronized (obj) {
        integer++;
    }
    }


}