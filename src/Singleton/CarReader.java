package Singleton;

import java.sql.SQLOutput;

public class CarReader extends Thread implements Runnable{

    private CarSingleton singleton;

    public CarReader(CarSingleton singleton){
        this.singleton = singleton;
    }

    @Override
    public void run(){
        try{
            Thread.sleep(2000);
            for (int i = 0; i < 5; i++) {

                String info = singleton.readInfo();
                System.out.println("Reading Car Information \n" + info);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }


}
