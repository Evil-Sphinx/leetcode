import java.util.LinkedList;
import java.util.List;

/**
 * @author sphinx
 * @date 2020/8/19
 * @description
 */
public class Solution257 {


    private List<String> result = new LinkedList();

    public List<String> binaryTreePaths(TreeNode root) {

        List<Integer> temp = new LinkedList();

        helper(root, temp);

        return result;

    }

    public void helper(TreeNode root, List<Integer> temp) {
        if (root == null) return;

        temp.add(root.val);

        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (Integer integer : temp) {
                if (sb.length() > 0) {
                    sb.append("->");
                }
                sb.append(integer);
            }
            result.add(sb.toString());

        }
        helper(root.left, temp);
        helper(root.right, temp);

        temp.remove(temp.size() - 1);

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
