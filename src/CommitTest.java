import java.util.Scanner;

public class CommitTest {
    static int money;
    static int[] count = {50000,10000,5000,1000,500,100,50,10};
    static int[] result;
    public static void main(String[] args) {

        scan();
        calc();
        print();

    }

    
    public static void scan(){
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        result = new int[8];
    }
    public static void print(){
        for(int i =0;i<result.length;i++){
            System.out.println(count[i] + "원은 몇개 : " +result[i]);
        }
    }

    public static void math(int d_money,int index){
        if(money/d_money != 0){
            result[index] = money/d_money;
            money = money%d_money;
        }
    }
    public static void calc(){
        for(int i = 0; i<8;i++){
            math(count[i],i);
        }
    }
}
