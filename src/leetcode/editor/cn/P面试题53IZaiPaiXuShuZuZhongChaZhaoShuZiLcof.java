//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找


package leetcode.editor.cn;
//Java：在排序数组中查找数字 I
public class P面试题53IZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题53IZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        int[] nums = {5,7,7,8,8,10};
        solution.search(nums,8);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int left = findBin(nums,0,nums.length-1,target-0.5);
        int right = findBin(nums,0,nums.length-1,target+0.5);
        return right - left;
    }

    private int findBin(int[] nums, int left, int right, double target) {
        if (left > right){
            return -1;
        }
        int mid = (left + right)/2;
        int tmp = nums[mid];
        if (tmp > target){
            findBin(nums,left,mid - 1,target);
        }else if (tmp < target){
            findBin(nums,mid + 1,right,target);
        }
        System.out.println(target + "  "+left);
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}