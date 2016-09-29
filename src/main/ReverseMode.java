package main;

/**
 * Created by Eugeny on 29.09.2016.
 */
public class ReverseMode extends PrintMode {
    @Override
    public void print(TreeNode root) {
        if (root!=null) {
            print(root.getLeft());
            print(root.getRight());
            if (process(root)) count++;
        }
    }
}
