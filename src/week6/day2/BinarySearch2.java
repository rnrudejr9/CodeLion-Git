package week6.day2;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int targetNum = 7;

        int startIdx = 0;
        int endIdx = nums.length-1;

        while(startIdx <= endIdx) {
            int midIdx = (startIdx+endIdx)/2;
            int midValue = nums[midIdx];
            //인덱스 점 옮기기
            if (midValue > targetNum) {
                endIdx = midIdx - 1;
            } else if (midValue < targetNum) {
                startIdx = midIdx + 1;
            } else {
                // 같은경우
                System.out.println(midIdx);
                break;
            }
        }

    }
}
