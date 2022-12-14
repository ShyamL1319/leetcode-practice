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
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode tNode = queue.remove();
                levelEle.add(tNode.val);
                if(tNode.left!=null)
                    queue.add(tNode.left);
                if(tNode.right!=null)
                    queue.add(tNode.right);
            }
            ans.add(levelEle);
            levelEle =  new ArrayList<>();
        }
        return ans;
    }
}