package Command;

import java.util.List;

public class FindCarsCommand implements Command{

    private CarInventory inventory;
    private String brand;

    public FindCarsCommand(String brand,CarInventory inventory){
        this.brand = brand;
        this.inventory = inventory;
    }

    @Override
    public void execute() {
        List<Car> foundCars = inventory.findCar(brand);
        if (foundCars.isEmpty()) {
            System.out.println("Машин марки " + brand + " не найдено");
        } else {
            System.out.println("Найдены машины марки " + brand + ":");
            for (Car car : foundCars) {
                System.out.println(car);
            }
        }
    }
    @Override
    public void undo() {

    }
}
