package main;

public class Main {

    int pos = 0;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String s = "(A, (B, (D, 0, 0), 0), (C, (E, 0, (G, 0, 0)), (F, (H, 0, 0), (I, 0, 0))))";
        TreeNode tree = scanTree(s);
//        printTree(tree, new DirectMode());
//        printTree(tree, new InfixMode());
        printTree(tree, new ReverseMode());
    }

    private void printTree(TreeNode root, PrintMode mode) {
        mode.print(root);
        System.out.println("count = " + mode.getCount());
    }

    private TreeNode scanTree(String s) {
        TreeNode node = null;
        char c = s.charAt(pos++);
        switch (c) {
            case '(':
                node = new TreeNode();
                node.setInfo(s.charAt(pos++));
                node.setLeft(scanTree(s));
                node.setRight(scanTree(s));
                c = s.charAt(pos++);
                return node;
            case '0':
                return null;
            default:
                return scanTree(s);
        }
    }
}
