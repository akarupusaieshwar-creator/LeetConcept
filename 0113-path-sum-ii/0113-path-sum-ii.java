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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        sum(root,targetSum,new ArrayList<>());
        return list;
    }
    public void sum(TreeNode root,int t,List<Integer> l){
        if(root == null) return;
        l.add(root.val);
        if(root.left == null && root.right == null && root.val == t){
            list.add(new ArrayList<>(l));
        }
        int s = t - root.val;
        sum(root.left,s,l);
        sum(root.right,s,l);
        l.remove(l.size() - 1);
    }
}