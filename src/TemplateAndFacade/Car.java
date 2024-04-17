package TemplateAndFacade;

public class Car {

    private String brand;
    private int year;
    private int price;
    private boolean isNew;


    public Car(String brand, int year, int price ,boolean isNew) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.isNew = isNew;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear(){
        return year;
    }

    public int getPrice(){
        return price;
    }

    public boolean isNew(){
        return isNew;
    }





}
