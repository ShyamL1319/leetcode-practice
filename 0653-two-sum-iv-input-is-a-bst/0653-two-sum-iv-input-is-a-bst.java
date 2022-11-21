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

class BSTIterator{
    private Stack<TreeNode> stack = new Stack<>();
    private boolean reverse = true;
    
    public BSTIterator(TreeNode root, boolean isReverse){
        reverse = isReverse;
        pushAll(root);
    }
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    
    public int next(){
        TreeNode tempNode = stack.pop();
        if(reverse) pushAll(tempNode.right);
        else pushAll(tempNode.left);
        return tempNode.val;
    }
    
    
    public void pushAll(TreeNode root){
        while(root != null){
            stack.push(root);
            if(reverse){
                root = root.right;
            }else{
                root = root.left;
            }
        }
    }
}
// class Solution {
//     public boolean findTarget(TreeNode root, int k) {
//         if(root == null) return false;
//         BSTIterator left = new BSTIterator(root, false);
//         BSTIterator right = new BSTIterator(root, true);
//         int next = left.next();
//         int before = right.next();
//         while(next < before){
//             if(next+before == k) return true;
//             else if(next+before < k)next = left.next();
//             else before = right.next();
//         }
//         return false;
        
//     }
    
// }


class Solution {
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k, root);
    }
    
    public boolean dfs(TreeNode node, int k, TreeNode root) {
        if (node == null) return false;
        if (search(root, k - node.val, node)) return true;
        return dfs(node.left, k, root) || dfs(node.right, k, root);
    }
    
    public boolean search(TreeNode node, int target, TreeNode pair) {
        if (node == null) return false;
        if (node.val == target && node != pair) return true;
        if (target > node. val) return search(node.right, target, pair);
        else return search(node.left, target, pair);
    }
}