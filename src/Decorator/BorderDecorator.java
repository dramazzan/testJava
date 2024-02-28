package Decorator;

public class BorderDecorator extends ShapeDecorator{

    public BorderDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        addBorder();
    }

    public void addBorder(){
        System.out.print(" add Border");
    }

}
