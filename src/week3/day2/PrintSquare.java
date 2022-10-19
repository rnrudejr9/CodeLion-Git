package week3.day2;

import java.util.Scanner;

public class PrintSquare {
    public void printSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>0 && j<n-1 && i>0 && i<n-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintSquare ps = new PrintSquare();
        ps.printSquare(n);
    }
}
