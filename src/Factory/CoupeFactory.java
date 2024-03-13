package Factory;

public class CoupeFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Coupe();
    }
}
