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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

    if(root==null) return ans;

    Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean flag = false;

    while(!queue.isEmpty()){
        int size = queue.size();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<size;i++){
            TreeNode node = queue.remove();

            if(node.left !=null)
            queue.add(node.left);

            if(node.right !=null)
            queue.add(node.right);

            list.add(node.val);
        }

        if(flag){
            Collections.reverse(list);
        }

        flag = !flag;
        ans.add(list);
    }

    return ans;
    }
}
