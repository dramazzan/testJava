package Singleton;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        CarSingleton singleton = CarSingleton.getSingleton();

        CarWriter writer = new CarWriter(singleton);
        CarReader reader = new CarReader(singleton);

        Thread writerThread = new Thread(writer);
        Thread readerThread = new Thread(reader);

        new CarWriter(singleton).start();
        new CarReader(singleton).start();


    }
}
