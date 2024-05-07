package State;

class UnderRepairState extends CarState {
    public UnderRepairState(Car car) {
        super(car);
    }

    @Override
    public void sellCar(Car car) {
        if(car.isSold){
            System.out.println("Автомобиль уже продан");
        }else{
            System.out.println("Нельзя продать автомобиль на ремонте");
            car.changeState(new SoldState(car));
        }
    }

    @Override
    public void testDrive(Car car) {
        System.out.println("Нельзя тест-драйвить автомобиль на ремонте");
        car.changeState(new SoldState(car));
    }

    @Override
    public void repair(Car car) {
        System.out.println("Автомобиль уже находится в ремонте");
        car.changeState(new SoldState(car));
    }
}