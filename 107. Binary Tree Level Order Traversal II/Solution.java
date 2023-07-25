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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int sizeOfQueue = queue.size();

            for(int i=0;i<sizeOfQueue;i++){
                TreeNode node = queue.remove();

                if(node.left != null)
                queue.add(node.left);

                if(node.right != null)
                queue.add(node.right);

                list.add(node.val);
            }
            ans.add(list);
        }
        Collections.reverse(ans);

        return ans;
    }
}