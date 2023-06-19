package model;


import java.time.LocalDate;
import java.util.Comparator;

// Добавляем интерфейс Comparable для сравнения объектов класса model.Teacher
public class Teacher extends User implements Comparable<Teacher>{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    @Override
    public int compareTo(Teacher otherTeacher) {
        return this.getSecondName().compareTo(otherTeacher.getSecondName());
    }

    // Добавляем Comparator для сравнения объектов класса model.Teacher по фамилии
    static class TeacherComparator implements Comparator<Teacher> {
        @Override
        public int compare(Teacher teacher1, Teacher teacher2) {
            return teacher1.getSecondName().compareTo(teacher2.getSecondName());
        }
    }
}