package week2;

public class University {

    // агрегация
    Student[] students;
    Teacher[] teachers;

    //композиция
    Lesson[] lessons;

    //ассоциация
    public University(Student[] students , Teacher[] teachers , Lesson[] lessons){
        this.students = students;
        this.teachers = teachers;
        this.lessons = lessons;
    }



    public void studentDetails(){
        for(Student s : students){
            System.out.println(
                    s.getStudentId() + s.getName() + s.getSurname()
            );
        }
    }



}
