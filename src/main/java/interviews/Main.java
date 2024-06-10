package interviews;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, String> map = new HashMap<>();

    static {
        map.put("value1", "one");
        map.put("value2", "two");
        map.put("value3", "three");
        map.put("value4", "four");
    }

    public static void main(String[] args) throws InterruptedException {
        Singleton singleton = Singleton.getSingleton();
    }
}
