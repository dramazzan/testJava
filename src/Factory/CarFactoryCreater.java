package Factory;

public class CarFactoryCreater {

    public static CarFactory createCarByType(String type){

        if(type.equalsIgnoreCase("Sedan")){
            return new SedanFactory();
        }else if(type.equalsIgnoreCase("Truck")){
            return new TruckFactory();
        }else if(type.equalsIgnoreCase("Coupe")){
            return new CoupeFactory();
        }else{
            throw new RuntimeException(type + "is unknown type");
        }

    }

}
