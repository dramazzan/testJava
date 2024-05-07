package CompositeAndIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class CarGroupIterator implements Iterator<Component> {
    public List<Component> cars;
    public int position = 0;

    public CarGroupIterator(List<Component> cars) {
        this.cars = cars;
    }

    @Override
    public boolean hasNext() {
        return position < cars.size();
    }

    @Override
    public Component next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return cars.get(position++);
    }
}