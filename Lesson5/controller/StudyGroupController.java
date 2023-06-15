package controller;
import model.*;
import service.*;
import java.util.List;

public class StudyGroupController {
    private final StudyGroupService studyGroupService;

    public StudyGroupController(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroup studentGroups = new StudyGroup(teacher, students);
        System.out.println("Создана учебная группа с преподавателем " + studentGroups.getTeacher().toString() + " и студентами:");
        for (Student student : studentGroups.getStudent()) {
            System.out.println("- " + student.toString());
        }
    }
}