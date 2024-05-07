package State;

class TestDriveState extends CarState {
    public TestDriveState(Car car) {
        super(car);
    }

    @Override
    public void sellCar(Car car) {
        if(car.isSold){
            System.out.println("Автомобиль уже продан");
        }else{
            System.out.println("Сначала завершите тест-драйв");
            car.changeState(new UnderRepairState(car));
        }

    }

    @Override
    public void testDrive(Car car) {
        System.out.println("Автомобиль уже на тест-драйве");
        car.changeState(new UnderRepairState(car));

    }

    @Override
    public void repair(Car car) {
        System.out.println("Нельзя ремонтировать автомобиль на тест-драйве");
        car.changeState(new UnderRepairState(car));
    }
}