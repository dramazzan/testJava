package TemplateAndFacade;

public class Car {

    private String brand;
    private int year;
    private boolean isNew;

    public Car(String brand, int year, boolean isNew) {
        this.brand = brand;
        this.year = year;
        this.isNew = isNew;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear(){
        return year;
    }

    public boolean isNew(){
        return isNew;
    }





}
