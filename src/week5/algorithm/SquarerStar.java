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

    public void printTriangle(int size, int cnt) {
        if (cnt > size) return;

        System.out.print("*".repeat(cnt));
        System.out.println();
        printTriangle(size, ++cnt);

    }

    public void printSquareV2(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size-1) {
                System.out.println("*".repeat(size));
            } else {
                System.out.print("*");
                System.out.print(" ".repeat(size-2));
                System.out.print("*\n");
            }
        }
    }

    public static void main(String[] args) {
        SquarerStar star = new SquarerStar();

        System.out.println("---정사각형---");
        int size = 4;
        star.printSquareMatrix(size);

        System.out.println("---직사각형---");
        int width = 5;
        int height = 3;
        star.printRectangle(width, height);

        System.out.println("---재귀 직각삼각형---");
        star.printTriangle(size, 1);

        System.out.println("---가운데 뚫린 직사각형---");
        star.printSquareV2(size);
    }
}
