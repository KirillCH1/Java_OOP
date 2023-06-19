package view;


import model.*;
import presenter.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student oneStudent = new Student(1, "Ян", "Янов", "Янович", LocalDate.now());
        Student twoStudent = new Student(2, "Петров", "Петр", "Петрович", LocalDate.now());
        Student threeStudent = new Student(3, "Сидоров", "Семен", "Петрович", LocalDate.now());

        Teacher oneTeacher = new Teacher("Валентина", "Петреченко", "Ивановна", LocalDate.now());
        Teacher twoTeacher = new Teacher("Иван", "Иванов", "Иванович", LocalDate.now());
        Teacher threeTeacher = new Teacher("Петр", "Петров", "Петрович", LocalDate.now());

        List<Student> studentList = new ArrayList<>();
        studentList.add(oneStudent);
        studentList.add(twoStudent);
        studentList.add(threeStudent);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(oneTeacher);
        teachersList.add(twoTeacher);
        teachersList.add(threeTeacher);

        // Создаем объекты presenter.StudentGroup и presenter.TeacherGroup, используя ранее созданных студентов и учителей
        // Каждый объект presenter.StudentGroup имеет следующих учителя
        StudentGroup sg = new StudentGroup(oneTeacher);
        // Добавляем список студентов в объект presenter.StudentGroup
        sg.addStudents(studentList);

        // Создаем объект presenter.TeacherGroup и добавляем список учителей
        TeacherGroup tg = new TeacherGroup();
        tg.addTeachers(teachersList);

        // Выводим информацию о группах
        System.out.println(sg);
        System.out.println(tg);
    }
}