//给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字）。 
//
// 
//
// 示例 1: 
//
// 输入: [2,3,-2,4]
//输出: 6
//解释: 子数组 [2,3] 有最大乘积 6。
// 
//
// 示例 2: 
//
// 输入: [-2,0,-1]
//输出: 0
//解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。 
// Related Topics 数组 动态规划


package leetcode.editor.cn;
//Java：乘积最大子数组
public class P152MaximumProductSubarray{
    public static void main(String[] args) {
        Solution solution = new P152MaximumProductSubarray().new Solution();
        int[] nums = {-4,-3};
        System.out.println(solution.maxProduct(nums));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length<1){
            return 0;
        }
        //状态定义，dp[i]表示前i个元素的最大连续子数组的和
        int[] dp = new int[nums.length];

        //状态初始化，数组中的第一个元素的最大和就是自己
        dp[0] = nums[0];
        int ans = nums[0];

        //状态转移 dp[i] = max[dp[i-1],0] + nums[i]
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],0) * nums[i];
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}