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
    
    public void pyramidReverse(int num) {
        for (int i = num-1; i >0 ; i--) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public void repeatExercise(int num) {
        System.out.println(str.repeat(num));
    }



    public static void main(String[] args) {
        Star star = new Star();
        int num = 5;
//        star.rightTriangleV1();
//        star.rightTriangleV2(num);
//        star.pyramid(num);
//        star.pyramidReverse(num);
        star.repeatExercise(num);
    }

}
