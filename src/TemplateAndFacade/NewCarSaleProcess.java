package TemplateAndFacade;

public class NewCarSaleProcess extends CarSaleProcess {
    public NewCarSaleProcess(Car car) {
        super(car);
    }

    @Override
    protected void prepareCar() {
        System.out.println("Подготовка нового автомобиля к продаже...");
    }

    @Override
    protected void testDriveCar() {
        System.out.println("Предоставление возможности для тест-драйва нового автомобиля...");
    }

    @Override
    protected void negotiatePrice() {
        System.out.println("Обсуждение цены нового автомобиля с клиентом...");
    }
}
