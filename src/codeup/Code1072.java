package codeup;

import java.util.Scanner;

public class Code1072 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numList = new int[num];

        for (int i =0; i<num; i++) {
            numList[i] = sc.nextInt();
        }

        for (int i : numList) {
            System.out.println(i);
        }

    }
}




