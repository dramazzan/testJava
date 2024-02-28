package Decorator;

public class FillingDecorator extends ShapeDecorator {

    public FillingDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        addFilling();
    }

    public void addFilling(){
        System.out.print(" add Filling");
    }

}
