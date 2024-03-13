package Factory;

public class TruckFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Truck();
    }
}
