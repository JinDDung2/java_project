package codeup;

import java.util.Scanner;

public class Code1070 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        String str = null;
        switch (month) {
            case 1 :
            case 2 :
            case 12 :
                str ="winter";
            break;
            case 3 :
            case 4 :
            case 5 :
                str ="spring";
                break;
            case 6 :
            case 8 :
            case 7 :
                str ="summer";
                break;
            case 9 :
            case 10 :
            case 11 :
                str ="fall";
                break;
        }
        System.out.println(str);

    }
}

