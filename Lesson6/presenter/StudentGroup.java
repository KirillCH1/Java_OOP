package presenter;

import model.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Реализуем интерфейс Iterable для того, чтобы объекты класса presenter.StudentGroup можно было перебирать
public class StudentGroup implements Iterable<Student>{
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;

    public StudentGroup(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    @Override
    public String toString() {
        return "presenter.StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    // Реализуем метод iterator, чтобы объекты класса presenter.StudentGroup можно было перебирать
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.students);
    }
}