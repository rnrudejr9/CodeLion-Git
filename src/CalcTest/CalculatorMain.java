package CalcTest;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator(20,10,new SpecificNumberGenerator());
        c.plus();

        Calculator c2 = new Calculator(20, 10, new RandomNumberGenerator());
        c2.plus();
////        c.plus();
////        c.minus();
////        c.multiple();
////        c.divide();
//
//        int a = 15;
//        c.plus(a);
//        c.minus(a);
//        c.multiple(a);
//        c.divide(a);
    }
}
