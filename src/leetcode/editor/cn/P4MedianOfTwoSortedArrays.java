//给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。 
//
// 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。 
//
// 你可以假设 nums1 和 nums2 不会同时为空。 
//
// 示例 1: 
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
// 
//
// 示例 2: 
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
// 
// Related Topics 数组 二分查找 分治算法

package leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Java：Median of Two Sorted Arrays
public class P4MedianOfTwoSortedArrays{
    public static void main(String[] args) {
        Solution solution = new P4MedianOfTwoSortedArrays().new Solution();
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(solution.findMedianSortedArrays(nums1,nums2));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        List<Integer> list = new ArrayList<>(l1+l2);
        for (int i:nums1){
            list.add(i);
        }
        for (int i:nums2){
            list.add(i);
        }
        Collections.sort(list);
        if (list.size()%2==0){
            int temp1 = list.get(list.size()/2-1);
            int temp2 = list.get(list.size()/2);
            result = (temp1+temp2)/2.0;
        }else {
            result = list.get(list.size()/2);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}