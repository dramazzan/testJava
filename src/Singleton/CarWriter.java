package Singleton;

public class CarWriter extends Thread implements Runnable{
    private  CarSingleton singleton;

    public CarWriter(CarSingleton singleton){
        this.singleton = singleton;
    }

    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            for (int i = 0; i < 5; i++) {

                singleton.writeInfo(
                        "Brand: Toyota \n" +
                        "Model: Camry \n" +
                        "Year: 2022 \n"
                );
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

}
