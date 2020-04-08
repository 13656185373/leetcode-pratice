//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。 
//
// 说明：解集不能包含重复的子集。 
//
// 示例: 
//
// 输入: nums = [1,2,3]
//输出:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//] 
// Related Topics 位运算 数组 回溯算法


package leetcode.editor.cn;

import java.util.*;

//Java：子集
public class P78Subsets{
    public static void main(String[] args) {
        Solution solution = new P78Subsets().new Solution();
        int[] arr = {1,2,3};
        System.out.println(solution.subsets(arr));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int n,k;

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for (k = 0; k < n+1; k++) {
            backtrack(0,new ArrayDeque<Integer>(),nums);
        }
        return result;
    }

    private void backtrack(int first, ArrayDeque<Integer> tmp, int[] nums) {
        if (tmp.size()==k){
            result.add(new ArrayList(tmp));
        }

        for (int i = first; i < n; i++) {
            tmp.push(nums[i]);
            backtrack(i+1,tmp,nums);
            tmp.pop();
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}