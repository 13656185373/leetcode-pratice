//一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [4,1,4,6]
//输出：[1,6] 或 [6,1]
// 
//
// 示例 2： 
//
// 输入：nums = [1,2,10,4,1,4,3,3]
//输出：[2,10] 或 [10,2] 
//
// 
//
// 限制： 
//
// 
// 2 <= nums <= 10000 
// 
//
// 
//


package leetcode.editor.cn;

import java.util.*;

//Java：数组中数字出现的次数
public class P面试题56IShuZuZhongShuZiChuXianDeCiShuLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题56IShuZuZhongShuZiChuXianDeCiShuLcof().new Solution();
        int[] nums = {1,2,10,4,1,4,3,3};
        solution.singleNumbers(nums);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumbers(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (set.contains(tmp)){
                set.remove(tmp);
            }else {
                set.add(tmp);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            result[i] = iterator.next();
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}