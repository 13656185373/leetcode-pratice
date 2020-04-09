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
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2)).setRight(new TreeNode(3).setLeft(new TreeNode(4)).setRight(new TreeNode(5)));
        System.out.println(solution.levelOrder(root));
        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0){
            List<Integer> tmp = new ArrayList<>();
            int tmpLen = queue.size();
            for (int i = 0; i < tmpLen; i++) {
                TreeNode node = queue.poll();
                tmp.add(node.val);

                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }

            }
            result.add(tmp);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}