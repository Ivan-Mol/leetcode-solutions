package codewars;

public class DoIGetABonus {
        public static String bonusTime(final int salary, final boolean bonus) {
            return bonus? Integer.toString(salary*10) : Integer.toString(salary);
        }
}
