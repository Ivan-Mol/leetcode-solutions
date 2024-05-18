package codewars;

import java.time.Duration;

public interface HumanReadableDurationFormat {

    static String formatDuration(int seconds) {
        Duration duration = Duration.ofSeconds(seconds);
        long d = duration.toDaysPart();
        long h = duration.toHoursPart();
        long m = duration.toMinutesPart();
        long s = duration.toSecondsPart();
        StringBuilder stringBuilder = new StringBuilder();
        if (d > 0) {
            stringBuilder
                    .append(d)
                    .append(d > 1 ? " days" : " day");
        }
        if (h > 0) {
            stringBuilder
                    .append(d > 0 ? ", " : "")
                    .append(h)
                    .append(h > 1 ? " hours" : " hour");
        }
        if (m > 0) {
            stringBuilder
                    .append(h > 0 || d > 0 ? ", " : "")
                    .append(m)
                    .append(m > 1 ? " minutes" : " minute");
        }
        if (s > 0) {
            stringBuilder.append(m > 0 || h > 0 || d > 0 ? " and " : "")
                    .append(s)
                    .append(s > 1 ? " seconds" : " second");
        }
        return stringBuilder.toString();
    }
    //        assertEquals("1 second", TimeFormatter.formatDuration(1));
    //        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
    //        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
    //        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
    //        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
}