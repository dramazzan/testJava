package CompositeAndIterator;

public class Car implements Component {
    public String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Car Model: " + model);
    }
}