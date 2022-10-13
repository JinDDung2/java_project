package codeup;

import java.util.Scanner;

public class Code1069 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        String str;
        switch (ch) {
            case 'A' : str ="best!!!";
                break;
            case 'B' : str = "good!!";
                break;
            case 'C' : str = "run!";
                break;
            case 'D' : str = "slowly~";
                break;
            default: str = "what?";
        }
        System.out.println(str);

    }
}

