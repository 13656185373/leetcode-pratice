//一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。 
//
// 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。 
//
// 示例 1： 
//
// 输入：n = 2
//输出：2
// 
//
// 示例 2： 
//
// 输入：n = 7
//输出：21
// 
//
// 提示： 
//
// 
// 0 <= n <= 100 
// 
//
// 注意：本题与主站 70 题相同：https://leetcode-cn.com/problems/climbing-stairs/ 
//
// 
// Related Topics 递归


package leetcode.editor.cn;
//Java：青蛙跳台阶问题
public class P面试题10IIQingWaTiaoTaiJieWenTiLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题10IIQingWaTiaoTaiJieWenTiLcof().new Solution();
        solution.numWays(44);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numWays(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        ArrayUtil.printSingle(dp);
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}