//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。 
//
// 
//
// 示例： 
//
// 输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50000 
// 1 <= nums[i] <= 10000 
// 
//


package leetcode.editor.cn;
//Java：调整数组顺序使奇数位于偶数前面
public class P面试题21DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题21DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
        int[] nums = {1,2,3,4};
        System.out.println(solution.exchange(nums));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length < 2){
            return nums;
        }
        int left = 0 , right = nums.length - 1;

        while (left < right){
            if (nums[left] % 2 ==1){
                left++;
                continue;
            }
            if (nums[right] % 2 ==0){
                right--;
                continue;
            }
            swap(nums,left,right);
        }
        return nums;
    }

    public void swap(int[] nums,int left,int right){
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}