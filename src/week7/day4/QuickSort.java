package week7.day4;

public class QuickSort {

    public static void sort(int[] a) {
        m_pivot_sort(a, 0, a.length - 1);
    }
    private static void m_pivot_sort(int[] a, int lo, int hi) {
        if(lo >= hi) {
            return;
        }
        int pivot = partition(a, lo, hi);

        m_pivot_sort(a, lo, pivot);
        m_pivot_sort(a, pivot + 1, hi);
    }


    private static int partition(int[] a, int left, int right) {
        int lo = left - 1;
        int hi = right + 1;
        int pivot = a[(left + right) / 2];		// 부분리스트의 중간 요소를 피벗으로 설정

        while(true) {
            do {
                lo++;
            } while(a[lo] < pivot);

            do {
                hi--;
            } while(a[hi] > pivot && lo <= hi);
            if(lo >= hi) {
                return hi;
            }

            swap(a, lo, hi);
        }

    }
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}