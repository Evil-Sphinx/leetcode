import model.TreeNode;

/**
 * @author sphinx
 * @date 9/8/20
 * @description
 */
public class Solution111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null && root.left != null) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
