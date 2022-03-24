package homework_20220320;

public class SecondBiggestNum {

    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5,6,7,8,5};
        find(a);
    }
    static public void find(int [] a){
        int first = a[0];
        int second = first;
        if (a.length==0){
            System.out.println("这是一个空数组");
        }else{

            for (int i = 0; i < a.length; i++) {
                if (first<a[i]){
                    second = first;
                    first = a[i];
                }
            }
        }
        System.out.println(second);
    }
}
