package week1.day3;

import week1.day1.CalcTest.NumberGenerator;

public class RandomAlphaGenerator implements NumberGenerator {
    @Override
    public int generate(int a) {

        return (int)(Math.random()*26+'A');
    }
}
