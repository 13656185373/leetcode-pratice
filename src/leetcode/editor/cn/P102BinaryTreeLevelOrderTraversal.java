//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索


package leetcode.editor.cn;

import java.util.*;

//Java：二叉树的层序遍历
public class P102BinaryTreeLevelOrderTraversal{
    public static void main(String[] args) {
        Solution solution = new P102BinaryTreeLevelOrderTraversal().new Solution();
        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.push(root);

        while (queue.size() > 0){
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.pop();
                tmp.add(node.val);

                if (node.left != null){
                    queue.push(node.left);
                }
                if (node.right != null){
                    queue.push(node.right);
                }
            }
            result.add(tmp);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}