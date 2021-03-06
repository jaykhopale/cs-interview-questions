package questions.tree;

import api.TreeNode;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class BstInsert {

    public static TreeNode<Integer> insertBst(final TreeNode<Integer> root, final int value) {
        return insertBst(root, new TreeNode<>(value));
    }

    public static TreeNode<Integer> insertBst(final TreeNode<Integer> root, final TreeNode<Integer> node) {
        if (root == null) {
            return node;
        }

        if (node.value > root.value) {
            root.right = insertBst(root.right, node);
        }

        if (node.value < root.value) {
            root.left = insertBst(root.left, node);
        }

        return root;
    }
}
