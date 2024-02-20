package Strategy;

public class Student  {

    private String name;

    private String surname;

    private int age;

    public Student(){}

    public Student(String name, String surname, int age, Draw draw) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.draw = draw;
    }

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Draw getDraw() {
        return draw;
    }

    Draw draw;


    public void setDraw(Draw draw) {
        this.draw = draw;
    }

    public void execute(){
        System.out.print(name+" ");
        draw.drawingShape();
    }

}
