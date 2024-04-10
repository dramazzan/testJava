package Adapter;

public class Truck implements Car{
    private String model;
    private int price;

    public Truck(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
