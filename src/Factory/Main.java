package Factory;

public class Main {


    public static void main(String[] args) {
         CarFactory carFactory = CarFactoryCreater.createCarByType("cOupe");
         Car car = carFactory.createCar();

         car.driveCar();
    }




}
