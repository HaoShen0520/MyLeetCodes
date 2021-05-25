public class MinDifInBST {
    int pre;
    int min;

    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        pre = -1;
        inorder_search(root);
        return min;
    }

    public void inorder_search(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder_search(root.left);

        if (pre != -1) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        inorder_search(root.right);
    }
}
