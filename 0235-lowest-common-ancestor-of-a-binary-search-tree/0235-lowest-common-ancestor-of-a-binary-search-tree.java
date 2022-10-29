/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int maxVal, minVal;
        if(p.val > q.val){
            maxVal = p.val;
            minVal = q.val;
        }else{
            maxVal = q.val;
            minVal = p.val;
        }
        return lca(root, minVal,maxVal);
    }
    public TreeNode lca(TreeNode root, long minVal, long maxVal){
        if(root!=null){
            if(root.val < minVal) return lca(root.right,minVal,maxVal);
            if(root.val > maxVal) return lca(root.left,minVal,maxVal);
            if(minVal <= root.val && root.val <= maxVal) return root;
            else return null;
        }
        return null;
        
    }
}