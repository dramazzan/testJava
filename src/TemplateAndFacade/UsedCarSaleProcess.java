package TemplateAndFacade;

public class UsedCarSaleProcess extends CarSaleProcess {


    public UsedCarSaleProcess(Car car) {
        super(car);
    }

    @Override
    protected void prepareCar() {
        System.out.println("Подготовка подержанного автомобиля к продаже...");
    }

    @Override
    protected void testDriveCar() {
        System.out.println("Предоставление возможности для тест-драйва подержанного автомобиля...");
    }

    @Override
    protected void negotiatePrice() {
        System.out.println("Обсуждение цены подержанного автомобиля с клиентом...");
    }
}
