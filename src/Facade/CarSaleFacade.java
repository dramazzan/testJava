package Facade;

import java.util.List;

public class CarSaleFacade {
    private InventoryManager inventoryManager;
    private CarValuation carValuation;
    private CarPurchase carPurchase;

    public CarSaleFacade() {
        this.inventoryManager = new InventoryManager();
        this.carValuation = new CarValuation();
        this.carPurchase = new CarPurchase();
    }

    public void buyCarWithValuation(String make, String model, int year) {
        List<Car> availableCars = inventoryManager.getAvailableCars();
        for (Car car : availableCars) {
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model) && car.getYear() == year) {
                double estimatedValue = carValuation.estimateCarValue(car);
                System.out.println("Оценка стоимости " + car.getYear() + " " + car.getMake() + " " + car.getModel() + ": $" + estimatedValue);
                carPurchase.buyCar(car);
                return;
            }
        }
        System.out.println("Автомобиль " + year + " " + make + " " + model + " не найден в инвентаре.");
    }
}
