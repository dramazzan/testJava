package Facade;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Car> inventory;

    public InventoryManager() {
        inventory = new ArrayList<>();
        inventory.add(new Car("Toyota", "Camry", 2020, 25000));
        inventory.add(new Car("Honda", "Civic", 2018, 20000));
        inventory.add(new Car("Ford", "Mustang", 2019, 35000));
    }

    public List<Car> getAvailableCars() {
        return inventory;
    }

}
