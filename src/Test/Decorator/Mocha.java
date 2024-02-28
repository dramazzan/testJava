package Test.Decorator;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public double cost(){
        return 0.20 + beverage.cost();
    }

}
