package Singleton;

public class Singleton {

    private static Singleton singlton;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        if(singlton == null){
            singlton = new Singleton();
        }
        return singlton;
    }

}
