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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root != null){
            queue.add(root);
        }
        List<Integer> levelEle = new ArrayList<>();
        List<TreeNode> levelNode = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode tNode = queue.remove();
            levelEle.add(tNode.val);
            levelNode.add(tNode);
            if(queue.isEmpty() && levelNode.size() > 0){
                for(TreeNode t:levelNode){
                    if(t.left!=null)
                        queue.add(t.left);
                    if(t.right!=null)
                        queue.add(t.right);
                }
                ans.add(levelEle);
                levelNode = new ArrayList<>();
                levelEle =  new ArrayList<>();
            }
        }
        return ans;
    }
}