package Adapter;

public class SedanAdapter implements CarListing{
    private Sedan sedan;

    public SedanAdapter(Sedan sedan) {
        this.sedan = sedan;
    }

    @Override
    public String getTitle() {
        return sedan.getModel() + " Sedan";
    }

    @Override
    public String getDescription() {
        return "This sedan is for sale";
    }

    @Override
    public int getPrice() {
        return sedan.getPrice();
    }
}
