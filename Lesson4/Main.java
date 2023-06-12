
/*
    Модифицировать учительский класс и связанные с ним, добавив типизацию(Добавить iterator + comparator + teacherGroup)
 */





import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Student oneStudent = new Student(1 ,"Ян", "Янов", "Янович", LocalDate.now());
        Student twoStudent = new Student( 2,"Петров", "Петр", "Петрович", LocalDate.now());
        Student threeStudent = new Student(3 ,"Сидоров", "Семен", "Петрович", LocalDate.now());

        Teacher oneTeacher = new Teacher("Валентина","Петреченко","Ивановна",LocalDate.now());
        Teacher twoTeacher = new Teacher("Иван","Иванов","Иванович",LocalDate.now());
        Teacher threeTeacher = new Teacher("Петр","Петров","Петрович",LocalDate.now());

        List<Student> studentList = new ArrayList<>();
        studentList.add(oneStudent);
        studentList.add(twoStudent);
        studentList.add(threeStudent);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(oneTeacher);
        teachersList.add(twoTeacher);
        teachersList.add(threeTeacher);

        StudentGroup sg = new StudentGroup(studentList,oneTeacher);
        TeacherGroup tg = new TeacherGroup(teachersList);
        System.out.println(sg);
        System.out.println(tg);


    }
}
