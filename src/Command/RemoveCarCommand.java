package Command;

public class RemoveCarCommand implements Command{

    private Car car;
    private CarInventory inventory;

    public RemoveCarCommand(Car car , CarInventory inventory){
        this.car = car;
        this.inventory = inventory;
    }

    @Override
    public void execute() {
        inventory.removeCar(car);
    }

    public void undo(){
        inventory.addCar(car);
    }

}
