package week3.day2;

class SquarePrinter {
    public void squarePrintStar(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rectanglePrintStar(int n, int m){
        for(int i =0;i<n;i++){
            for(int j=0 ; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class StarPrint {
    public static void main(String[] args) {
        SquarePrinter sp = new SquarePrinter();
        sp.squarePrintStar(5);
        System.out.println();
        sp.rectanglePrintStar(3,5);
    }
}
