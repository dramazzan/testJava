package Strategy;

import week1.Shape;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Student[] students = {new Student("Ramazan"), new Student("Aiym"), new Student("Arman")};

        Draw[] shapes = {new Circle(), new Square(), new Rectangle()};


//       for(Student std : students){
//
//           for(Draw shape : shapes){
//
//
//               std.getName();
//               std.setDraw(shape);
//               std.execute();
//
//
//
//           }
//
//
//       }

        Map<Student , Draw> studentShapeMap = new HashMap<Student , Draw>();



            for(int i=0 ; i<students.length ; i++){
                studentShapeMap.put(students[i] , shapes[i]);
            }



        for(Student std : students){

            std.getName();
            std.setDraw(studentShapeMap.get(std));
            std.execute();

        }





    }

}

