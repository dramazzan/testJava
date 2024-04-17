package Facade;

public class Main {
    public static void main(String[] args) {
        CarSaleFacade carSaleFacade = new CarSaleFacade();
        carSaleFacade.buyCarWithValuation("Toyota", "Camry", 2020);
        carSaleFacade.buyCarWithValuation("Toyota", "Corolla", 2021);
    }
}
