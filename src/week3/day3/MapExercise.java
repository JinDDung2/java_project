package week3.day3;

import java.util.HashMap;

public class MapExercise {
    public static void main(String[] args) {
        Names names = new Names();
        HashMap<String, String> studentsMap = names.makeStudentsMap();

        System.out.println(studentsMap.size());


    }
}
