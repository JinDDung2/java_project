package week3.day2;

public class RandomCalculator implements Calculator{

    private int num;
    private int random;
    private NumberCreator numberCreator;

    public RandomCalculator(int num, NumberCreator numberCreator) {
        this.num = num;
        this.numberCreator = numberCreator;
        random = numberCreator.create();
    }

    public RandomCalculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.num = 100;
    }

    @Override
    public void plus() {
        System.out.printf("%d + %d = %d", num, random, num+random);
        System.out.println();
    }

    @Override
    public void minus() {
        System.out.printf("%d - %d = %d", num, random, num-random);
        System.out.println();
    }

    @Override
    public void multiple() {
        System.out.printf("%d * %d = %d", num, random, num*random);
        System.out.println();
    }

    @Override
    public void divide() {
        try {
            float result = num / random;
            System.out.printf("%d / %d = %f", num, random, result);
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("분모가 0이라 계산이 안됩니다");
        }

    }
}
