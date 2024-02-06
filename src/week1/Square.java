package week1;

public class Square extends Shape implements Draw{

    public double side;

    Square(){
        this.side = 0.0;
    }

   public Square(double side){
        this.side = side;
    }

     double Area(){
      double  A = side*side;

      return A;
    }

    public void draw(){
        System.out.println("Drawing a Square");
    }



}
