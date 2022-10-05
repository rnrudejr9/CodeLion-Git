package CalcTest;

public class CalculatorMain {
    public static void main(String[] args) {
//        Calculator c = new Calculator(20,10);
//        c.plus();
//        c.minus();
//        c.multiple();
//        c.divide();
        RandomCalculator c = new RandomCalculator(new RandomNumberCreate());

        int a = 15;
        c.plus(a);
        c.minus(a);
        c.multiple(a);
        c.divide(a);
    }
}
