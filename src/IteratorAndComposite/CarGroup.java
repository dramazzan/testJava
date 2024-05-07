package IteratorAndComposite;

import java.util.ArrayList;
import java.util.List;

class CarGroup extends CarComponent {
    public List<CarComponent> carComponents = new ArrayList<>();

    public void addCar(CarComponent car) {
        carComponents.add(car);
    }

    public void removeCar(CarComponent car) {
        carComponents.remove(car);
    }

    @Override
    void printInfo() {
        System.out.println("Car Group:");
        for (CarComponent car : carComponents) {
            car.printInfo();
        }
    }
}