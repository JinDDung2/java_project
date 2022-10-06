package week3.day2.collecetion;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjects = new ArrayList<>();
    private Names names;

    public LikeLion2th(Names names) {
        students = names.makeList();
        studentObjects = names.getStudentObjects();
    }

    // 멋쟁이 사자처럼 2기 학생들 이름이 들어있는 List

    public List<String> getStudentList() {
        return this.students;
    }

    public List<Student> getStudentObjects() {
        return this.studentObjects;
    }

    public void printStudentList() {
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("인원 수 : " + students.size());
    }

    public void printStudentObjectsList() {
        for (Student studentObject : studentObjects) {
            System.out.println(studentObject);
        }
        System.out.println("인원 수 : " + students.size());
    }
}
