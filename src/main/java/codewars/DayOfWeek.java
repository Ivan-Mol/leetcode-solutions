package codewars;

import java.util.HashMap;

public interface DayOfWeek {

    static String getDay(int n) {
        HashMap<Integer, String> week = new HashMap<>();
        week.put(1, "Sunday");
        week.put(2, "Monday");
        week.put(3, "Tuesday");
        week.put(4, "Wednesday");
        week.put(5, "Thursday");
        week.put(6, "Friday");
        week.put(7, "Saturday");
        if (week.containsKey(n)) {
            return week.get(n);
        }
        return "Wrong, please enter a number between 1 and 7";
    }

}