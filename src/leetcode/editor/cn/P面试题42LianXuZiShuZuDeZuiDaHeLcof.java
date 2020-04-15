//输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。 
//
// 要求时间复杂度为O(n)。 
//
// 
//
// 示例1: 
//
// 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^5 
// -100 <= arr[i] <= 100 
// 
//
// 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/ 
//
// 
// Related Topics 分治算法 动态规划


package leetcode.editor.cn;
//Java：连续子数组的最大和
public class P面试题42LianXuZiShuZuDeZuiDaHeLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题42LianXuZiShuZuDeZuiDaHeLcof().new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        solution.maxSubArray(nums);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null){
            return 0;
        }
        int length = nums.length;
        if (nums.length == 1){
            return nums[0];
        }
        int max = nums[length-1];
        int[] dp = new int[length];

        for (int i = 0; i < length; i++) {
            dp[i] = nums[i];
            for (int j = i + 1; j < length; j++) {
                int column = nums[j];
                int last = dp[j-1];
                if (last < 0 ){
                    dp[j] = nums[j];
                }else {
                    dp[j] = last + column;
                }
                max = Math.max(max,dp[j]);
            }
            ArrayUtil.printSingle(dp);
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}