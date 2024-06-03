package interviews.car;

import lombok.Getter;

@Getter
public class Car<T extends Storage> {
    private final Trunk trunk;

    public Car(T storage) {
        this.trunk = new Trunk(storage);
    }
}
