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
    public static void main(String[] args) {
        SquarerStar star = new SquarerStar();

        int size = 4;
        star.printSquareMatrix(size);
    }
}
