import controller.StudyGroupController;
import model.Student;
import model.Teacher;
import service.StudyGroupService;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L,"Иван","Иванов"));
        students.add(new Student(2L,"Андрей","Андреев"));
        students.add(new Student(3L,"Кирилл","Кириллов"));
        students.add(new Student(4L,"Петр","Петров"));

        Teacher teacher = new Teacher(0L , "Федор","Федоров");



        StudyGroupService sgs = new StudyGroupService();
        sgs.createStudyGroup(teacher,students);
        StudyGroupController sgc = new StudyGroupController(sgs);
        sgc.createStudyGroup(teacher,students);
    }
}