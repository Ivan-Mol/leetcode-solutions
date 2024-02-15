package codewars;

public class Ship {
    private final double draft;
    private final int crew;

    public double getDraft() {
        return draft;
    }

    public int getCrew() {
        return crew;
    }

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    // your code her
    public boolean isWorthIt() {
        double res = draft - crew * 1.5;
        System.out.println(res);
        return res > 20;
    }
}