package service;
import model.*;
import java.util.List;

public class StudyGroupService {
            public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
                 return new StudyGroup(teacher, studentList);
        }
}
