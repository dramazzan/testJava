package IteratorAndComposite;

class Car extends CarComponent {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    void printInfo() {
        System.out.println("Car: " + name + ", Price: " + price);
    }
}