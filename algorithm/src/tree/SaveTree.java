package tree;

import java.util.ArrayList;
import java.util.Scanner;

public class SaveTree {
    public static void main(String[] args) {
        LinkedTree lt = new LinkedTree();
        lt.creatTree(lt);
        System.out.println("===============");
        lt.preOrder(lt);
        System.out.println("===============");
        lt.inOrder(lt);
        System.out.println("===============");
        lt.lastOrder(lt);
        System.out.println("===============层序遍历");
        lt.showLevel(lt);

    }

}


class LinkedTree {
    private int data;
    private LinkedTree left;
    private LinkedTree right;


//    public void levelTraversal(LinkedTree root) {//第一次
////        System.out.println(root.data);
////        if (root.left != null) {
////            levelTraversal(root.left);
////        }
////        if (left.right != null) {
////            levelTraversal(root.right);
////        }
//    }

//    public void level(LinkedTree root){//第二次
//        if (root == null) {
//            return;
//        }
//        if (root.left != null) {
//            level(root.left);
//        }
//        if (left.right != null) {
//            level(root.right);
//        }
//        System.out.println(root.left.data);
//        System.out.println(root.right.data);
//
//    }
    public void showLevel(LinkedTree root){//这个是直接的方法，因为level没有包含根节点，但是放进level就会因为递归乱套，所以放在了外面
        al.add(root.data);
        level(root);
    }
        ArrayList<Integer> al = new ArrayList<Integer>();
        public void level(LinkedTree root){//队列进行广度优先
            if (root == null||root.left==null||root.right==null) {
                return;
            }
            al.add(root.left.data);
            al.add(root.right.data);
            level(root.left);
            level(root.right);
            while (al.get(0)==0){
                al.remove(0);
            }
            System.out.println(al.get(0));
            al.remove(0);
        }

    public void creatTree(LinkedTree root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入0返回");
        int dd = sc.nextInt();
        if (dd == 0) {

        } else {
            System.out.println("请输入数据");
            root.data = sc.nextInt();
//            System.out.println(root.data);
            creatTree(root.left = new LinkedTree());
            creatTree(root.right = new LinkedTree());
        }
    }

    public void preOrder(LinkedTree root) {
        if (root == null) {
            return;
        }
        if (root.data == 0) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(LinkedTree root) {
        if (root == null) {
            return;
        }
        if (root.data == 0) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public void lastOrder(LinkedTree root) {
        if (root == null) {
            return;
        }
        if (root.data == 0) {
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.println(root.data);
    }
}


//    public LinkedTree creatTree(LinkedTree node) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("输入0停止");
//        if (sc.nextInt() == 0) {
//            return null;
//        } else {
//            System.out.println("请输入数据");
//            data = sc.nextInt();
//            node.left = creatTree(new LinkedTree());
//            node.right = creatTree(new LinkedTree());
//        }
//        return node;
//    }

//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public LinkedTree() {
//
//    }
//
//    public LinkedTree(int data) {
//        this.data = data;
//    }

//    public LinkedTree creatTree(LinkedTree root,int data) {
//        System.out.println("请输入数据");
//        this.data = data;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入0停止构建树，输入1构建左子树，2构建右子树");
//        int single = sc.nextInt();
//        if (single == 0) {
//        } else if (single == 1) {
//            System.out.println("请输入数据");
//            LinkedTree lt = new LinkedTree();
//            int ldata = sc.nextInt();
//            root.left = creatTree(lt,ldata);
//        }else if(single == 2){
//            System.out.println("请输入数据");
//            LinkedTree lt = new LinkedTree();
//            int rdata = sc.nextInt();
//            root.right = creatTree(lt,rdata);
//        }
//        return root;
//    }

//    public LinkedTree creatTree(){
//        Scanner sc = new Scanner(System.in);
//        this.setData(sc.nextInt());
//        System.out.println("输入0停止构建树，输入1构建左子树，2构建右子树");
//        int single = sc.nextInt();
//        if (single==0){
//        }else if (single==1){
//            this.left = new LinkedTree();
//        }
//        return root;
//    }
