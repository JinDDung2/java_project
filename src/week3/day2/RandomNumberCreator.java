package week3.day2;

public class RandomNumberCreator implements NumberCreator{
    @Override
    public int create() {
        int randomNum = (int) (Math.random() * 9);
        return randomNum;
    }
}
