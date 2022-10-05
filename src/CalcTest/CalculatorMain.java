package CalcTest;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c = new Calculator(20,10,new SpecificNumberGenerator());
        c.plus();

        Calculator c2 = new Calculator(20, 10, new RandomNumberGenerator());
        c2.plus();

        Calculator c3 = new Calculator(20,10, new ByPassGenerator());
        c3.plus();
    }
}
