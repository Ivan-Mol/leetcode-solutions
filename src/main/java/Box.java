import lombok.ToString;

import java.util.concurrent.Callable;
@ToString
public class Box implements Callable {
    Integer val = 1;
    @Override
    public Object call() throws Exception {
        Thread.sleep(5000);
        return val;
    }
}
