package Command;

public class CalculateTotalPriceCommand implements Command{

    private CarInventory inventory;

    public CalculateTotalPriceCommand(CarInventory inventory){
        this.inventory = inventory;
    }

    @Override
    public void execute() {
        inventory.calculateTotalPrice();
    }

    @Override
    public void undo() {

    }
}
