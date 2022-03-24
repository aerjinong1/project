package homewor20200220.lrualgorithm;

import com.sun.org.apache.xalan.internal.xsltc.dom.MultiValuedNodeHeapIterator;
import linklist.LRUBaseLinkedList;

import java.util.Scanner;




//就差限制链表长度了



public class LRUlinklist<T> {
    /*
     * 确认链表最大长度
     * */
    private final static Integer Default_Length = 10;
    /*
     * 链表当前长度
     * */
    private static Integer current_length = 0;
    /*
     * 头结点
     * */
    private Snode<T> headnode = new Snode<>();

    public LRUlinklist() {
        this.headnode = new Snode<>();
    }


    public void add(T data) {
        current_length++;
        Snode ifExitNode = findPreNode(data);
        if (ifExitNode != null) {
            deleteNode(ifExitNode);
            insertnode(data);
//            deleteEndNode();
        } else {
            insertnode(data);
        }
    }
    /*
     * 将原先不存在的节点插入到头结点
     * */
//    public void insert_setNext(T date) {
//        Snode node = new Snode();
//        node.setNext(date);
//    }

    /*
     * 删除目标节点的下一个
     * */
    private void deleteNode(Snode prenode) {
        Snode temp = prenode.getNext();
        if (temp.next==null){
            deleteEndNode();
        }else {
            prenode.setNext(temp.getNext());
        }

//        temp = null;
    }

    private void deleteEndNode(){
        Snode temp = headnode;
        while (temp.next.next!=null){
            temp= temp.next;
        }
        temp.next=null;
    }

    /*
     * 头插法插入节点
     * */
    public void insertnode(T data) {
        Snode next = headnode.getNext();        //将head的下一个（链表第一个的有效节点当做next，传入到下一行的方法中）
        headnode.setNext(new Snode(data, next));//(头结点的下一个设为new SNode（data：数据，next：上一行的内容））
    }

    private void printAll() {//输出所有
        Snode node = headnode.getNext();
        while (node != null) {
            System.out.print(node.getDate() + ",");
            node = node.getNext();
        }
        System.out.println();
    }

    public Snode findPreNode(T data) {//
        Snode temp = headnode;
        while (temp.next != null) {
            if (temp.getNext().getDate() == data) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public class Snode<T> {
        private T date;
        private Snode next;
        private Snode front;

        public Snode getNext() {
            return this.next;
        }

        /*
         * 仅限头插法使用
         * */
        public Snode(T data, Snode next) {
            this.next = next;
            this.date = data;
        }

        public Snode() {
        }
        /*
         * 寻找目标节点的上一个节点,如果存在则返回上一个节点，
         * 不存在返回null
         * */


        /*
         *
         * */
        public void setNext(Snode node) {
            if (node == null) {

            } else {
                this.next = node;
                node.front = this;
            }

        }

        public T getDate() {
            return date;
        }

        //        public void setDate(T date) {
//            this.date = date;
//        }
        /*
         * 将已有的节点插入到头结点
         * */
        public void setHeadNext(Snode next) {//
            headnode.next.front = next;
            this.next = next;
        }


    }

    public static void main(String[] args) {
        LRUlinklist list = new LRUlinklist();
        Scanner sc = new Scanner(System.in);
        while (true) {
            list.add(sc.nextInt());
            list.printAll();
        }
    }
}
