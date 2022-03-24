package homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes;

public class ZType {
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
        lt1.frontTree(lt1);
        System.out.println("============");
        lt1.zType(lt1);
//        ArrayList a = new ArrayList();
//        a.add(1);
//        System.out.println(a.size());


    }


}

class Tree {
    int data;
    Tree left;
    Tree right;
    Tree root;

    public void creatTree(Tree root) {

    }

    public void zType(Tree root) {
        ArrayList<Tree> stack = new ArrayList<>();
        ArrayList<Tree> queue = new ArrayList<>();
        stack.add(root);
        z(root, queue, stack);
    }

    public void z(Tree root, ArrayList<Tree> queue, ArrayList<Tree> strack) {

        while(queue.size() != 0||strack.size() != 0) {
            while (queue.size() != 0) {
                Tree temp = queue.get(0);
                System.out.println(temp.data);
                if (temp.left != null) {
                    strack.add(temp.left);
                }
                if (temp.right != null) {
                    strack.add(temp.right);
                }
                queue.remove(0);
            }
            while (strack.size() != 0) {
                Tree temp = strack.get(strack.size() - 1);
                System.out.println(temp.data);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                strack.remove(strack.size() - 1);
            }
        }
        queue.add(root.left);
        queue.add(root.right);
    }

    public void frontTree(Tree root) {
        System.out.println(root.data);
        if (root.left != null) {
            frontTree(root.left);
        }
        if (root.left != null) {
            frontTree(root.right);
        }
    }
}