package tree;

import java.util.Scanner;

public class MergeLink {

    public static void main(String[] args) {
        MergeLink ml = new MergeLink();
        Link lk1 = new Link();
        Link lk2 = new Link();
        System.out.println("请输入第一个链表");
        ml.creatLink(lk1);
        System.out.println("请输入第二个链表");
        ml.creatLink(lk2);
        Link l3 = ml.mergelink(lk1, lk2);
        ml.showLink(l3);
//        ml.showLink(lk);
    }

    Link head = new Link();

    public Link mergelink(Link l1, Link l2) {
        Link temp = head;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                temp.data = l1.data;
                l1 = l1.next;
                temp.next = new Link();
                temp = temp.next;
            } else if (l2.data < l1.data){
                temp.data = l2.data;
                l2 = l2.next;
                temp.next = new Link();
                temp = temp.next;
            }
        }
        while (l1 != null) {
            temp.data = l1.data;
            l1 = l1.next;
            temp.next = new Link();
            temp = temp.next;
        }
        while (l2 != null) {
            temp.data = l2.data;
            l2 = l2.next;
            temp.next = new Link();
            temp = temp.next;
        }
        return head;
    }

//    public Link mergelink(Link l1, Link l2) {
//
//        Link temp = head;
//        if (l2 == null && l1 == null){
//            return temp;
//        }else if (l2 == null && l1 != null) {
//            temp.data = l1.data;
//            l1 = l1.next;
//
//            temp.next = mergelink(l1, l2);
//
//        } else if (l1 == null && l2 != null) {
//            temp.data = l2.data;
//            l2 = l2.next;
//            temp.next = mergelink(l1, l2);
//        } else if (l1 != null&&l1.data < l2.data) {
//                temp.data = l1.data;
//                l1 = l1.next;
//
//                temp.next = mergelink(l1, l2);
//            } else if (l2 != null&&l2.data < l1.data) {
//                temp.data = l2.data;
//                l2 = l2.next;
//                temp.next = mergelink(l1, l2);
//            }
//
//        return head;
//    }

    public Link creatLink(Link head) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入0停止");
        if (sc.nextInt() != 0) {
            System.out.println("请输入数据");
            head.data = sc.nextInt();
            head.next = new Link();
            creatLink(head.next);
        }
        return head;
    }

    public void showLink(Link root) {
        Link temp = root;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

class Link {
    Link next;
    int data;

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}


//assert l1 != null;什么意思？
//有点小瑕疵