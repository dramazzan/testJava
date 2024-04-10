package Command;

public class SortCarCommand implements Command{

    private CarInventory inventory;

    public SortCarCommand(CarInventory inventory){
        this.inventory = inventory;
    }

    public void execute(){
        inventory.sortCars();
    }
    public void undo(){
        System.out.println(" ");
    }




}
