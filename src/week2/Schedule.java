package week2;

import java.util.List;

public class Schedule {
    private List<Lesson> lessons;

    public Schedule(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }
}
