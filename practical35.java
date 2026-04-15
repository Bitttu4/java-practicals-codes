// Write an Application that executes two threads. One displays “Hello” at every 1000 millisec. & Second displays “World” at every 3000 milliseconds. Create the threads by extending the Thread class.
class HelloThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class WorldThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("World");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class practical35 {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        WorldThread t2 = new WorldThread();

        t1.start();
        t2.start();
    }
}
