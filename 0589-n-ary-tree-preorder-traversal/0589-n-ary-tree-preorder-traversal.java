/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null ) return list;
        preorderTree(root,list);
        return list;
    }
    
    public void preorderTree(Node root, List<Integer> list){
        if(root != null){
            if(root.children.size() == 0){
                list.add(root.val);
            }else{
                int size = root.children.size();
                list.add(root.val);
                for(int j =0; j<size; j++){
                    preorderTree(root.children.get(j),list);
                }
                return;
            }
        }
        return;
    }
}