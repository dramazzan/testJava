package Facade;

public class CarPurchase {
        public void buyCar(Car car) {
            System.out.println("Покупка " + car.getYear() + " " + car.getMake() + " " + car.getModel() + " за $" + car.getPrice());
        }
}
