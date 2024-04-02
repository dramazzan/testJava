package Command;

public class AddCarCommand  implements Command{

    private Car car;
    private CarInventory inventory;

    public AddCarCommand(Car car , CarInventory inventory){
        this.car = car;
        this.inventory = inventory;
    }

    public void execute(){
        inventory.addCar(car);
    }

    public void undo(){
        inventory.removeCar(car);
    }

}
