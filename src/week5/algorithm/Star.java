package week5.algorithm;

public class Star {
    String str= "*";

    public Star() {}

    public Star(String str) {
        this.str = str;
    }

    public void rightTriangleV1() {
        System.out.println("* ");
        System.out.println("* * ");
        System.out.println("* * * ");
        System.out.println("* * * *");
    }

    public void rightTriangleV2(int num) {
        for (int i=0; i<num; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

    public void pyramid(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Star star = new Star();
        int num = 4;
//        star.rightTriangleV1();
//        star.rightTriangleV2(num);
        star.pyramid(num);
    }
}
