package week1;

public class Circle extends Shape implements Draw{

    public double R;

    Circle(){
        this.R = 0.0;
    }

    public Circle(double R){
        this.R = R;
    }

     double Area(){
        double A = Math.PI*R*R;

        return A;
    }

    public void draw(){
        System.out.println("Drawing a Circle");
    }


}
