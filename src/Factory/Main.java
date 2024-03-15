package Factory;

public class Main {

    public static void main(String[] args) {
         CarFactory carFactory = CarFactoryCreater.createCarByType("cOupe");
        CarFactory car1Factory = CarFactoryCreater.createCarByType("Truck");
         Car car = carFactory.createCar();
         Car car1 = car1Factory.createCar();

         car.driveCar();
         car1.driveCar();
    }




}
