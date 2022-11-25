/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        // Create an array list to store the solution result...
        List<Integer> sol = new ArrayList<>();
        // Return the solution answer if the tree is empty...
        if(root == null) return sol;
        // Create an empty stack and push the root node...
        Stack<TreeNode> bag = new Stack<>();
        bag.push(root);
        // Loop till stack is empty...
        while(!bag.isEmpty()){
            // Pop a node from the stack...
            TreeNode node = bag.pop();
            sol.add(node.val);
            // Push the right child of the popped node into the stack...
            if(node.right != null) bag.push(node.right);
            // Push the left child of the popped node into the stack...
            if(node.left != null) bag.push(node.left);
        }
        return sol;     // Return the solution list...
    }
}