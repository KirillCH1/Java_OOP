package presenter;

import model.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Реализуем интерфейс Iterable для того, чтобы объекты класса presenter.TeacherGroup можно было перебирать
public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    @Override
    public String toString() {
        return "presenter.TeacherGroup{" +
                "teachers=" + teachers +
                '}';
    }

    // Реализуем метод iterator, чтобы объекты класса presenter.TeacherGroup можно было перебирать
    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this.teachers);
    }
}