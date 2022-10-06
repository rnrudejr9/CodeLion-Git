package week1.day3;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        RandomNumberGenerator rand = new RandomNumberGenerator();
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ;i<50;i++){
            int r = rand.generate(10);
            set.add(r);
        }

        for(int i : set){
            System.out.println(i);
        }

    }
}
