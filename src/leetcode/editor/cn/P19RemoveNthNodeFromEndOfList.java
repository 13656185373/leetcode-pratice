//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。 
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 n = 2.
//
//当删除了倒数第二个节点后，链表变为 1->2->3->5.
// 
//
// 说明： 
//
// 给定的 n 保证是有效的。 
//
// 进阶： 
//
// 你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

//Java：Remove Nth ListNode From End of List
public class P19RemoveNthNodeFromEndOfList{
    public static void main(String[] args) {
        Solution solution = new P19RemoveNthNodeFromEndOfList().new Solution();
        int target = 8;

        // TO TEST
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this(val,null);
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
class Solution {
    private int binsearchRecursion(int[] nums, int left, int right, int value) {
        if (left > right){
            return -1;
        }
        int mid = (left + right)/2;
        if (nums[mid] == value){
            return mid;
        }else if (nums[mid] < value){
            left = mid + 1;
            return binsearchRecursion(nums,left,right,value);
        }else {
            right = mid - 1;
            return binsearchRecursion(nums,left,right,value);
        }
    }

    public int search(int[] nums, int target) {
        int minIndex = findMin(nums);
        if (nums[minIndex] == target){
            return minIndex;
        }else if (nums[minIndex] < target){
            return binsearchRecursion(nums,minIndex+1,nums.length,target);
        }else {
            return binsearchRecursion(nums,minIndex+1,nums.length,target);
        }
    }

    private int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] < nums[right]){
            return left;
        }
        while (left <= right){
            int mid = (left +  right)/2;
            if (mid < nums.length -1 && nums[mid] > nums[mid+1]){
                return mid+1;
            }
            if (nums[mid] >= nums[0]){
                left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return 0;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}