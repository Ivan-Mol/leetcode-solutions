package codewars;

public interface Dinglemouse {

    static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] result = new int[3];
        result[0] = humanYears;
        result[1] = 15;
        result[2] = 15;
        for (int i = 1; i < humanYears; i++) {
            result[1] = i == 1 ? result[1] + 9 : result[1] + 4;
            result[2] = i == 1 ? result[2] + 9 : result[2] + 5;
        }
        return result;
    }

}

//Cat Years
//15 cat years for first year
//+9 cat years for second year
//+4 cat years for each year after that
//Dog Years
//15 dog years for first year
//+9 dog years for second year
//+5 dog years for each year after that