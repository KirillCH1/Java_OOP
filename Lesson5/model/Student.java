package model;

public class Student extends  User implements Comparable<Long>  {

    public Student(Long id, String name, String lastName) {
        super(id, name, lastName);
    }



    @Override
    public int compareTo(Long id) {
        int result = this.getId().compareTo(getId());
        return result;
    }
}
