package Strategy;

public class Square implements Draw{

    public double side;


    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void drawingShape() {
        System.out.println("Drawing a Square");

    }
}
