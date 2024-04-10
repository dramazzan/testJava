package Adapter;

public class SportcarAdapter implements CarListing{

    private Sportcar sportcar;

    public SportcarAdapter(Sportcar sportcar){
        this.sportcar = sportcar;
    }

    @Override
    public String getTitle() {
        return sportcar.getModel() + " Sportcar";
    }

    @Override
    public String getDescription() {
        return "This sportcar is for sale";
    }

    @Override
    public int getPrice() {
        return sportcar.getPrice();
    }
}
