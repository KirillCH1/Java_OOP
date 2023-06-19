package presenter;

import model.Student;

import java.util.Iterator;
import java.util.List;

// Реализуем интерфейс Iterator для того, чтобы можно было перебирать объекты класса presenter.StudentGroup
public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    // Реализуем метод hasNext, чтобы можно было перебирать объекты класса presenter.StudentGroup
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    // Реализуем метод next, чтобы можно было перебирать объекты класса presenter.StudentGroup
    @Override
    public Student next() {
        if (!hasNext()){
            throw new RuntimeException("Students");
        }

        return students.get(counter++);
    }
}