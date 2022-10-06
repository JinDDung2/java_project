package week3.day2.collecetion;

import java.util.Arrays;
import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th(new Names());

        System.out.println("students 배열");
        likeLion2th.printStudentList();

        System.out.println("studentObjects 배열");
        likeLion2th.printStudentObjectsList();

    }
}
