package week8.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    private int fibonacci(int n) {

        if(n == 1){
            return 1;
        } if(n==2){
            return 1;
        }


        return fibonacci(n-1) + fibonacci(n-2);
    }
}
