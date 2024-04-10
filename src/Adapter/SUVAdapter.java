package Adapter;

public class SUVAdapter implements CarListing {
    private SUV suv;

    public SUVAdapter(SUV suv) {
        this.suv = suv;
    }

    @Override
    public String getTitle() {
        return suv.getModel() + " SUV";
    }

    @Override
    public String getDescription() {
        return "This SUV is for sale";
    }

    @Override
    public int getPrice() {
        return suv.getPrice();
    }
}
