package interviews.prodcom;

import lombok.SneakyThrows;

public class ProducerConsumer {
    static Object[] objects = new Object[1];

    @SneakyThrows
    public synchronized void produce(String s) {
        if (objects[0] != null) {
            wait();
        }
        objects[0]=s;
    }

    public synchronized void consume() {
        if (objects[0]==null) {
            notify();
        }
        System.out.println(objects[0]);
        objects[0]=null;
    }


    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        producerConsumer.produce("some string");
        producerConsumer.consume();
        producerConsumer.produce("some string two");
        producerConsumer.consume();
    }
}
