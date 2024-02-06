package week1;

public class Lesson{
    private String title;
    private String timeStart;
    private String timeEnd;
    private Teacher teacher;

    Lesson(){
        teacher = new Teacher();
    }

//    Lesson(String title, String timeStart,String timeEnd){
//        this.title = title;
//        this.timeStart = timeStart;
//        this.timeEnd = timeEnd;
//    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
