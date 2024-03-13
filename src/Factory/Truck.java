package Factory;

public class Truck implements Car{
    @Override
    public void driveCar() {
        System.out.println("Drive a Truck");
    }
}
