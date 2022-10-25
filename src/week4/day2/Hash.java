package week4.day2;

public class Hash {
    public int hash(String key){
        int asciiSum=0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        System.out.println(asciiSum);

        return asciiSum % 90;
    }

    public static void main(String[] args) {
        Hash hashFunction = new Hash();
        hashFunction.hash("Kyeongrok");

    }
}