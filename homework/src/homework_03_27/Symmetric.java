package homework_03_27;

import java.util.ArrayList;

public class Symmetric {
    public static void main(String[] args) {
        Tree lt1 = new Tree();
        lt1.data = 1;
        Tree lt2 = new Tree();
        lt2.data = 2;
        Tree lt3 = new Tree();
        lt3.data = 3;
        Tree lt4 = new Tree();
        lt4.data = 4;
        Tree lt5 = new Tree();
        lt5.data = 5;
        Tree lt6 = new Tree();
        lt6.data = 6;
        Tree lt7 = new Tree();
        lt7.data = 7;
        lt1.left = lt2;
        lt1.right = lt3;
        lt2.left = lt7;
        lt2.right = lt6;
        lt3.left = lt5;
        lt3.right = lt4;
        System.out.println(lt1.Symmetric(lt1));
    }
}

class Tree {
    int data;
    Tree left;
    Tree right;
    public boolean Symmetric(Tree root){
        boolean res = false;
        if (root.left!=null&&root.right!=null){
            Tree left = root.left;
            Tree right = root.right;
            res = judge(left,right);
        }

        return res;
    }
    public boolean judge(Tree left,Tree right){
        if (left.left!=null&&right.right!=null){//判断外围对称
            judge(left.left,right.right);
        }
        if (left.right!=null&&right.left!=null){//判断内围对称
            judge(left.right,right.left);
        }
        if (left.left!=null&&right.right==null||left.left==null&&right.right!=null||left.right!=null&&right.left==null||left.right==null&&right.left!=null){//不成立的条件
            return false;
        }
        return true;
    }

//    public void getstack(){
//        arr
//    }
}