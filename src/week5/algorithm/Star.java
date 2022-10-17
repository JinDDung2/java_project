package week5.algorithm;

public class Star {

    public void rightTriangleV1() {
        System.out.println("* ");
        System.out.println("* * ");
        System.out.println("* * * ");
        System.out.println("* * * *");
    }

    public void rightTriangleV2(int num) {
        for (int i=0; i<num; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Star star = new Star();
        int num = 4;
//        star.rightTriangleV1();
        star.rightTriangleV2(num);
    }
}
