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
    public int res ; 
    public class pair{
        int sum;
        int count;
        pair(int sum,int count){
            this.sum = sum;
            this.count = count;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;
        res = 0;
        fun(root);
        return res;
    }
    public pair fun(TreeNode root){
        if(root == null) return new pair(0,0);
        pair left = fun(root.left);
        pair right = fun(root.right);
        int sum = root.val + left.sum + right.sum;
        int count = 1 + left.count + right.count;
        if(root.val == sum/count) res++;
        return new pair(sum,count);
    }
}