//输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。 
//
// 例如： 
//
// 给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 10000 
// 
//
// 注意：本题与主站 104 题相同：https://leetcode-cn.com/problems/maximum-depth-of-binary-tre
//e/ 
// Related Topics 树 深度优先搜索


package leetcode.editor.cn;


//Java：二叉树的深度
public class P面试题55IErChaShuDeShenDuLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题55IErChaShuDeShenDuLcof().new Solution();
        TreeNode root = new TreeNode(3).setLeft(new TreeNode(9)).setRight(new TreeNode(20).setLeft(new TreeNode(15).setRight(new TreeNode(7))));
        System.out.println(solution.maxDepth(root));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return depth(root,0);
    }

    private int depth(TreeNode node, int depth) {
        if (node == null){
            max = Math.max(max,depth);
            return depth-1;
        }
        int left = depth(node.left,depth + 1);
        int right = depth(node.right,depth + 1);
        return Math.max(left,right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}