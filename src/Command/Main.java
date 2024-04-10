package Command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

        String brand = "Tyota";

        CarInventory inventory = new CarInventory();

        Car car1 = new Car("Toyota", "Camry" , 2017 , 25000);
        Car car2 = new Car("Honda", "Accord" , 2010 , 10000);
        Car car3 = new Car("Ferrari", "Roster" , 2018 , 200000);


        Command addCommand = new AddCarCommand(car1, inventory);
        Command addCommand2 = new AddCarCommand(car2, inventory);
        Command addCommand3 = new AddCarCommand(car3 , inventory);

        Command removeCommand = new RemoveCarCommand( car1 , inventory);
        Command showInventory = new ShowInventoryCommand(inventory);

        Command sortCarCommand = new SortCarCommand(inventory);

        Command totalPrice = new CalculateTotalPriceCommand(inventory);

        Command findCommand = new FindCarsCommand(brand,inventory);

        Call invoker = new Call();

        invoker.setCommand(addCommand);
        invoker.executeCommand();

        invoker.setCommand(addCommand2);
        invoker.executeCommand();

        invoker.setCommand(addCommand3);
        invoker.executeCommand();


//        invoker.setCommand(removeCommand);
//        invoker.executeCommand();
//
//        invoker.setCommand(showInventory);
//        invoker.executeCommand();

        invoker.setCommand(sortCarCommand);
        invoker.executeCommand();

//        invoker.setCommand(totalPrice);
//        invoker.executeCommand();

//        invoker.setCommand(findCommand);
//        invoker.executeCommand();




    }
}
