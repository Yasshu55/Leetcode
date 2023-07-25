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
    public TreeNode subtreeWithAllDeepest(final TreeNode root) {
      if(root==null){
          return null;
      }

      int ld = getDepth(root.left);
      int rd = getDepth(root.right);

      if(ld == rd){
          return root;
      }
      else if(ld>rd){
          return subtreeWithAllDeepest(root.left);
      }
      else{
          return subtreeWithAllDeepest(root.right);
      }
    }

    private int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(getDepth(root.left),getDepth(root.right)) +1;
    }
}