package week8.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(bufferedReader.readLine());
        arr = new int[n+1];
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {

        if(arr[n] != 0){
            return arr[n];
        }

        if(n == 1){
            return arr[n] = 1;
        } if(n==2){
            return arr[n] = 2;
        }
        return arr[n] = fibonacci(n-1) + fibonacci(n-2);
    }
}