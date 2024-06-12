package interviews.examples;

import lombok.SneakyThrows;

public class Main {
    ;

    @SneakyThrows
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(() -> System.out.println("second thread"));
        thread.start();
        thread2.start();

    }
}