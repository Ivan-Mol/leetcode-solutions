package interviews.car;

import lombok.Setter;

@Setter
public class SmallBox<T> implements Storage {
    private T val;
    private int x = 50;
    private int y = 50;

    public SmallBox(T val, int x, int y) {
        if (isValSizeValid(x,y)){
            this.val = val;
        }else {
            System.out.println("Size of "+val+" is Incorrect");
        }
    }

    @Override
    public T getVal() {
        return val;
    }

    @Override
    public boolean isValSizeValid(int x, int y) {
        return this.x > x && this.y > y;
    }


}
