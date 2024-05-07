package IteratorAndComposite;

import java.util.List;

class CarListIterator implements CarIterator {
    private List<CarComponent> cars;
    private int position = 0;

    public CarListIterator(List<CarComponent> cars) {
        this.cars = cars;
    }

    @Override
    public boolean hasNext() {
        return position < cars.size();
    }

    @Override
    public CarComponent next() {
        if (this.hasNext()) {
            return cars.get(position++);
        }
        return null;
    }
}