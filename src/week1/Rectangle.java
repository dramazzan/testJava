package week1;

public class Rectangle extends Shape implements Draw {

    public  double side_a;

   public  double side_b;

    Rectangle(){
        this.side_a = 0.0;
        this.side_b = 0.0;
    }

   public Rectangle(double a , double b){
        this.side_a = a;
        this.side_b = b;
    }

    public void draw(){
        System.out.println("Drawing a Rectangle");

    }

     double Area(){
        double A = side_a*side_b;

        return A;
    }

}
