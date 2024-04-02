package Command;

import java.util.ArrayList;
import java.util.List;

public class CarInventory {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
        System.out.println("Добавлен автомобиль: {" + car.getBrand() + " " + car.getModel() + " " + car.getYearOfRelease() + "}");

    }

    public void removeCar(Car car){
        cars.remove(car);
        System.out.println("Удален автомобиль: {" + car.getBrand() + " " + car.getModel() + " " + car.getYearOfRelease() + "}");

    }

    public void showInventory(){
        System.out.println("Список доступных автомобилей:");
        for(Car car : cars){
            System.out.println( "{" + car.getBrand() + " " + car.getModel() + " " + car.getYearOfRelease() + "}\n");
        }
    }

}
