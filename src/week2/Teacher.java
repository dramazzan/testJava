package week2;

public class Teacher {

    private String name;
    private String surname;
    private int teacherId;

    public Teacher(String name , String surname , int teacaherId){
        this.name = name;
        this.surname = surname;
        this.teacherId = teacaherId;
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

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
