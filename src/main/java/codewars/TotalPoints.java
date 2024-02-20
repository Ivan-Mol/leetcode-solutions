package codewars;

public interface TotalPoints {

    public static int points(String[] games) {
        int scores = 0;
        for (int i = 0; i < games.length; i++) {
            int frst = Integer.parseInt(games[i].substring(0,1));
            int scnd = Integer.parseInt(games[i].substring(2,3));
            int res = frst>scnd?3:frst==scnd?1:0;
            scores=scores+res;
        }
        return scores;
    }
}
//if x > y: 3 points (win)
//if x < y: 0 points (loss)
//if x = y: 1 point (tie)