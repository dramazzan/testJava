package State;

import javax.swing.plaf.nimbus.State;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        for(int i = 0; i < 5; i++) {
            car.sellCar();
            car.testDrive();
            car.repair();
        }



    }
}
