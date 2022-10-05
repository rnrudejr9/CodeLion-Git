package CalcTest;

public class RandomNumberCreate implements Create {

    @Override
    public int create() {
        return (int)(Math.random()*10);
    }
}
