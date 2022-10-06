
package CodeUp100Test.Codeup1;

import java.util.Scanner;

public class Codeup019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.next().split("\\.");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int z = Integer.parseInt(s[2]);
        System.out.print(String.format("%04d", x) + "." + String.format("%02d", y) + "." + String.format("%02d", z));

    }
}
