//一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出
//这个数字。 
//
// 
//
// 示例 1: 
//
// 输入: [0,1,3]
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [0,1,2,3,4,5,6,7,9]
//输出: 8 
//
// 
//
// 限制： 
//
// 1 <= 数组长度 <= 10000 
// Related Topics 数组 二分查找


package leetcode.editor.cn;
//Java：0～n-1中缺失的数字
public class P面试题53IIQueShiDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题53IIQueShiDeShuZiLcof().new Solution();
        int[] nums = {0,1,2};
        System.out.println(solution.missingNumber(nums));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        return miss(nums,0,nums.length-1);
    }

    private int miss(int[] nums, int left, int right) {
        if (left >= right){
            return nums[left] == left ? nums[left]+1 : nums[left]-1;
        }
        int mid = (left + right)/2;
        if (nums[mid] == mid){
            //在后半部分缺失
            return miss(nums,mid+1,nums.length-1);
        }else{
            //在前半部分缺失
            return miss(nums,left,mid-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}