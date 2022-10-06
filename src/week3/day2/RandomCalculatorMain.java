package week3.day2;

public class RandomCalculatorMain {
    public static void main(String[] args) {

        RandomCalculator randomCalculator0 = new RandomCalculator(new RandomNumberCreator());
        RandomCalculator randomCalculator = new RandomCalculator(10, new RandomNumberCreator());
        RandomCalculator specificCalculator = new RandomCalculator(2, new SpecificNumberCreator());

        System.out.println("-----고정값만 받기-----");
        randomCalculator0.plus();
        randomCalculator0.minus();
        randomCalculator0.multiple();
        randomCalculator0.divide();

        System.out.println("-----값 10 받기-----");
        randomCalculator.plus();
        randomCalculator.minus();
        randomCalculator.multiple();
        randomCalculator.divide();

        System.out.println("-----specificCalculator-----");
        specificCalculator.plus();
        specificCalculator.minus();
        specificCalculator.multiple();
        specificCalculator.divide();

    }
}
