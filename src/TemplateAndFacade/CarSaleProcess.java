package TemplateAndFacade;

abstract class CarSaleProcess {


    private Car car;

    public CarSaleProcess(Car car) {
        this.car = car;
    }

    public void buyCar() {
        System.out.println("Вы приобрели автомобиль " + car.getBrand() + " " + car.getYear() + ".");
    }

    public final void sellCar() {
        greetCustomer();
        prepareCar();
        testDriveCar();
        negotiatePrice();
        completeTransaction();
        buyCar();
    }

    protected void greetCustomer() {
        System.out.println("Добро пожаловать в наш автосалон!");
        String carType = car.isNew() ? "новый" : "подержанный";
        System.out.println("Мы предлагаем вам " + carType + " автомобиль " + car.getBrand() + " " + car.getYear() + " года выпуска.");
    }

    protected abstract void prepareCar();
    protected abstract void testDriveCar();
    protected abstract void negotiatePrice();


    protected void completeTransaction() {
        System.out.println("Поздравляем с покупкой! Сделка завершена.");
    }
}
