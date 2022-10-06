package week1.day3;

import week1.day1.CalcTest.NumberGenerator;

public class RandomNumberGenerator implements NumberGenerator {
    @Override
    public int generate(int a) {
        return (int)(Math.random()*a);
    }
}
