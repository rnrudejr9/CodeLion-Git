package p1005;

import java.util.Scanner;

public class CurrentTest {
    public static void main(String[] args) {
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        // raw 익히지 않은
        int refund = 12340; // 25000이라면 만원짜리 2장 5000원짜리 1장
        System.out.printf("5만원권 %d장 나머지:%d\n", refund / curr50000, refund % curr50000); // 25000을 5만원으로 거슬러주면?
        // 25,000원을 5만원으로 나누었을 때 몫, 나머지
        // 25,000원을 각 화폐 단위로 나누었을 때 몫과 나머지를 출력하는 코드를 작성해주세요.
        refund = refund % curr50000;
        // 5000원권은 1장만 나오게 하고 싶다. 왜냐, 25000 에서 2만원은 만원짜리 두개로 처리했기 때문에

        System.out.printf("1만원권 %d개 나머지:%d\n", refund / curr10000, refund % curr10000);
        refund = refund %10000;

        // refund는 25000을 1원으로 나눈 나머지로 값을 업데이트 한다.
//        refund = refund % 10000;
        System.out.printf("5천원권 %d개 나머지:%d\n", refund / curr5000, refund % curr5000);
        refund = refund % 5000;

        System.out.printf("천원권 %d개 나머지:%d\n", refund / curr1000, refund % curr1000);
        refund = refund % 1000;
        System.out.printf("오백원권 %d개 나머지:%d\n", refund / curr500, refund % curr500);
        refund = refund % 500;
        System.out.printf("백원권 %d개 나머지:%d\n", refund / curr100, refund % curr100);
        refund = refund % 100;
        System.out.printf("오십원권 %d개 나머지:%d\n", refund / curr50, refund % curr50);
        refund = refund % 50;
        System.out.printf("십원권 %d개 나머지:%d\n", refund / curr10, refund % curr10);
        refund = refund % 10;

        // 블록한 문자를 alt + j 로
        // step 2

    }

}
