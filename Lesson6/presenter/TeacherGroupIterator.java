package presenter;

import model.Teacher;

import java.util.Iterator;
import java.util.List;

// Реализуем интерфейс Iterator для того, чтобы можно было перебирать объекты класса presenter.TeacherGroup
public class TeacherGroupIterator implements Iterator<Teacher> {

    private int counter;
    private final List<Teacher> teachers;

    public TeacherGroupIterator(List<Teacher> teachers) {
        this.teachers = teachers;
        this.counter = 0;
    }

    // Реализуем метод hasNext, чтобы можно было перебирать объекты класса presenter.TeacherGroup
    @Override
    public boolean hasNext() {
        return counter < teachers.size();
    }

    // Реализуем метод next, чтобы можно было перебирать объекты класса presenter.TeacherGroup
    @Override
    public Teacher next() {
        if (!hasNext()){
            throw new RuntimeException("model.Teacher");
        }

        return teachers.get(counter++);
    }
}