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
    int ans = 0 ,max =Integer.MIN_VALUE;
    public int maxLevelSum(TreeNode root) {
        fun(root);
        return ans;
    }
    public void fun(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        ans = 1;
        int level = 1;
        while(!q.isEmpty()){
            int s = q.size();
            int sum = 0;
            for(int i=0;i<s;i++){
                TreeNode temp = q.poll();
                sum += temp.val;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            if(sum > max){
                max = sum;
                ans = level;
            }
            level++;
        }
    }
}