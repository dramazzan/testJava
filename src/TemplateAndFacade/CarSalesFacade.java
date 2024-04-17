package TemplateAndFacade;

public class CarSalesFacade  {
    private CarSaleProcess newCarSale;
    private CarSaleProcess usedCarSale;

    public CarSalesFacade() {
        Car newCar = new Car("Toyota", 2024, 20000 ,true);
        newCarSale = new NewCarSaleProcess(newCar);

        Car usedCar = new Car("BMW", 2018, 50000 ,false);
        usedCarSale = new UsedCarSaleProcess(usedCar);
    }

    public void sellNewCar() {
        System.out.println("Процесс продажи нового автомобиля:\n");
        newCarSale.startSellCar();
    }

    public void sellUsedCar() {
        System.out.println("Процесс продажи подержанного автомобиля:\n");
        usedCarSale.startSellCar();
    }



}
