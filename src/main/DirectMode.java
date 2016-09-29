package main;

/**
 * Created by Eugeny on 29.09.2016.
 */
public class DirectMode extends PrintMode {
    @Override
    public void print(TreeNode root) {
        if (root!=null) {
            if (process(root)) count++;
            print(root.getLeft());
            print(root.getRight());
        }
    }
}
