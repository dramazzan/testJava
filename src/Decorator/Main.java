package Decorator;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.draw();

        System.out.println("\n");

        Shape decoratedCircle = new BorderDecorator(circle);
        decoratedCircle.draw();

        System.out.println("\n");

        Shape triangle = new Triangle();
        triangle.draw();

        System.out.println("\n");

        Shape decTriangle = new FillingDecorator(triangle);
        decTriangle.draw();

        System.out.println("\n");



    }

}
