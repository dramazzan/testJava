package TemplateAndFacade;

public class CarSalesFacade {
    private CarSaleProcess newCarSale;
    private CarSaleProcess usedCarSale;

    public CarSalesFacade() {
        Car newCar = new Car("Toyota", 2024, true);
        newCarSale = new NewCarSaleProcess(newCar);

        Car usedCar = new Car("BMW", 2018, false);
        usedCarSale = new UsedCarSaleProcess(usedCar);
    }

    public void sellNewCar() {
        System.out.println("Процесс продажи нового автомобиля:");
        newCarSale.sellCar();
    }

    public void sellUsedCar() {
        System.out.println("Процесс продажи подержанного автомобиля:");
        usedCarSale.sellCar();
    }
}
