package homework_20220320;

import java.util.Scanner;

public class SwitchLink {
    link headnode;

    public void creadlink(link head) {
        Scanner sc = new Scanner(System.in);

        link temp = head;
        while (sc.nextInt() == 1) {
            link node = new link();
            temp.next = node;
            System.out.println("请输入数据");
            node.data = sc.nextInt();
            System.out.println("输入1继续创建链表");
        }
    }


    public static void main(String[] args) {
        link l1 = new link();
        link l2 = new link();
        link l3 = new link();
        link l4 = new link();
        link l5 = new link();
        link l6 = new link();
        link l7 = new link();
        link l8 = new link();
        l1.data = 1;
        l2.data = 2;
        l3.data = 3;
        l4.data = 4;
        l5.data = 5;
        l6.data = 6;
        l7.data = 7;
        l8.data = 8;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = null;
        l1.showlink(l1.switchnum(l1));
//        l1.showlink(l1.swapPairs(l1));
    }

}

class link {
    link next;
    int data;

    public void showlink(link head) {
        link temp = head;
        if (head == null) {
            System.out.println("这是一个空链表");
        } else {
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }

    public link switchnum(link head) {//我自己的方法，有一点点小瑕疵
        link t1 = head;
        head = head.next;
         link tt = t1.next;
         while (tt.next.next != null) {
             tt = tt.next;
        }
        while ( t1.next.next != null) {
                link t2 = t1.next;
                link t3 = t2.next;
                if (t2.next.next!=null){
                    t1.next = t2.next.next;
                    t2.next = t1;
                    t1 = t3;
                }
        }
        link tu = head;
        while (tu.next != null) {
            tu = tu.next;
        }
        tt.next=null;
        tu.next = tt;
        return head;
    }



    public link swapPairs(link head) {//leecode上的方法
        if (head == null || head.next == null) {
            return head;
        }
        link newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}