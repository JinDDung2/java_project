package week3.day1;

import java.util.Scanner;

public class CountMoney {
    public static void main(String[] args) {
        // 현금으로 돈을 받고 25000원을 거슬러줘야 합니/
        // [50000, 10000, 5000, 1000, 500, 100, 50, 10]

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;
        int money = 25000;

        System.out.printf("%d원 %d개 나머지 %d원\n", curr50000, money / curr50000, money % curr50000);
        money = money % curr50000;
        System.out.printf("%d원 %d개 나머지 %d원\n", curr10000, money / curr10000, money % curr10000);
        money = money % curr10000;
        System.out.printf("%d원 %d개 나머지 %d원\n", curr5000, money / curr5000, money % curr5000);
        money = money % curr5000;
        System.out.printf("%d원 %d개 나머지 %d원\n", curr1000, money / curr1000, money % curr1000);
        money = money % curr1000;
        System.out.printf("%d원 %d개 나머지 %d원\n", curr500, money / curr500, money % curr500);
        money = money % curr500;
        System.out.printf("%d원 %d개 나머지 %d원\n", curr100, money / curr100, money % curr100);
        money = money % curr100;
        System.out.printf("%d원 %d개 나머지 %d원\n", curr50, money / curr50, money % curr50);
        money = money % curr50;
        System.out.printf("%d원 %d개 나머지 %d원\n", curr10, money / curr10, money % curr10);
        }
    }

