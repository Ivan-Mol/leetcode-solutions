package interviews;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class PingPongSync implements Runnable {
    private String name;
    private static final Object MONITOR = new Object();
    private static int val = 0;

    @SneakyThrows
    public void doSomething() {
        synchronized (MONITOR) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(name + " " + val++);
                if (i % 2 == 0) {
                    MONITOR.wait();
                }
                if (i % 2 != 0) {
                    MONITOR.notify();
                }
            }
        }
    }

    @Override
    public void run() {
        doSomething();
    }

    @SneakyThrows
    public static void main(String[] args) throws InterruptedException {
        PingPongSync pingPongSync = new PingPongSync("first");
         Thread thread1 = new Thread(pingPongSync);
        PingPongSync pingPongSync1 = new PingPongSync("second");
        Thread thread2 = new Thread(pingPongSync1);
        thread1.start();
        thread2.start();
    }
}
