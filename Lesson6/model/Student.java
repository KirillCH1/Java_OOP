package model;

import java.time.LocalDate;

// Добавляем интерфейс Comparable для сравнения объектов класса model.Student
public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(long studentId,String firstName, String secondName,
                   String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "studentId='" + studentId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    // Добавляем реализацию метода compareTo, чтобы можно было сравнивать объекты класса model.Student
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}