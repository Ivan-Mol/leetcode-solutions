package interviews.examples;

import java.util.concurrent.CompletableFuture;

public interface Post<T> {
    CompletableFuture<T> getMessage();
}
