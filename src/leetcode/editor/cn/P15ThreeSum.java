//给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针

package leetcode.editor.cn;

import java.util.*;

//Java：3Sum
public class P15ThreeSum{
    public static void main(String[] args) {
        Solution solution = new P15ThreeSum().new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3){
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] > 0){
                return result;
            }
            int l = i+1;
            int r = nums.length-1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    System.out.println(nums[l]+"   "+nums[l+1]);
                    while (l < r && nums[l] == nums[l+1]){
                        l++;
                    }
                    System.out.println(nums[r]+"   "+nums[r-1]);
                    while (l < r && nums[r] == nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(sum < 0){
                    l++;
                }else {
                    r--;
                }
            }
        }
        return result;
    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> result = new HashSet<>();
//        List<Integer> list = new ArrayList<>();
//        for (int i : nums){
//            list.add(i);
//        }
//        Collections.sort(list);
//        if (nums.length <1 || list.get(0)>0){
//            return new ArrayList<>(result);
//        }
//
//        for (int i = 0 ; i < list.size()-2 ; i++) {
//            int l = i+1;
//            int r = list.size()-1;
//            while (l<r){
//                int sum = list.get(i)+list.get(l)+list.get(r);
//                if (sum == 0){
//                    List<Integer> tmp  = new ArrayList<>();
//                    tmp.add(list.get(i));
//                    tmp.add(list.get(l));
//                    tmp.add(list.get(r));
//                    Collections.sort(tmp);
//                    result.add(tmp);
//                    if (l + 1 < r && list.get(l+1).equals(list.get(l))){
//                        l++;
//                    }
//                    if (r - 1 > l && list.get(r-1).equals(list.get(r))){
//                        r--;
//                    }
//                    l++;
//                    r--;
//                }else if (sum>0){
//                    r--;
//                }else {
//                    l++;
//                }
//            }
//        }
//        return new ArrayList<>(result);
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}