package interviews.car;

public interface Storage<T> {
    T getVal();

    boolean isValSizeValid(int x, int y);
}
