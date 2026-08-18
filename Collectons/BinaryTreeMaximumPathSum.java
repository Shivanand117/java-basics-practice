package  Collectons;
public class BinaryTreeMaximumPathSum {

    // Tree Node
    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Stores the maximum path sum found so far
    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {

        maxGain(root);

        return maxSum;
    }

    // Returns the maximum gain that can be extended to parent
    public static int maxGain(TreeNode node) {

        // Base case
        if (node == null) {
            return 0;
        }

        // Maximum contribution from left subtree
        int leftGain = Math.max(maxGain(node.left), 0);

        // Maximum contribution from right subtree
        int rightGain = Math.max(maxGain(node.right), 0);

        // Path passing through current node
        int currentPathSum =
                node.val + leftGain + rightGain;

        // Update global maximum
        maxSum = Math.max(maxSum, currentPathSum);

        // Return only one side to parent
        return node.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {

        /*
                 -10
                 /  \
                9    20
                    /  \
                   15   7
        */

        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);

        root.right.right = new TreeNode(7);

        int result = maxPathSum(root);

        System.out.println("Maximum Path Sum = " + result);
    }
}