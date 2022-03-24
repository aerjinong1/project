package zhumu_2;

import java.util.ArrayList;
interface Iops{
    int exec(int a,int b);
}
class add implements Iops {
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
class sub implements Iops {
    @Override
    public int exec(int a, int b) {
        return a-b;
    }
}
class MyArr {
    private ArrayList list;
    public MyArr(ArrayList list){
        this.list = list;
    }
    public void dis(){
        for (Object o:this.list){
            System.out.println(o);
        }
    }
    public MyArr map (Iops fun,int a){
        ArrayList templist = new ArrayList();
        for (Object o:this.list){
            templist.add(fun.exec((Integer) o,a));
        }
        MyArr myArr = new MyArr(templist);
        return myArr;
    }
}
public class demo05 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        MyArr myarr = new MyArr(list);
        myarr.map(new add(),1).map(new add(),2).dis();
    }
}
