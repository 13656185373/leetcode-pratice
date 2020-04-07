//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。 
//
// 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
//
//与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
// 
// Related Topics 数组 双指针

package leetcode.editor.cn;

import java.util.Arrays;

//Java：3Sum Closest
public class P16ThreeSumClosest{
    public static void main(String[] args) {
        Solution solution = new P16ThreeSumClosest().new Solution();
        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int abs = 99999;
        if (nums.length<=3){
            for (int i : nums){
                result+=i;
            }
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int l = i+1;
            int r = nums.length-1;
            while (l<r){
                int cloest = nums[i] + nums[l] + nums[r];
                int diff = target-cloest;
                if (Math.abs(diff)<=abs){
                    abs = Math.abs(target-cloest);
                    result = cloest;
                }
                if (diff>0){
                    l++;
                }else if (diff<0){
                    r--;
                }else {
                    return result;
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}