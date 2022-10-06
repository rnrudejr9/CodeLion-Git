package week1.day3;

import week1.day1.CalcTest.NumberGenerator;

import java.util.HashSet;
import java.util.RandomAccess;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        NumberGenerator rand = new RandomNumberGenerator();
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0 ;i<50;i++){
//            int r = rand.generate(10);
//            set.add(r);
//        }
//        for(int i : set){
//            System.out.println(i);
//        }
        rand = new RandomAlphaGenerator();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<50;i++){
            int r = rand.generate(1);
            set2.add(r);
        }
        for(int c : set2){
            System.out.println((char)c);
        }
    }
}
