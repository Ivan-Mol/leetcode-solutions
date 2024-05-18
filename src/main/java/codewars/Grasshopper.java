package codewars;

public interface Grasshopper {
    public static int move(int position, int roll) {
        return position + (roll * 2);
    }
}
