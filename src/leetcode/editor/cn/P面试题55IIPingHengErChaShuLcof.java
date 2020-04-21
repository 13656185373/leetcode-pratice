//输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。 
//
// 
//
// 示例 1: 
//
// 给定二叉树 [3,9,20,null,null,15,7] 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回 true 。 
// 
//示例 2: 
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4] 
//
//        1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
// 
//
// 返回 false 。 
//
// 
//
// 限制： 
//
// 
// 1 <= 树的结点个数 <= 10000 
// 
//
// 注意：本题与主站 110 题相同：https://leetcode-cn.com/problems/balanced-binary-tree/ 
//
// 
// Related Topics 树 深度优先搜索


package leetcode.editor.cn;
//Java：平衡二叉树
public class P面试题55IIPingHengErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题55IIPingHengErChaShuLcof().new Solution();
        TreeNode root = new TreeNode(3).setLeft(new TreeNode(9)).setRight(new TreeNode(20).setLeft(new TreeNode(15)).setRight(new TreeNode(7)));
        System.out.println(solution.isBalanced(root));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        System.out.println("根节点左子树的高度是"+left+"根节点右子树的高度是"+right);
        return Math.abs( left - right) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode node) {
        if (node == null){
            return 0;
        }
        int left = depth(node.left);
        System.out.println(node.val +"左子树的高度是"+left);
        int right = depth(node.right);
        System.out.println(node.val +"右子树的高度是"+right);
        return Math.max(left,right)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}