package Command;

public class ShowInventoryCommand implements Command{

    private CarInventory inventory;

    public ShowInventoryCommand(CarInventory inventory){
        this.inventory = inventory;
    }

    public void execute(){
        inventory.showInventory();
    }

    @Override
    public void undo() {

    }
}
