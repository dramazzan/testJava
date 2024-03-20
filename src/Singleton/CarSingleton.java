package Singleton;

public class CarSingleton {
    private static CarSingleton singleton;
    private String carInfo;

    private CarSingleton(){
        carInfo = "";
    }

    public static synchronized CarSingleton getSingleton(){
        if(singleton == null){
            singleton = new CarSingleton();
        }
        return singleton;
    }

    public synchronized void  writeInfo(String info){
        System.out.println("Writing Car Information \n"+info);
        carInfo = info;
    }

    public synchronized String readInfo(){
        return carInfo;
    }


}
