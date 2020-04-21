//给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。 
//
// 示例: 
//
// 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
//输出: [3,3,5,5,6,7] 
//解释: 
//
//  滑动窗口的位置                最大值
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7 
//
// 
//
// 提示： 
//
// 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。 
//
// 注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/ 
// Related Topics 栈 Sliding Window


package leetcode.editor.cn;

import java.util.*;

//Java：滑动窗口的最大值
public class P面试题59IHuaDongChuangKouDeZuiDaZhiLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题59IHuaDongChuangKouDeZuiDaZhiLcof().new Solution();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(solution.maxSlidingWindow(nums,3));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length <1){
            return nums;
        }
        List<Integer> result = new ArrayList<>();
        int begin = 0 , end = k - 1;
        while (end < nums.length){
            result.add(getMin(nums,begin,end));
            begin++;
            end++;
        }
        return ArrayUtil.convertInt(result);
    }

    public int getMin(int[] nums,int begin,int end){
        PriorityQueue<Integer> queue = new PriorityQueue<>(3,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = begin; i <= end; i++) {
            queue.add(nums[i]);
        }
        System.out.println(queue);
        return queue.peek();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}