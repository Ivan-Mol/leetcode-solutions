package codewars;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public interface HumanReadableTime {
    static String makeReadable(int seconds) {
        // Do something
        Duration duration = Duration.ofSeconds(seconds);
        long HH = duration.toHours();
        long MM = duration.toMinutesPart();
        long SS = duration.toSecondsPart();
        return String.format("%02d:%02d:%02d", HH, MM, SS);
    }
}
