package CompositeAndIterator;

import java.util.ArrayList;
import java.util.List;

public class CarGroup implements Component {
    public List<Component> cars = new ArrayList<>();

    public void addCar(Component car) {
        cars.add(car);
    }

    public void removeCar(Component car) {
        cars.remove(car);
    }

    public List<Component> getCars() {
        return cars;
    }

    @Override
    public void print() {
        CarGroupIterator iterator = new CarGroupIterator(getCars());
        while(iterator.hasNext()) {
            iterator.next().print();
        }
    }
}
