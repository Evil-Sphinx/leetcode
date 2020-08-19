import java.util.LinkedList;
import java.util.List;

/**
 * @author sphinx
 * @date 2020/8/18
 * @description
 */


public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        int rootIndex = nums.length / 2;


        test(new LinkedList<Integer>());
        new TreeNode();

        return null;


    }

    private void test(List<Integer> list) {

    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}