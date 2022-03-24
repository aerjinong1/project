package homewor20200220.lrualgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteRepeat {

    static int time=0;

    public void delete(ArrayList<Integer> num) {
        for (int i = 0; i < num.size()-1; i++) {
//            int temp = 1;//不在这开个空间实在是不知道怎么删除连续出现3次以上的数字,现在会了【汗】
            while(num.get(i)==num.get(i+1)){
                time++;
                num.remove(i+1);
            }
//            if (num.get(i) == num.get(i + temp)){
//                num.remove(i+1);
//            }

        }
    }
    public void show(ArrayList<Integer> num){
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i)+"\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayList<Integer> origin = new ArrayList<Integer>();
        origin.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5));
        int or = origin.size();
        DeleteRepeat dr = new DeleteRepeat();
        dr.delete(origin);
        int num = or-origin.size();
        System.out.println("删除个数为:"+num);//计算数组个数差
        dr.show(origin);

        System.out.println("删除个数为:"+time);//静态
    }
}
