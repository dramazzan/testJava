package Command;

public class Car {

    public String brand;
    public String model;
    public int yearOfRelease;

    public Car(String brand, String model, int yearOfRelease) {
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
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
}
