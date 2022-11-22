package week10.algorithm;

public class Recurrence {
    public void print100(int num) {
        if (num > 100) return;
        System.out.println("num = " + num);
        num++;
        print100(num);

    }

    public static void main(String[] args) {
        Recurrence sol = new Recurrence();
        sol.print100(1);
    }
}
