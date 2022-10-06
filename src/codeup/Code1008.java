package codeup;

public class Code1008 {
    public void printString(String str1) {
        System.out.printf("%s\n", str1);
    }
    public static void main(String[] args) {
        Code1008 main = new Code1008();
        String str1 = "\u250C\u252C\u2510";
        String str2 = "\u251C\u253C\u2524";
        String str3 = "\u2514\u2534\u2518";

        main.printString(str1);
        main.printString(str2);
        main.printString(str3);
    }
}
