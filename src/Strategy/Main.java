package Strategy;

public class Main {

    public static void main(String[] args) {

        Student[] students = {new Student("Ramazan"), new Student("Aiym"), new Student("Arman")};

        Draw[] shapes = {new Circle(), new Square(), new Rectangle()};


        for (Draw shape : shapes) {

            for (Student std : students) {

                std.getName();
                std.setDraw(shape);
                std.execute();


            }
            break;
        }


    }

}

