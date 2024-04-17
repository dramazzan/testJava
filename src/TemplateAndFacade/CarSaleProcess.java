package TemplateAndFacade;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class CarSaleProcess {


    private Car car;

    public CarSaleProcess(Car car) {
        this.car = car;
    }

    public void buyCar() {
        System.out.println("Вы приобрели автомобиль {" + car.getBrand() + "} " + car.getYear() + " за "+ car.getPrice() + "$");
    }

    public final void startSellCar(){
        greetCustomer();
        askToContinue();
    }

    public final void sellCar() {
        prepareCar();
        testDriveCar();
        negotiatePrice();
        askToConfirm();
    }

//    public final void sellCar(){
//        greetCustomer();
//        prepareCar();
//        testDriveCar();
//        negotiatePrice();
//        completeTransaction();
//        buyCar();
//    }

    public final void endSellCar(){
        completeTransaction();
        buyCar();
    }


    protected void greetCustomer() {
        System.out.println("Добро пожаловать в наш автосалон!");
        String carType = car.isNew() ? "новый" : "подержанный";
        System.out.println("Мы предлагаем вам " + carType + " автомобиль {" + car.getBrand() + "} " + car.getYear() + " года выпуска за " +car.getPrice() + "$");
    }

    protected abstract void prepareCar();
    protected abstract void testDriveCar();
    protected abstract void negotiatePrice();


    protected void completeTransaction() {
        System.out.println("Поздравляем с покупкой! Сделка завершена.");
    }

    protected void askToContinue() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nХотите продолжить покупку? (да-#/нет-0): ");

        while (true) {
            try {
                String input = scanner.next();
                int choice = Integer.parseInt(input);

                if (choice == 0) {
                    System.out.println("Спасибо за посещение автосалона");
                    return;
                } else {
                    sellCar();
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите цифру (0 для нет, любая цифра для продолжения): ");
            }
        }
    }

    protected void askToConfirm() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nПодтвердите покупку? ((да-#/нет-0): ");

        while (true) {
            try{
                String input = scanner.next();
                int choice = Integer.parseInt(input);
                if(choice == 0){
                    System.out.println("Спасибо за посещение автосалона");
                    return;
                }else{
                    endSellCar();
                    return;
                }

            }catch (NumberFormatException e){
                System.out.println("Пожалуйста, введите цифру (0 для нет, любая цифра для продолжения): ");

            }
        }

    }


    public String getCarBrand(){
        return car.getBrand();
    }

    public int getCarPrice(){
        return car.getPrice();
    }

    public int getCarYear(){
        return car.getYear();
    }

}
