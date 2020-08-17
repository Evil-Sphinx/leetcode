import java.util.LinkedList;
import java.util.List;

/**
 * @author sphinx
 * @date 2020/8/17
 * @description
 */


public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> l1 = new LinkedList<Integer>();
        List<Integer> l2 = new LinkedList<Integer>();

        traverse(p, l1);
        traverse(q, l2);

        if (l1.size() != l2.size()) return false;

        for (int i = 0; i < l1.size(); i++) {
            if (!l1.get(i).equals(l2.get(i))) return false;
        }

        return true;
    }

    private void traverse(TreeNode node, List<Integer> result) {

        if (node == null) {
            result.add(Integer.MIN_VALUE);
            return;
        } else {
            result.add(node.val);
        }

        traverse(node.left, result);
        traverse(node.right, result);
    }

    public static void main(String[] args) {

        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));

        SameTree sameTree = new SameTree();

        System.out.println(sameTree.isSameTree(p, q));


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
