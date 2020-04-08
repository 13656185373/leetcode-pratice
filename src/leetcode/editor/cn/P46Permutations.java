//给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Java：全排列
public class P46Permutations{
    public static void main(String[] args) {
        Solution solution = new P46Permutations().new Solution();
        int[] arr = {1,2,3};
        System.out.println(solution.permute(arr));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int size = 0;
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        size = nums.length;
        if (size < 1){
            return result;
        }
        boolean[] used = new boolean[size];
        backtrak(nums, 0,new Stack<Integer>(),used);
        return result;
    }

        private void backtrak(int[] nums, int n,Stack<Integer> tmp,boolean[] used) {
            if (tmp.size() == size){
                result.add(new ArrayList<>(tmp));
                return;
            }
            for (int i = 0; i < size; i++) {
                if (!used[i]){
                    tmp.push(nums[i]);
                    used[i] = true;
                    backtrak(nums, i+1,tmp,used);
                    tmp.pop();
                    used[i] = false;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}