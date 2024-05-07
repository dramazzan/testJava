package State;

class SoldState extends CarState {
    public SoldState(Car car) {
        super(car);
    }

    @Override
    public void sellCar(Car car) {
        car.changeState(new InStockState(car));
        car.isSold(true);
        System.out.println("Автомобиль уже продан");
    }

    @Override
    public void testDrive(Car car) {
        System.out.println("Автомобиль уже продан");
        car.isSold(true);
        car.changeState(new InStockState(car));
    }

    @Override
    public void repair(Car car) {
        System.out.println("Автомобиль уже продан");
        car.isSold(true);
        car.changeState(new InStockState(car));
    }
}