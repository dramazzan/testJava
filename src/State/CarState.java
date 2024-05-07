package State;

public abstract class CarState {
    Car car;

    public CarState(Car car) {
        this.car = car;
    }

   abstract void sellCar(Car car);
   abstract void testDrive(Car car);
   abstract void repair(Car car);
}
