package TemplateAndFacade;

public class NewCarSaleProcess extends CarSaleProcess {

    public NewCarSaleProcess(Car car) {
        super(car);
    }

    @Override
    protected void prepareCar() {
        System.out.println("Подготовка нового автомобиля {" +getCarBrand()+"} к продаже ");
    }

    @Override
    protected void testDriveCar() {
        System.out.println("Предоставление возможности для тест-драйва нового автомобиля --> {"+getCarBrand() + "} " + getCarYear() + " года" );
    }

    @Override
    protected void negotiatePrice() {
        System.out.println("Обсуждение цены нового автомобиля с клиентом. Цена: " +getCarPrice() +"$");
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
