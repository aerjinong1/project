package tree;

public class SaveTree {
}


class LinkedTree {
    private int data;
    private LinkedTree left;
    private LinkedTree right;


    public void preOrder(LinkedTree root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
