package codeup;

import java.util.Scanner;

public class Code1020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split("-");
//        System.out.println(Arrays.toString(x));
        System.out.printf("%s%s", x[0], x[1]);
    }

}
