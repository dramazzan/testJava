package Adapter;

public class OnlineCarListing implements CarListing {
    private String title;
    private String description;
    private int price;

    public OnlineCarListing (String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
