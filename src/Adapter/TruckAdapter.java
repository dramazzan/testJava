package Adapter;

public class TruckAdapter implements CarListing {
    private Truck truck;

    public TruckAdapter(Truck truck) {
        this.truck = truck;
    }

    @Override
    public String getTitle() {
        return truck.getModel() + " Truck";
    }

    @Override
    public String getDescription() {
        return "This truck is for sale";
    }

    @Override
    public int getPrice() {
        return truck.getPrice();
    }
}
