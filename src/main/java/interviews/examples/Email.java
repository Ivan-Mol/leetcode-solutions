package interviews.examples;

import java.util.concurrent.CompletableFuture;

public class Email<T> implements Post<T>{
    private T val;
    @Override
    public CompletableFuture<T> getMessage() {
        return null;
    }
}
