package State;

public class InStockState extends CarState{

    InStockState(Car car) {
        super(car);
    }

    @Override
    public void sellCar(Car car) {
        if(car.isSold){
            System.out.println("Автомобиль уже продан");
        }else{
            System.out.println("Продажа автомобиля...");
            car.changeState(new TestDriveState(car));
        }
    }

    @Override
    public void testDrive(Car car) {
        System.out.println("Тест-драйв доступен");
        car.changeState(new TestDriveState(car));
    }

    @Override
    public void repair(Car car) {
        System.out.println("Нет необходимости в ремонте");
        car.changeState(new TestDriveState(car));
    }}
