package week1;

public class Triangle extends Shape implements Draw {

    public double side1;
    public double side2;
    public double side3;

    Triangle(){
        this.side1=0.0;
        this.side2=0.0;
        this.side3=0.0;
    }

   public Triangle(double a , double b , double c){
        this.side1=a;
        this.side2=b;
        this.side3=c;
    }

    public void draw(){
        System.out.println("Drawing a Triangle");
    }

     double Area(){

        double p = (side1 + side2 + side3) / 2.0;

        double Area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

        return Area;
    }

}
