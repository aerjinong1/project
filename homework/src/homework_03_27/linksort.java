//package homework_03_27;
//
//
//public class linksort {
//    public static void main(String[] args) {
//        Link l5 = new Link();
//        Link l4 = new Link();
//        Link l3 = new Link();
//        Link l2 = new Link();
//        Link l1 = new Link();
//        l1.val = 5;
//        l2.val = 4;
//        l3.val = 3;
//        l4.val = 2;
//        l5.val = 1;
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        l5.next = null;
////        l1.showlink(l1);
//        l1.sort(l1);
//        l1.showlink(l1);
//    }
//
//}
//
//class Link {
//    int val;
//    Link next;
//
//    public void showlink(Link head) {
//        Link l1 = head;
//        if (l1 == null) {
//            System.out.println("空链表");
//        } else {
//
//            while (l1 != null) {
//                System.out.println(l1.val);
//                l1 = l1.next;
//            }
//        }
//    }
//
//    public void sort(Link head) {
//        if (head == null) {
//
//        } else {
//            head = sortlink(head);
//        }
//    }
//
//    public Link sortlink(Link head) {//调用方法
//        Link temp = head;
//        Trees t = new Trees();
//        while (temp != null) {
//            t.insert(t,temp.val);
//            temp = temp.next;
//        }
//        t.frontinsert(t,head);
//        return head;
//    }
//}
//
//class Trees {
//    int data;
//    Trees left;
//    Trees right;
//
//    public void frontinsert(Trees Troot,Link Thead ) {//按前序插入链表
//        if (Troot == null) {
//            return;
//        }
//        Link node = new Link();
//        node.val = Troot.data;
//        frontinsert(Troot.left,Thead);
//        node.val = Troot.data;
//        while (Thead.next!=null){
//            Thead = Thead.next;
//        }
//        Thead.next = node;
//        frontinsert(Troot.right,Thead);
//    }
//
//
//    public void insert(Trees root, int val) {//将未排序链表生成一颗不平衡的有序二叉树
//        Trees temp = root;
//        Trees node = new Trees();
//        node.data = val;
//        while (temp != null) {
//            if (val < temp.data) {
//                temp = temp.left;
//            } else if (val > temp.data) {
//                temp = temp.right;
//            }
//        }
//        if (val< temp.data){
//            temp.left = node;
//        }else if (val == temp.data) {
//            if (temp.left != null) {
//                node.left = temp.left;
//                temp.left = node;
//                return;
//            } else {
//                temp.right = node;
//                return;
//            }
//        }
//    }
//}