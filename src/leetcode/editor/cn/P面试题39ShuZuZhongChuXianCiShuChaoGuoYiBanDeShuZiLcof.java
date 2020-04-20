//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 
//
// 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1: 
//
// 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
//输出: 2 
//
// 
//
// 限制： 
//
// 1 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/ 
//
// 
// Related Topics 位运算 分治算法


package leetcode.editor.cn;

import java.util.Arrays;

//Java：数组中出现次数超过一半的数字
public class P面试题39ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题39ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        int vote = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0){
                count = 1;
                vote = nums[i];
                continue;
            }
            if (nums[i] == vote){
                count++;
            }else{
                count--;
            }
        }
        return vote;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}