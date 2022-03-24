package collection;

import java.util.*;

public class SimpleList {

    public static void main(String[] args) {
        //数组实现
//        Integer a = null;
//        List<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(a);
//
//        for (Integer a1 : arrayList) {
//            System.out.println(a1);
//        }
//        for (Iterator<Integer> it = arrayList.iterator(); it.hasNext(); ) {
//            System.out.println(it.next());
//        }
//
//        Iterator<Integer> it = arrayList.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }


//        List<String> strList = new ArrayList<>();
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        for (Iterator<String> it1 = strList.iterator(); it1.hasNext(); ) {
//            System.out.println(it1.next());
//        }

        ReverseList<String> rlist = new ReverseList<>();
        rlist.add("a");
        rlist.add("b");
        rlist.add("c");
        for (Iterator<String> it1 = rlist.iterator(); it1.hasNext(); ) {
            System.out.println(it1.next());
        }

        for (String s:rlist){
            System.out.println(s);
        }


//
//        //链表实现
//        List<Integer> linkedList = new LinkedList<>();
////
////        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(1);
//        }
////
//        System.out.println(arrayList);

//        List<A> list = new ArrayList<>();
//        list.add(new A("aaa", 111));
//        list.add(new A("aaa", 111));
//        list.add(new A("aaa", 111));
//        list.add(new A("aaa", 111));
//        A aaa = new A("aaa", 111);
//        System.out.println(list.contains(aaa));
//        long end = System.currentTimeMillis();
//        System.out.println("array:" + (end - start));
//
//
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            linkedList.add( i);
//        }
//        System.out.println(linkedList);
//        long end1 = System.currentTimeMillis();
//        System.out.println("link:" + (end1 - start1));
//
//        long start3 = System.currentTimeMillis();
////        for(int i=0;i<arrayList.size();i++){
////
////        }
////        Iterator iterator = arrayList.iterator();
////        while (iterator.hasNext()){
////            iterator.next();
////        }
//        for (Object o : arrayList) {
//
//        }
//        long end3 = System.currentTimeMillis();
//        System.out.println("array_read:" + (end3 - start3));
//
//        long start4 = System.currentTimeMillis();
//        int i = linkedList.indexOf(7777);
//        System.out.println(i);
//        for (Object o : linkedList) {
//
//        }
//        long end4 = System.currentTimeMillis();
//        System.out.println("link_read:" + (end4 - start4));


//        delList();


    }

    private static void delList() {
        //bad example
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        for (Object o : list) {
            list.remove(o);
        }


        //正确姿势（其实也不是完全正确）
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//            iterator.remove();
//        }
//        System.out.println(list);

    }
}

class A {
    String a1;
    int a2;

    public A(String a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    /**
     * 重写equals方法的要点：
     * 1、先确定对象“相等”的逻辑，即哪些属性相等，就认为是对象相等
     * 2、用instanceof判断传入的Object是不是当前类型，如果是则继续比较，如果不是则返回false
     * 3、对引用类型的属性使用类似Objects.equals()的方法进行比较，对基本类型直接使用==进行比较
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof A) {
            A aaa = (A) obj;
            return Objects.equals(a1, aaa.a1) && this.a2 == aaa.a2;
        }
        return false;
    }

}

//int的最大值：2^31-1
class B {
    String firstName;
    String lastName;
    int age;

    @Override
    public int hashCode() {
//        int h = 0;
//        h = 31 * h + firstName.hashCode();
//        h = 31 * h + lastName.hashCode();
//        h = 31 * h + age;
//        return h;

        return Objects.hash(firstName, lastName, age);
    }
}


class ReverseList<T> implements Iterable<T> {

    private List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }


    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator(list.size());
    }

    class ReverseIterator implements Iterator<T> {
        int index;

        ReverseIterator(int index) {
            this.index = index;
        }


        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return ReverseList.this.list.get(index);
        }
    }
}
