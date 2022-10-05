package CalcTest;

public class ByPassGenerator implements NumberGenerator{
    @Override
    public int generate(int a) {
        return a;
    }
}
