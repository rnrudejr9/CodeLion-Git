package week2.day2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            pq.add(sc.nextInt());
        }
        System.out.println(pq.poll());

    }
}
