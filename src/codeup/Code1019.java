package codeup;

import java.util.Scanner;

public class Code1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split("\\.");
//        System.out.println(Arrays.toString(x));

        int year = Integer.parseInt(x[0]);
        int month = Integer.parseInt(x[1]);
        int day = Integer.parseInt(x[2]);

        System.out.printf(String.format("%04d.%02d.%02d",year,month,day));
    }

}
