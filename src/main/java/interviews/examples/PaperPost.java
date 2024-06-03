package interviews.examples;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

@AllArgsConstructor
public class PaperPost<T> implements Post<T> {

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
}
