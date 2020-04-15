//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：和为s的连续正数序列
public class P面试题57IIHeWeiSdeLianXuZhengShuXuLieLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题57IIHeWeiSdeLianXuZhengShuXuLieLcof().new Solution();
        solution.findContinuousSequence(15);
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void findContinuousSequence(int target) {
        int half = target/2+1;
        int left = 1;
        int right = 2;
        while (left < right && right <= half){
            int sum = (left+right)*(right-left+1)/2;
            if (sum == target){
                result.add(constructList(left,right));
                left++;
            }else if (sum > target){
                left++;
            }else {
                right++;
            }
        }
        System.out.println(result);
    }

        private List<Integer> constructList(int left, int right) {
            List<Integer> tmp = new ArrayList<>(right - left +1);
            for (int i = left; i <= right ; i++) {
                tmp.add(i);
            }
            return tmp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}