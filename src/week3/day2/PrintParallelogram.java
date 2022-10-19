package week3.day2;

import java.util.Scanner;

public class PrintParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n-1;
        for(int i = 0 ;i<n;i++){
            for(int j=0;j<n+(t-1);j++){
                if(j<t-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }

            }
            t++;
            System.out.println();
        }

    }
}
