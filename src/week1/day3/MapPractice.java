package week1.day3;

import week1.day2.NameGenerator;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        NameGenerator gen = new NameGenerator();

        for(int i = 0 ;i<50;i++){
            map.put(i,gen.generateName());
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
    }
}
