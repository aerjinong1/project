package demo;

public class Demo1 {

    //最好情况时间复杂度：O(1)
    //最坏情况时间复杂度：O(n)
    //平均情况时间复杂度：O(n)
    //只有同一代码块在不同情况下，时间复杂度有量级差距的情况下，才需要去分析以上三种时间复杂度
    int find(int[] array, int n, int x) {
        int i = 0;
        int pos = -1;
        for (; i < n; i++) {
            if (array[i] == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    //(1+2+3+4+...+n+n)/(n+1)=n(n+3)/2(n+1)
    //O(n)
    //(1*(1/2n))+(2*(1/2n))+...+(n*(1/2n))+(n*(1/2))=(3n+1)/4
    //O(n)


    //最好情况时间复杂度：O(1)
    //最坏情况时间复杂度：O(n)
    //平均情况时间复杂度：O(1)
    //均摊情况的时间复杂度：O(1)
    void insert(int val,int n){
        int[] array=new int[n];
        int count=0;
        if(count==array.length){
            int sum=0;
            for (int i=0;i<n;i++){
                sum=sum+array[i];
            }
            array[0]=sum;
            count=1;
        }
        array[count]=val;
        ++count;
    }
}
