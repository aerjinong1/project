package homewor20200220.lrualgorithm;

public class StackTest {
    /*
    不能实现栈的扩容，只能在限定范围内压栈，出栈时最后一位会有残留

*/
    public void pop(int numlist[],int num){
        int posion = numlist.length;
        for (int i = 0; i < posion+2; i++) {
            numlist[posion-1]=numlist[posion-2];
            --posion;
        }

        numlist[0]=num;
    }
    public void showarray(int numarray[]){
        for (int i = 0; i < numarray.length; i++) {
            System.out.println(numarray[i]);
        }
    }
    public void pusharray(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
    }
    public static void main(String[] args) {
        StackTest st = new StackTest();
        int num[] = {1,3,5,7,9};
        st.pop(num,2);
        st.showarray(num);
        st.pusharray(num);
        System.out.println("================");
        st.showarray(num);

    }
}
