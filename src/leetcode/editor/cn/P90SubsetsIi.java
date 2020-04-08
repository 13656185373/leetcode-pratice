//给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。 
//
// 说明：解集不能包含重复的子集。 
//
// 示例: 
//
// 输入: [1,2,2]
//输出:
//[
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//] 
// Related Topics 数组 回溯算法


package leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：子集 II
public class P90SubsetsIi{
    public static void main(String[] args) {
        Solution solution = new P90SubsetsIi().new Solution();
        int[] arr = {1,2,2};
        System.out.println(solution.subsetsWithDup(arr));
        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int n,k;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length < 1){
            return result;
        }
        Arrays.sort(nums);
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
            if (i>first && nums[i] == nums[i-1]){
                continue;
            }
            tmp.push(nums[i]);
            backtrack(i+1,tmp,nums);
            tmp.pop();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}