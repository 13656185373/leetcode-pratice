//从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。 
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
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
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
//
// 注意：本题与主站 102 题相同：https://leetcode-cn.com/problems/binary-tree-level-order-tra
//versal/ 
// Related Topics 树 广度优先搜索


package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.List;

//Java：从上到下打印二叉树 II
public class P面试题32IICongShangDaoXiaDaYinErChaShuIiLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题32IICongShangDaoXiaDaYinErChaShuIiLcof().new Solution();
        TreeNode root = new TreeNode(3).setLeft(new TreeNode(9)).setRight(new TreeNode(20).setLeft(new TreeNode(15).setRight(new TreeNode(7))));
        System.out.println(solution.levelOrder(root));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String levelOrder(TreeNode root) {
        if (root == null){
            return null;
        }
        ArrayDeque<TreeNode> deque = new ArrayDeque();
        deque.push(root);
        StringBuilder sb = new StringBuilder("");
        while (deque.size() > 0){
            TreeNode tmp = deque.poll();
            sb.append(tmp.val).append(" ");
            if (tmp.left!=null){
                deque.push(tmp.left);
            }
            if (tmp.right!=null){
                deque.push(tmp.right);
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}