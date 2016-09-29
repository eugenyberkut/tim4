package main;

/**
 * Created by Eugeny on 29.09.2016.
 */
public abstract class PrintMode {
    protected int count;

    public abstract void print(TreeNode root);

    public boolean process(TreeNode root) {
        if (root.getLeft()==null && root.getRight()==null) {
            System.out.println(root.getInfo());
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }
}
