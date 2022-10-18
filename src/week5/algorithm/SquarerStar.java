package week5.algorithm;

public class SquarerStar {

    public void printSquareMatrix(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.println("*".repeat(width));
        }
    }

    public static void main(String[] args) {
        SquarerStar star = new SquarerStar();

        System.out.println("---정사각형---");
        int size = 4;
        star.printSquareMatrix(size);
        /* 정사각형
        ****
        ****
        ****
        ****
        */

        System.out.println("---직사각형---");
        int width = 5;
        int height = 3;
        star.printRectangle(width, height);

        /* 직사각형
        *****
        *****
        *****
        */
    }
}
