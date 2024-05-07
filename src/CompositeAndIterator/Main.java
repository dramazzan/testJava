package CompositeAndIterator;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry");
        Car car2 = new Car("Honda Civic");
        Car car3 = new Car("Ford Mustang");

        CarGroup carGroup = new CarGroup();
        carGroup.addCar(car1);
        carGroup.addCar(car2);
        carGroup.addCar(car3);

        carGroup.print();

    }
}
