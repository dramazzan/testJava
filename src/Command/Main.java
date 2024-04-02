package Command;

public class Main {
    public static void main(String[] args) {
        CarInventory inventory = new CarInventory();

        Car car1 = new Car("Tayota", "Camry" , 2017);
        Car car2 = new Car("Honda", "Accord" , 2010);

        Command addCommand = new AddCarCommand(car1, inventory);
        Command addCommand2 = new AddCarCommand(car2, inventory);

        Command removeCommand = new RemoveCarCommand( car1 , inventory);
        Command showInventory = new ShowInventoryCommand(inventory);

        Call invoker = new Call();

        invoker.setCommand(addCommand);
        invoker.executeCommand();

        invoker.setCommand(addCommand2);
        invoker.executeCommand();


        invoker.setCommand(removeCommand);
        invoker.executeCommand();

        invoker.setCommand(showInventory);
        invoker.executeCommand();



    }
}
