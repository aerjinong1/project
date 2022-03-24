package homewor20200220.lrualgorithm;

import com.sun.org.apache.xerces.internal.xinclude.XPointerSchema;

import javax.jws.Oneway;
import java.util.Scanner;

/*
 * LRU
 * 最近使用
 * 将一个链表中最后一次使用的放到第一位，保持原长度不变
 * 将原先不存在的放到链表第一位，其他顺位后移，保持长度不变，将最后一位删除
 * */
/*

初版，只能实现现有范围内的LRU机制，不能再添加新的内容，
原因，我不知道该怎么用方法给链表中的节点命名，因此不能建造新的节点，只能使用现有的
蒋哥的单链表例子(import linklist.LRUBaseLinkedList)里使用的是int类型的，直接对数字当链表使用即add方法
另外，不能通过scanner输入node来模拟用户使用，但是好像可以通过向下转型的方式做到，没时间了
* */
public class Lrualgorithm {
    private final static Integer DEFAULT_CAPACITY = 5;//默认链表长度
    private final static Lrualgorithm headnode = new Lrualgorithm();
    private Lrualgorithm next;
    private Lrualgorithm front;
    private int date;
    private Lrualgorithm link;

    public void usednode(Lrualgorithm node) {
        boolean exist = ifexist(node);
        if (exist) {//判断节点是否存在
            deletNode(node);//删除节点
            insertNode(node);
        }

    }

    public boolean ifexist(Lrualgorithm node) {//判断节点是否存在
        Lrualgorithm temp = headnode;
        while (temp.next != null) {
            if (node.date == temp.date) {
                return true;
            }
            temp= temp.next;
        }
        return false;
    }

    public void insertNode(Lrualgorithm node) {//插入节点
        node.next = headnode.next;
        headnode.next.front = node;
        node.front = headnode;
        headnode.next = node;
    }

    public void deletNode(Lrualgorithm node) {//删除节点
        Lrualgorithm temp = headnode;
        while (temp.next != null) {
            if (node.date == temp.date) {
                temp.front.next = temp.next;
                temp.next.front = temp.front;
//                this.next=null;
//                this.front=null;
            }
            temp = temp.next;
        }
    }

    public void showlink(Lrualgorithm headnode) {
        Lrualgorithm temp = headnode;
        while (temp.next != null) {
            System.out.println(temp.next.date);
            temp = temp.next;
        }
//        if (temp.next==null){
//            System.out.println("这是一个空链表");
//        }else {
//            System.out.println(temp.next.date);
//            temp= temp.next;
//        }
    }

    public Lrualgorithm() {

    }

    public void setLink(Lrualgorithm front, Lrualgorithm next, int date) {
        this.date = date;
        this.front = front;
        this.next = next;
    }



    public static void main(String[] args) {
        Lrualgorithm lru0 = new Lrualgorithm();
        Lrualgorithm lru1 = new Lrualgorithm();
        Lrualgorithm lru2 = new Lrualgorithm();
        Lrualgorithm lru3 = new Lrualgorithm();
        Lrualgorithm lru4 = new Lrualgorithm();
        lru4.setLink(headnode, lru3, 4);
        lru3.setLink(lru4, lru2, 3);
        lru2.setLink(lru3, lru1, 2);
        lru1.setLink(lru2, lru0, 1);
        lru0.setLink(lru1, null, 0);
        headnode.next = lru4;
        lru4.usednode(lru3);
        Scanner sc = new Scanner(System.in);
        String nodea = sc.next();
//        Lrualgorithm
//        lru4.usednode((Lrualgorithm) sc.nextline());
//        lru1.usednode(lru2);
        lru1.showlink(headnode);
    }

}
