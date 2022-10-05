package week1.day1.CalcTest;

public class Calculator {
    NumberGenerator numberGenerator;
    int a;
    int b;
    public Calculator(int a, int b,NumberGenerator numberGenerator) {
        this.a = a;
        this.b = numberGenerator.generate(b);
    }
    public void plus(){
        System.out.println(a+b);
    }
    public void minus(){
        System.out.println(a-b);
    }
    public void multiple(){
        System.out.println(a*b);
    }
    public void divide(){
        double div = a/b;
        System.out.println(div);
    }



}
