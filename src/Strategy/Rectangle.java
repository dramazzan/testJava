package Strategy;

public class Rectangle implements  Draw {

    private  double side_a;

    private  double side_b;

    Rectangle(){

    }

    public Rectangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double getSide_a() {
        return side_a;
    }

    public void setSide_a(double side_a) {
        this.side_a = side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public void setSide_b(double side_b) {
        this.side_b = side_b;
    }

    @Override
    public void drawingShape() {
        System.out.println("Drawing a Rectangle");
    }
}
