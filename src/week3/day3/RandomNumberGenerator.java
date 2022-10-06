package week3.day3;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int create(int num) {
        int random = (int) (Math.random() * num);
        return random;
    }
}
