package Command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarInventory {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
        System.out.println("Добавлен автомобиль: {" + car.getBrand() + " " + car.getModel() + " " + car.getYearOfRelease()+ " " + car.getPrice() +"$ }");

    }

    public void removeCar(Car car){
        cars.remove(car);
        System.out.println("Удален автомобиль: {" + car.getBrand() + " " + car.getModel() + " " + car.getYearOfRelease() + " " + car.getPrice() +"$ }");

    }

    public void showInventory(){
        System.out.println("Список доступных автомобилей:");
        for(Car car : cars){
            System.out.println( "{" + car.getBrand() + " " + car.getModel() + " " + car.getYearOfRelease()+ " " + car.getPrice() + "$ }\n");
        }
    }

    public void sortCars() {
        System.out.println("Список сортированных машин по году выпуска:");

        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Integer.compare(car1.getYearOfRelease(), car2.getYearOfRelease());
            }
        };

        Collections.sort(cars, comparator);

        for (Car car : cars) {
            System.out.println("{" + car.getBrand() + " " + car.getModel() + " " + car.getYearOfRelease() +" "+ car.getPrice() + "$ }");
        }
    }


    public void calculateTotalPrice(){
        double totalValue = 0.0;

        for (Car car : cars) {
            totalValue += car.getPrice();
        }

        System.out.println("Общая стоимость : "+totalValue +"$");
    }


    public List<Car> findCar(String brand){

        List<Car> foundCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                foundCars.add(car);
            }
        }


            return foundCars;

    }

    }






