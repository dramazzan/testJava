package IteratorAndComposite;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 25000);
        Car car2 = new Car("Honda Civic", 20000);
        Car car3 = new Car("Ford Mustang", 35000);
        Car car4 = new Car("BMW M3", 30000);


        CarGroup carGroup = new CarGroup();
        carGroup.addCar(car1);
        carGroup.addCar(car2);

        CarGroup subGroup = new CarGroup();
        subGroup.addCar(car3);
        carGroup.addCar(subGroup);

        carGroup.printInfo();

        System.out.println("\nПеребор группы автомобилей:");
        CarIterator iterator = new CarListIterator(carGroup.carComponents);
        while (iterator.hasNext()) {
            iterator.next().printInfo();
        }
    }
}