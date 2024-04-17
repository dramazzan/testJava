package Facade;

public class CarValuation {
    public double estimateCarValue(Car car) {
        return car.getPrice() * 0.9;
    }
}
