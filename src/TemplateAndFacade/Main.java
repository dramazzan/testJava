package TemplateAndFacade;

public class Main {
    public static void main(String[] args) {
        CarSalesFacade carSalesFacade = new CarSalesFacade();

        carSalesFacade.sellNewCar();

        System.out.println("\n");

//        carSalesFacade.sellUsedCar();
    }
}
