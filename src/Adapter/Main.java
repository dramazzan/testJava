package Adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<CarListing> carListings = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeCarListings();

        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    viewListings();
                    break;
                case 2:
                    addListing();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        }
        scanner.close();
    }

    private static void initializeCarListings() {
        carListings.add(new SedanAdapter(new Sedan("Toyota Camry", 25000)));
        carListings.add(new SUVAdapter(new SUV("Jeep Wrangler", 35000)));
        carListings.add(new TruckAdapter(new Truck("Ford F-150", 40000)));
        carListings.add(new SportcarAdapter(new Sportcar("Ferrari" , 200000)));
    }

    private static void displayMenu() {
        System.out.println("\nДобро пожаловать на платформу автосалонов!");
        System.out.println("1. Посмотреть списки");
        System.out.println("2. Добавить объявление");
        System.out.println("3. Выход");
        System.out.print("Пожалуйста, выберите опцию: ");
    }

    private static void viewListings() {
        System.out.println("\nДоступные объявления:");
        for (int i = 0; i < carListings.size(); i++) {
            System.out.println((i + 1) + ". " + carListings.get(i).getTitle() + " - $" + carListings.get(i).getPrice());
        }
    }

    private static void addListing() {
        System.out.println("\nДобавление нового объявления:");
        System.out.print("Введите модель автомобиля: ");
        String model = scanner.nextLine();
        System.out.print("Введите тип автомобиля (1 - Sedan, 2 - SUV, 3 - Truck,4 - Sportcar): ");
        int type = scanner.nextInt();
        System.out.print("Введите цену: ");
        int price = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                carListings.add(new SedanAdapter(new Sedan(model, price)));
                break;
            case 2:
                carListings.add(new SUVAdapter(new SUV(model, price)));
                break;
            case 3:
                carListings.add(new TruckAdapter(new Truck(model, price)));
                break;
            case 4:
                carListings.add(new SportcarAdapter(new Sportcar(model , price)));
            default:
                System.out.println("Неверный тип автомобиля. Объявление не добавлено.");
        }

        System.out.println("Объявление успешно добавлено!");
    }

}
