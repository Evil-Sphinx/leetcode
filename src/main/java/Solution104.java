/**
 * @author sphinx
 * @date 9/8/20
 * @description
 */
public class Solution104 {

    int max = 0;

    public int maxDepth(TreeNode root) {
        helper(root, 0);
        return max;
    }

    public void helper(TreeNode node, int depth) {
        if (node == null) {
            if (depth > max) max = depth;
        } else {
            depth++;
            helper(node.left, depth);
            helper(node.right, depth);
        }
    }

}
