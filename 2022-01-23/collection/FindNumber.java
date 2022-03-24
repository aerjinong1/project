package collection;

import java.util.ArrayList;
import java.util.List;

public class FindNumber {
    public static void main(String[] args) {
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        Integer removed = list.remove((int) (Math.random() * list.size()));
        int missNum = findMissNum(start, end, list);
        System.out.println(list.toString());
        System.out.println("miss number:" + missNum);
        System.out.println(removed == missNum ? "成功" : "失败");
        System.out.println(removed);
    }


    static int findMissNum(int start, int end, List<Integer> list) {
        //请实现这个方法
        int result = 0;

        for (int i = start ; i < end; i++) {
                int t = list.get(i-start);
                if (t!=i){
                    result = i;//如果不一样，那么一定是list少了一个，所以得返回i
                    return result;
                }
            }
        return 0;
    }
}
