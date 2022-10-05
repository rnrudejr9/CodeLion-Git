package CalcTest;

public class Calculator {
    int a;
    int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
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
