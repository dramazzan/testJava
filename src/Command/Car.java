package Command;

public class Car {

    public String brand;
    public String model;

    public int yearOfRelease;
    public int price;

    public Car(String brand, String model, int yearOfRelease , int price) {
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
