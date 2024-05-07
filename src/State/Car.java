package State;

public class Car {
    private CarState currentState;
    public boolean isSold = false;

    public Car() {
        this.currentState = new InStockState(this);
    }

    public void setSold(boolean sold) {
        this.isSold = sold;
    }


    public boolean isSold(boolean isSold) {
        return isSold;
    }

    public void changeState(CarState state){
        this.currentState = state;
    }

    public void sellCar() {
        currentState.sellCar(this);
    }

    public void testDrive() {
        currentState.testDrive(this);
    }

    public void repair() {
        currentState.repair(this);
    }
}