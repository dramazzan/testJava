package Strategy;

public class Circle implements  Draw {

    private double R;


    public Circle(){

    }

    public Circle(double r) {
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public void drawingShape() {
        System.out.println("Drawing a Circle");
    }
}
