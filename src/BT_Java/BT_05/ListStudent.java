package BT_Java.BT_05;

import java.util.ArrayList;

public class ListStudent {
    private final ArrayList<Student> students;

    public ListStudent() {
        this.students = new ArrayList<Student>();
    }

    public ListStudent(ArrayList<Student> students) {
        this.students = students;
    }

    void addStudent(Student student) {
        this.students.add(student);
    }

    void inListStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    boolean isListStudent() {
        return this.students.isEmpty();
    }

    int sumStudents() {
        return students.size();
    }

    void nullStudent() {
        this.students.removeAll(students);
    }

    boolean checkStudent(Student student) {
        return this.students.contains(student);
    }

    boolean removeStudent(Student student) {
        if (checkStudent(student)) {
            return this.students.remove(student);
        }
        return false;
    }

    public static void main(String[] args) {
        ListStudent students = new ListStudent();
        Student student = new Student("A123", "giangtt", 12.8, "1999");
        students.addStudent(student);
        Student student1 = new Student("A1234", "giangtt1", 12.8, "1999");
        //add student
        students.addStudent(student1);
        //in list student
        students.inListStudent();
        System.out.println(students.isListStudent());
        //sum student
        System.out.println("Tong :" + students.sumStudents());

        System.out.println("kiem tra ton tai:" + students.checkStudent(student1));
        System.out.println("delete:");
        students.removeStudent(student1);
        students.inListStudent();

        students.nullStudent();
        System.out.println("List student");
        students.inListStudent();
    }
}
