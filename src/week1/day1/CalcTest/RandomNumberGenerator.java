package week1.day1.CalcTest;

public class RandomNumberGenerator implements NumberGenerator{


    @Override
    public int generate(int a) {
        return (int)(Math.random()*10);
    }
}
