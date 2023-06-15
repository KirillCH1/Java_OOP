package model;


import java.util.List;


public class StudyGroup {
    private Teacher teacher;
    private List<Student> student;

    public StudyGroup(Teacher teacher,  List<Student> student) {
        this.teacher = teacher;
        this.student =  student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}