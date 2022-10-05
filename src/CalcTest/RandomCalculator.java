package CalcTest;

public class RandomCalculator {
        //random 0~9 사이 정수
        //a + random number
        int b;



        public void plus(int a){
            System.out.println(a+b);
        }
        public void minus(int a){
            System.out.println(a-b);
        }
        public void multiple(int a){
            System.out.println(a*b);
        }

        public void divide(int a){
            double div = 0;
            try {
                div = a / b;
            }catch (Exception e){
                System.out.println("divide by zero");
            }finally {
                System.out.println(div);
            }
        }

}
