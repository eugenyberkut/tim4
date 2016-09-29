package main;

/**
 * Created by Eugeny on 29.09.2016.
 */
public class InfixMode extends PrintMode {

    @Override
    public void print(TreeNode root) {
        if (root!=null) {
            print(root.getLeft());
            if (process(root)) count++;
            print(root.getRight());
        }
    }

}
