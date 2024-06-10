package interviews.prodcom;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    static List<String> strings = new ArrayList<>();

    @SneakyThrows
    public synchronized void produce(String s) {
        if (!strings.isEmpty()) {
            wait();
        }
        strings.add(s);
    }

    public synchronized void consume() {
        if (strings.isEmpty()) {
            notify();
        }
        System.out.println(strings.get(0));
        strings.clear();
    }


    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        producerConsumer.produce("some string");
        producerConsumer.consume();
        producerConsumer.produce("some string two");
        producerConsumer.consume();
    }
}
