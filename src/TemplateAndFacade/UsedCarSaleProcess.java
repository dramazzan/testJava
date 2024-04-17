package TemplateAndFacade;

public class UsedCarSaleProcess extends CarSaleProcess {


    public UsedCarSaleProcess(Car car) {
        super(car);
    }

    @Override
    protected void prepareCar() {
        System.out.println("Подготовка подержанного автомобиля {" +getCarBrand()+"} к продаже ");
    }

    @Override
    protected void testDriveCar() {
        System.out.println("Предоставление возможности для тест-драйва подержанного автомобиля --> {"+getCarBrand() + "} " + getCarYear() + " года" );
    }

    @Override
    protected void negotiatePrice() {
        System.out.println("Обсуждение цены подержанного автомобиля с клиентом. Цена: " +getCarPrice()+"$");
    }

    @Override
    public String getCarBrand() {
        return super.getCarBrand();
    }

    public int getCarPrice(){
        return super.getCarPrice();
    }

    public int getCarYear(){
        return super.getCarYear();
    }
}
