package week1;

public class Main {

    public static void main(String[] args) {

//        Shape circle = new Circle(2);
//
//            System.out.println( circle.Area());
//
//        Square sq = new Square(4);
//
//            System.out.println(sq.Area());
//


//        sq.draw();



        Shape [] sh = {new Circle(2), new Square(4)};

        for(Shape s : sh){
            s.Area();


        }






    }

}
