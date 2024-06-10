package interviews.examples;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.ToString;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

@AllArgsConstructor

public class PaperPost<T> implements Post<T> ,Cloneable{

    private final Random random = new Random();
    private T message;

    @SneakyThrows
    @Override
    public CompletableFuture<T> getMessage() {
        return CompletableFuture.supplyAsync(this::supply);
    }

    @SneakyThrows
    private T supply() {
        Thread.sleep(random.nextInt(1500));
        return message;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PaperPost{\"message\":" +"\""+ message +"\"}";
    }
}
