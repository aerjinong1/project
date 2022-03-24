package array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        // 排序后:
        System.out.println(Arrays.toString(ns));


//        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
//        Arrays.sort(ns);
//        System.out.println(Arrays.toString(ns));


//        int[][][] ns = {
//                {
//                        {1, 2, 3},
//                        {4, 5, 6},
//                        {7, 8, 9}
//                },
//                {
//                        {10, 11},
//                        {12, 13}
//                },
//                {
//                        {14, 15, 16},
//                        {17, 18}
//                }
//        };
    }
}
