package homework;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class QuickSort {

    public static void main(String[] args) {
//        int bigsign;
        int legth;
        QuickSort link = new QuickSort();
        Snode slink = new Snode();
        link.creatLink(slink);
        link.showLink(slink);
        slink = link.separate(slink);
        System.out.println("===========");
        link.showLink(slink);

    }


    public Snode separate(Snode headnode) {
        Snode temp1 = headnode;
        int length=0;
        while (temp1 != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
            length++;
        }
        Snode temp = headnode;
        int bigsign = headnode.bigsign;
        for (int i = 0; i < length-1; i++) {
            if (temp.next.data <= bigsign) {
                temp = temp.next;
            }else{
                endInsert(temp.next.data,headnode);
                deletenextnode(temp);
                System.out.println("===========");
                showLink(headnode);
            }
        }
//        while (temp.next != null) {
//
//        }
        return headnode;
    }

    public void endInsert(int data, Snode node) {
        while (node.next != null) {
            node = node.next;
        }
//        if (node.next==null){
            Snode bnode = new Snode();
            node.next = bnode;
            bnode.data = data;
            bnode.front = node;
//        }else {
//            Snode bnode = new Snode();
//            bnode.data = data;
//            node.next.front = bnode;
//            bnode.next = node.next;
//            node.next= bnode;
//            node.bigsign = data;
//        }
    }

    public void deletenextnode(Snode node) {
        node.next = node.next.next;
    }

    public void creatLink(Snode headnode) {
        Scanner sc = new Scanner(System.in);
//         temp = new Snode();
        headnode.next = new Snode();
        Snode temp = headnode.next;
        int s = 1;
        while (s == 1) {
            System.out.println("输入数据");
            temp.data = sc.nextInt();
//            headnode.sign = temp.data;
            headnode.bigsign = temp.data;
//            headnode.tinysign = temp.data;
            System.out.println("扣一继续");
            s = sc.nextInt();
            if (s == 1) {
                temp.next = new Snode();
                temp = temp.next;
            }
        }
    }

    public void showLink(Snode headnode) {

        Snode temp = headnode;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

}

class Snode {
    //    Snode headnode = new Snode();
    Snode front;
    Snode next;
//    int length = 0;
    int data;
    int sign;//最后一位的标志
    int bigsign;
    int tinysign;


}