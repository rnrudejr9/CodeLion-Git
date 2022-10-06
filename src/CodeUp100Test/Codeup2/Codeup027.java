package CodeUp100Test.Codeup2;

import java.util.Scanner;

public class Codeup027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] array = sc.nextLine().split("\\.");
        int []a=new int[3];
        for(int i=0;i<array.length;i++) {
            a[i]=Integer.parseInt(array[i]);
        }
        System.out.printf("%02d-%02d-%04d",a[2],a[1],a[0]);

    }
}
